/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.grades;

import Data.CUTTING;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class AddGrades {

    private int contGrades = 0;
    int Y = 45;
    JFrame notas = new JFrame();
    JScrollPane jSPanel = new JScrollPane();
    JPanel panel = new JPanel();
    ArrayList <JTextField> nameGrades = new ArrayList();
    ArrayList <JTextField> grades = new ArrayList();
    
    CUTTING cutting;

    public AddGrades(String num, CUTTING cutting) {

        this.cutting = cutting;
        init();

    }

    
    public void init() {

        //<editor-fold defaultstate="collapsed" desc="Show more" >
        notas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel.setBackground(Color.WHITE);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        notas.getContentPane().add(jSPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, Y, 600, 150));
        jSPanel.setViewportView(panel);
        notas.setMinimumSize(new java.awt.Dimension(700, 400));
        notas.setResizable(false);
        notas.setLocationRelativeTo(null);
        notas.setVisible(true);
        notas.setTitle("Notas del Corte");

        JLabel nameGrade = new JLabel("Nombre nota");
        JLabel percentage = new JLabel("%");
        JLabel nota = new JLabel("Nota");

        nameGrade.setFont(new java.awt.Font("Tahoma", 1, 15));
        nameGrade.setForeground(new java.awt.Color(0, 0, 0));
        nota.setFont(new java.awt.Font("Tahoma", 1, 15));
        nota.setForeground(new java.awt.Color(0, 0, 0));
        percentage.setFont(new java.awt.Font("Tahoma", 1, 15));
        percentage.setForeground(new java.awt.Color(0, 0, 0));
        notas.add(nameGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 15));
        notas.add(nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 15));
        notas.add(percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 15));

        newGrade();
        newGrade();

        JButton addGrade = new JButton("Nueva nota");
        addGrade.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newGrade();
            }
        });
        notas.add(addGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 100, 30));

        //Definitiva y promedio
        JLabel def = new JLabel("DEF CORTE:");
        def.setFont(new java.awt.Font("Tahoma", 1, 18));
        def.setForeground(new java.awt.Color(0, 0, 0));
        def.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        notas.add(def, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, Y + 150, 220, 40));
        JTextField totaldef = new JTextField();
        totaldef.setEditable(false);
        notas.add(totaldef, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, Y + 157, 80, 25));
        //Añade fondo
        JLabel background = new JLabel();
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/agenda_1500px.png")));
        background.setPreferredSize(new java.awt.Dimension(700, 400));
        notas.setMinimumSize(new java.awt.Dimension(700, 400));
        notas.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));
        notas.setVisible(true);
        
        //</editor-fold>
    }

    private void newGrade() {

        //<editor-fold defaultstate="collapsed" desc="Show more">
        final JToggleButton sets = new JToggleButton();
        final JTextField nameGrade = new JTextField();
        final JTextField grade = new JTextField();
        this.grades.add(grade);
        this.nameGrades.add(nameGrade);
        contGrades++;
        
        //NOMBRE NOTAS DEL CORTE
        nameGrade.setName(String.valueOf(contGrades));
        nameGrade.setEditable(false);
        nameGrade.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {

                grade.transferFocusDownCycle();

            }
        });
        panel.add(nameGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, Y - 25, 150, 30));

        //NOTAS DEL CORTE
        grade.setName(String.valueOf(contGrades));
        grade.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                //MODIFICAR NOTA
            }

            @Override
            public void focusLost(FocusEvent e) {

                if (!e.getOppositeComponent().equals(nameGrade)) {
                    if (!e.getOppositeComponent().equals(sets)) {
                        sets.setSelected(false);
                        nameGrade.setEditable(false);
                        grade.setEditable(false);
                    }

                }

            }
        });

        grade.setEditable(false);
        panel.add(grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, Y - 25, 150, 30));

        //Boton editar
        //Al dar clic cambia una nota
        sets.setName(String.valueOf(contGrades));
        sets.addActionListener((ActionEvent e) -> {
            if (sets.isSelected()) {

                nameGrade.setEditable(true);
                grade.setEditable(true);

            } else {
                if (!sets.isSelected()) {

                    nameGrade.setEditable(false);
                    grade.setEditable(false);
                }

            }
        });
        sets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/editar.png")));

        panel.add(sets, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, Y - 25, 40, 30));

        //Porcentaje
        JComboBox perc = new JComboBox<>();
        perc.setMinimumSize(new java.awt.Dimension(20, 20));
        perc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"10", "15", "20", "25", "35", "40", "45",
            "50", "55", "60", "65", "70", "75", "80", "85", "90", "95", "100"}));
        panel.add(perc, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, Y - 25, 40, 30));

        //Obtener informacion
        JButton info = new JButton();
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icon.png")));
        info.setFocusable(false);
        info.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Informacion: ");
        });
        panel.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, Y - 25, 40, 30));
        panel.updateUI();
        Y = Y + 40;

        //</editor-fold>
        
    }
    
    private void chargeGrades(){
        
        
    }
}
