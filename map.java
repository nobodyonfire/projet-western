package projet.java.western;

import java.util.Random;
import static projet.java.western.Personnages.ANSI_GREEN;

/* Classe Map qui contient tous les "affichage particulier" */
/* Je tiens à préciser que chacun des jeu / carte / affichage a été fait manuellement sans aucune forme d'aide exterieur */
/* ( oui sur la carte tous les batiments ont été fait à la main sur un fichier texte) */
public class map {
    
    /* Initialisation des variables */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    /* Méthode pour afficher la carte */
    public static void printcarte(){
         
        System.out.println(" ");
        System.out.println("		                                                                                         ___");
        System.out.println("	                                                                                               __|_|__");
        System.out.println("                                                                                                      |_______|");
        System.out.println("                               ____________           ____________	     ____________              	 | |");
        System.out.println("                            __/ ///////// /|	   __/ ///////// /|	  __/ ///////// /|	       __| |___");
        System.out.println("                           /              Â¯/|	  /              Â¯/|	 /              Â¯/|	      / ///\\\\\\ \\");
        System.out.println("                          /_______________/ |	 /_______________/ |	/_______________/ |	     / ////\\\\\\\\ \\");
        System.out.println("    ________________      |  __________  |  |	 |  __________  |  |	|  __________  |  |     ____/ /////\\\\\\\\\\ \\");
        System.out.println("   /               /|     | |          | |  |	 | |          | |  |	| |          | |  |    |		  |	");
        System.out.println("  /               / |     | |  "+ANSI_GREEN_BACKGROUND+ANSI_WHITE+"PRISON"+ANSI_RESET+"  | |  |    | |  "+ANSI_GREEN_BACKGROUND+ANSI_WHITE+"SALOON"+ANSI_RESET+"  | |  |	| |  "+ANSI_GREEN_BACKGROUND+ANSI_WHITE+"BANQUE"+ANSI_RESET+"  | |  |    |  ___	"+ANSI_GREEN_BACKGROUND+ANSI_WHITE+"EGLISE"+ANSI_RESET+"     |");
        System.out.println(" /_______________/  |     | |          | |  |	 | |          | |  |	| |          | |  |    |  | |	|  | |	  |");
        System.out.println("(_______________(   |     | |__________| | /     | |__________| | / 	| |__________| | /     |	|  | |	  |");
        System.out.println("(____"+ANSI_GREEN_BACKGROUND+ANSI_WHITE+"ARMURIE"+ANSI_RESET+"____(   |     |______________|/      |_____|_|______|/ 	|______________|/      |________|__|_|____|	");
        System.out.println("(_______________(  /     |____>______<_____|____>______<_____|____>______<_____|_______<_____|");
        System.out.println("(_______________( /     /                                                               / ");
        System.out.println("(               (/     /                                                               /");
        System.out.println(" Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯      				 Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯  ");
        System.out.println(" ");
        
    }
    
    /* Méthode pour afficher le piano */
    public static void printpiano(int emplacement,String valeur){
        String[] liste= {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
        liste[emplacement]=valeur;
        
        System.out.println("");
        System.out.println(" ____________________________________________________________________________________");
        System.out.println("|  |#| |#| |#|  |  |#| |#|  |  |#| |#| |#|  |  |#| |#|  |  |#| |#| |#|  |  |#| |#|  |");
        System.out.println("|  |#| |#| |#|  |  |#| |#|  |  |#| |#| |#|  |  |#| |#|  |  |#| |#| |#|  |  |#| |#|  |");
        System.out.println("|  |#| |#| |#|  |  |#| |#|  |  |#| |#| |#|  |  |#| |#|  |  |#| |#| |#|  |  |#| |#|  |");
        System.out.println("|  |#| |#| |#|  |  |#| |#|  |  |#| |#| |#|  |  |#| |#|  |  |#| |#| |#|  |  |#| |#|  |");
        System.out.println("|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |");
        System.out.println("| "+liste[0]+" | "+liste[1]+" | "+liste[2]+" | "+liste[3]+" | "+liste[4]+" | "+liste[5]+" | "+liste[6]+" | "+liste[7]+" | "+liste[8]+" | "+liste[9]+" | "+liste[10]+" | "+liste[11]+" | "+liste[12]+" | "+liste[13]+" | "+liste[14]+" | "+liste[15]+" | "+liste[16]+" | "+liste[17]+" | "+liste[18]+" | "+liste[19]+" | "+liste[20]+" | ");
        System.out.println("|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
        System.out.println("");
    }
    
    /* Méthode pour afficher le jeu séduire */
    public static void printseduire(int emplacement){
        String[] liste= {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
        liste[emplacement]="X";
        
        
        System.out.println("");
        System.out.println(" B 0 1 2 3 4 5 ");
        System.out.println("A _____________");
        System.out.println("0 |"+liste[1]+" "+liste[2]+" "+liste[3]+" "+liste[4]+" "+liste[5]+" "+liste[6]+"|");
        System.out.println("1 |"+liste[7]+" "+liste[8]+" "+liste[9]+" "+liste[10]+" "+liste[11]+" "+liste[12]+"|");
        System.out.println("2 |"+liste[13]+" "+liste[14]+" "+liste[15]+" "+liste[16]+" "+liste[17]+" "+liste[18]+"|");
        System.out.println("3 |"+liste[19]+" "+liste[20]+" "+liste[21]+" "+liste[22]+" "+liste[23]+" "+liste[24]+"|");
        System.out.println("4 |"+liste[25]+" "+liste[26]+" "+liste[27]+" "+liste[28]+" "+liste[29]+" "+liste[30]+"|");
        System.out.println("5 |"+liste[31]+" "+liste[32]+" "+liste[33]+" "+liste[34]+" "+liste[35]+" "+liste[36]+"|");
        System.out.println("  ¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("");    
        
    }   
    
    /* Méthode pour afficher l'écran de chargement */
    public static void printbienvenu(Player player,String string,int k){
        
        int taille = 0;
      
        if (k==1){
            taille = player.getName().length();  
        }
        else {
           taille = string.length();
        }
        
      
        int a = 50;
        System.out.println(""); 
        
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.print(" /~~~\\/~~\\/~~~\\/~~~\\/~~\\/~~~\\"); 
        for (int i = 0; i < taille + 12; ++i) System.out.print(" ");
        System.out.println("/~~~\\/~~\\/~~~\\/~~~\\/~~\\/~~~\\"); 
        
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.print(" | /\\/ /\\/ /\\ || /\\/ /\\/ /\\ |"); 
        for (int i = 0; i < taille/2+2 ; ++i) System.out.print(" ");
        System.out.print("BIENVENUE");  
        for (int i = 0; i < taille/2+2 ; ++i) System.out.print(" ");
        System.out.println("| /\\ \\/\\ \\/\\ || /\\ \\/\\ \\/\\ |"); 
        
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.print(" \\ \\/ /\\/ /\\/ /\\ \\/ /\\/ /\\/ /"); 
        for (int i = 0; i < taille + 12; ++i) System.out.print(" ");
        System.out.println("\\ \\/\\ \\/\\ \\/ /\\ \\/\\ \\/\\ \\/ /"); 
        
        
        if (k==1){
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.print(" \\ \\/\\ \\/\\ \\/  \\ \\/\\ \\/\\ \\/ "); 
        for (int i = 0; i < 7; ++i) System.out.print(" ");
        System.out.print(ANSI_GREEN+player.getName()+ANSI_RESET); System.out.print("");
        for (int i = 0; i < 5; ++i) System.out.print(" ");
        System.out.println(" \\/ /\\/ /\\/ /  \\/ /\\/ /\\/ /"); 
        }
        else{
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.print(" \\ \\/\\ \\/\\ \\/  \\ \\/\\ \\/\\ \\/ "); 
        for (int i = 0; i < 7; ++i) System.out.print(" ");
        System.out.print(ANSI_GREEN+string+ANSI_RESET); System.out.print("");
        for (int i = 0; i < 5; ++i) System.out.print(" ");
        System.out.println(" \\/ /\\/ /\\/ /  \\/ /\\/ /\\/ /");  
        }
     
        
        
        
        
        
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.print(",_/\\ \\/\\ \\/\\ \\__/\\ \\/\\ \\/\\ \\_"); 
        for (int i = 0; i < taille + 12; ++i) System.out.print("_");
        System.out.println("_/ /\\/ /\\/ /\\__/ /\\/ /\\/ /\\_,"); 
        
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.print("(__/\\__/\\__/\\____/\\__/\\__/\\__"); 
        for (int i = 0; i < taille + 12; ++i) System.out.print("_");
        System.out.println("__/\\__/\\__/\\____/\\__/\\__/\\__)"); 
        
        System.out.println("");   
        System.out.println("");   
        System.out.println("");  

        
    }
    
    /* Méthode pour afficher le chemin actuel */
    public static int printchemin(int a,int random){
        
        String[] liste= {" "," "," "};
        
        
        int[] listehisto = {0,0,0};
        
        liste[random]="X";
        
        for (int i = 0; i < a+8; ++i) System.out.print(" ");
        System.out.println("| |");
        for (int i = 0; i < a+8; ++i) System.out.print(" ");
        System.out.println("|"+ANSI_GREEN+"0"+ANSI_RESET+"|");
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.println("       /   \\");
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.println("      /     \\");
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.println("     / /| |\\ \\");
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.println("    / / | | \\ \\");
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.println("   |"+ANSI_RED+liste[0]+ANSI_RESET+"|  |"+ANSI_RED+liste[1]+ANSI_RESET+"|  |"+ANSI_RED+liste[2]+ANSI_RESET+"| ");
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.println("   | |  | |  | | "); 
        return random;
    }
    
    /* Méthode pour afficher le chemin suivant */
    public static void printpartchemin(int a){
        
        for (int i = 0; i < a+8; ++i) System.out.print(" ");
        System.out.println("| |");
        
        for (int i = 0; i < a+8; ++i) System.out.print(" ");
        System.out.println("| |");
        
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.println("       /   \\");
        
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.println("      /     \\");
        
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.println("     / /| |\\ \\");
        
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.println("    / / | | \\ \\");
        
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.println("   | |  | |  | | "); 
        
        for (int i = 0; i < a; ++i) System.out.print(" ");
        System.out.println("   | |  | |  | | "); 
    }

    /* Méthode qui permet d'avoir un nom entre min et max */
     private static int getRandomNumberInRange(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("MAX > MIN");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
}
