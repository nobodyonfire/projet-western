
package projet.java.western;

/* Classe Cowboy qui est un personnage */
public class CowBoy extends Personnages {
    
    /* Initialisation des variables */
    protected int TruthLevel;
    protected String FavoritePlate;
    
    /* Constructeur */
    public CowBoy(String Name, Location Location, Arme Gun , String Job, int Argent,int TruthLevel,String FavoritePlate) {
        super(Name,Location,Gun,Job,Argent);
        this.TruthLevel=TruthLevel;
        this.FavoritePlate=FavoritePlate;

    }
    
    /* Accessors */
    public int getTruthLevel(){
        return this.TruthLevel;
    }
    
    public String getFavoritePlate(){
        return this.FavoritePlate;
    }
    
    /* Mutators */
    public void setTruthLevel(int TruthLevel){
        this.TruthLevel = TruthLevel;
    }
    
    public void setFavoritePlate(String FavoritePlate){
        this.FavoritePlate=FavoritePlate;
    }
    
    /* Méthode override de introduceYourself dans peronnage */
    @Override 
    public void introduceYourself(){
        super.introduceYourself();
        talkb(" Je suis là pour faire reigner l'ordre et la discipline"); 
    }
    
     /*
    public void tirer(Brigand) {
        
    }
    
   public void libererDame(Dame){
        
    } */
    
    
}
