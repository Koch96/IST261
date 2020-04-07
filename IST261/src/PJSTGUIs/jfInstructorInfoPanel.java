/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJSTGUIs;

/**
 *
 * @author Jake_Gaming_PC
 */
public class jfInstructorInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form jfInstructorInfoPanel
     */
    public jfInstructorInfoPanel() {
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

        jlTimes = new javax.swing.JLabel();
        jlDepartment = new javax.swing.JLabel();
        jtDays = new javax.swing.JTextField();
        jlCampus = new javax.swing.JLabel();
        jtTimes = new javax.swing.JTextField();
        jlTerm = new javax.swing.JLabel();
        jtDepartment = new javax.swing.JTextField();
        jlCourse = new javax.swing.JLabel();
        jbAddCourse = new javax.swing.JButton();
        jcCampus = new javax.swing.JComboBox<>();
        jlTitle = new javax.swing.JLabel();
        jcTerm = new javax.swing.JComboBox<>();
        jbExit = new javax.swing.JButton();
        jcCourse = new javax.swing.JComboBox<>();
        jlAddCourse = new javax.swing.JLabel();
        jlDays = new javax.swing.JLabel();

        jlTimes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlTimes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTimes.setText("Times Available:");

        jlDepartment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlDepartment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDepartment.setText("Department:");

        jtDays.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtDays.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtDays.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlCampus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCampus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCampus.setText("Campus:");

        jtTimes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtTimes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtTimes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlTerm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlTerm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTerm.setText("Term:");

        jtDepartment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtDepartment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtDepartment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlCourse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCourse.setText("Course:");
        jlCourse.setToolTipText("");

        jbAddCourse.setBackground(new java.awt.Color(0, 0, 153));
        jbAddCourse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbAddCourse.setForeground(new java.awt.Color(255, 255, 255));
        jbAddCourse.setText("Add Course");

        jcCampus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcCampus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "University Park", "Abington", "Altoona", "Beaver", "Berks", "Brandywine", "Carlisle", "Dubois", "Erie (Behrend)", "Fayette", "Greater Allegheny", "Great Valley", "Harrisburg", "Hazleton", "Hershey", "Lehigh Valley", "Mont Alto", "New Kensington", "Penn College of Technology", "Schuylkill", "Scranton", "Shenango", "Wilkes-Barre", "York" }));
        jcCampus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        jlTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("Instructor Info");

        jcTerm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcTerm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spring 2021", "Summer 2021", "Fall 2021", "Spring 2022" }));
        jcTerm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        jbExit.setBackground(new java.awt.Color(0, 0, 153));
        jbExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbExit.setForeground(new java.awt.Color(255, 255, 255));
        jbExit.setText("Exit");

        jcCourse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcCourse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        jlAddCourse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlAddCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAddCourse.setText("Add a Course:");

        jlDays.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlDays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDays.setText("Days Available:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlDays)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtDays, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTerm)
                            .addComponent(jlCourse)
                            .addComponent(jlCampus))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcTerm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcCampus, 0, 369, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTimes)
                            .addComponent(jlDepartment)
                            .addComponent(jbAddCourse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtTimes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDepartment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbExit, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(jlAddCourse)
                .addGap(188, 188, 188))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jlTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitle)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCampus)
                    .addComponent(jcCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTerm)
                    .addComponent(jcTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCourse))
                .addGap(35, 35, 35)
                .addComponent(jlAddCourse)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDays)
                    .addComponent(jtDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTimes)
                    .addComponent(jtTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDepartment)
                    .addComponent(jtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAddCourse)
                    .addComponent(jbExit))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAddCourse;
    private javax.swing.JButton jbExit;
    private javax.swing.JComboBox<String> jcCampus;
    private javax.swing.JComboBox<String> jcCourse;
    private javax.swing.JComboBox<String> jcTerm;
    private javax.swing.JLabel jlAddCourse;
    private javax.swing.JLabel jlCampus;
    private javax.swing.JLabel jlCourse;
    private javax.swing.JLabel jlDays;
    private javax.swing.JLabel jlDepartment;
    private javax.swing.JLabel jlTerm;
    private javax.swing.JLabel jlTimes;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JTextField jtDays;
    private javax.swing.JTextField jtDepartment;
    private javax.swing.JTextField jtTimes;
    // End of variables declaration//GEN-END:variables
}
