package projet.java.western;
import java.util.Random;
import java.util.Scanner; 
import static projet.java.western.ProjetJavaWestern.listearme;
import static projet.java.western.ProjetJavaWestern.duel;


/* Class de la location Banque */
public class Banque extends Location{
    
    /* Initialisation des variables */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final Banque Banque_Populaire = new Banque("Banque Populaire",0,0);
    private static final Arme Couteau = new Arme("Couteau", 10, 9, 100, 0);
    
    int Stocke;
    
    /* Constructeur */
    public Banque(String Nom,int Danger, int Stocke){
        super(Nom,Danger);
        this.Stocke = Stocke;
    }
 
    /* Accessors */
    public void SetName(String Nom){
        this.Nom = Nom;
    } 
    
    public void SetDanger(int Danger){
        this.Danger = Danger;
    } 
    
    public void SetStocke(int Stocke){
        this.Stocke = Stocke;
    }
    
    /* Mutators */
    public String GetName(){
        return this.Nom;
    }
    
    public int GetDanger(){
        return this.Danger;
    }
    
    public int GetStocke(){
        return this.Stocke;
    }
    
    /* Méthode qui permet de déposer de l'argent à la banque */
    public void Deposer(Player player){
        System.out.println(ANSI_BLUE+"Combien voulez-vous déposer ?"+ANSI_RESET);
        Scanner q = new Scanner(System.in);
        int montant = q.nextInt();
        if (montant > player.getArgent()){
            System.out.println("");
            System.out.println(ANSI_BLUE+"Vous n'avez pas assez d'argent pour déposer cette somme. Je dépose donc tout votre argent sur votre compte."+ANSI_RESET);
            Banque_Populaire.SetStocke(Banque_Populaire.GetStocke() + player.getArgent());
            player.SetArgent(0);
        }
        else{
            System.out.println("");
            System.out.println(ANSI_BLUE+"Votre dépôt de " + montant + " a bien été pris en compte. Merci de nous faire confiance."+ANSI_RESET);
            Banque_Populaire.SetStocke(Banque_Populaire.GetStocke() + montant);
            player.SetArgent(player.getArgent()-montant);
        }
        System.out.println(ANSI_BLUE+ "Vous avez actuellement " + Banque_Populaire.GetStocke() + "$ stockés chez nous."+ANSI_RESET);
        Menu(player);
        
    }
    
    /* Méthode qui permet de récuperer l'argent du joueur stocké dans la banque */
    public void Recuperer(Player player){
        System.out.println(ANSI_BLUE+"Combien voulez-vous récupérer ? Vous avez actuellement " + Banque_Populaire.GetStocke() + "$ en banque."+ANSI_RESET);
        Scanner q = new Scanner(System.in);
        int montant = q.nextInt();
        if (montant > Banque_Populaire.GetStocke()){
            System.out.println("");
            System.out.println(ANSI_BLUE+"J'imagine que vous voulez tout retirer."+ANSI_RESET);
            player.SetArgent(Banque_Populaire.GetStocke());
            Banque_Populaire.SetStocke(0);
        }
        else{
            player.SetArgent(montant);
            System.out.println("");
            Banque_Populaire.SetStocke(Banque_Populaire.GetStocke() - montant);
        }
        System.out.println(ANSI_BLUE+"Merci de nous faire confiance. Il vous reste "+ Banque_Populaire.GetStocke() + "$."+ANSI_RESET);
        Menu(player);
    }
    
    /* Méthode qui permet de voir l'argent stocké dans la banque */
    public void Monargent(Player player){
        System.out.println(ANSI_BLUE+"Vous avez " + Banque_Populaire.GetStocke() + "$ sur votre compte"+ANSI_RESET);
        Menu(player);
    }
    
    /* Méthode qui permet d'initialiser avec une certaine chance un braquage dans la banque */
    private void Braquage(Player player){
        
        int a=getRandomNumberInRange(0,10-GetDanger());
        if (a==0){
            Brigand Braqueur;
            Brigand brigand = new Brigand("null", Banque_Populaire, Couteau, false, 11, 0);
            Braqueur = brigand.createBrigand(1, Banque_Populaire, listearme().get(getRandomNumberInRange(0, listearme().size())), player);
            Braqueur.talkstr(ANSI_RED+"Ceci est un Hold Up! Les mains en l'air et que personne ne bouge!"+ANSI_RESET);
            System.out.println("");
            System.out.println(ANSI_BLUE+"Nelson : C'est un braqueur, aide moi à l'éliminer!"+ANSI_RESET);
            duel(player, Braqueur);
            recompense(player);
        }
    }
    
    /* Méthode qui permet de donner une récompense après un braquage */
    private void recompense(Player player){
        System.out.println("Nelson : Merci de votre aide. Tenez un peu d'argent, après tout, vous le méritez bien.");
        player.add_argent(getRandomNumberInRange(500,800), player);
    }   
    
    /* Méthode qui permet d'avoir un nom entre min et max */
    @Override
    public int getRandomNumberInRange(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("MAX > MIN");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
    
    /* Méthode qui permet d'afficher le menu */
    @Override
    public void display_menu(){
        System.out.println("");
        System.out.println("Sélection: ");
        System.out.println("1) Déposer  \n2) Récupérer \n3) Vérifier mon compte \n4) Partir");
    }
    
    /* Méthode qui permet d'afficher le menu de la location */
    @Override
    public void display_location(){
        
        System.out.println("Sélection: ");
        System.out.println("1) Saloon  \n2) Armurerie \n3) Prison \n4) Eglise \n5) Extérieur de la ville \n6) Rester");
    }
    
    /* Override d'interfance location pour changer le player d'endroit*/
    @Override
    public void changelocation(Player player) {
        
        Prison Lockcity = new Prison("Lockcity",50);
        Armurie Bangout = new Armurie("Bangout",10);
        Eglise SantaMaria = new Eglise("SantaMaria",10);
        Saloon le7iemeciel = new Saloon("le7iemeciel", 10);
        FarWest Farwest = new FarWest("Farwest", 0);
        
        System.out.println("Où voulez-vous aller ?");
        
        display_location();
        int q = Test.test();
        switch (q) 
	{
   
	    case 1:
                System.out.println();    
                System.out.println("Vous entrez dans le Saloon.");
                player.SetLocation(le7iemeciel);
                le7iemeciel.Menu(player);
                break;
  
	    case 2:
                System.out.println();
                System.out.println("Vous entrez dans l'armurerie.");
                player.SetLocation(Bangout);
                Bangout.Menu(player);
                break;
  
	    case 3:
                System.out.println(); 
                System.out.println("Vous entrez dans la prison.");
                player.SetLocation(Lockcity);
                Lockcity.Menu(player);
                break;
            case 4:
                System.out.println(); 
                System.out.println("Vous entrez dans l'église Santa Maria.");
                player.SetLocation(SantaMaria);
                SantaMaria.Menu(player);
            case 5:
 
                System.out.println();   
                System.out.println("Vous entrer dans le Far west. Faites attention! Le danger rôde.");
                player.SetLocation(Farwest);
                Farwest.Menu(player);
                break;
            
            case 6:
 
                System.out.println();
                Menu(player);
                break;
            default:
                System.out.println("");
                System.err.println ( "Erreur" );
                changelocation(player);
	    break;
              
	}
        throw new UnsupportedOperationException("Erreur"); 
    }


     /* Override d'interfance Menu pour faire un choix à l'utilisateur*/
    @Override
    public void Menu(Player player) {
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans la Banque!"+ ANSI_RESET);
        System.out.println();
        Braquage(player);

        display_menu();
        int q = Test.test();
        switch (q) 
	{
   
	    case 1:
                System.out.println();    
                Deposer(player);
                break;
  
	    case 2:
                System.out.println();
                Recuperer(player);
                break;
  
	    case 3:
                System.out.println ( "" );
                Monargent(player);
                break;
            
            case 4:
                System.out.println("");
                changelocation(player);
                break;
                
	    default:
                Menu(player);
                System.out.println();
                System.err.println ( "Erreur" );
                break;
              
	}
        
        throw new UnsupportedOperationException("Erreur."); 
    }
    
    
}
