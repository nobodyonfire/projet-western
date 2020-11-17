package projet.java.western;

/* Interface de location */
public class Location implements LocationPackage, getRandomNumberInRange{
    
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

    @Override
    public void changelocation(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display_location() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Menu(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display_menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clearScreen(int ligne) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pressenter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRandomNumberInRange(int min, int max) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
