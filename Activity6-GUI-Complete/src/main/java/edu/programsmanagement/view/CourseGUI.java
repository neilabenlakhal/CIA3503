/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.programsmanagement.view;

import edu.programsmanagement.model.Program;
import edu.programsmanagement.dao.ProgramDAO;
import edu.programsmanagement.dao.CourseDAO;
import edu.programsmanagement.model.Course;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;

/**
 *
 * @author nbenayed
 */
public class CourseGUI extends javax.swing.JFrame {
    String code;
    String title;
    String credits;
    String progTitle;
    CourseDAO courseDAO;
    ProgramDAO programDAO;
    Course course;
    Program program;
    /**
     * Creates new form ProgramGUI
     */
    public CourseGUI() throws SQLException {
        initComponents();
        populateComboBox();
    }
    private final void loadAllCourses(){
        //      get all the course data from the courseDAO 
        //and Display it in a JTable

        //step 1:  set the column name of the jtable
        Vector colNameV=new Vector();
        colNameV.add("Course Code");
        colNameV.add("Course Title");
        colNameV.add("Credits");
        colNameV.add("Program");
        
       
        
        //Step 2: set the rows of jtable
        
        //2.a retreive all program data
        courseDAO=new CourseDAO();
        List<Course> courseList=null;
        try{
            courseList=courseDAO.getAllCourses();
        }
        catch(SQLException e){
            jLabelStatus.setText("Database Error! "+e.getMessage());
         
        }
        
        //convert the courseList and data in it to a vector of vectors
        Vector rowDataVector = new Vector();
        Vector cellVector = null;

        for (Course c:courseList){
            cellVector=new Vector();
            cellVector.add(c.getCode());
            cellVector.add(c.getTitle());
            cellVector.add(c.getCredits());
            cellVector.add(c.getProgram().getCode());
           //add this cell data vector to the rowDataVector
        rowDataVector.add(cellVector);
        }
        
        
        //init the JTable instance using the row data and column data vectors
        jTableAllCourses=new JTable(rowDataVector,colNameV);
        jScrollPane3.setViewportView(jTableAllCourses);

}
    private final void populateComboBox() throws SQLException{
        programDAO=new ProgramDAO();
        List<Program> progList= programDAO.getAllPrograms();
          for(Program p:progList){
            jComboBoxProgram.addItem(p.getTitle());}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelStatus = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelCourseCode = new javax.swing.JLabel();
        jLabelCourseTitle = new javax.swing.JLabel();
        jLabelCredits = new javax.swing.JLabel();
        jTextCourseCode = new javax.swing.JTextField();
        jTextCourseTitle = new javax.swing.JTextField();
        jTextCourseCredits = new javax.swing.JTextField();
        jLabelProgram = new javax.swing.JLabel();
        jComboBoxProgram = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButtonAddCourse = new javax.swing.JButton();
        jButtonUpdateCourse = new javax.swing.JButton();
        jButtonDeleteCourse = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAllCourses = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButtonShowAllCourses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Course Details");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelStatus.setForeground(new java.awt.Color(0, 0, 204));
        jLabelStatus.setText("jLabelStatus");
        getContentPane().add(jLabelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 670, 24));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCourseCode.setText("Course Code");
        jPanel1.add(jLabelCourseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 16, -1, -1));

        jLabelCourseTitle.setText("Course Title");
        jPanel1.add(jLabelCourseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 44, -1, -1));

        jLabelCredits.setText("Course Credits");
        jPanel1.add(jLabelCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 69, -1, -1));
        jPanel1.add(jTextCourseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 13, 327, -1));
        jPanel1.add(jTextCourseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 41, 327, -1));
        jPanel1.add(jTextCourseCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 69, 327, -1));

        jLabelProgram.setText("Program");
        jPanel1.add(jLabelProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 106, -1, -1));

        jPanel1.add(jComboBoxProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 103, 327, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 450, 150));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonAddCourse.setText("Add Course");
        jButtonAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCourseActionPerformed(evt);
            }
        });

        jButtonUpdateCourse.setText("Update Course");
        jButtonUpdateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateCourseActionPerformed(evt);
            }
        });

        jButtonDeleteCourse.setText("Delete Course");
        jButtonDeleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonUpdateCourse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddCourse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jButtonAddCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonUpdateCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeleteCourse)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 6, -1, 150));

        jScrollPane3.setViewportView(jTableAllCourses);

        jTableAllCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableAllCourses);

        jScrollPane3.setViewportView(jScrollPane2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 471, 151));

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonShowAllCourses.setText("Show All Courses");
        jButtonShowAllCourses.setDefaultCapable(false);
        jButtonShowAllCourses.setInheritsPopupMenu(true);
        jButtonShowAllCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAllCoursesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButtonShowAllCourses)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButtonShowAllCourses)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShowAllCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAllCoursesActionPerformed
        // TODO add your handling code here:
        loadAllCourses(); 
    }//GEN-LAST:event_jButtonShowAllCoursesActionPerformed

    private void jButtonDeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteCourseActionPerformed
        // TODO add your handling code here:
        code=jTextCourseCode.getText().trim();
        //check if course code is empty
        if(code.isEmpty()){
            jLabelStatus.setText("Enter the code of the course to delete!");
            return;
        }
        courseDAO=new CourseDAO();
        int status=-1;
        try{
            if(courseDAO.findCourseByCode(code)==null){
                jLabelStatus.setText("Course Code does not exist in the DB!");
                return;

            }
            status=courseDAO.deleteCourse(code);
        }
        catch (SQLException e){
            jLabelStatus.setText(e.getMessage());
        }
        if(status==1){
            jLabelStatus.setText("Course "+code+" is deleted!");
            loadAllCourses();
            jTextCourseCode.setText(" ");
            jTextCourseTitle.setText(" ");
            jTextCourseCredits.setText(" ");
            loadAllCourses();
        }
        else{
            jLabelStatus.setText("Error while deleting "+code+" course!");
        }

    }//GEN-LAST:event_jButtonDeleteCourseActionPerformed

    private void jButtonUpdateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateCourseActionPerformed
        // TODO add your handling code here:
        code =jTextCourseCode.getText().trim();
        title=jTextCourseTitle.getText().trim();
        credits=jTextCourseCredits.getText().trim();
        progTitle=jComboBoxProgram.getSelectedItem().toString();

        if (code.isEmpty() || title.isEmpty() || credits.isEmpty()){
            // display an error message
            jLabelStatus.setText("Please enter data");
            //exit the program
            return;
        }
        // sanitize the  input

        try{
            int creditst=Integer.parseInt(credits);
        }
        catch(NumberFormatException e){
            jLabelStatus.setText("Error while coventing to integer. Make sure to enter numbers");
            return;

        }
        courseDAO=new CourseDAO();

        int updateStatus=-1;
        try{
            if(courseDAO.findCourseByCode(code) ==null){
                jLabelStatus.setText("Code does not exist in the DB");
                return;
            }
            //retrieve the program code
            programDAO=new ProgramDAO();
            program= programDAO.findProgramByTitle(progTitle);

            //update the course
            updateStatus=courseDAO.updateCourse(code, title, Integer.parseInt(credits),program.getCode());

            if (updateStatus==1){
                jLabelStatus.setText("Course "+code+" is updated!");
                loadAllCourses();
            }
            else {jLabelStatus.setText("No record is updated!");}
        }
        catch(SQLException e){
            jLabelStatus.setText(e.getMessage());
        }
    }//GEN-LAST:event_jButtonUpdateCourseActionPerformed

    private void jButtonAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCourseActionPerformed
        // TODO add your handling code here:
        code =jTextCourseCode.getText().trim();
        title=jTextCourseTitle.getText().trim();
        credits=jTextCourseCredits.getText().trim();
        progTitle=jComboBoxProgram.getSelectedItem().toString();

        if (code.isEmpty() || title.isEmpty() || credits.isEmpty()){
            // display an error message
            jLabelStatus.setText("Please enter data");
            //exit the program
            return;
        }

        // sanitize the  input

        try{
            int creditst=Integer.parseInt(credits);
        }
        catch(NumberFormatException e){
            jLabelStatus.setText("Error while coventing to integer. Make sure to enter numbers");
            return;

        }

        courseDAO=new CourseDAO();
        //before adding the course, make sure that the code doesn't exist in the database

        try{
            if(courseDAO.findCourseByCode(code) !=null){
                jLabelStatus.setText("Code exists in the DB!");
                return;
            }
            //retrieve the program code
            programDAO=new ProgramDAO();
            program= programDAO.findProgramByTitle(progTitle);

            //add a new course
            int insertStatus=courseDAO.addNewCourse(code, title,Integer.parseInt(credits),program.getCode());
            jLabelStatus.setText("Course "+code+" is added!");
            loadAllCourses();

        }
        catch(SQLException e){
            jLabelStatus.setText(e.getMessage());

        }

    }//GEN-LAST:event_jButtonAddCourseActionPerformed

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
            java.util.logging.Logger.getLogger(CourseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
           // public void run() {
                //new CourseGUI().setVisible(true);
            //}
       // });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCourse;
    private javax.swing.JButton jButtonDeleteCourse;
    private javax.swing.JButton jButtonShowAllCourses;
    private javax.swing.JButton jButtonUpdateCourse;
    private javax.swing.JComboBox<String> jComboBoxProgram;
    private javax.swing.JLabel jLabelCourseCode;
    private javax.swing.JLabel jLabelCourseTitle;
    private javax.swing.JLabel jLabelCredits;
    private javax.swing.JLabel jLabelProgram;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAllCourses;
    private javax.swing.JTextField jTextCourseCode;
    private javax.swing.JTextField jTextCourseCredits;
    private javax.swing.JTextField jTextCourseTitle;
    // End of variables declaration//GEN-END:variables
}
