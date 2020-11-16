package projet.java.western;

/* Class de l'armurier */
public class Armurier extends Personnages{
    
    protected Boolean SeFaitCambrioler;
    
    /* Constructeur */
    public Armurier(String Name, Location Location, Arme Gun , String Job ,int Argent) {
        super(Name,Location,Gun,Job,Argent);

    }
    
    /* Override da méthode introduceYourself dans Personnage */
    @Override 
    public void introduceYourself(){
        super.introduceYourself();
        talk(" Passez à l'armurie , je vous ferais de meilleures armes !"); 
    }
    
    
    


    
    
    
}
