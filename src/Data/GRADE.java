/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Alejandro
 */
public class GRADE {
    
    private double calification;
    private String name;
    private typeGrade type;
    private double percentage;
    private String descripton;

    public GRADE(String name, typeGrade type, double percentage) {
        this.name = name;
        this.type = type;
        this.percentage = percentage;
        calification = -1;
    }

    public GRADE( String name, typeGrade type,double percentage, double calification, String descripton) {
        this.calification = calification;
        this.name = name;
        this.type = type;
        this.percentage = percentage;
        this.descripton = descripton;
    }
    

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getCalification() {
               
        return calification;
    }

    public void setCalification(double calification) {
        this.calification = calification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public typeGrade getType() {
        return type;
    }

    public void setType(typeGrade type) {
        this.type = type;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }
    
    
    
}
