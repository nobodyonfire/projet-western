package projet.java.western;
import java.util.Random;
import java.util.Scanner;

/* Nous initions la classe Arme avec l'implements "Comparable" afin de pouvoir les trier par la suite */
public class Arme implements Comparable, getRandomNumberInRange{
    
    /* Dans la classe Arme nous avons les attributs suivants */
    String name;
    int puissanceMax;
    int puissanceMin;
    int accuracy;
    int prix;
    String Savename;
    
    
    /* Constructeur */
    public Arme(String name, int puissanceMax, int puissanceMin, int accuracy, int prix){
        this.name = name;
        this.puissanceMax = puissanceMax;
        this.puissanceMin = puissanceMin;
        this.accuracy = accuracy;
        this.prix = prix;
    }
    
    
    /* Accessors */
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
    
 

    /* Mutators */
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
    
    /* Cette méthode sert à retourner un nombre de dégat qui dépent des caractéristiques de l'arme , ainsi qu'une part d'aléatoire */
    public int puissance(Arme gun){
        int interval = gun.getpuissanceMax() - gun.getpuissanceMin();
           
        int a =getRandomNumberInRange(0,interval);
        int degat = a + gun.getpuissanceMin();
        return degat;
    }
    
    /* Cette méthode sert à savoir si l'arme à toucher sa cible en fonction de sa précision */
    public boolean toucher(Arme gun){
        int a =getRandomNumberInRange(1,100);
        boolean toucher = false;
        if (a <= gun.accuracy){
            toucher = true;
        }
        return toucher;
    }
    
    
    

    /* Cette méthode permet de choisir un mini-jeu aléatoire dans ceux que l'on a fait 
    mais pour l'instant il y a quelques soucis avec la classe reminder...*/
    public void minijeurandom(){
        int a =getRandomNumberInRange(1,2);
        
        if (a==1){
            minijeu1();
        }
        if (a==2){
            minijeu2();
        }
        
    }
    
    
   /* Nous avons ici la méthode pour le mini-jeu numéro 1 , où nous faisons appaître des chiffres et avec la classe reminder 
    l'utilisateur a un temps donné pour les rentrer*/ 
   public int minijeu1(){
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
   
  
   /* Nous avons ici la méthode du mini-jeu 2 où avec la classe reminder , nous affichons une série de chiffre et nous demandons à l'utilisateur 
   de les réécrire dans le bon ordre*/
   public int minijeu2(){
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
       int valeur =test.getvaleur();
       if (a==valeur){
           System.out.println("Vous avez réussi !");
           return 2;
                   
       }
       else{
           System.out.println("Vous avez échoué..");
           return 1;
       }  
       
       
   }
   
   /* Méthode qui nous aide pour les minis jeux, enlever les 0 superflus */
     static int intToString(int valeur) {
       String valeurstring= Integer.toString(valeur);
       valeurstring.substring(1);
       return Integer.parseInt(valeurstring);
    }
   
   /* Méthode qui permet d'avoir un nom entre min et max */
    @Override
    public int getRandomNumberInRange(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("MAX > MIN");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
    
    /* Méthode pour sleep */
    public static void sleep(int temps){
        try {  Thread.sleep(temps); } catch (InterruptedException ie) {}
    }
    
    /* Méthode pour passer à la ligne j fois*/
    public static void clearScreen(int j) {  

        for (int i = 0; i < j; ++i) System.out.println("");

    }
    
    /* Méthode pour demander à l'utilisateur d'appuyer sur entrer */
    public static void pressenter(){
        Scanner readinput = new Scanner(System.in);
        String enterkey = "appuyer sur entrer...";
        System.out.print(enterkey);
        enterkey = readinput.nextLine();
        System.out.print(enterkey);
    
    }
    
    /* Méthode qui permet de comparer les armes en fonction de leur prix
    mais nous avons des classes dédiées pour les autres comparaisons*/
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
    
    
    
    
    
    
