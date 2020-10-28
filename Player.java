
package projet.java.western;




public class Player extends Personnages{
    
    int etat;
    int HP;
    
    
    public Player(String Name, String Location, Arme Gun , String Job , int Niveau, int Argent, int etat, int HP) {
        super(Name,Location,Gun,Job,Niveau,Argent);
        this.etat = etat;
        this.HP = HP;

        
    }
    
   @Override 
   public void introduceYourself(){
        talk("Il est temps de rendre l'honneur et la prospérité à ce village !"); 
   }

}
