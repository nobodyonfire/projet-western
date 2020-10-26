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
public class Player extends Personnages{
    
    
    public Player(String Name, String Location, String Gun , String Job , int Niveau, int Argent) {
        super(Name,Location,Gun,Job,Niveau,Argent);

        
    }
    
   @Override 
   public void introduceYourself(){
        talk("Il est temps de rendre l'honneur et la prospérité à ce village !"); 
   }

}
