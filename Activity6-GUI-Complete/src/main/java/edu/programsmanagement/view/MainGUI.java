/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package edu.programsmanagement.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nbenayed
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form NewApplication
     */
    public MainGUI() {
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

        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        programMenuItem = new javax.swing.JMenuItem();
        courseMenuItem = new javax.swing.JMenuItem();
        searchMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programs Management Application");
        setLocation(new java.awt.Point(0, 0));
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 400));

        fileMenu.setMnemonic('m');
        fileMenu.setText("Manage");

        programMenuItem.setMnemonic('o');
        programMenuItem.setText("Programs");
        programMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(programMenuItem);

        courseMenuItem.setMnemonic('c');
        courseMenuItem.setText("Courses");
        courseMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(courseMenuItem);

        searchMenuItem.setMnemonic('s');
        searchMenuItem.setText("Search ");
        searchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(searchMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void programMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programMenuItemActionPerformed
        new ProgramGUI().setVisible(true);



       // TODO add your handling code here:
    }//GEN-LAST:event_programMenuItemActionPerformed

    private void searchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMenuItemActionPerformed
        // TODO add your handling code here:
        new ProgramCoursesGUI().setVisible(true); 
    }//GEN-LAST:event_searchMenuItemActionPerformed

    private void courseMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseMenuItemActionPerformed
        // TODO add your handling code here:
    try{
        new CourseGUI().setVisible(true); }
    catch(SQLException e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_courseMenuItemActionPerformed
   
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
            //public void run() {
              //  new MainGUI().setVisible(true);
            //}
        //});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem courseMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem programMenuItem;
    private javax.swing.JMenuItem searchMenuItem;
    // End of variables declaration//GEN-END:variables

}