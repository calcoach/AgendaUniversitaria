/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion;
import Data.Files;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public final class Sesion {
    
    public Sesion(){
        super();
        
    }
    
    public String userName;
    
    
    public boolean StartSesion(String username, String pass){ 
        
       File search=new File("Dt"+"\\"+username);
       //Comprueba si el usuario existe
       if(search.exists()){
    
       ArrayList<String> data=new ArrayList();

       Files lee= new Files();
       data=lee.readArchive("Dt"+"\\"+username+"\\"+username);
       String [] split=data.get(0).split(",");

        //Comprueba la contraseña   
       if(split[3].equals(pass)){
           
           lee.writeArchive("Sesion", username);
           userName=username;
           return true;  
          }  
       }
       
           return false;
    }
    
    public boolean expelIntruder(String user){
        
        String [] names=new String[10];
        names[0]="lolo";
        names[1]="marcos";
        
        for(String i: names){
            if(user.equalsIgnoreCase(i)){
                
                return true;
              }
         }
       return false;
    }
    
    public static void closeSesion(){
        
        File sesion=new File("Sesion.txt");
        sesion.delete();
    }
    
}
