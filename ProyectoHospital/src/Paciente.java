
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XCPC
 */
public class Paciente extends javax.swing.JFrame {

    /**
     * Creates new form Paciente
     */
    public Paciente() {
        initComponents();
          this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        informacionjLabel = new javax.swing.JLabel();
        volverjButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        volverjButton1 = new javax.swing.JButton();
        moduloCitajButton = new javax.swing.JButton();
        fichaClinicajButton = new javax.swing.JButton();

        informacionjLabel.setText("Informacion");

        volverjButton.setText("Volver");
        volverjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverjButtonMouseClicked(evt);
            }
        });
        volverjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverjButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Paciente");

        volverjButton1.setText("Volver");
        volverjButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverjButton1MouseClicked(evt);
            }
        });
        volverjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverjButton1ActionPerformed(evt);
            }
        });

        moduloCitajButton.setText("Gestionar Cita");
        moduloCitajButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moduloCitajButtonMouseClicked(evt);
            }
        });
        moduloCitajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduloCitajButtonActionPerformed(evt);
            }
        });

        fichaClinicajButton.setText("Ficha Clinica");
        fichaClinicajButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fichaClinicajButtonMouseClicked(evt);
            }
        });
        fichaClinicajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichaClinicajButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(volverjButton1)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(moduloCitajButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(136, 136, 136)
                            .addComponent(fichaClinicajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addComponent(moduloCitajButton)
                .addGap(100, 100, 100)
                .addComponent(fichaClinicajButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(volverjButton1)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverjButtonMouseClicked
        Hospital loginFrame = new Hospital();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverjButtonMouseClicked

    private void volverjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volverjButtonActionPerformed

    private void volverjButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverjButton1MouseClicked
        Hospital loginFrame = new Hospital();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverjButton1MouseClicked

    private void volverjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverjButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volverjButton1ActionPerformed

    private void moduloCitajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloCitajButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moduloCitajButtonActionPerformed

    private void moduloCitajButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moduloCitajButtonMouseClicked
        GestionarCita gestionarCita = new GestionarCita();
        gestionarCita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_moduloCitajButtonMouseClicked

    private void fichaClinicajButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fichaClinicajButtonMouseClicked
       FichaClinica fichaClinica = new FichaClinica();
        fichaClinica.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fichaClinicajButtonMouseClicked

    private void fichaClinicajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichaClinicajButtonActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_fichaClinicajButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fichaClinicajButton;
    private javax.swing.JLabel informacionjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton moduloCitajButton;
    private javax.swing.JButton volverjButton;
    private javax.swing.JButton volverjButton1;
    // End of variables declaration//GEN-END:variables
}
