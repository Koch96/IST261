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
public class ConnectedPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConnectedPanel
     */
    public ConnectedPanel() {
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

        jpLogin1 = new PJSTGUIs.jpLogin();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpRevisedSchedule1 = new PJSTGUIs.jpRevisedSchedule();
        jpInstructorInfo1 = new PJSTGUIs.jpInstructorInfo();

        jTabbedPane1.addTab("tab2", jpRevisedSchedule1);
        jTabbedPane1.addTab("tab1", jpInstructorInfo1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private PJSTGUIs.jpInstructorInfo jpInstructorInfo1;
    private PJSTGUIs.jpLogin jpLogin1;
    private PJSTGUIs.jpRevisedSchedule jpRevisedSchedule1;
    // End of variables declaration//GEN-END:variables
}
