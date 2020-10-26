/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java.western;
import static java.lang.constant.ConstantDescs.NULL;

/**
 *
 * @author ASUS
 */
public class ProjetJavaWestern {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {
        
        System.out.println(" ");
        System.out.println(ANSI_RED_BACKGROUND +  ANSI_WHITE+ "DEBUT INITIALISATION " + ANSI_RESET);
        System.out.println(" ");
        
        
        Sherif Robbert = new Sherif("Robbert", "Saloon", "NULL", "NULL", 0,0,100,"pate bolo",10);
        Saloon le7iemeciel = new Saloon("Le 7 ième ciel",10);
        
        Player Joueur = new Player("Alexis","le7iemeciel","NULL" , "NULL", 1, 0); 
        
        System.out.println(" ");
        System.out.println(ANSI_RED_BACKGROUND +  ANSI_WHITE+  "FIN INITIALISATION " + ANSI_RESET);
        System.out.println(" ");
        System.out.println(" ");
  
        clearScreen(1);
  
        
        didactitiel();
        
        
        le7iemeciel.question();
        
  
    }
    
    
    
    
    public static void clearScreen(int j) {  

        for (int i = 0; i < j; ++i) System.out.println("");

    }
    
    public static void didactitiel(){
        
        System.out.println(ANSI_CYAN +"« Dans la ville de Widowchapel, réputé pour le nombre de chasseur de prime qui y meurt.");
        System.out.println(ANSI_CYAN + " Vous apparaissez, afin de faire régner l’ordre ,de capturer les malfrat tout en protégeant la ville des attaques , en s’équipant d’arme de plus en plus puissantes.");
        System.out.println(ANSI_CYAN + "Les risques et les récompenses sont toutes deux élevés. »");
        
        try {  Thread.sleep(5000); } catch (InterruptedException ie) {}   
    
    
    }
    
        
}
