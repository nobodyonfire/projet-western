
package projet.java.western;




public class Player extends Personnages{
    
    
    public Player(String Name, String Location, Arme Gun , String Job , int Niveau, int Argent) {
        super(Name,Location,Gun,Job,Niveau,Argent);

        
    }
    
   @Override 
   public void introduceYourself(){
        talk("Il est temps de rendre l'honneur et la prospérité à ce village !"); 
   }

}
