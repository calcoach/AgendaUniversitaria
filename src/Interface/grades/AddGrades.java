/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.grades;

import Data.Course;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class AddGrades {

    boolean clic;

    int Y = 45;
    Clic CLIC;
    Course course;

    public AddGrades(String num, Course course) {

        clic = false;
        CLIC = Clic.CLIC_FALSE;
        this.course = course;
        gradesCutting();
    }

    public void gradesCutting() {

        JFrame notas = new JFrame();
        notas.setMinimumSize(new java.awt.Dimension(600, 200));
        notas.setResizable(false);
        notas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        notas.setLocationRelativeTo(null);
        notas.setVisible(true);
        notas.setTitle("Notas del Corte");

        JLabel nameGrade = new JLabel("Nombre nota");
        JLabel percentage = new JLabel("%");
        JLabel nota = new JLabel("Nota");
        JLabel background = new JLabel();
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/agenda_1500px.png")));
        background.setPreferredSize(new java.awt.Dimension(600, 500));

        nameGrade.setFont(new java.awt.Font("Tahoma", 1, 15));
        nameGrade.setForeground(new java.awt.Color(0, 0, 0));
        nota.setFont(new java.awt.Font("Tahoma", 1, 15));
        nota.setForeground(new java.awt.Color(0, 0, 0));
        percentage.setFont(new java.awt.Font("Tahoma", 1, 15));
        percentage.setForeground(new java.awt.Color(0, 0, 0));
        notas.add(nameGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 15));
        notas.add(nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(250,15));
        notas.add(percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 15));

        JToggleButton[] sets = new JToggleButton[10];
        JTextField[] nameGrades = new JTextField[10];
        JTextField[] grades = new JTextField[10];

        for (int i = 1; i <= 3; i++) {

            //NOMBRE NOTAS DEL CORTE
            nameGrades[i] = new JTextField();
            nameGrades[i].setName(String.valueOf(i));
            nameGrades[i].setEditable(false);
            nameGrades[i].addFocusListener(new java.awt.event.FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    
                }

                @Override
                public void focusLost(FocusEvent e) {

                   grades[Integer.valueOf(e.getComponent().getName())].transferFocusDownCycle();
                      
                    
                            
                }
            });
            notas.add(nameGrades[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(10, Y, 150, 30));

            //NOTAS DEL CORTE
            grades[i] = new JTextField();

            grades[i].addFocusListener(new java.awt.event.FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    
                    //MODIFICAR NOTA
                }

                @Override
                public void focusLost(FocusEvent e) {
                   
                    nameGrades[Integer.valueOf(e.getComponent().getName())].setEditable(false);
                    grades[Integer.valueOf(e.getComponent().getName())].setEditable(false);
                    sets[Integer.valueOf(e.getComponent().getName())].setSelected(false);
                    CLIC=Clic.CLIC_FALSE;

                }
            });
            grades[i].setName(String.valueOf(i));
            grades[i].setEditable(false);
            notas.add(grades[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(200, Y, 150, 30));

            //Boton editar
            //Al dar clic cambia una nota
            sets[i] = new JToggleButton();
            sets[i].setName(String.valueOf(i));
            sets[i].addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    switch (CLIC) {

                        case CLIC_TRUE:
                            CLIC = Clic.CLIC_FALSE;
                            String[] split = e.toString().split(" ");
                            nameGrades[Integer.valueOf(split[2])].setEditable(false);
                            grades[Integer.valueOf(split[2])].setEditable(false);
                            break;

                        case CLIC_FALSE:
                            String[] split2 = e.toString().split(" ");
                            nameGrades[Integer.valueOf(split2[2])].setEditable(true);
                            grades[Integer.valueOf(split2[2])].setEditable(true);
                            sets[Integer.valueOf(split2[2])].transferFocus();
                            CLIC = Clic.CLIC_TRUE;
                            System.out.println("jajaajja");
                            break;

                    }

                }
            });
            notas.add(sets[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(380, Y, 40, 30));

            //Porcentaje
            JComboBox perc = new JComboBox<>();
            perc.setMinimumSize(new java.awt.Dimension(20, 20));
            perc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"10", "15", "20", "25", "35", "40", "45",
                "50", "55", "60", "65", "70", "75", "80", "85", "90", "95", "100"}));
            notas.add(perc, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, Y, 40, 30));

            //Obtener informacion
            JButton info = new JButton();
            info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icon.png")));
            info.setFocusable(false);
            info.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Informacion: ");
                }
            });
            notas.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, Y, 40, 30));

            Y = Y + 40;
        }

        //Definitiva y promedio
        JLabel def = new JLabel("DEF CORTE:");
        def.setFont(new java.awt.Font("Tahoma", 1, 18));
        def.setForeground(new java.awt.Color(0, 0, 0));
        def.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        notas.add(def, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, Y + 40, 220, 40));
        JTextField totaldef = new JTextField();
        totaldef.setEditable(false);
        notas.add(totaldef, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, Y + 48, 80, 25));

        //Añade fondo
        notas.setMinimumSize(new java.awt.Dimension(500, Y + 120));
        notas.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, Y + 130));

        Y = 45;
    }
}
