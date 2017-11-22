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
public class User {
    
    private int id;
    private String userName;
    private String pass;
    private String name;
    private ArrayList <Semester> dataSemesters;
    
    public User(int id, String userName, String name, String pass){
        this.id=id;
        this.name=name;
        this.userName=userName;
        this.pass=pass;
    }
    
    public void setID(int id){
        this.id=id;
    }
    
    public int getID(){
        return this.id;
    }
    
    public void setNameUser(String nameUser){
        this.userName=nameUser;
    }
    
    public String getNameUser(){
        return this.userName;
    }
    
    public void setPass(String pass){
        this.pass=pass;
    }
    
    public String getPass(){
        return this.pass;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addSemester(int num){
        Semester newSemester=new Semester(num);
        this.dataSemesters.add(newSemester);
    }
    
    
}
