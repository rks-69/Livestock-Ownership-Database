package smartindiahackathon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Menu1 extends javax.swing.JFrame {
String u;
    public Menu1() 
    {
        initComponents();
        //wn.setText("Welcome Mr "+u);
        //setSize(getMaximumSize());
        //jPanel1.setSize(getMaximumSize());
        //pr.setSize(getMaximumSize());
	//setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
	setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        wn = new javax.swing.JLabel();
        pr = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        re = new javax.swing.JMenuItem();
        dre = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        oi = new javax.swing.JMenuItem();
        oc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\prateek\\an1.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 2, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LIVESTOCK OWNERSHIP DATABASE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 720, 50));

        wn.setFont(new java.awt.Font("Calibri", 2, 48)); // NOI18N
        wn.setForeground(new java.awt.Color(255, 255, 0));
        wn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wn.setText("Government of Andhra Pradesh");
        wn.setToolTipText("");
        jPanel1.add(wn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 1212, 57));

        pr.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\back.jpg")); // NOI18N
        pr.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.add(pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 1000));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 1360, 1020));

        jMenu3.setText("Dealers");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jMenu3.setOpaque(true);

        re.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        re.setText("Register a Dealer");
        re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reActionPerformed(evt);
            }
        });
        jMenu3.add(re);

        dre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dre.setText("Delete registration of the Dealer");
        dre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dreActionPerformed(evt);
            }
        });
        jMenu3.add(dre);

        jMenuBar2.add(jMenu3);

        jMenu1.setText("View");
        jMenu1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setOpaque(true);

        oi.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        oi.setText("Owner Information");
        oi.setOpaque(true);
        oi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oiActionPerformed(evt);
            }
        });
        jMenu1.add(oi);

        oc.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        oc.setText("Owners in a City");
        oc.setOpaque(true);
        oc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocActionPerformed(evt);
            }
        });
        jMenu1.add(oc);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reActionPerformed
        if(evt.getSource()==re)
        {
            new Register();
        }
    }//GEN-LAST:event_reActionPerformed

    private void dreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dreActionPerformed
        if(evt.getSource()==dre)
        {
            new Dregister();
        }
    }//GEN-LAST:event_dreActionPerformed

    private void oiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oiActionPerformed
        if(evt.getSource()==oi)
        {
            String a=JOptionPane.showInputDialog(null, "Enter the Owner ID:-");
            new Details(a);
        }
    }//GEN-LAST:event_oiActionPerformed

    private void ocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocActionPerformed
        if(evt.getSource()==oc)
        {
            String a=JOptionPane.showInputDialog(null, "Enter the City:-");
            new ViewCity(a);
        }
    }//GEN-LAST:event_ocActionPerformed

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
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem dre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem oc;
    private javax.swing.JMenuItem oi;
    private javax.swing.JLabel pr;
    private javax.swing.JMenuItem re;
    private javax.swing.JLabel wn;
    // End of variables declaration//GEN-END:variables
}
