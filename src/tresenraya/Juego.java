package tresenraya;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalButtonUI;

public class Juego extends javax.swing.JFrame {
    
    int matriz[][] = new int[3][3];
    

    public Juego() {
       
    }
    
    public Juego(String name) {
        initComponents();
      //  iniciarJuego();
   }
    
    /**
     * Se tiene que llamar al método iniciar partida ubicado en LogicaJuego, pasando por parámetros
     * la matriz y jPanel4
     * 
     * Llamaremos al método para que reinicie todos los botones.
     */
    public void iniciarJuego(){
    	
    	clearButtons();
    	this.matriz=new int[3][3];
    	}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
System.out.println("init Components");
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pX = new javax.swing.JLabel();
        pO = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(73, 185, 206));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton10.setBackground(new java.awt.Color(254, 201, 64));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setText("Iniciar partida");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
             
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(178, 90));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("X");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("O");

        pX.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pX.setText("0");

        pO.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        pO.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pX)
                        .addGap(18, 18, 18)
                        .addComponent(pO)))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Partidas ganadas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton10)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tresenraya/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        tiradaJugador(jButton9, 2, 2, matriz, jPanel4, pX, pO);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        tiradaJugador(jButton8, 2, 1, matriz, jPanel4, pX, pO);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        tiradaJugador(jButton7, 2, 0, matriz, jPanel4, pX, pO);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        tiradaJugador(jButton6, 1, 2, matriz, jPanel4, pX, pO);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        tiradaJugador(jButton5, 1, 1, matriz, jPanel4, pX, pO);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tiradaJugador(jButton4, 1, 0, matriz, jPanel4, pX, pO);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       tiradaJugador(jButton3, 0, 2, matriz, jPanel4, pX, pO);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
    tiradaJugador(jButton2, 0, 1, matriz, jPanel4, pX, pO);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tiradaJugador(jButton1, 0, 0, matriz, jPanel4, pX, pO);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        iniciarJuego();
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * Vacía todos los botones
     * 
     * ¡¡¡¡No es necesario modificar este método!!!!.
     */
    public void clearButtons(){
    	count=0;
    	turno=1;
    	  jButton1.setEnabled(true);
    	  jButton2.setEnabled(true);
    	  jButton3.setEnabled(true);
    	  jButton4.setEnabled(true);
    	  jButton5.setEnabled(true);
    	  jButton6.setEnabled(true);
    	  jButton7.setEnabled(true);
    	  jButton8.setEnabled(true);
    	  jButton9.setEnabled(true);
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
    //    jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setBackground(new java.awt.Color(255, 255, 255));
//        jButton1.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
//        jButton1.setBorder(null);
//        jButton1.setBorderPainted(false);
        jButton1.setBorder(new LineBorder(Color.BLACK));
    }
    
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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego("tic toe").setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel pO;
    private javax.swing.JLabel pX;
    // End of variables declaration//GEN-END:variables
    
    
    int turno=1, pXX=0, pOO=0; // Turno del jugador
    boolean habilitado; // Habilita y deshabilita el tablero
    int count;
    /**
     * Inicializaremos el juego con las siguientes variables_
     * @param turno (Nos indicará el turno del jugador: 0 - X, 1 - O)
     * @param pX (Contiene el valor total de las victorias de este jugador)
     * @param pO (Contiene el valor total de las victorias de este jugador)
     */
    public int cambioTurno(){
        // Inserta código aquí...
    	// change turn
    	 if(turno==1)
 	    {
 	    	turno=2;
 	    }
 	    else
 	    {
 	    	turno=1;
 	    }
    	 System.out.println(turno+"---turn");
    	 return turno;
        
    }
    
    /**
     * Comprobar si se ha conseguido un tres en raya, 
     * en caso que se haya conseguido devolverá 1, en caso contrario retorna 0 y continúa el juego
     * @param matriz (Tablero de juego)
     * @return 
     */
    public int comprobarJuego(int matriz[][]){
        // Inserta código aquí...
        
        // Comprobar si existe tres en raya
        // Comprobar horizontal
        
        //Comprobar vertical
        
        //Comprobar en diagonal
        
        // Si no hay tres en raya
        return 0;
    }
    
    /**
     * Deshabilitará el botón para evitar que se vuelva a posicionar una ficha en ese hueco
     * @param bt (Botón seleccionado)
     * @param x (Posición x en el tablero)
     * @param y (Posición y en el tablero)
     * @param matriz (Tablero de juego)
     * @param jp (Panel dónde se sitúa el tablero de juego)
     * @param lX (JLabel del jugador X)
     * @param lO (JLabel del jugador O)
     * @return 
     */
    public int tiradaJugador(javax.swing.JButton bt, int x, int y, int matriz[][], javax.swing.JPanel jp, javax.swing.JLabel lX, javax.swing.JLabel lO){
    	count++;
    	System.out.println(x+"--x---y-"+y);
    	
    	  bt.setUI(new MetalButtonUI() {
    		    protected Color getDisabledTextColor() {
    		        return Color.RED;
    		    }
    		});
    	 bt.setEnabled(false);
    	      
    		   pintarFicha(bt);
    		   ponerFicha(matriz,x,y, bt);
    		 
    		   boolean result=checkVictoryCondition(x,y,matriz);
    		   System.out.println(result);
    		   if(result)
        	   {
        	    JOptionPane.showMessageDialog(null, "Player "+turno+" Wins");
        	   
        	    if(turno==1)
        	    {	pXX++;
        	    System.out.println("px--"+pXX);
        	  //  JuegObject.pO.setText("HAHAH");
        	//    lX.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        	    lX.setText(String.valueOf(pXX));
        	    }
        	    else
        	    	{pOO++;
        	    	System.out.println("pO---"+pOO);
        	    lO.setText(String.valueOf(pOO));

        	    	}
        	    iniciarJuego();
        	   }
    		   else if(count==9)
    	   {
    	    JOptionPane.showMessageDialog(null, "Match is a draw!");
    	    iniciarJuego();
    	   }
    		   else
    	   cambioTurno();
    	// Inserta código aquí...
        
        // Deshabilita el botón
        
        // Insertar la ficha en el botón
               
        // Comprobar si se ha ganado la partida
         
         // Deshabilitar tablero
         return 0;
    }
    
    boolean checkVictoryCondition(int x,int y,int matriz[][])
    {
    if(matriz[x][y]!=0)
    {
     Integer a=x;
     Integer b=y;
     int i;
   
     //check row
     for(i=0;i<3;i++)  {
      if((matriz[a][i])!=matriz[a][b])
       break;
     }
     if(i==3)
      return true;
   
     //check column
     for(i=0;i<3;i++)  {
      if(matriz[i][b]!=matriz[a][b])
       break;
     }
     if(i==3)
      return true;
   
     //check diagonal
     if((a==2&&b==2)||(a==0&&b==0)||(a==1&&b==1)||(a==0&&b==2)||(a==2&&b==0))
     {
      //left diagonal
      for(i=0;i<3;i++)
      	if(matriz[i][i]!=matriz[a][b])
      		break;
      if(i==3)
       return true;
   
      //right diagonal
      if((matriz[0][2]==matriz[a][b])&&(matriz[1][1]==matriz[a][b])&&(matriz[2][0]==matriz[a][b]))
       return true;
   
      }
   
     return false;
    }
    else return false;
    }
    /**
     * Actualizar la puntuación de cada jugador al ganar la partida
     * Al finalizar el incremento de puntuación es necesario cambiar de turno
     * @param lX (JLabel del jugador X)
     * @param lO (JLabel del jugador O)
     */
    public void ganador(javax.swing.JLabel lX, javax.swing.JLabel lO){
        // Inserta código aquí...
        
        // Incrementa jugador ganador e inserta resultado en jLabel    
 
    }
    
    /**
     * Habilitará o deshabilitará el tablero dependiendo del estado de la variable habilitado
     * @param jp  (Panel dónde se sitúa el tablero de juego)
     */
    public void habilitarTablero( javax.swing.JPanel jp){
        // Inserta código aquí...
        // Bloquea todos los elementos del JPanel
        
    }
    
    /**
     * Insertaremos la ficha en la posición correspondiente de la matriz
     * Llamaremos al método pintarFicha
     * @param matriz (Tablero de juego)
     * @param t (Turno)
     * @param x (Posición x en el tablero)
     * @param y (Posición y en el tablero)
     * @param bt (Botón pulsado)
     */
    public void ponerFicha(int matriz[][], int x, int y, javax.swing.JButton bt){
    	
    	if(turno==1)
    	matriz[x][y]=1;
    	else
    		matriz[x][y]=2;	
        // Inserta código aquí...        

        // Insertar ficha en la posición de la matriz
        
    }
    
    /**
     * Pintará la ficha en el tablero de juego visual, es decir, en el botón
     * @param bt (Botón pulsado)
     */
    private void pintarFicha(javax.swing.JButton bt){
        // Inserta código aquí...
        // Si el turno es de 0 pintará una X en rojo

         // Si el turno es de 1, pintará una O en azul 
    	if(turno==1) {
    		bt.setText("X");
    		 bt.setUI(new MetalButtonUI() {
     		    protected Color getDisabledTextColor() {
     		        return Color.white;
     		    }
     		});
    		bt.setBackground(new java.awt.Color(255, 0, 0));
    	}
        	else {
        		bt.setText("O");
        		 bt.setUI(new MetalButtonUI() {
          		    protected Color getDisabledTextColor() {
          		        return Color.white;
          		    }
          		});
        		bt.setBackground(new java.awt.Color(44, 0, 7));
        	}
    }
    
    /**
     * Inicializa una nueva partida, reinicia la matriz (Tablero de juego) y habilita el tablero
     * 
     * ¡¡¡¡No es necesario modificar este método!!!!.
     * 
     * @param matriz (Tablero de juego)
     * @param jp (Panel dónde se sitúa el tablero de juego)
     */
    public void iniciarPartida(int matriz[][], javax.swing.JPanel jp){
        // Rellenamos la matriz por primera vez, evitando que se repitan los números
        for (int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++){
                matriz[x][y]=(x+10)*(y+10);
            }
        }

        // Habilitar tablero
         habilitado = true;
         habilitarTablero(jp);
    }

}
