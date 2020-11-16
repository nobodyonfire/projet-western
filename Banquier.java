package projet.java.western;

/* Classe du banquier qui est un personnage */
public class Banquier extends Personnages{
    
    /* Initialisation des variables */
    protected Boolean SeFaitCambrioler;
    
    /* Constructor */
    public Banquier(String Name, Location Location, Arme Gun , String Job , int Argent, Boolean SeFaitCambrioler) {
        super(Name,Location,Gun,Job,Argent);
        this.SeFaitCambrioler=SeFaitCambrioler;

    }
    
    /* Méthode qui sera utiliser pour de futures updates */
    public Boolean getSeFaitCambrioler(){
        return this.SeFaitCambrioler;
    }
    
    /* Méthode qui sera utiliser pour de futures updates */
    public void setSeFaitCambrioler(Boolean SeFaitCambrioler){
        this.SeFaitCambrioler=SeFaitCambrioler;
    }
    
    /* Override d'introduce Yourself de peronnage */
    @Override 
    public void introduceYourself(){
        super.introduceYourself();
        talk(" Passez à la banque pour protéger votre argent !"); 
    }
    
    
  
 
    
}
