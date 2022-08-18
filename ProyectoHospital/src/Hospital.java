
//import static Reporte.cedula;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
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
public class Hospital extends javax.swing.JFrame {

    /**
     * Creates new form Hospital
     */
    String host = "localhost";
    int port = 32000;

    public Hospital() {
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

        jPanel1 = new javax.swing.JPanel();
        nombreHospitaljLabel = new javax.swing.JLabel();
        usuariojLabel = new javax.swing.JLabel();
        contrasenajLabel = new javax.swing.JLabel();
        contrasenajPasswordField = new javax.swing.JPasswordField();
        loginjButton = new javax.swing.JButton();
        usuariojTextArea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreHospitaljLabel.setText("Hospital Sonrisas");

        usuariojLabel.setText("Usuario:");

        contrasenajLabel.setText("Contrasena");

        contrasenajPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenajPasswordFieldActionPerformed(evt);
            }
        });

        loginjButton.setText("Login");
        loginjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginjButtonMouseClicked(evt);
            }
        });
        loginjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjButtonActionPerformed(evt);
            }
        });

        usuariojTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariojTextAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(nombreHospitaljLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(usuariojLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contrasenajLabel)
                            .addComponent(loginjButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuariojTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(contrasenajPasswordField))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(nombreHospitaljLabel)
                .addGap(70, 70, 70)
                .addComponent(usuariojLabel)
                .addGap(40, 40, 40)
                .addComponent(usuariojTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(contrasenajLabel)
                .addGap(18, 18, 18)
                .addComponent(contrasenajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(loginjButton)
                .addContainerGap(165, Short.MAX_VALUE))
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

    private void loginjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginjButtonMouseClicked

        if (usuariojTextArea.getText().equals("MauricioVargasLogin") && contrasenajPasswordField.getText().equals("mauricio")) {
            Salud saludFrame = new Salud();
            saludFrame.setVisible(true);
            JOptionPane.showMessageDialog(null, "Bienvenido Doctor Mauricio Vargas");
            this.dispose();
            return;
        }

        if (usuariojTextArea.getText().equals("ChristianBermudezLogin") && contrasenajPasswordField.getText().equals("chris")) {
            Salud saludFrame = new Salud();
            saludFrame.setVisible(true);
            JOptionPane.showMessageDialog(null, "Bienvenido Doctor Christian Bermudez");
            this.dispose();
            return;
        }
        if (usuariojTextArea.getText().equals("MauricioSandiLogin") && contrasenajPasswordField.getText().equals("sandi")) {
            Paciente pacienteFrame = new Paciente();
            pacienteFrame.setVisible(true);
            JOptionPane.showMessageDialog(null, "Bienvenido Mauricio");
            this.dispose();
            return;

        }
        if (usuariojTextArea.getText().equals("AndresLopezLogin") && contrasenajPasswordField.getText().equals("andres")) {
            Paciente pacienteFrame = new Paciente();
            pacienteFrame.setVisible(true);
            JOptionPane.showMessageDialog(null, "Bienvenido Andres");
            this.dispose();
            return;

        } else if (usuariojTextArea.getText().equals("") || contrasenajPasswordField.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Usuario o contrasena vacios");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contrasena Incorrectos");

        }

        try ( Socket socket = new Socket(host, port)) {

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_loginjButtonMouseClicked

    private void loginjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginjButtonActionPerformed

    private void contrasenajPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenajPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenajPasswordFieldActionPerformed

    private void usuariojTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariojTextAreaActionPerformed

    }//GEN-LAST:event_usuariojTextAreaActionPerformed

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
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contrasenajLabel;
    private javax.swing.JPasswordField contrasenajPasswordField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginjButton;
    private javax.swing.JLabel nombreHospitaljLabel;
    private javax.swing.JLabel usuariojLabel;
    private javax.swing.JTextField usuariojTextArea;
    // End of variables declaration//GEN-END:variables
}
