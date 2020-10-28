
package projet.java.western;






public class CowBoy extends Personnages {
    
    protected int TruthLevel;
    protected String FavoritePlate;
    
    public CowBoy(String Name, String Location, Arme Gun , String Job , int Niveau, int Argent,int TruthLevel,String FavoritePlate) {
        super(Name,Location,Gun,Job,Niveau,Argent);
        this.TruthLevel=TruthLevel;
        this.FavoritePlate=FavoritePlate;

    }
    
    public int getTruthLevel(){
        return this.TruthLevel;
    }
    
    public String getFavoritePlate(){
        return this.FavoritePlate;
    }
    
    
    
    
    
    public void setTruthLevel(int TruthLevel){
        this.TruthLevel = TruthLevel;
    }
    
    public void setFavoritePlate(String FavoritePlate){
        this.FavoritePlate=FavoritePlate;
    }
    
    
  
    
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
