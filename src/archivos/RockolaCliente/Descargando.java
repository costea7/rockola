/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package archivos.RockolaCliente;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author jochechavez
 */
public class Descargando extends javax.swing.JDialog {

    /**
     * Creates new form Descargando
     */
    boolean flat;
    
    /**
     *
     * @param parent
     * @param modal
     */
    public Descargando(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jlporcentaje.setVisible(flat);
        
        
    }

    /**
     *
     */
    public void iniciar(){
        this.getprogressbar().setBorderPainted(true);
        this.getprogressbar().setForeground(new Color(50, 50, 153, 100));
        this.getprogressbar().setStringPainted(true);
    }

    /**
     *
     * @return
     */
    public JProgressBar getprogressbar(){
        
        return jbprogreso;
    }

    /**
     *
     * @param nombre
     */
    public void setNombreCancion(String nombre){
        jlbnombre.setText("Nombre de la Canción: "+nombre);
    }

    /**
     *
     * @return
     */
    public JLabel getPorcentaje(){
        return jlporcentaje;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbnombre = new javax.swing.JLabel();
        jbprogreso = new javax.swing.JProgressBar();
        jCheckBox1 = new javax.swing.JCheckBox();
        jlbporcentaje = new javax.swing.JLabel();
        jlporcentaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlbnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbnombre.setText("Nombre de la cancion: ");

        jbprogreso.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setText("Mostrar Porcentaje");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jlporcentaje.setText("0 %");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbnombre)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jlbporcentaje))
                    .addComponent(jCheckBox1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbprogreso, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlporcentaje)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jlbnombre)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbprogreso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlporcentaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(13, 13, 13)
                .addComponent(jlbporcentaje))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        flat = !flat;
        jlporcentaje.setVisible(flat);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    /**
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Descargando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Descargando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Descargando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Descargando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Descargando dialog = new Descargando(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
**/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JProgressBar jbprogreso;
    private javax.swing.JLabel jlbnombre;
    private javax.swing.JLabel jlbporcentaje;
    private javax.swing.JLabel jlporcentaje;
    // End of variables declaration//GEN-END:variables
}
