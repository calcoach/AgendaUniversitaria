/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Alejandro
 */
public class Files {
        
  private User user;      
  private  static File archive;
       
  
  public Files(){ 
      File parent=new File("Dt");
      parent.mkdir();
  }
 
  public boolean createFile(String rute){
      
     File file=new File(rute);
     if(!file.exists()){
         file.mkdir();
         return true;
     }
     else{
         return false;
     }
  }
  
  public boolean createArchive(String url){
      
      archive=new File(url+".txt");
      
      if(!archive.exists()){
       try{
          archive.createNewFile(); 
           System.out.println("d");
          return true;
       } catch(IOException e){
          JOptionPane.showMessageDialog(null, "No se puede crear archivo");
          return false;
       } 
       
      }
      return false;
  }
  
  
  public ArrayList readArchive(String rute ){
      
     this.archive = new File(rute+".txt");
     
     try{
         
         ArrayList<String> data = new ArrayList();
         FileReader read=new FileReader(archive);
         
         BufferedReader lee=new BufferedReader(read);
         
         while(lee.ready()){
            
            data.add(lee.readLine());
            
         } 
         
         read.close();
         lee.close();
         
         return data;       
     
     } catch(IOException e){
       JOptionPane.showMessageDialog(null, "Error al abrir la informacion");
       }
     return null; 
     
  }
  
  
  public void writeArchive(String name, ArrayList<String> datos) {
      
      this.archive = new File(name+".txt");
      
      try(FileWriter escribir = new FileWriter(archive) ) {
          
          
          for(String i: datos){
          
              escribir.write(i);
          }
          
          escribir.close();
      
      } catch (IOException e) {
          JOptionPane.showMessageDialog(null, "Error al escribir en el archivo");
      }
      
  }   
  
    
  public void writeArchive(String name,String data) {
      
      this.archive = new File(name+".txt");
      
      try(FileWriter escribir = new FileWriter(archive,true)) {
          
          escribir.write(data);
          
          escribir.close();
 
      } catch (IOException e) {
          JOptionPane.showMessageDialog(null, "Error al escribir en el archivo");
      }
      
  }
  
  public void overWriteArchie(String name,String data) {
      
      this.archive = new File(name+".txt");
      
      try(FileWriter escribir = new FileWriter(archive)) {
          
          escribir.write(data);
          
          escribir.close();
 
      } catch (IOException e) {
          JOptionPane.showMessageDialog(null, "Error al escribir en el archivo");
      }
      
  }
  
  
  public void createNewUser(int id, String userName, String name, String pass ) {
      
      user= new User(id,userName,name,pass);
      String data=id+","+userName+","+name+","+pass;
      
      File directory=new File("Dt"+"\\"+userName);
      directory.mkdir();
      writeArchive("Dt"+"\\"+userName+"\\"+userName, data);
      
  }
  
 
    
}
