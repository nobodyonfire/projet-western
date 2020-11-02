/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java.western;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author ASUS
 */
public class Reminder {
    
    Timer timer;
    
    public static int valeur=0;

    public Reminder(int seconds) {
        timer = new Timer();
        
        timer.schedule(new RemindTask(), seconds*1000);

        int valeur =0;
        Scanner readinput = new Scanner(System.in);
        String enterkey = "0";
        enterkey = readinput.nextLine();
        if (isNumeric(enterkey)){
            valeur=Integer. parseInt(enterkey); 
        }
        else{
            valeur=0;
        }
              
}

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println(""); 
            System.out.println(""); 
            timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(int args) {
       new Reminder(args);
       
    }
    
    public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        int d =  Integer. parseInt(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
    
    
    public int getvaleur(){
        return this.valeur;
    }
    
}