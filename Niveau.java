package projet.java.western;

/* Classe niveau */
public class Niveau {
    
    /* Initialisation des variables */
    public int level;
    public double xp_actuel;
    public double xp_necessaire;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    /* Constructeur */
    public Niveau(int level, int xp_actuel, int xp_necessaire){
        this.level = level;
        this.xp_actuel = xp_actuel;
        this.xp_necessaire = xp_necessaire;
    }
    
    /* Accessors */
    public int GetLevel(){
        return this.level;
    }
    
    public double GetXp_actuel(){
        return this.xp_actuel;
    }
    
    public double GetXp_necessaire(){
        return this.xp_necessaire;
    }
    
    /* Mutators */
    public void SetLevel(int level){
        this.level = level;
    }
    
    public void SetXp_actuel(double xp){
        this.xp_actuel = xp;
    }
   
    public void SetXp_necessaire(double xp){
        this.xp_necessaire = xp;
    }
    
    /* Méthode permettant d'ajouter un nombre d'xp à un joueur */
    public void add_xp(Player player, double xp){
        System.out.println("");
        System.out.println(ANSI_PURPLE+"Vous avez gagné " + xp + " points d'expériences."+ANSI_RESET);
        SetXp_actuel(xp + GetXp_actuel());
        levelup(player);
    }
    
    /* Méthode permettant de level up le player s'il possède plus d'xp que le nombre requis pour passer un niveau */
    private void levelup(Player player){
        if (player.niveau.xp_actuel >= player.niveau.xp_necessaire){
            if (player.niveau.GetLevel() != 10){
                SetLevel(GetLevel()+1);               
                System.out.println(ANSI_PURPLE+"Vous gagnez un niveau! Vous êtes mainteant niveau " + GetLevel() + "."+ANSI_RESET);
                System.out.println("");
                System.out.println(ANSI_BLUE+"Vous obtenez 15 points de vie suppélementaires."+ANSI_RESET);
                SetXp_actuel(GetXp_actuel() - GetXp_necessaire());
                CurveXp_necessaire(player);
                player.soin(1000, player);
            }
        }
    }
    
    /* Méthode permettant d'avoir la courbe d'xp */
    private void CurveXp_necessaire(Player player){
        SetXp_necessaire(500 + 50*Math.pow(player.niveau.GetLevel(),2));        
    }
}
