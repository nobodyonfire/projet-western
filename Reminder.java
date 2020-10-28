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

        Scanner readinput = new Scanner(System.in);
        int enterkey = 0;
        enterkey = readinput.nextInt();
        valeur=enterkey;       
}

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("///////////////////////////"); 
            timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(int args) {
       new Reminder(args);
       
    }
    
    
    public int getvaleur(){
        return this.valeur;
    }
    
}