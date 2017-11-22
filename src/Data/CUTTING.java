/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class CUTTING {
    
    private ArrayList<GRADE> grades;
    private double promCutting;
    private double calification;
    private double percentage;
    private String name;

    public CUTTING(String name, double promCutting, double percentage) {
        this.promCutting = promCutting;
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public ArrayList<GRADE> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<GRADE> grades) {
        this.grades = grades;
    }
    
    
    /**
     * Calcula la calificacion teniendo en cuenta el porcentaje
     * @return 
     */
    public double getCalification() {
        
        for(GRADE g: this.grades){
           
            calification = calification+g.getCalification();
        }
        
        return calification*this.percentage;
        
    }
    
    
    /**
     * Retorna la calificacion del corte
     * @return 
     */
    public double getCalificationSP(){
        
        for(GRADE g: this.grades){
           
            calification = calification+g.getCalification();
        }
        
        return calification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void setGrade(int section, double grade) {
        
        grades.get(section).setCalification(calification);
    }

    public void setNameGrade(int positionSection, String name) {

        grades.get(positionSection).setName(name);
    }
    
    public void setPercentageGrade(int positionSection, double name){
        
        grades.get(positionSection).setPercentage(percentage);
    }

    public void setDescription(int positionSection, String description) {
        
        grades.get(positionSection).setDescripton(description);
     }

    public void addGrade(GRADE grade) {

        grades.add(grade);
    }
    
    
}
