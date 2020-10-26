
package projet.java.western;



public class Sherif extends CowBoy{
    
    protected int NombreDeCapture;
    
    public Sherif(String Name, String Location, String Gun , String Job , int Niveau, int Argent,int TruthLevel,String FavoritePlate,int NombreDeCapture) {
        super(Name,Location,Gun,Job,Niveau,Argent,TruthLevel,FavoritePlate);
        this.NombreDeCapture=NombreDeCapture;
        
    }
    
    
    public int getNombreDeCapture(){
        return this.NombreDeCapture;
    }
    
  
    
    
    public void setNombreDeCapture(int NombreDeCapture){
        this.NombreDeCapture = NombreDeCapture;
    }
    
    
    @Override 
    public void introduceYourself(){
        super.introduceYourself();
        talk(" Je suis également le Sherif de cette ville et j'ai déjà "+this.NombreDeCapture+ " captures à mon actif !"); 
    }
    
}
