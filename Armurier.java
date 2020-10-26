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
