
package projet.java.western;






public class Banquier extends Personnages{
    
    protected Boolean SeFaitCambrioler;
    
    public Banquier(String Name, Location Location, Arme Gun , String Job , int Argent, Boolean SeFaitCambrioler) {
        super(Name,Location,Gun,Job,Argent);
        this.SeFaitCambrioler=SeFaitCambrioler;

    }
    

    public Boolean getSeFaitCambrioler(){
        return this.SeFaitCambrioler;
    }
    
    
    
    

    public void setSeFaitCambrioler(Boolean SeFaitCambrioler){
        this.SeFaitCambrioler=SeFaitCambrioler;
    }
    
    
    @Override 
    public void introduceYourself(){
        super.introduceYourself();
        talk(" Passez à la banque pour proteger votre argent !"); 
    }
    
    
  
 
    
}
