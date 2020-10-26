
package projet.java.western;





public class Armurier extends Personnages{
    
    protected Boolean SeFaitCambrioler;
    
    public Armurier(String Name, String Location, String Gun , String Job , int Niveau, int Argent) {
        super(Name,Location,Gun,Job,Niveau,Argent);

    }
    
    
    @Override 
    public void introduceYourself(){
        super.introduceYourself();
        talk(" Passez à l'armurie , je vous ferais de meilleurs armes !"); 
    }
    
    
    


    
    
    
}
