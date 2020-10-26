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
public class Location {
    
    protected String Nom;
    protected int Danger;
    
    public Location(String Nom, int Danger){
        this.Nom= Nom;
        this.Danger=Danger;
    }
    
    
     public String getNom(){
        return this.Nom;
    }
    
    public int getDanger(){
        return this.Danger;
    }
    
    
    
    
    
    public void setNom(String Nom){
        this.Nom = Nom;
    }
    
    public void setDanger(int Danger){
        this.Danger=Danger;
    }
    
}
