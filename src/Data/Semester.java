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
public class Semester {
    
    int numSemester;
    ArrayList<Course> courses= new ArrayList();
    
    public Semester(int num){
        this.numSemester=num;
    }
    
    public void addCourse(String name){

        Course newCourse=new Course(name,3);
        courses.add(newCourse);
    }
    
    public void deleteCourse(int num){
        
        courses.remove(num);
        
    }
    
    
    
    public String getNameCourses(){
        
        String nameCourses="";
        
        for(Course i: courses){
           nameCourses=nameCourses+i.getNameCourse()+",";
        }
        
        return nameCourses;
    }
    
    public int getNumCourses(){
        return this.courses.size();
    }
    
    public Course getCourse(String nameCourse){
        
        for (Course c : this.courses){
            
            if(c.getNameCourse().equals(nameCourse)){
                return c;
            }
        }
        
        return null;
    }
    
    public ArrayList<Course> getCourses(){
        
        return courses;
    }
    
}
