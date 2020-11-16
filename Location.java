package projet.java.western;

/* Interface de location */
public class Location {
    
    /* Initialisation des variables */
    protected String Nom;
    protected int Danger;
    
    /* Constructeur */
    public Location(String Nom, int Danger){
        this.Nom= Nom;
        this.Danger=Danger;
    }
    
    /* Accessors */
     public String getNom(){
        return this.Nom;
    }
    
    public int getDanger(){
        return this.Danger;
    }
    
    /* Mutators */
    public void setNom(String Nom){
        this.Nom = Nom;
    }
    
    public void setDanger(int Danger){
        this.Danger=Danger;
    }
    
}
