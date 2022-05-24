package Probabilidades;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mymathematics.Ordenamiento;
import mymathematics.MedidaCentral;
/**
 *
 * @author isaac
 */
public class ORDENAMIENTO extends javax.swing.JFrame {
double aux;
Ordenamiento ordenar = new Ordenamiento();
MedidaCentral med= new MedidaCentral();
    public ORDENAMIENTO() {
        initComponents();
        /*        ImageIcon esfera = new ImageIcon(getClass().getResource("/Imagenes/Triangul0.png"));
        ImageIcon icon= new ImageIcon(esfera.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(icon);*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtVariable = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtVariable1 = new javax.swing.JTextArea();
        miboton1 = new componentes.Miboton();
        miboton2 = new componentes.Miboton();
        miboton3 = new componentes.Miboton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtVariable.setEditable(false);
        txtVariable.setColumns(20);
        txtVariable.setRows(5);
        txtVariable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtVariable.setCaretColor(new java.awt.Color(255, 51, 51));
        txtVariable.setDisabledTextColor(new java.awt.Color(255, 102, 102));
        txtVariable.setOpaque(false);
        jScrollPane1.setViewportView(txtVariable);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtVariable1.setColumns(20);
        txtVariable1.setRows(5);
        txtVariable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(txtVariable1);

        miboton1.setText("Nuevo");
        miboton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        miboton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miboton1ActionPerformed(evt);
            }
        });

        miboton2.setText("Ingresar Datos");
        miboton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miboton2ActionPerformed(evt);
            }
        });

        miboton3.setText("volver");
        miboton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miboton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Media, Mediana y Moda");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b9e23e943bcb519befa5d3f32f69f29f.png"))); // NOI18N
        jLabel1.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(miboton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(miboton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(miboton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(miboton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(miboton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(miboton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miboton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miboton1ActionPerformed
    txtVariable1.setText("");           
    }//GEN-LAST:event_miboton1ActionPerformed

    private void miboton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miboton2ActionPerformed
    try{
        double media = 0;
      
    int datos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de datos"));
    int Arreglo[] = new int[datos];
    String Numeros= "";
    String numT= "";
    for(int i = 0; i<Arreglo.length; i++){    
    Arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato " )); 
    Numeros+= "\n" + Arreglo[i];
                int numero=0;  
    }  
    {
            }
        txtVariable1.append("Numeros Ingresados");
        txtVariable1.append(Numeros);
        ordenar.mostrarArreglo(Arreglo);
        txtVariable1.append("\n"+"-----------------------------------------------------------------------------"+
                "\n"+"Numeros Menor a Mayor");
        ordenar.burbuja(Arreglo);

        for (int i = 0; i <Arreglo.length; i++) {
            numT+="\n"+Arreglo[i];

    }
    ordenar.mostrarArreglo(Arreglo);
    txtVariable1.append(numT+"\n"+"-----------------------------------------------------------------------------");
    med.mediana(Arreglo);
    med.promedio(Arreglo);
    med.moda(Arreglo);
    med.mostrar(Arreglo);
       txtVariable1.append("\n"+"La mediana es: "+"\n"+med.mediana(Arreglo)+"\n"
       +"La moda es : "+"\n"+med.moda(Arreglo)+"\n"
       +"El promedio es : "+"\n"+med.promedio(Arreglo)+
       "\n"+"------------------------------------------------------------------------");

            	 
    
}catch(Exception er){            
       JOptionPane.showMessageDialog(null,"Llene todos los Datos.","ADVERTENCIA",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_miboton2ActionPerformed

    private void miboton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miboton3ActionPerformed
      Probabilidad prob= new Probabilidad();
      prob.setVisible(true);
      prob.setLocationRelativeTo(null);
      dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_miboton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ORDENAMIENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ORDENAMIENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ORDENAMIENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ORDENAMIENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ORDENAMIENTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private componentes.Miboton miboton1;
    private componentes.Miboton miboton2;
    private componentes.Miboton miboton3;
    private javax.swing.JTextArea txtVariable;
    private javax.swing.JTextArea txtVariable1;
    // End of variables declaration//GEN-END:variables
}
