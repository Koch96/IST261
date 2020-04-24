/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJSTGUIs;

import IST261.*;

/**
 *
 * @author Joey
 */
public class jpRevisedSchedule extends javax.swing.JPanel {

    /**
     * Creates new form jpRevisedSchedule
     */
    public jpRevisedSchedule() {
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

        jlProgramCoord = new javax.swing.JLabel();
        jlRevisedSchedule = new javax.swing.JLabel();
        jbExit = new javax.swing.JButton();
        jbChange1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        jlProgramCoord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlProgramCoord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlProgramCoord.setText("Program Coordinator");

        jlRevisedSchedule.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlRevisedSchedule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlRevisedSchedule.setText("See Revised Schedule");

        jbExit.setBackground(new java.awt.Color(0, 0, 153));
        jbExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbExit.setForeground(new java.awt.Color(255, 255, 255));
        jbExit.setText("Exit");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        jbChange1.setBackground(new java.awt.Color(0, 0, 153));
        jbChange1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbChange1.setForeground(new java.awt.Color(255, 255, 255));
        jbChange1.setText("Change");
        jbChange1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbChange1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Generate raw schedule");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbChange1)
                                .addGap(43, 43, 43)
                                .addComponent(jButton1)
                                .addGap(57, 57, 57)
                                .addComponent(jbExit))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlProgramCoord)
                                    .addComponent(jlRevisedSchedule))))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlProgramCoord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlRevisedSchedule)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExit)
                    .addComponent(jbChange1)
                    .addComponent(jButton1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbChange1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbChange1ActionPerformed
        // TODO add your handling code here:
        SQLiteDatabase dbTemp = new SQLiteDatabase();
        
        dbTemp.connectDatabase();
        jTextArea1.setText(dbTemp.checkCourseInfo(dbTemp.CourseInfo()));
        
    }//GEN-LAST:event_jbChange1ActionPerformed

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbChange1;
    private javax.swing.JButton jbExit;
    private javax.swing.JLabel jlProgramCoord;
    private javax.swing.JLabel jlRevisedSchedule;
    // End of variables declaration//GEN-END:variables
}
