package unidad2t.Geometria;

import java.awt.Image;
import javax.swing.ImageIcon;
import unidad2t.Principal;

/**
 *
 * @author isaac
 */
public class Geometria extends javax.swing.JFrame {

    /**
     * Creates new form Geometria
     */
    public Geometria() {
        initComponents();
        /*        ImageIcon fondo = new ImageIcon(getClass().getResource("/Imagenes/b9e23e943bcb519befa5d3f32f69f29f.png"));
        ImageIcon icon= new ImageIcon(fondo.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(icon);*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miboton5 = new componentes.Miboton();
        miboton1 = new componentes.Miboton();
        miboton2 = new componentes.Miboton();
        miboton3 = new componentes.Miboton();
        miboton6 = new componentes.Miboton();
        miboton4 = new componentes.Miboton();
        jLabel1 = new javax.swing.JLabel();

        miboton5.setText("Volver");
        miboton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miboton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        miboton1.setText("Area Esfera");
        miboton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miboton1ActionPerformed(evt);
            }
        });

        miboton2.setText("Area Y Perimetro Triangulo");
        miboton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miboton2ActionPerformed(evt);
            }
        });

        miboton3.setText("Area Piramide Cuadrada");
        miboton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miboton3ActionPerformed(evt);
            }
        });

        miboton6.setText("Volver");
        miboton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miboton6ActionPerformed(evt);
            }
        });

        miboton4.setText("Distancia Entre Puntos");
        miboton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miboton4ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b9e23e943bcb519befa5d3f32f69f29f.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(miboton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(miboton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(miboton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(miboton2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(miboton4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(miboton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(miboton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231)
                .addComponent(miboton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(miboton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(miboton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miboton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miboton1ActionPerformed
     SuperficieEsfera sup=new SuperficieEsfera();
      sup.setVisible(true);
      sup.setLocationRelativeTo(null);
      dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_miboton1ActionPerformed

    private void miboton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miboton2ActionPerformed
       FormulaHeron for2= new FormulaHeron();
              for2.setVisible(true);
              for2.setLocationRelativeTo(null);
              dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_miboton2ActionPerformed

    private void miboton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miboton3ActionPerformed
     AreaPiramide area=new AreaPiramide();
     area.setVisible(true);
     area.setLocationRelativeTo(null);
     dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_miboton3ActionPerformed

    private void miboton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miboton5ActionPerformed
        Geometria geo=new Geometria();
        geo.setVisible(true);
        geo.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_miboton5ActionPerformed

    private void miboton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miboton6ActionPerformed
Principal geo=new Principal();
geo.setVisible(true);
geo.setLocationRelativeTo(null);
dispose();    

    }//GEN-LAST:event_miboton6ActionPerformed

    private void miboton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miboton4ActionPerformed
    Distancia2Puntos dis= new Distancia2Puntos();
    dis.setVisible(true);
    dis.setLocationRelativeTo(null);
    dispose();
    }//GEN-LAST:event_miboton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Geometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Geometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Geometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Geometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Geometria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private componentes.Miboton miboton1;
    private componentes.Miboton miboton2;
    private componentes.Miboton miboton3;
    private componentes.Miboton miboton4;
    private componentes.Miboton miboton5;
    private componentes.Miboton miboton6;
    // End of variables declaration//GEN-END:variables
}
