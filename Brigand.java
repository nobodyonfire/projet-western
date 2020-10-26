
package projet.java.western;





public class Brigand extends Personnages {
    
    protected int NombreCapture;
    protected Boolean EstEnPrison;
    
    public Brigand(String Name, String Location, String Gun , String Job , int Niveau, int Argent,int NombreCapture,Boolean EstEnPrison) {
        super(Name,Location,Gun,Job,Niveau,Argent);
        this.NombreCapture=NombreCapture;
        this.EstEnPrison=EstEnPrison;

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
    
    
  
    
    @Override 
    public void introduceYourself(){
        super.introduceYourself();
        talk(" J'ai déjà " + this.NombreCapture+ " captures à mon actif "); 
    }
    
}
