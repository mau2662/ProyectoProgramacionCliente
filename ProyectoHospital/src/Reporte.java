import java.io.*;
import javax.swing.JOptionPane;

public class Reporte extends Persona {
    protected  String diagnostico, tratamiento,cita;

    public Reporte(String diagnostico, String tratamiento,String cita, String cedula, String nombre, String telefono, String email, int edad) {
        super(cedula, nombre, telefono, email, edad);
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.cita = cita;
        
    }
    
    

    
    public void generarReporte(){
        try{
            DataOutputStream archivo = new DataOutputStream(
        new FileOutputStream("pacientes.txt", true));
            cedula = JOptionPane.showInputDialog(null,"Digite la cedula");
            nombre = JOptionPane.showInputDialog(null,"Digite el nombre");
            edad = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite la edad"));
            diagnostico = JOptionPane.showInputDialog(null,"Digite el diagnostico");
            telefono = JOptionPane.showInputDialog(null,"Digite el telefono");
            email = JOptionPane.showInputDialog(null,"Digite el email");
            tratamiento = JOptionPane.showInputDialog(null,"Digite el tratamiento");
            
            archivo.writeUTF(cedula);
            archivo.writeUTF(nombre);
            archivo.writeInt(edad);
            archivo.writeUTF(diagnostico);
            archivo.writeUTF(telefono);
            archivo.writeUTF(email);
            archivo.writeUTF(tratamiento);
            JOptionPane.showMessageDialog(null,"Reporte generado correctamente!",
                    "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
            archivo.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al generar el reporte", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }

   
    
    public void leerReporte(){
        String ced,nom,diag,tel,ema,trat;
        int ed;
        
        String nomb = JOptionPane.showInputDialog(null,"Digite el nombre a "
                + "buscar:");
        
        try{
            DataInputStream archivo = new DataInputStream(
        new FileInputStream("pacientes.txt"));
            try{
                while(true){
                    ced = archivo.readUTF();
                    nom = archivo.readUTF();
                    ed = archivo.readInt();
                    diag = archivo.readUTF();
                    tel = archivo.readUTF();
                    ema = archivo.readUTF();
                    trat = archivo.readUTF();
                    
                    if(nomb.equals(nom)){
                        JOptionPane.showMessageDialog(null, 
                                "La persona "+nom+" cuya cedula es "+ced+
                                        " presenta el siguiente diagnostico "+diag+
                                        "para el cual se le receto el siguiente"
                                                + " tratamiento: "+trat);
                    }
                    else{
                    }
                }
            }catch(EOFException ex){
                archivo.close();
            }
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,
                    "El reporte no existe","Error",
                    JOptionPane.ERROR_MESSAGE);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,
                    "Error Desconocido","Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
