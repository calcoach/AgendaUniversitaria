
import Data.Course;
import Interface.WindowStartSesion;
import Interface.grades.AddGrades;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class NewClass {
    
   @Test
    public static void main(String [] args){
        
         AddGrades a = new AddGrades("1", new Course("Calculo", 5));
        
         
    }
}
