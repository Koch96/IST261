/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJSTGUIs;

/**
 *
 * @author jef35
 */
public class jfScheduleList extends javax.swing.JFrame {

    /**
     * Creates new form jfScheduleList
     */
    public jfScheduleList() {
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

        jlScheduleOne = new javax.swing.JLabel();
        jtScheduleOne = new javax.swing.JTextField();
        jlScheduleTwo = new javax.swing.JLabel();
        jtScheduleTwo = new javax.swing.JTextField();
        jbConfirm = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusableWindowState(false);
        setForeground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jlScheduleOne.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlScheduleOne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlScheduleOne.setText("Schedule 1");

        jtScheduleOne.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtScheduleOne.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtScheduleOne.setText("View Schedule?");
        jtScheduleOne.setToolTipText("");
        jtScheduleOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jtScheduleOne.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jlScheduleTwo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlScheduleTwo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlScheduleTwo.setText("Schedule 2");

        jtScheduleTwo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtScheduleTwo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtScheduleTwo.setText("View Schedule?");
        jtScheduleTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        jbConfirm.setBackground(new java.awt.Color(0, 0, 153));
        jbConfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbConfirm.setForeground(new java.awt.Color(255, 255, 255));
        jbConfirm.setText("Confirm");

        jbExit.setBackground(new java.awt.Color(0, 0, 153));
        jbExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbExit.setForeground(new java.awt.Color(255, 255, 255));
        jbExit.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlScheduleTwo)
                    .addComponent(jlScheduleOne)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbConfirm)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbExit))
                        .addComponent(jtScheduleOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtScheduleTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlScheduleOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtScheduleOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jlScheduleTwo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtScheduleTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConfirm)
                    .addComponent(jbExit))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(jfScheduleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfScheduleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfScheduleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfScheduleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfScheduleList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbConfirm;
    private javax.swing.JButton jbExit;
    private javax.swing.JLabel jlScheduleOne;
    private javax.swing.JLabel jlScheduleTwo;
    private javax.swing.JTextField jtScheduleOne;
    private javax.swing.JTextField jtScheduleTwo;
    // End of variables declaration//GEN-END:variables
}
