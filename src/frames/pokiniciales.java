/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import projecto2.Entrenador;

/**
 *
 * @author Acer
 */
public class pokiniciales extends javax.swing.JFrame {

    /**
     * Creates new form pokiniciales
     */
    public pokiniciales() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botEscBulba = new javax.swing.JButton();
        botEscChar = new javax.swing.JButton();
        botEscSquir = new javax.swing.JButton();
        eleccBulba = new javax.swing.JButton();
        eleccCharm = new javax.swing.JButton();
        eleccSquir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONOCE MÁS A LOS POKEMON");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 40));

        botEscBulba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Bulbasaur.jpg"))); // NOI18N
        botEscBulba.setOpaque(false);
        botEscBulba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEscBulbaActionPerformed(evt);
            }
        });
        getContentPane().add(botEscBulba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 150));

        botEscChar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Charmander.jpeg"))); // NOI18N
        botEscChar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEscCharActionPerformed(evt);
            }
        });
        getContentPane().add(botEscChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 150, 150));

        botEscSquir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Squirtle.jpeg"))); // NOI18N
        botEscSquir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEscSquirActionPerformed(evt);
            }
        });
        getContentPane().add(botEscSquir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 150, 150));

        eleccBulba.setBackground(new java.awt.Color(102, 255, 102));
        eleccBulba.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        eleccBulba.setText("Bulbasaur");
        eleccBulba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccBulbaActionPerformed(evt);
            }
        });
        getContentPane().add(eleccBulba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 150, -1));

        eleccCharm.setBackground(new java.awt.Color(255, 0, 51));
        eleccCharm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        eleccCharm.setText("Charmander");
        eleccCharm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccCharmActionPerformed(evt);
            }
        });
        getContentPane().add(eleccCharm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, -1));

        eleccSquir.setBackground(new java.awt.Color(51, 153, 255));
        eleccSquir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        eleccSquir.setText("Squirtle");
        eleccSquir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccSquirActionPerformed(evt);
            }
        });
        getContentPane().add(eleccSquir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 150, -1));

        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Leelawadee", 0, 13)); // NOI18N
        descripcion.setLineWrap(true);
        descripcion.setRows(5);
        descripcion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 211, 450, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eleccBulbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccBulbaActionPerformed
        principal menu=new principal();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_eleccBulbaActionPerformed

    private void botEscBulbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEscBulbaActionPerformed
        descripcion.setBackground(new java.awt.Color(102, 255, 102));
        descripcion.setText("Pokemon de tipo planta. Cuando este Pokemon nace, tiene una semilla en su lomo. Esta semilla crece y se desarrolla a lo largo del ciclo de vida de Bulbasaur a medida que se producen sus evoluciones. Suelen encontrarse en manadas mixtas con otros pokemon tipo planta.");
    }//GEN-LAST:event_botEscBulbaActionPerformed

    private void eleccCharmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccCharmActionPerformed
              
        principal menu=new principal();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_eleccCharmActionPerformed

    private void botEscCharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEscCharActionPerformed
        descripcion.setBackground(new java.awt.Color(255, 0, 51));
        descripcion.setText("Pokemon de tipo fuego. Charmander es un pequeño lagarto bípedo. Tiene una pequeña llama en la punta de su cola que indica el estado físico y emocional del Pokemon.Si la llama desaparece o se apaga, moriría.");
    }//GEN-LAST:event_botEscCharActionPerformed

    private void botEscSquirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEscSquirActionPerformed
        descripcion.setBackground(new java.awt.Color(51, 153, 255));
        descripcion.setText("Pokemon de tipo agua. Squirtle es una de las especies más difíciles de encontrar. Son pequeñas tortugas color celeste con caparazones color café o rojas, con una cola enrollada que los distingue. Cuando se siente atacado, Squirtle esconde completamente su cuerpo en el interior de su caparazón.");
    }//GEN-LAST:event_botEscSquirActionPerformed

    private void eleccSquirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccSquirActionPerformed
        principal menu=new principal();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_eleccSquirActionPerformed

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
            java.util.logging.Logger.getLogger(pokiniciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pokiniciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pokiniciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pokiniciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pokiniciales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botEscBulba;
    private javax.swing.JButton botEscChar;
    private javax.swing.JButton botEscSquir;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JButton eleccBulba;
    private javax.swing.JButton eleccCharm;
    private javax.swing.JButton eleccSquir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
