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
public class CowBoy extends Personnages {
    
    protected int TruthLevel;
    protected String FavoritePlate;
    
    public CowBoy(String Name, String Location, String Gun , String Job , int Niveau, int Argent,int TruthLevel,String FavoritePlate) {
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
        talk(" Je suis là pour faire reigner l'ordre et la discipline"); 
    }
    
     /*
    public void tirer(Brigand) {
        
    }
    
   public void libererDame(Dame){
        
    } */
    
    
}
