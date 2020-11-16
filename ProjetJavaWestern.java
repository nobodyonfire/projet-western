package projet.java.western;
import static java.lang.Thread.sleep;
import static java.lang.constant.ConstantDescs.NULL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import static projet.java.western.Armurie.clearScreen;


/* Class MAIN */
public class ProjetJavaWestern {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    /* MAIN */
    public static void main(String[] args) {
        
        /* Nous lançons les différentes étapes , l'initialisation , le didactitiel puis le monde libre */
        initialisation();
        didactitiel();

    }
    
    /* Méthode permettant de lancer l'initialisation */
    public static void initialisation(){
        
        
        clearScreen(50);
        
        
        System.out.println(" ");
        System.out.println(ANSI_RED_BACKGROUND +  ANSI_WHITE+ "DEBUT INITIALISATION " + ANSI_RESET);
        System.out.println(" ");
        System.out.println(ANSI_RED+"METTRE LA CONSOLE EN PLEIN ECRAN !"+ANSI_RESET);
        System.out.println(" ");
        
        menudepart(player);
      
        String Player_name = Robbert.StoryTelling();     
        player.SetName(Player_name);
        
        
        
        sleep(1000);
        
        System.out.println(" ");
        System.out.println(ANSI_RED_BACKGROUND +  ANSI_WHITE+  "FIN INITIALISATION " + ANSI_RESET);
        System.out.println(" ");
        System.out.println(" ");
        clearScreen(4);
          
    }
    
    /* Méthode permettant d'afficher les menus de départ et de faire choisir au joueur l'état de son aventure */
    public static void menudepart(Player player){
        
        System.out.println("Voulez-vous ?");
        System.out.println("");
        System.out.println("1) Nouvelle partie");
        System.out.println("2) Load a game");
        System.out.println("");
        int q = Test.test();
        switch (q) 
	{
   
	    case 1:
                menudidactitiel(player);
            break;
            
            case 2:
            player.playerload();
            SantaMaria.changelocation(player);
            break;
            
            default:
            System.out.println("");
	    System.err.println ( "faites un choix !" );
            System.out.println("");
            menudepart(player);
	    break;   
            
        } 
    }
    
    /* méthode permettant de faire choisir au joueur de skip le didactiel */
    public static void menudidactitiel(Player player){
        clearScreen(2);
        System.out.println("Voulez-vous ?");
        System.out.println("");
        System.out.println("1) Faire le didactitiel (conseillé)");
        System.out.println("2) Skip");
        System.out.println("");
        int q1 = Test.test();   
        switch (q1) 
        {
            case 1:
            clearScreen(3);
            break;
            case 2:
            player.SetArgent(500);
            player.SetNiveau(Niveau.SetLevel(1));
            String Player_name = Robbert.StoryTelling();     
            player.SetName(Player_name);
            player.playersave(Banque_Populaire);
            clearScreen(50);
             map.printbienvenu(player," ",1);
            sleep(2300);
            SantaMaria.changelocation(player);
            break;

            default:
            System.out.println("");
            System.err.println ( "faites un choix !" );
            System.out.println("");
            menudidactitiel(player);
            break;   
            } 
    }

    /* Méthode du qui représente toutes les actions du didactitiel pour faire comprendre les mécaniques du jeu au joueur */
    public static void didactitiel(){
        

        /* ZONE TEST */

        /* FIN ZONE TEST */
        

        
         /* PREMIERE  PARTIE */
        clearScreen(50);
        map.printbienvenu(player," ",1);
        sleep(2300);
        clearScreen(50);
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
        System.out.println(ANSI_BLUE +"                                                                                  DIDACTITIEL                                                                              " +  ANSI_RESET);
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
        clearScreen(3);
        System.out.println(ANSI_BLUE +"« Dans la ville de Widowchapel, réputée pour le nombre de chasseurs de prime qui y meurt." +  ANSI_RESET);
        System.out.println(ANSI_BLUE + " Vous apparaissez, afin de faire régner l’ordre ,de capturer les malfrats, tout en protégeant la ville des attaques , en s’équipant d’armes de plus en plus puissantes." +  ANSI_RESET);
        System.out.println(ANSI_BLUE + "Les risques et les récompenses sont toutes deux élevées. »" +  ANSI_RESET);
        pressenter();clearScreen(1);
      
        clearScreen(1);
        System.out.println(ANSI_BLUE + "Vous vous trouvez dans le saloon de la ville de Widowchapel" +  ANSI_RESET);
        pressenter();clearScreen(1);
        System.out.println(ANSI_BLUE + "Pour commencer, aller voir le barman pour chercher une boisson" +  ANSI_RESET);
        pressenter();clearScreen(1);
        le7iemeciel.questiontuto(player);
        clearScreen(1);
        Luis.talkb("Alors, ça fait du bien de se désaltérer un petit peu ?");
        Luis.talkb("Le sherif m'a dit qu'il voulait te voir alors dépèche-toi!");
        pressenter();
        
        
        /* DEUXIEME PARTIE */
        le7iemeciel.questiontuto2();
        clearScreen(1);
        Robbert.talkb("Comme tu es nouveau je vais te présenter un peu la ville ...");
        Robbert.talkb("Quand tu te situes dans un lieu tu peux le quitter pour en rejoindre d'autres");
        Robbert.talkb("Il y a l'amurie, le saloon, l'allée centrale, la prison , la banque et l'extérieur de la ville..");
        
        pressenter();
        Robbert.talkb("Voilà la carte de la ville");
        
        clearScreen(2);
        System.out.println("CARTE: ");
        map.printcarte();
        
        clearScreen(2);
        Robbert.talkb("Dans l'armurie tu peux acheter de nouvelles armes et vendre la tienne");
        pressenter();clearScreen(1);
        Robbert.talkb("Dans le saloon tu peux jouer, récuperer des points de vie , jouer , boire..etc");
        pressenter();clearScreen(1);
        Robbert.talkb("La banque est l'endroit où tu pourras stocker ton argent et le retirer");
        pressenter();clearScreen(1);
        Robbert.talkb("Dans l'église tu pourras sauvegarder ta progression !");
        pressenter();clearScreen(1);
        Robbert.talkb("Tu pourras aussi me trouver à la prison, où j'aurai des missions pour toi !");
        pressenter();clearScreen(1);
        Robbert.talkb("Et enfin dehors , le Far West , il faudra faire très attention aux rencontres que tu feras..");
        pressenter();clearScreen(2); 
        /* CHANGER DE LOCATION LE JOUEUR*/
        Robbert.talkb("Tant que tu es là, j'ai besoin de ton aide en prison ..");
        pressenter();clearScreen(1);
        
        
        /* TROISIEME PARTIE */
        player.SetLocation(Lockcity);
        clearScreen(1);
        Robbert.talkb("Ho non ! Le prisonnier s'échappe !");
        pressenter();clearScreen(1);
        Robbert.talkb("Eh " + player.getName() + " fais tes preuves et attrape-le.");
        Robbert.talkb("Tu auras le droit à la moitié de sa prime. Tiens un flingue je l'ai trouvé par terre.");
        player.SetGun(Pistolet_de_seconde_main);
        Robbert.talkb(ANSI_RED+"Lors des combats contre les brigands , des minis jeux apparaitront et influencerons le résultat du duel !"+ANSI_RESET);
        pressenter();clearScreen(1);
        
        duel(player, Jacob);
        Robbert.talkb("Chapeau l'artiste! Tu as attrapé ta première prime à Widowchapel.");
        Robbert.talkb("Voici ta récompense.");
        pressenter();
        player.add_argent(500, player);
        Robbert.talkb("Tu comprends comment ça marche maintenant. Tu me rapportes un bandit et je te donne de l'argent en retour.");
        Robbert.talkb("Facile non ? Bon je vais te laisser j'ai de la paperasse qui m'attend. Reviens me voir plus tard.");
        player.playersave(Banque_Populaire);
        pressenter();
        clearScreen(50);
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
        System.out.println(ANSI_BLUE +"                                                                                 FIN DU DIDACTITIEL                                                                              " +  ANSI_RESET);
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
        clearScreen(3);
        sleep(3000);
        clearScreen(50);
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
        System.out.println(ANSI_BLUE +"                                                                                 VOUS RENTREZ DANS LE MONDE LIBRE                                                                    " +  ANSI_RESET);
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
        clearScreen(3);
        sleep(3000);
        Lockcity.Menu(player);
                    
    }
    
    
    /* Méthode permettant de créer une lista composée de toutes les armes du jeu */
    public static ArrayList<Arme> listearme(){
        ArrayList <Arme> listearme = new ArrayList < Arme> ();
        listearme.add(Pistolet_de_seconde_main);
        listearme.add(Colt_anaconda);
        listearme.add(Calibre_44_PN);  
        listearme.add(Colt_baby_dragon );
        listearme.add(Remington_1875_USA_army);
        listearme.add(Fusil_henry); 
        listearme.add(Fusil_sharps);
        listearme.add(Winchester_modele_1873);
        listearme.add(Winchester_modele_1887); 
        listearme.add(Winchester_modele_1895);
        listearme.add(Winchester_modele_1897);
        listearme.add(Fusil_double_canon); 
        listearme.add(Fusil_canon_scie);
        listearme.add(The_Lucky_Luck );
        listearme.add(Couteau);    
        
        return listearme;
    }
    
    /* Méthode pour retourner la taille d'un mot et afficher le nombre d'espace associé */
    private static void taille(String mot,int max){
        int taillemot=mot.length();
        for (int i = 0; i < max-taillemot; ++i) 
            System.out.print(" ");
    }
    

    /* Méthode pour sleep */
    public static void sleep(int temps){
        try {  Thread.sleep(temps); } catch (InterruptedException ie) {}
    }
    
    /* Méthode pour passer à la ligne j fois*/
    public static void clearScreen(int j) {  
        for (int i = 0; i < j; ++i) System.out.println("");

    }
    
    /* Méthode pour demander à l'utilisateur d'appuyer sur entrer */
    public static void pressenter(){
        Scanner readinput = new Scanner(System.in);
        String enterkey = "appuyer sur entrer...";
        System.out.print(enterkey);
        enterkey = readinput.nextLine();
        System.out.print(enterkey);
    
    }
    
    /* Méthode pour le duel */
    public static boolean duel(Player player, Brigand brigand){
        
        System.out.println("");
        
        /* Mini jeu avant chaque duel mais encore quelques bugs */
        /* Arme.minijeurandom(); */
        
        boolean victoire = false;
        int degat;
        
        int taillea = Math.max( player.getName().length() +8 , player.Gun.getname().length()+8);
        int tailleb = Math.max( brigand.getName().length() +8 , brigand.Gun.getname().length()+8);
        int taille = Math.max( taillea,tailleb);
        
        /* AFFICHAGE DUEL */
  
        for (int i = 0; i < taille*2+2 ; ++i) System.out.print("_");clearScreen(1);
        for (int i = 0; i < taille-1 ; ++i) System.out.print(ANSI_RED_BACKGROUND+ANSI_WHITE+" "+ANSI_RESET);
        System.out.print(ANSI_RED_BACKGROUND+ANSI_WHITE+"DUEL"+ANSI_RESET);
        for (int i = 0; i < taille-1; ++i) System.out.print(ANSI_RED_BACKGROUND+ANSI_WHITE+" "+ANSI_RESET);        clearScreen(1);
        for (int i = 0; i < taille*2+2; ++i) System.out.print("¯"); clearScreen(1);
        
        /* AFFICHAGE NOM*/
        
        System.out.print(player.getName());
         for (int i = 0; i < (taille - player.getName().length()) ; ++i) {System.out.print(" ");}
         System.out.print("VS");
         for (int i = 0; i < (taille - brigand.getName().length()) ; ++i) {System.out.print(" ");}
         System.out.print(brigand.getName());
         
        /* AFFICHAGE HP*/
       
        clearScreen(1);
         System.out.print(player.getHP());
         for (int i = 0; i < (taille -  Integer.toString(player.getHP()).length()) ; ++i) {System.out.print(" ");}
         System.out.print("HP");
         for (int i = 0; i < (taille -Integer.toString(brigand.getHP()).length()) ; ++i) {System.out.print(" ");}
         System.out.print(brigand.getHP());

         
        
         /* AFFICHAGE ARMES*/
        
         clearScreen(1);
         System.out.print(player.Gun.getname());
         for (int i = 0; i < (taille - player.Gun.getname().length()) -1; ++i) {System.out.print(" ");}
         System.out.print("ARME");
         for (int i = 0; i < (taille - brigand.Gun.getname().length()) -1; ++i) {System.out.print(" ");}
         System.out.print(brigand.Gun.getname());
        
        System.out.println("");
        System.out.println("");
        pressenter();
        System.out.println("");

        while (player.HP > 0 && brigand.HP > 0){
            if (player.Gun.toucher(player.Gun) == true){

                degat = player.Gun.puissance(player.Gun);
                
                brigand.HP = brigand.HP - degat;
                if (brigand.HP > 0 ){
                System.out.println(ANSI_GREEN+"Touché ! Vous lui avait fait " + degat + " dégats! Il lui reste encore " + brigand.HP + " HP"+ANSI_RESET);
                }
                 else{
                System.out.println(ANSI_GREEN+"Touché ! Vous lui avait fait " + degat + " dégats!"+" Le brigand est mort !"+ANSI_RESET); 
                 }
                
            } 
            else               
            {
                System.out.println(ANSI_GREEN+"Vous l'avez raté de peu..."+ANSI_RESET);  
            }
            
            if (brigand.HP < 0 ){
                break;
            }
            if (brigand.Gun.toucher(brigand.Gun) == true){
                degat = brigand.Gun.puissance(brigand.Gun);
                player.HP = player.HP - degat;
                System.out.println(ANSI_RED+"Il ne vous a pas loupé, vous avez perdu " + degat + " HP! Il vous reste " + player.HP+" HP"+ANSI_RESET);
            }
            else
            {
                System.out.println(ANSI_RED+"Vous avez esquivé son tir!"+ANSI_RESET);
            }

            pressenter();
            System.out.println("");
            
        }
        if (player.HP <= 0){
            System.out.println("");
            System.out.println(ANSI_RED_BACKGROUND+ANSI_WHITE+"Vous êtes mort!"+ANSI_RESET);
            System.out.println(ANSI_BLUE+"Chargement de la dernière sauvegarde.."+ANSI_RESET);
            sleep(1000);
            player.playerload();
        }
        else {
            System.out.println("Vous avez eu " + brigand.getName() + ".");
            clearScreen(1);
            System.out.println("Il fera moins le malin en prison.");
            pressenter();
            victoire = true;
            brigand.setEstEnPrison(victoire);
            player.niveau.add_xp(player, brigand.Drop_xp_curve(brigand));
        }
        System.out.println("");   
        return victoire;
    }
    
    
    
     /* 
    Initialisation des armes
    */
    
    private static final Arme Pistolet_de_seconde_main = new Arme("Pistolet de seconde main", 10, 1, 80, 10);
    private static final Arme Colt_anaconda = new Arme("Colt anaconda", 60, 30, 85, 400);
    private static final Arme Calibre_44_PN = new Arme("Calibre .44 PN", 70, 25, 70, 450);
    private static final Arme Colt_baby_dragon = new Arme("Colt baby dragon", 80, 10, 80, 600);
    private static final Arme Remington_1875_USA_army = new Arme("Remington 1875 USA Army", 80, 53, 85, 1000);
    private static final Arme Fusil_henry = new Arme("Fusil_Henry", 30, 15, 95, 500);
    private static final Arme Fusil_sharps = new Arme("fusil Sharps", 35, 10, 97, 550);
    private static final Arme Winchester_modele_1873 = new Arme("Winchester modele 1873", 20, 5, 99, 600);
    private static final Arme Winchester_modele_1887 = new Arme("Winchester modele 1887", 35, 20, 100, 700);
    private static final Arme Winchester_modele_1895 = new Arme("Whinchester modele 1895", 45, 30, 100, 800); 
    private static final Arme Winchester_modele_1897 = new Arme("Whinchester modele 1897", 150, 60, 60, 1520);
    private static final Arme Fusil_double_canon = new Arme("Fusil double canon", 130, 40, 55, 700);
    private static final Arme Fusil_canon_scie = new Arme("Fusil a canon scié", 170, 50, 33, 900);
    private static final Arme The_Lucky_Luck = new Arme("The Lucky Luke", 200, 1, 50, 1500);
    private static final Arme Couteau = new Arme("Couteau", 10, 2, 100, 0);
  
    
     /*
    Initialisation des lieux 
    */
    
    private static final Saloon le7iemeciel = new Saloon("Le 7 ième ciel",10);
    private static final Prison Lockcity = new Prison("Lockcity",50);
    private static final Armurie Bangout = new Armurie("Bangout",10);
    private static final Eglise SantaMaria = new Eglise("SantaMaria",10);
    private static final FarWest FarWest = new FarWest("Far West",0);
    private static final Banque Banque_Populaire = new Banque("Banque Populaire", 10, 0);
    /*
    Initialisation des personnages
    */
    private static final Niveau niveau = new Niveau(0 , 0, 500);
    private static final Player player = new Player("Billi",le7iemeciel,Couteau, "NULL", niveau, 1500, 0, 100,null,false); 
    private static final Sherif Robbert = new Sherif("Robbert",le7iemeciel, Winchester_modele_1897);   
    private static final Barman Luis = new Barman("Luis",le7iemeciel,Couteau );
    private static final Brigand Jacob = new Brigand("Jacob", Lockcity, Pistolet_de_seconde_main, false, 11, 0);
}