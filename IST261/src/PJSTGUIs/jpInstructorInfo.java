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
public class jpInstructorInfo extends javax.swing.JPanel {

    /**
     * Creates new form jpInstructorInfo
     */
    public jpInstructorInfo() {
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

        jbAddCourse = new javax.swing.JButton();
        jlTitle = new javax.swing.JLabel();
        jlTimes = new javax.swing.JLabel();
        jlDepartment = new javax.swing.JLabel();
        jbExit = new javax.swing.JButton();
        jtDays = new javax.swing.JTextField();
        jlAddCourse = new javax.swing.JLabel();
        jtTimes = new javax.swing.JTextField();
        jlDays = new javax.swing.JLabel();
        jtCourse = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jtUser = new javax.swing.JTextField();

        jbAddCourse.setBackground(new java.awt.Color(0, 0, 153));
        jbAddCourse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbAddCourse.setForeground(new java.awt.Color(255, 255, 255));
        jbAddCourse.setText("Add Course");
        jbAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddCourseActionPerformed(evt);
            }
        });

        jlTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("Instructor Info");

        jlTimes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlTimes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTimes.setText("Times Available:");

        jlDepartment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlDepartment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDepartment.setText("Preferred Course:");

        jbExit.setBackground(new java.awt.Color(0, 0, 153));
        jbExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbExit.setForeground(new java.awt.Color(255, 255, 255));
        jbExit.setText("Exit");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        jtDays.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtDays.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtDays.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlAddCourse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlAddCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAddCourse.setText("Add a Course:");

        jtTimes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtTimes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtTimes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlDays.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlDays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDays.setText("Days Available:");

        jtCourse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtCourse.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtCourse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Comments:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlTitle)
                    .addComponent(jlAddCourse))
                .addGap(188, 188, 188))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbAddCourse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbExit)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jlDays)
                                    .addGap(16, 16, 16))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlTimes)
                                    .addComponent(jlDepartment)))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jtCourse, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtTimes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtDays, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtUser))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitle)
                .addGap(39, 39, 39)
                .addComponent(jlAddCourse)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDays)
                        .addGap(18, 18, 18)
                        .addComponent(jlTimes)
                        .addGap(18, 18, 18)
                        .addComponent(jlDepartment)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtDays, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExit)
                    .addComponent(jbAddCourse))
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddCourseActionPerformed
         SQLiteDatabase dbTemp = new SQLiteDatabase();
                dbTemp.connectDatabase();
                
                dbTemp.inputInstructorUpdate(jtUser.getText(), jtCourse.getText(), jtDays.getText(), jtTimes.getText(), jTextArea1.getText());
                
                
               
    }//GEN-LAST:event_jbAddCourseActionPerformed

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jbExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbAddCourse;
    private javax.swing.JButton jbExit;
    private javax.swing.JLabel jlAddCourse;
    private javax.swing.JLabel jlDays;
    private javax.swing.JLabel jlDepartment;
    private javax.swing.JLabel jlTimes;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JTextField jtCourse;
    private javax.swing.JTextField jtDays;
    private javax.swing.JTextField jtTimes;
    private javax.swing.JTextField jtUser;
    // End of variables declaration//GEN-END:variables
}
