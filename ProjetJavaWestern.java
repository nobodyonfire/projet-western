
package projet.java.western;
import static java.lang.Thread.sleep;
import static java.lang.constant.ConstantDescs.NULL;
import java.util.Scanner; 
import java.util.logging.Level;
import java.util.logging.Logger;




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
        
        System.out.println(" ");
        System.out.println(ANSI_RED_BACKGROUND +  ANSI_WHITE+ "DEBUT INITIALISATION " + ANSI_RESET);
        System.out.println(" ");
        
        
        Sherif Robbert = new Sherif("Robbert", "Saloon", "NULL", "NULL", 0,0,100,"pate bolo",10);
        
        Robbert.StoryTelling();
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println( "           Quel est ton nom cowboy ?" );
        String Player_name = scanner.nextLine();
        
        Saloon le7iemeciel = new Saloon("Le 7 ième ciel",10,"NULL");
        
        
        Player Joueur = new Player(Player_name,"le7iemeciel","NULL" , "NULL", 1, 0); 
        Robbert.talk("Ainsi soit-il " + Joueur.Name + ". Bienvenue en enfer.");
        
        try {
            sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjetJavaWestern.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(" ");
        System.out.println(ANSI_RED_BACKGROUND +  ANSI_WHITE+  "FIN INITIALISATION " + ANSI_RESET);
        System.out.println(" ");
        System.out.println(" ");
  
        clearScreen(4);
  
        
        didactitiel();
        
        
        
        
  
    }
    
    
    
    
    
    public static void didactitiel(){
        
        System.out.println(ANSI_BLUE +"« Dans la ville de Widowchapel, réputé pour le nombre de chasseur de prime qui y meurt." +  ANSI_RESET);
        System.out.println(ANSI_BLUE + " Vous apparaissez, afin de faire régner l’ordre ,de capturer les malfrat tout en protégeant la ville des attaques , en s’équipant d’arme de plus en plus puissantes." +  ANSI_RESET);
        System.out.println(ANSI_BLUE + "Les risques et les récompenses sont toutes deux élevés. »" +  ANSI_RESET);
        pressenter();clearScreen(1);
        Saloon le7iemeciel = new Saloon("Le 7 ième ciel",10,"NULL");
        clearScreen(1);
        System.out.println(ANSI_BLUE + "Vous vous trouvez dans le saloon de la ville de Widowchapel" +  ANSI_RESET);
        pressenter();clearScreen(1);
        System.out.println(ANSI_BLUE + "Pour commencer, aller voire le barman pour chercher une boisson" +  ANSI_RESET);
        pressenter();clearScreen(1);
        Barman Luis = new Barman("Luis","7 ième ciel","NULL" , "Barman" , 20, 1000);
        le7iemeciel.questiontuto();
        clearScreen(1);
        Luis.talk("Alors, ça fait du bien de se désaltérer un petit peu ?");
        Luis.talk("Le shériff m'a dit qu'il voulait te voir alors dépèche toi!");
        le7iemeciel.question();
        
        
        
        
        
        
         /*try {  Thread.sleep(5000); } catch (InterruptedException ie) {}   */
        
        
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
        if(enterkey == ""){
            System.out.println("It works!"); }
    
    }
}
