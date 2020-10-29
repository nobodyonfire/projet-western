package projet.java.western;
import static java.lang.Thread.sleep;
import static java.lang.constant.ConstantDescs.NULL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;




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

    public static void main(String[] args) {
        
        
        initialisation();
        didactitiel();
        
        
        
        
  
    }
    
    
    public static void initialisation(){
        
        
        clearScreen(50);
        
        
        System.out.println(" ");
        System.out.println(ANSI_RED_BACKGROUND +  ANSI_WHITE+ "DEBUT INITIALISATION " + ANSI_RESET);
        System.out.println(" ");
        
        
      
        String Player_name = Robbert.StoryTelling();     
        player.SetName(Player_name);
        
        
        
        sleep(1500);
        
        System.out.println(" ");
        System.out.println(ANSI_RED_BACKGROUND +  ANSI_WHITE+  "FIN INITIALISATION " + ANSI_RESET);
        System.out.println(" ");
        System.out.println(" ");
        clearScreen(4);
        
        
    }
    
    
    public static void didactitiel(){
        

        /* ZONE TEST */
        
        /*
        player.playersave();
        player.playerload();
       
        map.printcarte();
        Bangout.questionAcheter(); */
        
        
        
         /* PREMIERE  PARTIE */
        System.out.println(ANSI_BLUE +"« Dans la ville de Widowchapel, réputé pour le nombre de chasseur de prime qui y meurt." +  ANSI_RESET);
        System.out.println(ANSI_BLUE + " Vous apparaissez, afin de faire régner l’ordre ,de capturer les malfrat tout en protégeant la ville des attaques , en s’équipant d’arme de plus en plus puissantes." +  ANSI_RESET);
        System.out.println(ANSI_BLUE + "Les risques et les récompenses sont toutes deux élevés. »" +  ANSI_RESET);
        pressenter();clearScreen(1);
      
        clearScreen(1);
        System.out.println(ANSI_BLUE + "Vous vous trouvez dans le saloon de la ville de Widowchapel" +  ANSI_RESET);
        pressenter();clearScreen(1);
        System.out.println(ANSI_BLUE + "Pour commencer, aller voire le barman pour chercher une boisson" +  ANSI_RESET);
        pressenter();clearScreen(1);
        le7iemeciel.questiontuto();
        clearScreen(1);
        Luis.talkb("Alors, ça fait du bien de se désaltérer un petit peu ?");
        Luis.talkb("Le shériff m'a dit qu'il voulait te voir alors dépèche toi!");
        pressenter();
        
        
        /* DEUXIEME PARTIE */
        le7iemeciel.questiontuto2();
        clearScreen(1);
        Robbert.talkb("Comme tu es nouveau je vais te présenter un peu la ville ...");
        Robbert.talkb("Quand tu te situe dans un lieu tu peux le quitter pour en rejoindre d'autres");
        Robbert.talkb("Il y a l'amurie, le saloon, l'allée centrale, la prison , la banque et l'extérieur de la ville..");
        
        pressenter();
        Robbert.talkb("Voilà la carte de la ville");
        
        clearScreen(2);
        System.out.println("CARTE: ");
        map.printcarte();
        clearScreen(2);
        Robbert.talkb("Dans l'armurie tu peux acheter de nouvelles armes et vendre la tienne");
        pressenter();clearScreen(1);
        Robbert.talkb("Dans le saloon tu peux jouer, récuperer et boire..etc");
        pressenter();clearScreen(1);
        Robbert.talkb("La banque est l'endroit où tu pourras stocker ton argent et le retirer");
        pressenter();clearScreen(1);
        Robbert.talkb("Tu pourras aussi me trouver à la prison, où j'aurais des missions pour toi !");
        pressenter();clearScreen(1);
        Robbert.talkb("Et enfin dehors , le far west , il faudra faire très attentions aux rencontres que tu vas faire..");
        pressenter();clearScreen(2); 
        /* CHANGER DE LOCATION LE JOUEUR*/
        Robbert.talkb("Tant que tu es là, j'aurais besoin de ton aide en prison ..");
        pressenter();clearScreen(1);
        
        
        /* TROISIEME PARTIE */
        player.SetLocation(Lockcity);
        clearScreen(1);
        Robbert.talkb("Ho non ! Le prisonnier s'échappe !");
        pressenter();clearScreen(1);
        Robbert.talkb("Eh " + player.getName() + " fait tes preuves et attrape le.");
        Robbert.talkb("Tu auras le droit à la moitié de sa prime. Tiens un flingue je l'ai trouvé par terre.");
        player.SetGun(Pistolet_de_seconde_main);
        pressenter();clearScreen(1);
        
        duel(player, Jacob);
        Robbert.talkb("Chapeau l'artiste! Tu as attrapé ta première prime à Widowchapel.");
        Robbert.talkb("Voici ta récompense, et approche je vais soigner tes blessures.");
        pressenter();
        player.soin(100, player);
        player.add_argent(500, player);
        Robbert.talkb("Tu comprends comment ça marche maintenant. Tu me rapportes un bandit et je te donne de l'argent en retour.");
        Robbert.talkb("Facile non ? Bon je vais te laisser j'ai de la paperasse qui m'attends. Reviens me voir plus tard.");
        Lockcity.question(player);
              
        
         /*try {  Thread.sleep(5000); } catch (InterruptedException ie) {}   */
        
        
    }
    
    
    
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
    
    
    private static void taille(String mot,int max){
        int taillemot=mot.length();
        for (int i = 0; i < max-taillemot; ++i) 
            System.out.print(" ");
    }
    
   
    public static void sleep(int temps){
        try {  Thread.sleep(temps); } catch (InterruptedException ie) {}
    }
    
    public static void clearScreen(int j) {  

        for (int i = 0; i < j; ++i) System.out.println("");

    }
    
    public static void pressenter(){
        Scanner readinput = new Scanner(System.in);
        String enterkey = "appuyer sur entrer...";
        System.out.print(enterkey);
        enterkey = readinput.nextLine();
        System.out.print(enterkey);
    
    }
    
    public static boolean duel(Player player, Brigand brigand){
        
        System.out.println("");
        boolean victoire = false;
        int degat;
      
        /* AFFICHAGE DUEL */
        
                
        for (int i = 0; i < player.getName().length() + 61 ; ++i) System.out.print("_");clearScreen(1);

        for (int i = 0; i < player.getName().length() + 26 ; ++i) System.out.print(ANSI_RED_BACKGROUND+ANSI_WHITE+" "+ANSI_RESET);
        System.out.print(ANSI_RED_BACKGROUND+ANSI_WHITE+"DUEL"+ANSI_RESET);
        for (int i = 0; i < brigand.getName().length() +26; ++i) System.out.print(ANSI_RED_BACKGROUND+ANSI_WHITE+" "+ANSI_RESET);        clearScreen(1);
        for (int i = 0; i < player.getName().length() + 61 ; ++i) System.out.print("¯");
        /* AFFICHAGE NOM*/
        
        System.out.println("");
        System.out.println(player.getName()+ "                           VS                          "+ brigand.getName());
        
        /* AFFICHAGE HP*/
       
        System.out.print(player.getHP());
         for (int i = 0; i < player.getName().length()-Integer.toString(player.getHP()).length() ; ++i) System.out.print(" ");
         if (brigand.getHP()>99){
             System.out.println("                           HP                            "+ brigand.getHP());}
         else{
             System.out.println("                           HP                             "+ brigand.getHP());
         }
         
        
         /* AFFICHAGE ARMES*/
        
        for (int i = 0; i < player.getName().length()-player.Gun.getname().length() ; ++i) System.out.print(" ");
        
        System.out.print(player.Gun.getname());
        for (int i = 0; i < 31-player.Gun.getname().length() ; ++i) System.out.print(" ");
        System.out.print("GUN");
        for (int i = 0; i < 31-brigand.Gun.getname().length() ; ++i) System.out.print(" ");
        System.out.print(brigand.Gun.getname());
        
        
        System.out.println("");
        System.out.println("");
        pressenter();
        System.out.println("");

        while (player.HP > 0 && brigand.HP > 0){
            if (player.Gun.toucher(player.Gun) == true){

                degat = player.Gun.puissance(player.Gun);
                brigand.HP = brigand.HP - degat;
                System.out.println("Touché ! Vous lui avait fait " + degat + " dégats! Il lui reste encore " + brigand.HP + " HP");
            } 
            else               
            {
                System.out.println("Vous l'avez rateé de peu...");  
            }
            
            if (brigand.HP < 0 ){
                break;
            }
            if (brigand.Gun.toucher(brigand.Gun) == true){
                degat = brigand.Gun.puissance(brigand.Gun);
                player.HP = player.HP - degat;
                System.out.println("Il ne vous a pas loupé, vous avait perdu " + degat + " HP! Il vous en reste " + player.HP+" HP");
            }
            else
            {
                System.out.println("Vous avez esquivé son tir!");
            }

            pressenter();
            System.out.println("");
            
        }
        if (player.HP <= 0){
            System.out.println("Vous êtes mort!");
        }
        else {
            System.out.println("Vous avez eu " + brigand.getName() + ".");
            clearScreen(1);
            System.out.println("Il fera moins le malin en prison.");
            pressenter();
            victoire = true;
            brigand.setEstEnPrison(victoire);
            
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
    private static final Arme Couteau = new Arme("Couteau", 10, 9, 100, 0);
  
    
     /*
    Initialisation des lieux 
    */
    
    private static final Saloon le7iemeciel = new Saloon("Le 7 ième ciel",10,"NULL");
    private static final Prison Lockcity = new Prison("Lockcity",50,"NULL");
    private static final Armurie Bangout = new Armurie("Bangout",10,"NULL");
    /*
    Initialisation des personnages
    */
    private static final Player player = new Player("Billi",le7iemeciel,Couteau, "NULL", 1, 0, 0, 100); 
    private static final Sherif Robbert = new Sherif("Robbert",le7iemeciel, Winchester_modele_1897, "NULL", 0,0,100,"pate bolo",10);   
    private static final Barman Luis = new Barman("Luis",le7iemeciel,Couteau, "Barman" , 20, 1000);
    private static final Brigand Jacob = new Brigand("Jacob", Lockcity, Pistolet_de_seconde_main, "Voleur" , 1, 0,1,false, 11);

}