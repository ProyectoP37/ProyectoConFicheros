/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author Acer
 */

public class pokedex extends javax.swing.JFrame {

    
    /**
     * Creates new form pokedex
     */
    public pokedex() {
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

        pokem = new javax.swing.JLabel();
        descrip = new javax.swing.JTextArea();
        dexImg = new javax.swing.JLabel();
        botBulba = new javax.swing.JButton();
        botCharm = new javax.swing.JButton();
        botSquir = new javax.swing.JButton();
        botEkan = new javax.swing.JButton();
        botPika = new javax.swing.JButton();
        botSands = new javax.swing.JButton();
        botMach = new javax.swing.JButton();
        botGast = new javax.swing.JButton();
        botOnix = new javax.swing.JButton();
        botDrow = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pokem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 160));

        descrip.setBackground(new java.awt.Color(51, 255, 0));
        descrip.setColumns(20);
        descrip.setLineWrap(true);
        descrip.setRows(5);
        descrip.setWrapStyleWord(true);
        descrip.setFocusable(false);
        getContentPane().add(descrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 140, 180));

        dexImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Pokedex.png"))); // NOI18N
        getContentPane().add(dexImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        botBulba.setText("Bulbasaur");
        botBulba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBulbaActionPerformed(evt);
            }
        });
        getContentPane().add(botBulba, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 110, -1));

        botCharm.setText("Charmander");
        botCharm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCharmActionPerformed(evt);
            }
        });
        getContentPane().add(botCharm, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 110, -1));

        botSquir.setText("Squirtle");
        botSquir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSquirActionPerformed(evt);
            }
        });
        getContentPane().add(botSquir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 110, -1));

        botEkan.setText("Ekans");
        botEkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEkanActionPerformed(evt);
            }
        });
        getContentPane().add(botEkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 110, -1));

        botPika.setText("Pikachu");
        botPika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPikaActionPerformed(evt);
            }
        });
        getContentPane().add(botPika, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 110, -1));

        botSands.setText("Sandshrew");
        botSands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSandsActionPerformed(evt);
            }
        });
        getContentPane().add(botSands, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 110, -1));

        botMach.setText("Machop");
        botMach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMachActionPerformed(evt);
            }
        });
        getContentPane().add(botMach, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 110, -1));

        botGast.setText("Gastly");
        botGast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botGastActionPerformed(evt);
            }
        });
        getContentPane().add(botGast, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 110, -1));

        botOnix.setText("Onix");
        botOnix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botOnixActionPerformed(evt);
            }
        });
        getContentPane().add(botOnix, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 110, -1));

        botDrow.setText("Drowzee");
        botDrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botDrowActionPerformed(evt);
            }
        });
        getContentPane().add(botDrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 110, -1));

        jButton1.setText("jButton1");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 243, 60, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botCharmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCharmActionPerformed
        
        pokem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Charmander.jpeg")));
        descrip.setText("Pokemon de tipo fuego\n" +
"Charmander es un pequeño lagarto bípedo.Tiene una pequeña llama en la punta de su cola que indica el estado físico y emocional del Pokemon.Si la llama desaparece o se apaga, moriría.");
    }//GEN-LAST:event_botCharmActionPerformed

    private void botBulbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBulbaActionPerformed
        pokem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Bulbasaur.jpg")));
        descrip.setText("Pokemon de tipo planta\n" +
"Cuando este Pokemon nace, tiene una semilla en su lomo. Esta semilla crece y se desarrolla a lo largo del ciclo de vida de Bulbasaur a medida que se producen sus evoluciones.");
    }//GEN-LAST:event_botBulbaActionPerformed

    private void botSquirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSquirActionPerformed
        pokem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Squirtle.jpeg")));
        descrip.setText("Pokemon de tipo agua\n" +
"Squirtle es una de las especies más difíciles de encontrar. Son pequeñas tortugas color celeste con caparazones color café o rojas, con una cola enrollada que los distingue.");
    }//GEN-LAST:event_botSquirActionPerformed

    private void botEkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEkanActionPerformed
        pokem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Ekans.jpeg")));
        descrip.setText("Pokemon de tipo veneno. Este Pokemon reside en las praderas, le gustan los lugares abiertos y cerca del agua para poder tener terreno a su gusto.");
    }//GEN-LAST:event_botEkanActionPerformed

    private void botPikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPikaActionPerformed
        pokem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Pikachu.jpg")));
        descrip.setText("Pokemon de tipo eléctrico\n" +
"Pikachu es un pequeño roedor con una cola en forma de rayo en los machos; en las hembras la punta de la cola tiene forma de corazón. Pikachu crece en aŕeas con altas cantidades de actividad eléctrica natural.");
    }//GEN-LAST:event_botPikaActionPerformed

    private void botSandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSandsActionPerformed
        pokem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Sandshrew.jpeg")));
        descrip.setText("Pokemon de tipo tierra\n" +
"Este Pokemon reside en los lugares abiertos donde le gusta cavar y hacer sus madrigueras, por esto mismo habita en lugares como el campo, los desiertos y algunas cuevas.");
    }//GEN-LAST:event_botSandsActionPerformed

    private void botMachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMachActionPerformed
        pokem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Machop.png")));
        descrip.setText("Pokemon de tipo lucha\n" +
"Su hábitat natural se encuentra principalmente en las montañas y en las cuevas, donde dispone de lo necesario para su fortalecimiento. ");
    }//GEN-LAST:event_botMachActionPerformed

    private void botGastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botGastActionPerformed
        pokem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Gastly.jpg")));
        descrip.setText("Pokemon de tipo fantasma\n" +
"Está hecho de una masa negra gaseosa con un aura de gas violeta a su alrededor la cual es venenosa y asfixiaría a la mayoría de los mortales. Presenta dos grandes ojos y una boca.");
    }//GEN-LAST:event_botGastActionPerformed

    private void botOnixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botOnixActionPerformed
        pokem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Onix.jpeg")));
        descrip.setText(" Pokemon de tipo roca. \n" +
"Onix es uno de los Pokemon más curiosos por su aspecto físico, teniendo forma similar a la de una lombriz hecha de roca. A pesar de su gran tamaño , pesa muy poco.");
    }//GEN-LAST:event_botOnixActionPerformed

    private void botDrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botDrowActionPerformed
        pokem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Drowzee.jpg")));
        descrip.setText("Pokemon de tipo psíquico\n" +
"Este Pokemon es de gran utilidad para las personas que padecen insomnio. Es capaz de dormir a una ciudad entera con su poder mental.");
    }//GEN-LAST:event_botDrowActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        principal princi=new principal();
        princi.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pokedex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botBulba;
    private javax.swing.JButton botCharm;
    private javax.swing.JButton botDrow;
    private javax.swing.JButton botEkan;
    private javax.swing.JButton botGast;
    private javax.swing.JButton botMach;
    private javax.swing.JButton botOnix;
    private javax.swing.JButton botPika;
    private javax.swing.JButton botSands;
    private javax.swing.JButton botSquir;
    private javax.swing.JTextArea descrip;
    private javax.swing.JLabel dexImg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel pokem;
    // End of variables declaration//GEN-END:variables
}
