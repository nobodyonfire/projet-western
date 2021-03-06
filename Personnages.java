package projet.java.western;

import java.lang.constant.ConstantDesc;

/* Classe mère , personnage */
public class Personnages {
    
    /* Initialisation des variables */
    protected String Name;
    protected Location Location;
    protected Arme Gun;
    protected String Job;
    protected int Niveau;
    protected int Argent;
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    
    /* Constructeur */
    public Personnages(String Name, Location Location, Arme Gun , String Job , int Argent) {
        if(Name.equals(null) || Name.equals("")){this.Name="Player";}else{this.Name=Name;}
        this.Location=Location;
        this.Gun=Gun;
        this.Job=Job;
        this.Niveau=Niveau;
        this.Argent=Argent;
        
        /*introduceYourself();*/
    }
    
    /* Accessors */
    public String getName (){
        return this.Name;
    }
    public Location getLocation (){
        return this.Location;
    }
    public Arme getGun (){
        return this.Gun;
    }
    public String getJob (){
        return this.Job;
    }
    public int Argent (){
        return this.Argent;
    }
    public int Niveau (){
        return this.Niveau;
    }
    
   /* Mutators */
    public void SetName(String Name){
        if(Name.equals(null) || Name.equals("")){this.Name="Player";}else{this.Name=Name;}
    } 
    public void SetLocation(Location Location){
        this.Location = Location;
    } 
    public void SetJob(String Job){
        this.Job = Job;
    } 
    public void SetGun(Arme Gun){
        this.Gun = Gun;
    } 
    public void SetNiveau(int Niveau){
        this.Niveau = Niveau;
    } 
    public void SetArgent(int Argent){
        this.Argent = Argent;
    }
    
    /* Méthode pour les différentes manières de parler du personnage */
    public void talk(String say){
        System.out.println(Name + " : " + say);
    }
    public void talkstr(String say){
        System.out.print(Name + " : " + say);
    }
    public void talkb(String say){
        System.out.println(ANSI_GREEN +Name + " : " + say + ANSI_RESET);
    }
    
    /* Méthode pour parler et s'introduire ( non utilisé ) */
    public void introduceYourself (){
        talkb( " Bonjour à tous, je suis " + Name);
    }
    
    
}