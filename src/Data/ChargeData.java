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
public class ChargeData {

    public ChargeData(String userSesion, String sem, int numSem) {

        this.sem = sem;
        this.userSesion = userSesion;
        actualSemester = new Semester(numSem);
        //Comprueba si el usuario tiene la carpeta del semestre
        if (data.createFile("Dt\\" + userSesion + "\\" + sem)
                | data.createArchive("Dt\\" + userSesion + "\\" + sem + "\\" + "info")) {

        } //Si la encuentra, luego carga la informacion
        else {
            ArrayList<String> info = data.readArchive("Dt\\" + userSesion + "\\" + sem + "\\" + "info");

            for (String i : info) {

                String[] split = i.split(",");
                for (int j = 0; j < split.length; j++) {

                    actualSemester.addCourse(split[j]);
                    numCourses++;
                }
            }

        }
    }

    Files data = new Files();
    Semester actualSemester;
    String userSesion;
    String sem;
    int idexCourse = 1;
    int numCourses = 0;

    public void addCourse(String name) {

        actualSemester.addCourse(name);
        numCourses++;
        String url = "Dt\\" + userSesion + "\\" + sem + "\\" + "info";

        this.data.writeArchive(url, name + ",");

    }

    public void deleteCourse(int num) {

        actualSemester.deleteCourse(num);

        data.overWriteArchie("Dt\\" + userSesion + "\\" + sem + "\\" + "info", actualSemester.getNameCourses());

        numCourses--;

    }

    public int getNumCourses() {

        return numCourses;
    }

    public String getNamesCourses(String userSesion, String sem, int numSem) {

        return actualSemester.getNameCourses();
    }

    public Course getCourse(int i) {

        if (i < numCourses) {
            //Cambia el nombre de usuario del estudiante del curso 
            actualSemester.getCourses().get(i).setNameUser(userSesion);
    
            return actualSemester.getCourses().get(i);

        } else {
            return null;
        }
    }
    
    

}
