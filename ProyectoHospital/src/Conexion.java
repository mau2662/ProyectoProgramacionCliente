import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import com.mysql.jdbc.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion extends Reporte{
  
    protected Statement state;
    

    public Conexion(Statement state, String diagnostico, String tratamiento, String cita, String cedula, String nombre, String telefono, String email, int edad) {
        super(diagnostico, tratamiento, cita, cedula, nombre, telefono, email, edad);
        this.state = state;
    }
    
    
    
    
    
public void conectarDB(){
    
    try{
        Connection conector = DriverManager.getConnection("jdbc:sqlserver://database-proyecto-hospital.database.windows.net:1433;database=PACIENTES;user=adminazure@database-proyecto-hospital;password={4dm1n4ZUR3};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        state = conector.createStatement();
    }catch(SQLException ex){
        System.out.println(ex);
            
        }
    }

public void guardarDB(){
    try{
            cedula= JOptionPane.showInputDialog(null,"Digite el numerode su cedula");
            nombre= JOptionPane.showInputDialog(null,"Digite su nombre");
            edad= Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite la edad"));
            diagnostico = JOptionPane.showInputDialog(null,"Digite el diagnostico");
            telefono = JOptionPane.showInputDialog(null,"Digite el telefono");
            email = JOptionPane.showInputDialog(null,"Digite el email");
            tratamiento = JOptionPane.showInputDialog(null,"Digite el tratamiento");
            cita = JOptionPane.showInputDialog(null,"Digite la fecha de la cita en formato DD/MM/aaaa");
            
            state.executeUpdate("INSERT INTO DATOSPACIENTES VALUES ("+cedula+","+nombre+","+edad+","+
                    diagnostico+","+telefono+","+email+","+tratamiento+","+cita+")");
        }catch(SQLException e){
                System.out.println(e);
        }


}

        
public void leerDB(String line){
try{
            ResultSet rs = state.executeQuery("SELECT * FROM DATOSPACIENTES WHERE CEDULA ="+ line );
            int numFila = 0;
            rs.next();
            do{
                System.out.println("Datos del paciente"+
                        "\nCedula: "+rs.getInt("cedula")+
                        "\nNombre: "+rs.getString("nombre")+
                        "\nEdad: "+rs.getInt("edad")+
                        "\nDiagnostico: "+rs.getString("diagnostico")+
                        "\nTelefono: "+rs.getString("telefono")+
                        "\nEmail: "+rs.getString("email")+
                        "\nTratamiento: "+rs.getString("tratamiento"));
            
            }while(rs.next());
            
        }catch(SQLException e){
                System.out.println(e);

}
}

public  void ConexionServer (){
    ServerSocket server = null;
    
    try{
        server = new ServerSocket(32000);
        server.setReuseAddress(true);
        
        while(true){
          Socket client = server.accept();
        }
    }catch(IOException e){
        e.printStackTrace();
    }
}

class ClientHandler implements Runnable{
    
   private final Socket clientSocket;
   
   public ClientHandler(Socket socket){
       this.clientSocket=socket;
   }
   
   @Override
   public void run(){
       PrintWriter out = null;
       BufferedReader in = null;
       
       try{
             out = new PrintWriter(clientSocket.getOutputStream(), true);
             in = new BufferedReader(new InputStreamReader(
                    clientSocket.getInputStream()));
             String line = null;
             while((line = in.readLine()) != null){
             //codigo donde busca en la BD la cedula 
             leerDB(line);
             }
       }catch(IOException e){
        e.printStackTrace();
    } finally {
       try {
         if (out != null){
             out.close();
         }
         if (in != null){
             in.close();
             clientSocket.close();
         }
         
       }catch(IOException e){
        e.printStackTrace();
    }
       }
   }
   
}
}
