package smartindiahackathon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Menu extends javax.swing.JFrame {
String u;
    public Menu(String u) 
    {
        this.u=u;
        initComponents();
        //wn.setText("Welcome Mr "+u);
        setSize(getMaximumSize());
	setExtendedState(JFrame.MAXIMIZED_BOTH);
	setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        deta = new javax.swing.JMenuItem();
        cp = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        add = new javax.swing.JMenuItem();
        del = new javax.swing.JMenuItem();
        pur = new javax.swing.JMenuItem();
        sell = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\l.jpg")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LIVESTOCK OWNERSHIP DATABASE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 255));
        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 0));

        jMenu1.setText("Profile");
        jMenu1.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setOpaque(true);

        deta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        deta.setText("Details");
        deta.setOpaque(true);
        deta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detaActionPerformed(evt);
            }
        });
        jMenu1.add(deta);

        cp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cp.setText("Change Password");
        cp.setOpaque(true);
        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });
        jMenu1.add(cp);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Livestock");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setOpaque(true);

        add.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        add.setText("Add");
        add.setOpaque(true);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jMenu2.add(add);

        del.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        del.setText("Delete");
        del.setOpaque(true);
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        jMenu2.add(del);

        pur.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pur.setText("Purchase");
        pur.setOpaque(true);
        pur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purActionPerformed(evt);
            }
        });
        jMenu2.add(pur);

        sell.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sell.setText("Sell");
        sell.setOpaque(true);
        sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellActionPerformed(evt);
            }
        });
        jMenu2.add(sell);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void detaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detaActionPerformed
        if(evt.getSource()==deta)
            new Details(u);
    }//GEN-LAST:event_detaActionPerformed

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
        if(evt.getSource()==cp)
           new ChangePassword1(u);
    }//GEN-LAST:event_cpActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(evt.getSource()==add)
            new Add();
    }//GEN-LAST:event_addActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        if(evt.getSource()==del)
            new Delete();
    }//GEN-LAST:event_delActionPerformed

    private void purActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purActionPerformed
        if(evt.getSource()==pur)
            new Purchase();
    }//GEN-LAST:event_purActionPerformed

    private void sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellActionPerformed
        if(evt.getSource()==sell)
            new Purchase();
    }//GEN-LAST:event_sellActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add;
    private javax.swing.JMenuItem cp;
    private javax.swing.JMenuItem del;
    private javax.swing.JMenuItem deta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem pur;
    private javax.swing.JMenuItem sell;
    // End of variables declaration//GEN-END:variables
}
