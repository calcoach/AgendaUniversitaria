/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.grades;

import Data.Files;
import Data.Course;
import Sesion.Sesion;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class WindowCourse extends javax.swing.JPanel {

    /**
     * Creates new form Course
     * @param name
     */
    
    String name;
    Course course;
    Sesion actualSesion;
    int num;
    
    /**
     *
     */
    public WindowCourse(Course course, Sesion sesion) {
       
        this.course=course;
        this.name=course.getNameCourse();
        actualSesion=sesion;
        
        initComponents();
        createDataFiles();
        setNameCurse(name);
        
    }
    
    
    private void createDataFiles(){
        
       
    }
    
    public int getNum(){
        return num;
    }
    
    public void setProm(){
       this.jTextField3.setText(String.valueOf(course.calculateProm()));  
    }
    
    private void setNameCurse(String name){
     
        jLabel1.setText(" "+name.toUpperCase());
    }
    
    public void setNum(int num){
        this.num=num;
    }
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.setText("5.0");
        jTextField3.setMargin(new java.awt.Insets(2, 12, 2, 2));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 5, 60, 40));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.setText("5.0");
        jTextField4.setMargin(new java.awt.Insets(2, 12, 2, 2));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 5, 60, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/lapiz.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/cubo-de-basura.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 30, 30));
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 30, 30));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("  Algebra");
        jLabel1.setIconTextGap(1);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        WindowCourseNotes newWindow=new WindowCourseNotes(course, actualSesion);
        newWindow.setVisible(true);
        newWindow.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
