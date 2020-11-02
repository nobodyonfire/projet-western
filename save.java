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
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class save {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
   

    private static final String FILENAME = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Projet Java Western\\src\\projet\\java\\western\\save.txt";

    public static void Save(String args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

            String content =args;

            bw.write(content);

           //no need to close it.
           //bw.close();
            System.out.println("");System.out.println("");
            System.out.println(ANSI_PURPLE_BACKGROUND+ANSI_WHITE+"Sauvegarde effectuée"+ANSI_RESET);
            System.out.println("");System.out.println("");
        } catch (IOException e) {

            e.printStackTrace();

        }

    }
    
    
    public static String lire(){
		
		try
		{
				
			String adressedufichier = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Projet Java Western\\src\\projet\\java\\western\\save.txt";
			
			FileReader fr = new FileReader(adressedufichier);
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