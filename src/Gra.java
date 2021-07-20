
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;


public class Gra extends javax.swing.JFrame {

    
    public Gra() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Ikona.png")));
        
        imageX = new ImageIcon(getClass().getResource("X.png"));
        imageO = new ImageIcon(getClass().getResource("O.png"));
        
        
    }
    
    static public ImageIcon imageX;
    static public ImageIcon imageO;
    public boolean krzyzyk = true;
    
    private void akcja(JButton przycisk)
    {
        if(krzyzyk)
        {
            przycisk.setDisabledIcon(imageX);
            przycisk.setEnabled(false);
            krzyzyk=false;
            przycisk.setName("X");
        }
        else
        {
            przycisk.setDisabledIcon(imageO);
            przycisk.setEnabled(false);
            krzyzyk=true;
            przycisk.setName("O");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrzyciskA1 = new javax.swing.JButton();
        PrzyciskB1 = new javax.swing.JButton();
        PrzyciskC1 = new javax.swing.JButton();
        PrzyciskA2 = new javax.swing.JButton();
        PrzyciskB2 = new javax.swing.JButton();
        PrzyciskC2 = new javax.swing.JButton();
        PrzyciskA3 = new javax.swing.JButton();
        PrzyciskB3 = new javax.swing.JButton();
        PrzyciskC3 = new javax.swing.JButton();
        Tlo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kolko i Krzyzyk");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrzyciskA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pytajnik.png"))); // NOI18N
        PrzyciskA1.setToolTipText("");
        PrzyciskA1.setDisabledIcon(null);
        PrzyciskA1.setDisabledSelectedIcon(null);
        PrzyciskA1.setName("?"); // NOI18N
        PrzyciskA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrzyciskA1ActionPerformed(evt);
            }
        });
        getContentPane().add(PrzyciskA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, 100));

        PrzyciskB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pytajnik.png"))); // NOI18N
        PrzyciskB1.setDisabledIcon(null);
        PrzyciskB1.setDisabledSelectedIcon(null);
        PrzyciskB1.setName("?"); // NOI18N
        PrzyciskB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrzyciskB1ActionPerformed(evt);
            }
        });
        getContentPane().add(PrzyciskB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 90, 100));

        PrzyciskC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pytajnik.png"))); // NOI18N
        PrzyciskC1.setActionCommand("");
        PrzyciskC1.setDisabledIcon(null);
        PrzyciskC1.setDisabledSelectedIcon(null);
        PrzyciskC1.setName("?"); // NOI18N
        PrzyciskC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrzyciskC1ActionPerformed(evt);
            }
        });
        getContentPane().add(PrzyciskC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 90, 100));

        PrzyciskA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pytajnik.png"))); // NOI18N
        PrzyciskA2.setDisabledIcon(null);
        PrzyciskA2.setDisabledSelectedIcon(null);
        PrzyciskA2.setName("?"); // NOI18N
        PrzyciskA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrzyciskA2ActionPerformed(evt);
            }
        });
        getContentPane().add(PrzyciskA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 90, 100));

        PrzyciskB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pytajnik.png"))); // NOI18N
        PrzyciskB2.setDisabledIcon(null);
        PrzyciskB2.setDisabledSelectedIcon(null);
        PrzyciskB2.setName("?"); // NOI18N
        PrzyciskB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrzyciskB2ActionPerformed(evt);
            }
        });
        getContentPane().add(PrzyciskB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 90, 100));

        PrzyciskC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pytajnik.png"))); // NOI18N
        PrzyciskC2.setDisabledIcon(null);
        PrzyciskC2.setDisabledSelectedIcon(null);
        PrzyciskC2.setName("?"); // NOI18N
        PrzyciskC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrzyciskC2ActionPerformed(evt);
            }
        });
        getContentPane().add(PrzyciskC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 90, 100));

        PrzyciskA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pytajnik.png"))); // NOI18N
        PrzyciskA3.setDisabledIcon(null);
        PrzyciskA3.setDisabledSelectedIcon(null);
        PrzyciskA3.setName("?"); // NOI18N
        PrzyciskA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrzyciskA3ActionPerformed(evt);
            }
        });
        getContentPane().add(PrzyciskA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 90, 100));

        PrzyciskB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pytajnik.png"))); // NOI18N
        PrzyciskB3.setDisabledIcon(null);
        PrzyciskB3.setDisabledSelectedIcon(null);
        PrzyciskB3.setName("?"); // NOI18N
        PrzyciskB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrzyciskB3ActionPerformed(evt);
            }
        });
        getContentPane().add(PrzyciskB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 90, 100));

        PrzyciskC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pytajnik.png"))); // NOI18N
        PrzyciskC3.setDisabledIcon(null);
        PrzyciskC3.setDisabledSelectedIcon(null);
        PrzyciskC3.setName("?"); // NOI18N
        PrzyciskC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrzyciskC3ActionPerformed(evt);
            }
        });
        getContentPane().add(PrzyciskC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 90, 100));

        Tlo.setIcon(new javax.swing.ImageIcon("C:\\Users\\klaku\\Desktop\\Kursy\\Programowanie\\Programy\\Własne\\Próby z zajęć\\Tworzenie Aplikacji\\KiK\\Tlo.png")); // NOI18N
        Tlo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Tlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PrzyciskA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrzyciskA1ActionPerformed
       akcja(PrzyciskA1);
    }//GEN-LAST:event_PrzyciskA1ActionPerformed

    private void PrzyciskC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrzyciskC1ActionPerformed
        akcja(PrzyciskC1);
    }//GEN-LAST:event_PrzyciskC1ActionPerformed

    private void PrzyciskB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrzyciskB1ActionPerformed
        akcja(PrzyciskB1);
    }//GEN-LAST:event_PrzyciskB1ActionPerformed

    private void PrzyciskA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrzyciskA2ActionPerformed
        akcja(PrzyciskA2);
    }//GEN-LAST:event_PrzyciskA2ActionPerformed

    private void PrzyciskB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrzyciskB2ActionPerformed
        akcja(PrzyciskB2);
    }//GEN-LAST:event_PrzyciskB2ActionPerformed

    private void PrzyciskC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrzyciskC2ActionPerformed
        akcja(PrzyciskC2);
    }//GEN-LAST:event_PrzyciskC2ActionPerformed

    private void PrzyciskA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrzyciskA3ActionPerformed
        akcja(PrzyciskA3);
    }//GEN-LAST:event_PrzyciskA3ActionPerformed

    private void PrzyciskB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrzyciskB3ActionPerformed
        akcja(PrzyciskB3);
    }//GEN-LAST:event_PrzyciskB3ActionPerformed

    private void PrzyciskC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrzyciskC3ActionPerformed
        akcja(PrzyciskC3);
    }//GEN-LAST:event_PrzyciskC3ActionPerformed

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
            java.util.logging.Logger.getLogger(Gra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PrzyciskA1;
    private javax.swing.JButton PrzyciskA2;
    private javax.swing.JButton PrzyciskA3;
    private javax.swing.JButton PrzyciskB1;
    private javax.swing.JButton PrzyciskB2;
    private javax.swing.JButton PrzyciskB3;
    private javax.swing.JButton PrzyciskC1;
    private javax.swing.JButton PrzyciskC2;
    private javax.swing.JButton PrzyciskC3;
    private javax.swing.JLabel Tlo;
    // End of variables declaration//GEN-END:variables
}
