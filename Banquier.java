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
public class Banquier extends Personnages{
    
    protected Boolean SeFaitCambrioler;
    
    public Banquier(String Name, String Location, String Gun , String Job , int Niveau, int Argent,Boolean SeFaitCambrioler) {
        super(Name,Location,Gun,Job,Niveau,Argent);
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
