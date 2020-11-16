
package projet.java.western;

/* CLASSE NON UTILISE POUR L'INSTANT */
public class DameDetresse extends Personnages{
    
    /* Initialisation des variables */
    protected String Etat;
    protected String Vetement;
    
    /* Constructeur */
    public DameDetresse(String Name, Location Location, Arme Gun , String Job, int Argent, String Etat,String Vetement) {
        super(Name,Location,Gun,Job,Argent);
        this.Etat=Etat;
        this.Vetement=Vetement;

    }
    
    /* Accessors */
    public String getEtat(){
        return this.Etat;
    }
    
    public String getVetement(){
        return this.Vetement;
    }
    
    /* Mutators */
    public void setEtat(String Etat){
        this.Etat = Etat;
    }
    
    public void setVetement(String Vetement){
        this.Vetement=Vetement;
    }
    
  
    @Override 
    public void introduceYourself(){
        super.introduceYourself();
        talk(" Je porte actuellement " + this.Vetement); 
    }
    
}
