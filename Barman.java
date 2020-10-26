
package projet.java.western;





public class Barman extends Personnages{
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    
    public Barman(String Name, String Location, String Gun , String Job , int Niveau, int Argent) {
        super(Name,Location,Gun,Job,Niveau,Argent);
        
    }
    
    public void boire(){
        talk("Je te sers quoi ?"); 
    }
    
    @Override 
    public void introduceYourself(){
        talk(ANSI_PURPLE + "Hey salut moi c'est " + Name + " .Je suis le barman de ce bar je te sers quelque chose ? ptite biere ?" + ANSI_RESET); 
    }
    
    
    


    
    
    
}
