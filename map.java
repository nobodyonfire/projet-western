/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java.western;

/**
 *
 * @author ASUS
 */
public class map {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    
    public static void printcarte(){
        System.out.println(" ");
        System.out.println("                               ____________           ____________	     ____________");
        System.out.println("                            __/ ///////// /|	   __/ ///////// /|	  __/ ///////// /|");
        System.out.println("                           /              Â¯/|	  /              Â¯/|	 /              Â¯/|");
        System.out.println("                          /_______________/ |	 /_______________/ |	/_______________/ |");
        System.out.println("    ________________      |  __________  |  |	 |  __________  |  |	|  __________  |  |");
        System.out.println("   /               /|     | |          | |  |	 | |          | |  |	| |          | |  |");
        System.out.println("  /               / |     | |  "+ANSI_CYAN_BACKGROUND+ANSI_WHITE+"PRISON"+ANSI_RESET+"  | |  |	 | |  "+ANSI_CYAN_BACKGROUND+ANSI_WHITE+"SALOON"+ANSI_RESET+"  | |  |	| |  "+ANSI_CYAN_BACKGROUND+ANSI_WHITE+"BANQUE"+ANSI_RESET+"  | |  |");
        System.out.println(" /_______________/  |     | |          | |  |	 | |          | |  |	| |          | |  |");
        System.out.println("(_______________(   |     | |__________| | /     | |__________| | / 	| |__________| | /");
        System.out.println("(____"+ANSI_CYAN_BACKGROUND+ANSI_WHITE+"ARMURIE"+ANSI_RESET+"____(   |     |______________|/      |_____|_|______|/ 	|______________|/");
        System.out.println("(_______________(  /     |____>______<_____|____>______<_____|____>______<_____|_______<_____|");
        System.out.println("(_______________( /     /                                                               / ");
        System.out.println("(               (/     /                                                               /");
        System.out.println(" Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯      				 Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯Â¯  ");
        System.out.println(" ");
        
        
    }
    
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
    
}
