
package projet.java.western;






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
