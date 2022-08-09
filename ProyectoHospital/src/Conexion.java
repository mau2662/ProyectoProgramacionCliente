import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

public class Conexion extends Reporte{
    private Connection conector;
    private Statement state;
    private ResultSet rs;
    
private void conectarDB(){
    try{
        conector = DriverManager.getConnection("jdbc:derby://localhost:1527/shopmedb;create=true");
        state = conector.createStatement();
    }catch(SQLException ex){
        System.out.println(ex);
            
        }
    }

private void guardarDB(){
    try{
            
            state.executeUpdate("INSERT INTO PACIENTES VALUES ("+cedula+","+nombre+","+","+edad+
                    ","+diagnostico+","+telefono+","+email+","+tratamiento+")");
        }catch(SQLException e){
                System.out.println(e);
        }


}

        
private void leerDB(){
try{
            rs = state.executeQuery("SELECT * FROM PACIENTES");
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

private void ConexionLogin (){
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
             /*codigo donde busca en la BD la cedula y contrasena*/
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
