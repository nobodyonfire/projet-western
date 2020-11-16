package projet.java.western;

import java.lang.constant.ConstantDesc;

/* Classe mère , personnage */
public class Personnages {
    
    /* Initialisation des variables */
    protected String Name;
    protected Location Location;
    protected Arme Gun;
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    
    /* Constructeur */
    public Personnages(String Name, Location Location, Arme Gun) {
        if(Name.equals(null) || Name.equals("")){this.Name="Player";}else{this.Name=Name;}
        this.Location=Location;
        this.Gun=Gun;
 
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

    
   /* Mutators */
    public void SetName(String Name){
        if(Name.equals(null) || Name.equals("")){this.Name="Player";}else{this.Name=Name;}
    } 
    public void SetLocation(Location Location){
        this.Location = Location;
    } 
    public void SetGun(Arme Gun){
        this.Gun = Gun;
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