
package projet.java.western;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner; 
import static projet.java.western.Arme.sleep;
import projet.java.western.Barman;





public class Saloon extends Location implements Move_Location, Menu{
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final Arme Couteau = new Arme("Couteau", 10, 10, 100, 0);
    private static final Saloon le7iemeciel = new Saloon("Le 7 ième ciel",10,"NULL");
    
    protected String Name;
    
    public Saloon(String Nom,int Danger,String Name){
        super(Nom,Danger);
        this.Name=Name;
    }

    
    public void boire(Player player){
        
        Barman Barman = new Barman("Luis",le7iemeciel,Couteau,"Barman" ,0,1000);       
        Barman.questionboisson(player);
        
    }
    @SuppressWarnings("empty-statement")
    
    
  public void Jouer(Player player){
        
        List<Integer> Deckinit = Arrays.asList(11,2,3,4,5,6,7,8,9,10,10,10,10,11,2,3,4,5,6,7,8,9,10,10,10,10,11,2,3,4,5,6,7,8,9,10,10,10,10,11,2,3,4,5,6,7,8,9,10,10,10,10);
        ArrayList<Integer> Deck = new ArrayList<Integer>(); 
        Deck.addAll(Deckinit);
        int Bank_Value = 0;
        int Player_Value = 0;
        Scanner q = new Scanner(System.in);
        int index;
        boolean Stop = false;
        String Answer;
        
        clearScreen(1);
        System.out.println(ANSI_BLUE+"Vous avez " + player.getArgent() + "$ sur vous."+ANSI_RESET);
        clearScreen(1);
        
        int mise = paiement(player);
        
        System.out.println("_______________________________________________________");
        System.out.println(ANSI_GREEN+"          DEBUT DE LA PARTIE          "+ANSI_RESET);
        System.out.println("_______________________________________________________");

        
        
        Random r = new Random();
        
        index = r.nextInt(Deck.size());
        Player_Value = Deck.get(index);
        clearScreen(1);
        System.out.println(ANSI_BLUE+"Vous piochez un " + Deck.get(index) + "."+ANSI_RESET);
        Deck.remove(index);
        
        index = r.nextInt(Deck.size());
        Player_Value = Player_Value + Deck.get(index);
        System.out.println(ANSI_BLUE+"Vous piochez un " + Deck.get(index) + "."+ANSI_RESET);
        Deck.remove(index);
        
        index = r.nextInt(Deck.size());
        Bank_Value = Deck.get(index);
        Deck.remove(index);
        clearScreen(1);
        System.out.println(ANSI_RED+"Le score de la banque est " + Bank_Value + "."+ANSI_RESET);
        
        while (Stop == false && Player_Value < 22){
            System.out.println(ANSI_BLUE+"Votre score est de " + Player_Value + ". Voulez-vous continuez ?"+ANSI_RESET);
            System.out.println(ANSI_BLUE+"Y/N"+ANSI_RESET);
            Answer = q.nextLine();
            if (Answer.isEmpty()||Answer.contains("y") || Answer.contains("Y")){
                index = r.nextInt(Deck.size());
                Player_Value = Player_Value + Deck.get(index);
                clearScreen(1);
                System.out.println(ANSI_BLUE+"Vous piochez un " + Deck.get(index) + "."+ANSI_RESET);
                Deck.remove(index);
            }
            else{
                if (Answer.contains("N")||Answer.contains("n")){
                    Stop = true;
                }
            }
        }
        while (Bank_Value < 17){
            index = r.nextInt(Deck.size());
            Bank_Value = Bank_Value + Deck.get(index);
            clearScreen(1);
            System.out.println(ANSI_RED+"La Banque pioche un " + Deck.get(index) + "."+ANSI_RESET);
            Deck.remove(index);
            System.out.println(ANSI_RED+"Le score de la banque est " + Bank_Value + "."+ANSI_RESET);
            sleep(1500);
        }
        if (Player_Value > 21 || (Player_Value < Bank_Value && Bank_Value < 22)){
            clearScreen(1);
            System.out.println(ANSI_RED+"Vous avez perdu. Vous perdez " + mise + "$."+ANSI_RESET);
            player.add_argent(-mise, player);
        }
        else{
            if (Player_Value==Bank_Value){
                clearScreen(1);
                System.out.println(ANSI_BLUE+"Egalité, personne ne gagne."+ANSI_RESET);
            } 
            else{
                clearScreen(1);
                System.out.println(ANSI_BLUE+"Vous avez gagné. Vous gagnez " + 2*mise + "$."+ANSI_RESET);
                mise = 2 * mise;
                player.add_argent(mise, player); 
            }
            
        }
        clearScreen(1);
        System.out.println("Voulez-vous rejouer ? ");
        System.out.println("Y/N");
        
        Answer = q.nextLine();
        if (Answer.isEmpty()||Answer.contains("y") || Answer.contains("Y")){
            Jouer(player);
        }
        else{
            if (Answer.contains("N")||Answer.contains("n")){
                Menu(player);
            }
        }
        
    }
    
    public int paiement(Player player){
        int mise = 0;
        Scanner q = new Scanner(System.in);
        boolean paiement = false;
        while (paiement == false){
            System.out.println("Combien voulez-vous miser ?");
            mise = q.nextInt();    
            if (mise > player.getArgent()){
                System.out.println("Vous ne pouvez pas miser de l'argent que vous n'avez pas.");
            }
            else{
                if (mise > 300){
                    System.out.println("Désolé vous ne pouvez pas miser autant.");
                }
                else{
                    System.out.println("Votre mise de " + mise + "$ a été prise en compte.");
                    paiement = true;
                    
                }
            }
        }
        return mise;
    }
    
    public void Seduire(Player player){
        System.out.println("");
        System.out.println(ANSI_BLUE+"Jouer pour augmenter vos HP max !"+ANSI_RESET);
        System.out.println("");
        display_seduire(player);
    }
    
    public void PlayPiano(Player player){
        System.out.println("");
        System.out.println(ANSI_BLUE+"Jouer pour gagner de l'argent et des HP !"+ANSI_RESET);
        System.out.println("");
        display_piano(player);  
    }
    
    public void leave(){
        
    }
    
    
    
    public void recompensepiano(Player player){
        int a =getRandomNumberInRange(1,3);
        int b =getRandomNumberInRange(1,2);
        
        if (b==1){
            if (player.getHP()+1<101){
                player.setHP(player.getHP()+1);
                System.out.println(ANSI_BLUE+"Vous avez été soigné de 1HP, vous avez maintenant :"+ player.getHP()+" HP"+ANSI_RESET);
            }
        }
        if (a==1){
            player.SetArgent(player.getArgent()+1);
            System.out.println(ANSI_BLUE +"Vous avez été gagné 1$ ! " + ANSI_RESET);   
        }  
    }      
    public void display_piano(Player player){
       int a =getRandomNumberInRange(1,9);
       int b =getRandomNumberInRange(0,20);
       map.printpiano(b,  Integer.toString(a));
       int valeur =50;boolean Stop = false;
       System.out.println("Rentrer le nombre que vous voyez, rentrer "+ "0" +" pour quiter");
       
       while((a!=valeur) && (Stop == false)){
            System.out.println("");
            Scanner q = new Scanner(System.in);
            valeur = q.nextInt();
            if (valeur == 0 ){
                Stop = true; 
            }
       }
       if (Stop == true){
            Menu(player);
       }
       else{
         recompensepiano(player);
         display_piano(player);  
       }
     
    }
    
    
    public void recompenseseduire(Player player){
        int a =getRandomNumberInRange(1,3);
 
        if (a==1){
            if (player.getHP()+1<101){
                player.setHP(player.getHP()+1);
                System.out.println(ANSI_BLUE+"Vous avez été soigné de 1HP, vous avez maintenant :"+ player.getHP()+" HP"+ANSI_RESET);
            }
            else {
                player.setHP(player.getHP()+1);
                System.out.println(ANSI_BLUE+"Vos HP max ont augmentés:"+ player.getHP()+" HP"+ANSI_RESET);
            }
        }
    }      
     public void display_seduire(Player player){
          int a =getRandomNumberInRange(1,36);
          map.printseduire(a);
          int A =50;int B =50;boolean Stop = false;int valeur=50;
          System.out.println("Rentrer le nombre que vous voyez ( A puis B ), rentrer "+ "0 pour A et B" +" pour quiter");
       
       while((a!=valeur) && (Stop == false)){
            System.out.print("A= ");
            Scanner q = new Scanner(System.in);
            int tmp = q.nextInt();
            System.out.print("B= ");
            Scanner q1 = new Scanner(System.in);
            int tmp2 = q1.nextInt();
            valeur = tmp*6+tmp2+1;
            if (valeur == 1 ){
                Stop = true; 
            }
       }
       if (Stop == true){
            Menu(player);
       }
       else{
         recompenseseduire(player);
         display_seduire(player);  
       }
     
     }
    
    
    
    
    
    
    public void display_menu() 
    {
	System.out.println("1) Barman  \n2) Jouer ( BlackJack ) \n3) Seduire \n4) PlayPiano \n5) leave");
	System.out.print("Selection: ");  
    }
    
    
    
 
    public void display_location()
    {
        System.out.println("Selection: ");
        System.out.println("1) Prison  \n2) Banque \n3) Armurie \n4) Eglise \n5) Sortir de la ville \n6) Rester");
	
    }
    
    
    @Override
    public void changelocation(Player player) {
        
        Prison Lockcity = new Prison("Lockcity",50,"NULL");
        Armurie Bangout = new Armurie("Bangout",10,"NULL");
        Banque Banque_Populaire = new Banque("Banque Populaire", 10, 0);
        Eglise SantaMaria = new Eglise("SantaMaria",10);
        
        System.out.println("Où voulez-vous aller ?");
        Scanner q = new Scanner(System.in);
        
        display_location();
        
        switch (q.nextInt()) 
	{
   
	    case 1:
                System.out.println();    
                System.out.println("Vous entrez dans la prison");
                player.SetLocation(Lockcity);
                Lockcity.Menu(player);
                break;
  
	    case 2:
                System.out.println();
                System.out.println("Vous entrez dans la banque.");
                player.SetLocation(Banque_Populaire);
                Banque_Populaire.Menu(player);
                break;
  
	    case 3:
                System.out.println();
                System.out.println("Vous entrez dans l'armurie.");
                player.SetLocation(Bangout);
                Bangout.Menu(player);
                break;
            case 4:
                System.out.println();
                System.out.println("Vous entrez dans l'Eglise.");
                player.SetLocation(SantaMaria);
                SantaMaria.Menu(player);
                break;
            case 5:
 
                System.out.println();   
                System.err.println ("Allons à l'aventure !");
                System.out.println("Vous sortez de la ville faites bien attention.");
                break;
            
            case 6:
 
                System.out.println();
                System.err.println ( "Hum , je vais rester encore un peu ici" );
                Menu(player);
                break;
              
	}
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void Menu(Player player) {

        System.out.println();
	System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans le saloon !"+ ANSI_RESET);
        System.out.println();
	System.out.println("Que voulez vous faire ?");
	Scanner q = new Scanner(System.in);


        display_menu();

	switch (q.nextInt()) 
	{


	    case 1:
            System.out.println();    
	    System.out.println ("Il est temps de boire un coup !" );
            boire(player);
	    break;

	    case 2:
            System.out.println();
	    System.out.println ( "Il est temps de faire un blackJack !" );
	    Jouer(player);
	    break;

	    case 3:
	    System.out.println();
	    System.out.println ( "Il est temps de séduire.." );
	    Seduire(player);
	    break;

            case 4:
            System.out.println();
	    System.out.println ( "Jouons un peu de piano" );
            PlayPiano(player);
            case 5:
            System.out.println("Je pars d'ici");
            changelocation(player);
	    default:
            Menu(player);
            System.out.println();
	    System.err.println ( "Erreur inconnue" );
	    break;

	}
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static int getRandomNumberInRange(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("MAX > MIN");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
    
    public static void sleep(int temps){
        try {  Thread.sleep(temps); } catch (InterruptedException ie) {}
    }
    
    public static void clearScreen(int j) {  

        for (int i = 0; i < j; ++i) System.out.println("");

    }
    
    /* FONCTION TUTORIEL SALOON */
    
    public void display_menututo() 
    {
	System.out.println("1) Barman  \n2) Jouer \n3) Seduire \n4) Piano \n5) Quitter");
	System.out.print("Selection: ");    
    }    
    
    public void boiretuto(Player player){
        Barman Barman = new Barman("Luis",le7iemeciel,Couteau,"Barman" ,0,1000);       
        Barman.questionboissontuto(player);
    }
    
     public void questiontuto2()
    {   
        System.out.println("");
	System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans le saloon !"+ ANSI_RESET);
        System.out.println("");
	System.out.println("Que voulez vous faire ?");
	Scanner q = new Scanner(System.in);
       
        display_menututo2();
        
	switch (q.nextInt()) 
	{
   
	    case 5:
            System.out.println();
	    break;
	    default:
            System.out.println();
	    System.out.println(ANSI_GREEN+ "Il faut aller voir le Sherif !" +ANSI_RESET);
            questiontuto2();
	    break;     
            
	}
    }
     
     public void display_menututo2() 
    {
	System.out.println("1) Barman  \n2) Jouer ( BlackJack ) \n3) Seduire \n4) PlayPiano \n5) Sherif  \n6) leave");
	System.out.print("Selection: ");           
    }
     
    public void questiontuto(Player player)
    {   
        System.out.println();
	System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans le saloon !"+ ANSI_RESET);
	System.out.println("Que voulez vous faire ?");
	Scanner q = new Scanner(System.in);
       
        display_menututo();
        
	switch (q.nextInt()) 
	{
   
	    case 1:
            System.out.println();
	    System.out.println ("Il est temps de boire un coup !" );
            boiretuto(player);
	    break;
	    default:
            System.out.println();
	    System.out.println(ANSI_GREEN+ "Il faut aller voir le barman !" +ANSI_RESET);
            questiontuto(player);
	    break;     
            
	}
    }

 
}