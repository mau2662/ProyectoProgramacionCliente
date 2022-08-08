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
}
