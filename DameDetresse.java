
package projet.java.western;





public class DameDetresse extends Personnages{
    
    
    protected String Etat;
    protected String Vetement;
    
    public DameDetresse(String Name, Location Location, Arme Gun , String Job , int Niveau, int Argent, String Etat,String Vetement) {
        super(Name,Location,Gun,Job,Niveau,Argent);
        this.Etat=Etat;
        this.Vetement=Vetement;

    }
    
    public String getEtat(){
        return this.Etat;
    }
    
    public String getVetement(){
        return this.Vetement;
    }
    
    
    
    
    
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
