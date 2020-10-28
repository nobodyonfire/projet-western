
package projet.java.western;





public class Brigand extends Personnages {
    
    protected int NombreCapture;
    protected Boolean EstEnPrison;
    public int HP;
    
    public Brigand(String Name, String Location, Arme Gun , String Job , int Niveau, int Argent,int NombreCapture,Boolean EstEnPrison, int HP) {
        super(Name,Location,Gun,Job,Niveau,Argent);
        this.NombreCapture=NombreCapture;
        this.EstEnPrison=EstEnPrison;
        this.HP = HP;

    }
    
    public int getNombreCapture(){
        return this.NombreCapture;
    }
    
    public Boolean getEstEnPrison(){
        return this.EstEnPrison;
    }
    
    
    
    
    
    public void setNombreCapture(int NombreCapture){
        this.NombreCapture = NombreCapture;
    }
    
    public void setEstEnPrison(Boolean EstEnPrison){
        this.EstEnPrison=EstEnPrison;
    }
    
     public int getHP(){
        return this.HP;
    }
    
  
    
    @Override 
    public void introduceYourself(){
        super.introduceYourself();
        talk(" J'ai déjà " + this.NombreCapture+ " captures à mon actif "); 
    }
    
}