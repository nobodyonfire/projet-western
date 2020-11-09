
package projet.java.western;
import java.util.Random;
import java.util.Scanner;

public class Arme implements Comparable{
    String name;
    int puissanceMax;
    int puissanceMin;
    int accuracy;
    int prix;
    String Savename;
    
    
    
    public Arme(String name, int puissanceMax, int puissanceMin, int accuracy, int prix){
        this.name = name;
        this.puissanceMax = puissanceMax;
        this.puissanceMin = puissanceMin;
        this.accuracy = accuracy;
        this.prix = prix;
    }
    
    
    
    public String getname(){
        return this.name;
    }
    public int getpuissanceMax (){
        return this.puissanceMax;
    }
    public int getpuissanceMin (){
        return this.puissanceMin;
    }
    public int getaccuracy (){
        return this.accuracy;
    }
    public int getprix (){
        return this.prix;
    }
    
 

    
    public void Setname(String name){
        this.name = name;
    } 
    public void SetpuissanceMax(int puissanceMax){
        this.puissanceMax = puissanceMax;
    } 
    public void SetpuissanceMin(int puissanceMin){
        this.puissanceMin = puissanceMin;
    } 
    public void Setaccuracy(int accuracy){
        this.accuracy = accuracy;
    } 
    public void Setprix(int prix){
        this.prix = prix;
    } 
    
    public int puissance(Arme gun){
        Random r = new Random();
        int interval = gun.puissanceMax - gun.puissanceMin;
        int degat = r.nextInt(interval) + gun.puissanceMin;
        return degat;
    }
    
    public boolean toucher(Arme gun){
        Random r = new Random();
        boolean toucher = false;
        if (r.nextInt(100)< gun.accuracy){
            toucher = true;
        }
        return toucher;
    }
    
    
    
    
    
    
    
    public static void minijeurandom(){
        int a =getRandomNumberInRange(1,2);
        
        if (a==1){
            minijeu1();
        }
        if (a==2){
            minijeu2();
        }
        
    }
    
    
    
   public static int minijeu1(){
       System.out.println("TIR 1 ; Des chiffres vont apparaître, il faut les réécrire le plus vite possible !");
       pressenter();
       System.out.println("3");
       sleep(1000);
       System.out.println("2");
       sleep(1000);
       System.out.println("1");
       sleep(1000);
       System.out.println("GO ");
       sleep(1000);
       System.out.println(" ");
       System.out.println("///////////////////////////"); 
       System.out.println(" ");
       int succes=0;
       
       for (int i = 0; i <3 ; ++i) {
       
            int a =getRandomNumberInRange(1,100);
            System.out.print(a);
            System.out.println(" ");
            
            Reminder test= new Reminder(3);
            sleep(500);
            int valeur =test.getvaleur();

            if (a==valeur){succes=succes+1;}
 
       }
      
       System.out.println("Vous avez fait un " + succes +" / " + "3");
       return succes;
   }
   
  
  
   public static int minijeu2(){
       System.out.println("TIR 2 ; Des chiffres vont apparaître, il faut les réécrire le plus vite possible !");
       pressenter();
       System.out.println("3");
       sleep(1000);
       System.out.println("2");
       sleep(1000);
       System.out.println("1");
       sleep(1000);
       System.out.println("GO ");
       sleep(1000);
       System.out.println(" ");
       System.out.println("///////////////////////////"); 
       System.out.println(" ");

       int a =getRandomNumberInRange(10000,1000000);
       System.out.print(a);
       System.out.println(" ");

       Reminder test= new Reminder(10);
       sleep(500);
       int valeur =intToString(test.getvaleur());
       System.out.println("valeur" + "a "+valeur+a);
       if (a==valeur){
           System.out.println("Vous avez réussi !");
           return 1;
                   
       }
       else{
           System.out.println("Vous avez échoué..");
           return 0;
       }  
       
       
   }
   
     static int intToString(int valeur) {
       String valeurstring= Integer.toString(valeur);
       valeurstring.substring(1);
       return Integer.parseInt(valeurstring);
    }


   
   
   
   
    private static int getRandomNumberInRange(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("MAX > MIN");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
    
    public static void sleep(int temps){
        try {  Thread.sleep(temps); } catch (InterruptedException ie) {}
    }
    
    public static void clearScreen(int j) {  

        for (int i = 0; i < j; ++i) System.out.println("");

    }
    public static void pressenter(){
        Scanner readinput = new Scanner(System.in);
        String enterkey = "appuyer sur entrer...";
        System.out.print(enterkey);
        enterkey = readinput.nextLine();
        System.out.print(enterkey);
    
    }
    
    
    
    
    
    @Override
    public int compareTo(Object other) {
        Arme user1 = (Arme) other;
        if(this.getprix()<=user1.getprix()) {
            return this.getprix();
        } else {
            return user1.getprix();
        }

    }
}
    
    
    
    
    
    
