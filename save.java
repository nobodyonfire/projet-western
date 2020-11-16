package projet.java.western;
import java.io.IOException;

import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/* Classe pour sauvegarder */
public class save {
    
    /* Initialisation des variables */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";

    private static String FILENAME = "";
    
    /* Méthode permettant de sauvegarder dans le fichier save.txt */
    public static void Save(String args) {
        
        FILENAME=Main(FILENAME) + "\\src\\projet\\java\\western\\save.txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            String content =args;
            
            
            bw.write(content);

            System.out.println("");System.out.println("");
            System.out.println(ANSI_PURPLE_BACKGROUND+ANSI_WHITE+"Sauvegarde effectuée"+ANSI_RESET);
            System.out.println("");System.out.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    /* Méthode permettant de chercher le repertoire courant */
    public static String Main(String FILENAME) 
  {
    String curDir = System.getProperty("user.dir");
    
    return curDir;
  }
    
    /* Méthode permettant de lire dans le fichier save.txt */
    public static String lire(){
		
		try
		{	
			FILENAME=Main(FILENAME) + "\\src\\projet\\java\\western\\save.txt";
			
			FileReader fr = new FileReader(FILENAME);
			BufferedReader br = new BufferedReader(fr);
			
			String texte = "";
			int a = 0;
				while(a<2) //petite boucle 2 fois
				{
					texte = texte + br.readLine() + "\n";
					a++;		
				}
			br.close();
			
			
			 return texte;
		
		}
		catch(IOException ioe){System.out.println("erreur : " + ioe);}
		
                return "NULL";
		
	}
   
}