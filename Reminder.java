
package projet.java.western;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Reminder {
    
    Timer timer;
    int valeur;
    

    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);

        
        Scanner readinput = new Scanner(System.in);
        String enterkey = "12";
        enterkey = readinput.nextLine();
        setvaleur(valeur);
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
            timer.cancel(); 
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
    
    
    public void setvaleur(int valeur ){
        this.valeur=valeur;   
    }
    
    public int getvaleur(){
        return valeur;
    }
    
  
}