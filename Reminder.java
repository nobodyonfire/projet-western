
package projet.java.western;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/* Classe du Reminder (non utilisé car mini jeu avec des bugs*/
public class Reminder {
    
    /* Initialisation des variables */
    Timer timer;
    int valeur;
    
    /* Méthode qui créer une action sur le temps */
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
    /* Classe spéciale qui permet d'arreter le temps dans le calendrier */
    class RemindTask extends TimerTask {
        public void run() {
            System.out.println(""); 
            System.out.println(""); 
            timer.cancel(); 
        }
    }

    /* Main/ Constructeur */
    public static void main(int args) {
       new Reminder(args);
       
    }
    
    /* Méthode qui permet de savoir si un string est un int */
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
    
    /* Mutator */
    public void setvaleur(int valeur ){
        this.valeur=valeur;   
    }
    
    /* Constructor */
    public int getvaleur(){
        return valeur;
    }

}