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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jfInstructorInfoPanel1 = new PJSTGUIs.jfInstructorInfoPanel();
        jfRevisedSchedulePanel1 = new PJSTGUIs.jfRevisedSchedulePanel();

        jTabbedPane1.addTab("tab1", jfInstructorInfoPanel1);
        jTabbedPane1.addTab("tab2", jfRevisedSchedulePanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 111, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private PJSTGUIs.jfInstructorInfoPanel jfInstructorInfoPanel1;
    private PJSTGUIs.jfRevisedSchedulePanel jfRevisedSchedulePanel1;
    // End of variables declaration//GEN-END:variables
}