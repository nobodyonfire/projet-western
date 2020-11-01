
package projet.java.western;





public class Armurier extends Personnages{
    
    protected Boolean SeFaitCambrioler;
    
    public Armurier(String Name, Location Location, Arme Gun , String Job ,int Argent) {
        super(Name,Location,Gun,Job,Argent);

    }
    
    
    @Override 
    public void introduceYourself(){
        super.introduceYourself();
        talk(" Passez à l'armurie , je vous ferais de meilleures armes !"); 
    }
    
    
    


    
    
    
}
