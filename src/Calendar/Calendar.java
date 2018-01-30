// 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///
package Calendar;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JButton;


/**
 *
 * @author Alejandro
 */
public class Calendar extends javax.swing.JPanel {
    
    ArrayList<JButton> days=new ArrayList();
    LocalDate local;
    int buttonPainted;
      

    /**
     * Creates new form Calendar
     */
    public Calendar() {
        
        initComponents();
        addJButtonsToArray();
        Compiler.disable();
        updateCalendar(LocalDate.now());
        
    }
    
    private void addJButtonsToArray(){
       
        //<editor-fold defaultstate="collapsed" desc="Show more" >
        javax.swing.JButton k=new JButton();
       days.add(0,k);
       days.add(jButton1);
       days.add(jButton2);
       days.add(jButton3);
       days.add(jButton4);
       days.add(jButton5);
       days.add(jButton6);
       days.add(jButton7);
       days.add(jButton8);
       days.add(jButton9);
       days.add(jButton10);
       days.add(jButton11);
       days.add(jButton12);
       days.add(jButton13);
       days.add(jButton14);
       days.add(jButton15);
       days.add(jButton16);
       days.add(jButton17);
       days.add(jButton18);
       days.add(jButton19);
       days.add(jButton20);
       days.add(jButton21);
       days.add(jButton22);
       days.add(jButton23);
       days.add(jButton24);
       days.add(jButton25);
       days.add(jButton26);
       days.add(jButton27);
       days.add(jButton28);
       days.add(jButton29);
       days.add(jButton30);
       days.add(jButton31);
       days.add(jButton32);
       days.add(jButton33);
       days.add(jButton34);
       days.add(jButton35);
       days.add(jButton36);
       days.add(jButton37);
       days.add(jButton38);
       days.add(jButton39);
       days.add(jButton40);
       days.add(jButton41);
       days.add(jButton42);
         
       //</editor-fold>
    }
    
    private int [] getInfoOfMonth(LocalDate date){
        
        //<editor-fold defaultstate="collapsed" desc="Show more" >
        int [] info=new int[2];
        info[0]=date.lengthOfMonth();
        
        if(date.getMonthValue()<10){
          info[1]=LocalDate.parse(date.getYear()+"-"+"0"+date.getMonthValue()+"-"+"01").getDayOfWeek().getValue()+1;
        }
        
        else{
           info[1]=LocalDate.parse(date.getYear()+"-"+date.getMonthValue()+"-"+"01").getDayOfWeek().getValue()+1; 
        }

        return info;
        //</editor-fold>
    }
    
    private void paintDayActually(LocalDate date, int info){
        
        if(date.getYear()==LocalDate.now().getYear()){
            
            if(date.getMonthValue()==LocalDate.now().getMonthValue()){
                buttonPainted=LocalDate.now().getDayOfMonth()+info-1;
                this.days.get(LocalDate.now().getDayOfMonth()+info-1).setBackground(Color.red);
                this.jTextField1.setText(traslateMounth(local.getMonth().getValue())+" de "
                        +String.valueOf(local.getYear()));
                
            }
        }    
    }
    
    private void updateCalendar(LocalDate date){
        
         //<editor-fold defaultstate="collapsed" desc="Show more" >
        
        local=date;
        int [] info=getInfoOfMonth(date);
        int [] lastMounth;
        
         if(date.getMonthValue()==1){
                   
             lastMounth=this.getInfoOfMonth(date.withMonth(12).withYear(date.getYear()-1));
          }
               
          else{
             lastMounth=this.getInfoOfMonth(date.withMonth(date.getMonthValue()-1));
          }
               
        for(int i=1;i<43;i++){
            
         if(i<info[1]){ 
             
               days.get(i).setForeground(new java.awt.Color(153, 153, 153));
               days.get(i).setText(String.valueOf(lastMounth[0]-info[1]+1+i));
             
         }
                        
         else{
            
             if(i<info[0]+(info[1])){
                 
                days.get(i).setForeground(new java.awt.Color(0, 0, 0));
                days.get(i).setText(String.valueOf(i-info[1]+1));
               
            }
             
             else{
      
                days.get(i).setForeground(new java.awt.Color(153, 153, 153));
                days.get(i).setText(String.valueOf(i-info[0]-info[1]+1));
             
             }         
              
           }
        }  
        
        paintDayActually(date,info[1]);
        
        //</editor-fold>
    }
    
    
   
    private String traslateMounth(int mounth){
       
        //<editor-fold defaultstate="collapsed" desc="Devuelve el nombre de los meses ingresados">
        String [] mount=new String[13];
        mount[1]="Enero";
        mount[2]="Febrero";
        mount[3]="Marzo";
        mount[4]="Abril";
        mount[5]="Mayo";
        mount[6]="Junio";
        mount[7]="Julio";
        mount[8]="Agosto";
        mount[9]="Septiembre";
        mount[10]="Octubre";
        mount[11]="Noviembre";
        mount[12]="Diciembre";
        
        //</editor-fold>
        
        return mount[mounth];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        nextMount = new javax.swing.JButton();
        lastMounth = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(300, 400));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setText("29");
        jButton1.setBorderPainted(false);
        jButton1.setFocusCycleRoot(true);
        jButton1.setFocusPainted(false);
        jButton1.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 153, 153));
        jButton2.setText("30");
        jButton2.setBorderPainted(false);
        jButton2.setFocusCycleRoot(true);
        jButton2.setFocusPainted(false);
        jButton2.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 153));
        jButton3.setText("31");
        jButton3.setBorderPainted(false);
        jButton3.setFocusCycleRoot(true);
        jButton3.setFocusPainted(false);
        jButton3.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("1");
        jButton4.setBorderPainted(false);
        jButton4.setFocusCycleRoot(true);
        jButton4.setFocusPainted(false);
        jButton4.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("2");
        jButton5.setBorderPainted(false);
        jButton5.setFocusCycleRoot(true);
        jButton5.setFocusPainted(false);
        jButton5.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("3");
        jButton6.setBorderPainted(false);
        jButton6.setFocusCycleRoot(true);
        jButton6.setFocusPainted(false);
        jButton6.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("4");
        jButton7.setBorderPainted(false);
        jButton7.setFocusCycleRoot(true);
        jButton7.setFocusPainted(false);
        jButton7.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("5");
        jButton8.setBorderPainted(false);
        jButton8.setFocusCycleRoot(true);
        jButton8.setFocusPainted(false);
        jButton8.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("6");
        jButton9.setBorderPainted(false);
        jButton9.setFocusCycleRoot(true);
        jButton9.setFocusPainted(false);
        jButton9.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("7");
        jButton10.setBorderPainted(false);
        jButton10.setFocusCycleRoot(true);
        jButton10.setFocusPainted(false);
        jButton10.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setText("8");
        jButton11.setBorderPainted(false);
        jButton11.setFocusCycleRoot(true);
        jButton11.setFocusPainted(false);
        jButton11.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setText("9");
        jButton12.setBorderPainted(false);
        jButton12.setFocusCycleRoot(true);
        jButton12.setFocusPainted(false);
        jButton12.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setText("10");
        jButton13.setBorderPainted(false);
        jButton13.setFocusCycleRoot(true);
        jButton13.setFocusPainted(false);
        jButton13.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setText("11");
        jButton14.setBorderPainted(false);
        jButton14.setFocusCycleRoot(true);
        jButton14.setFocusPainted(false);
        jButton14.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setText("12");
        jButton15.setBorderPainted(false);
        jButton15.setFocusCycleRoot(true);
        jButton15.setFocusPainted(false);
        jButton15.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.setText("13");
        jButton16.setBorderPainted(false);
        jButton16.setFocusCycleRoot(true);
        jButton16.setFocusPainted(false);
        jButton16.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton17.setText("14");
        jButton17.setBorderPainted(false);
        jButton17.setFocusCycleRoot(true);
        jButton17.setFocusPainted(false);
        jButton17.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton18.setText("15");
        jButton18.setBorderPainted(false);
        jButton18.setFocusCycleRoot(true);
        jButton18.setFocusPainted(false);
        jButton18.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton19.setText("16");
        jButton19.setBorderPainted(false);
        jButton19.setFocusCycleRoot(true);
        jButton19.setFocusPainted(false);
        jButton19.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton20.setText("17");
        jButton20.setBorderPainted(false);
        jButton20.setFocusCycleRoot(true);
        jButton20.setFocusPainted(false);
        jButton20.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton21.setText("18");
        jButton21.setBorderPainted(false);
        jButton21.setFocusCycleRoot(true);
        jButton21.setFocusPainted(false);
        jButton21.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton22.setText("19");
        jButton22.setBorderPainted(false);
        jButton22.setFocusPainted(false);
        jButton22.setFocusTraversalPolicyProvider(true);
        jButton22.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton23.setText("20");
        jButton23.setBorderPainted(false);
        jButton23.setFocusCycleRoot(true);
        jButton23.setFocusPainted(false);
        jButton23.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton24.setBackground(new java.awt.Color(255, 255, 255));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton24.setText("21");
        jButton24.setBorderPainted(false);
        jButton24.setFocusCycleRoot(true);
        jButton24.setFocusPainted(false);
        jButton24.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton25.setBackground(new java.awt.Color(255, 255, 255));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton25.setText("22");
        jButton25.setBorderPainted(false);
        jButton25.setFocusCycleRoot(true);
        jButton25.setFocusPainted(false);
        jButton25.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton26.setBackground(new java.awt.Color(255, 255, 255));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton26.setText("23");
        jButton26.setBorderPainted(false);
        jButton26.setFocusCycleRoot(true);
        jButton26.setFocusPainted(false);
        jButton26.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton27.setBackground(new java.awt.Color(255, 255, 255));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setText("24");
        jButton27.setBorderPainted(false);
        jButton27.setFocusCycleRoot(true);
        jButton27.setFocusPainted(false);
        jButton27.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton28.setBackground(new java.awt.Color(255, 255, 255));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton28.setText("25");
        jButton28.setBorderPainted(false);
        jButton28.setFocusCycleRoot(true);
        jButton28.setFocusPainted(false);
        jButton28.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton29.setBackground(new java.awt.Color(255, 255, 255));
        jButton29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton29.setText("26");
        jButton29.setBorderPainted(false);
        jButton29.setFocusCycleRoot(true);
        jButton29.setFocusPainted(false);
        jButton29.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton30.setBackground(new java.awt.Color(255, 255, 255));
        jButton30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton30.setText("27");
        jButton30.setBorderPainted(false);
        jButton30.setFocusCycleRoot(true);
        jButton30.setFocusPainted(false);
        jButton30.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton31.setBackground(new java.awt.Color(255, 255, 255));
        jButton31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton31.setText("28");
        jButton31.setBorderPainted(false);
        jButton31.setFocusCycleRoot(true);
        jButton31.setFocusPainted(false);
        jButton31.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton32.setBackground(new java.awt.Color(255, 255, 255));
        jButton32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton32.setForeground(new java.awt.Color(153, 153, 153));
        jButton32.setText("1");
        jButton32.setBorderPainted(false);
        jButton32.setFocusCycleRoot(true);
        jButton32.setFocusPainted(false);
        jButton32.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton33.setBackground(new java.awt.Color(255, 255, 255));
        jButton33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton33.setForeground(new java.awt.Color(153, 153, 153));
        jButton33.setText("2");
        jButton33.setBorderPainted(false);
        jButton33.setFocusCycleRoot(true);
        jButton33.setFocusPainted(false);
        jButton33.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton34.setBackground(new java.awt.Color(255, 255, 255));
        jButton34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton34.setForeground(new java.awt.Color(153, 153, 153));
        jButton34.setText("3");
        jButton34.setBorderPainted(false);
        jButton34.setFocusCycleRoot(true);
        jButton34.setFocusPainted(false);
        jButton34.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton35.setBackground(new java.awt.Color(255, 255, 255));
        jButton35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton35.setForeground(new java.awt.Color(153, 153, 153));
        jButton35.setText("4");
        jButton35.setBorderPainted(false);
        jButton35.setFocusCycleRoot(true);
        jButton35.setFocusPainted(false);
        jButton35.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton36.setBackground(new java.awt.Color(255, 255, 255));
        jButton36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton36.setForeground(new java.awt.Color(153, 153, 153));
        jButton36.setText("5");
        jButton36.setBorderPainted(false);
        jButton36.setFocusCycleRoot(true);
        jButton36.setFocusPainted(false);
        jButton36.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton37.setBackground(new java.awt.Color(255, 255, 255));
        jButton37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton37.setForeground(new java.awt.Color(153, 153, 153));
        jButton37.setText("6");
        jButton37.setBorderPainted(false);
        jButton37.setFocusCycleRoot(true);
        jButton37.setFocusPainted(false);
        jButton37.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton38.setBackground(new java.awt.Color(255, 255, 255));
        jButton38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton38.setForeground(new java.awt.Color(153, 153, 153));
        jButton38.setText("7");
        jButton38.setBorderPainted(false);
        jButton38.setFocusCycleRoot(true);
        jButton38.setFocusPainted(false);
        jButton38.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton39.setBackground(new java.awt.Color(255, 255, 255));
        jButton39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton39.setForeground(new java.awt.Color(153, 153, 153));
        jButton39.setText("8");
        jButton39.setBorderPainted(false);
        jButton39.setFocusCycleRoot(true);
        jButton39.setFocusPainted(false);
        jButton39.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton40.setBackground(new java.awt.Color(255, 255, 255));
        jButton40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton40.setForeground(new java.awt.Color(153, 153, 153));
        jButton40.setText("9");
        jButton40.setBorderPainted(false);
        jButton40.setFocusCycleRoot(true);
        jButton40.setFocusPainted(false);
        jButton40.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton41.setBackground(new java.awt.Color(255, 255, 255));
        jButton41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton41.setForeground(new java.awt.Color(153, 153, 153));
        jButton41.setText("10");
        jButton41.setBorderPainted(false);
        jButton41.setFocusCycleRoot(true);
        jButton41.setFocusPainted(false);
        jButton41.setMargin(new java.awt.Insets(2, 3, 2, 3));

        jButton42.setBackground(new java.awt.Color(255, 255, 255));
        jButton42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton42.setForeground(new java.awt.Color(153, 153, 153));
        jButton42.setText("11");
        jButton42.setBorderPainted(false);
        jButton42.setFocusCycleRoot(true);
        jButton42.setFocusPainted(false);
        jButton42.setMargin(new java.awt.Insets(2, 3, 2, 3));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("LU");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("MA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("MI");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("JU");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("VI");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("SA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("DO");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 0, 0));
        jTextField1.setText("Febrero de 2017");
        jTextField1.setRequestFocusEnabled(false);

        nextMount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nextMount.setText(">");
        nextMount.setBorderPainted(false);
        nextMount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextMountActionPerformed(evt);
            }
        });

        lastMounth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastMounth.setText("<");
        lastMounth.setBorderPainted(false);
        lastMounth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastMounthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lastMounth, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nextMount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextMount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastMounth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );
    }// </editor-fold>//GEN-END:initComponents

     
   /* private void actionListener(){
        
        jButton1.addActionListener(new ActionListener(){      
          @Override
          public void actionPerformed(java.awt.event.ActionEvent evt){
              jButton1ActionPerformed(evt);
          }
          
    
        });
        jButton2.addActionListener(this::jButton1ActionPerformed);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        System.out.println("hola");
    }*/
    private void nextMountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextMountActionPerformed
        // TODO add your handling code here:
       days.get(buttonPainted).setBackground(Color.white);
       if(local.getMonthValue()==12){
            
            updateCalendar(local.withYear(local.getYear()+1).withMonth(1)); 
        }
            
        else{
            
             updateCalendar(local.withMonth(local.getMonthValue()+1));  
         }
       
       this.jTextField1.setText(traslateMounth(local.getMonth().getValue())+" de "+String.valueOf(local.getYear()));
    
    }//GEN-LAST:event_nextMountActionPerformed

    private void lastMounthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastMounthActionPerformed
        // TODO add your handling code here:
        days.get(buttonPainted).setBackground(Color.white);
        if(local.getMonthValue()==1){
            
            updateCalendar(local.withYear(local.getYear()-1).withMonth(12));
        }
            
        else{
            
             updateCalendar(local.withMonth(local.getMonthValue()-1));           
         }
       this.jTextField1.setText(traslateMounth(local.getMonth().getValue())+" de "+String.valueOf(local.getYear()));
    }//GEN-LAST:event_lastMounthActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton lastMounth;
    private javax.swing.JButton nextMount;
    // End of variables declaration//GEN-END:variables
}
