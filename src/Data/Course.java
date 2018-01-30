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
public class Course {
    
    private String nameUser;
    private String nameCourse;
    int sections; //Cortes, por defecto es 1
    ArrayList<CUTTING> cuttings;
    
    
    //Necesita como parametros nombre del curso, y cortes
    public Course(String nameCourse, int sections){
        this.nameCourse=nameCourse;
        this.sections=sections;
        cuttings = new ArrayList();
    }

    public void addGrade(String name,typeGrade type, int section,double percentage,double note, String description){
     
        GRADE newGrade = new GRADE(name,type, percentage, note, description);
        cuttings.get(section).addGrade(newGrade);
    }
    
    public void addGrade(String name, typeGrade type, int section, double percentage){
        
        GRADE newGrade = new GRADE(name, type, percentage);
        cuttings.get(section).addGrade(newGrade);
    }
    
    public double calculateDef(){
        
       double def=0;
       for(CUTTING c : cuttings){
           
           def = def + c.getCalification();
       }
       
       return def;
    }
    
    public double calculateProm(){
        
       double cont = 0;
       double sum = 0;
       
       for(CUTTING c : cuttings){
           
         sum = sum+(c.getCalification()*c.getPercentage());
         cont = cont + c.getPercentage();
       }
       return sum/cont;
    }
   
    public double getGrade(int section, int positionSection){
      
       return this.cuttings.get(section).getGrades().get(positionSection).getCalification();
        
    }
    
    public String getNameCourse(){
        return this.nameCourse;
    }
    
    public String getNameUser(){
        
        return nameUser;
    }
    
    public void setGrade(int section, int positionSection,double grade){
        
        this.cuttings.get(section).setGrade(positionSection, grade);
    }
    
    public void sePercentageGrade(int section, int positionSection, double percentage){
        
        this.cuttings.get(section).setPercentageGrade(positionSection, percentage);
    }
    
    public void setNameGrade(int section, int positionSection,String name){
        
        cuttings.get(section).setNameGrade(positionSection,name);
    }
    
    public void setNameDescriptionGrade(int cutting, int numGrade,String description){
        
       cuttings.get(cutting).setDescriptionGrade(numGrade,description);

    }
    
    public void setNameCourse(String nameCourse){
        this.nameCourse=nameCourse;
    }
    
    public void setNameUser(String name){
        this.nameUser=name;
    }

}
