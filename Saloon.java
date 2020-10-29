
package projet.java.western;
import java.util.Random;
import java.util.Scanner; 
import static projet.java.western.Arme.sleep;
import projet.java.western.Barman;





public class Saloon extends Location implements Move_Location{
    
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
    
    
    public void Jouer(){  
        
    }
    public void Seduire(){
        
    }
    public void PlayPiano(){
        
    }
    public void leave(){
        
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
           question(player);
       }
       else{
         display_piano(player);  
       }
     
    }
    
    public void display_menu() 
    {
	System.out.println("1) Barman  \n2) Jouer \n3) Seduire \n4) PlayPiano \n5) leave");
	System.out.print("Selection: ");  
    }
    
    
    public void question(Player player) 
    {
        System.out.println();
	System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans le saloon !"+ ANSI_RESET);
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
	    System.out.println ( "You picked option 2" );
	    question(player);
	    break;
  
	    case 3:
	    System.out.println ( "You picked option 3" );
	    question(player);
	    break;
            
            case 4:
                System.out.println("Piano");
                display_piano(player);
            case 5:
                System.out.println("I'm gonna leave this place");
                changelocation(player);
	    default:
            question(player);
            System.out.println();
	    System.err.println ( "Unrecognized option" );
	    break;
              
	}
    }
    
    
    
 
    public void display_location()
    {
        System.out.println("Selection: ");
        System.out.println("1) Prison  \n2) Banque \n3) Armurie \n4) Sortir de la ville \n5) Rester");
	
    }
    
    
    @Override
    public void changelocation(Player player) {
        
        Prison Lockcity = new Prison("Lockcity",50,"NULL");
        Armurie Bangout = new Armurie("Bangout",10,"NULL");
        
        System.out.println("Où voulez-vous aller ?");
        Scanner q = new Scanner(System.in);
        
        display_location();
        
        switch (q.nextInt()) 
	{
   
	    case 1:
                System.out.println();    
                System.out.println ("Allons voir si le sherif à de nouvelles choses.." );
                System.out.println("Vous entrez dans la prison");
                player.SetLocation(Lockcity);
                Lockcity.question(player);
                break;
  
	    case 2:
                System.out.println();
                System.out.println ("Allons faire un tour à la banque..");
                System.out.println("Vous entrez dans la banque.");
                break;
  
	    case 3:
                System.out.println ( "Allons acheter une nouvelle arme..");
                System.out.println("Vous entrez dans l'armurie.");
                player.SetLocation(Bangout);
                Bangout.question(player);
                break;
            case 4:
 
                System.out.println();   
                System.err.println ("Allons à l'aventure !");
                System.out.println("Vous sortez de la ville faites bien attention.");

                break;
            
            case 5:
 
                System.out.println();
                System.err.println ( "Hum , je vais rester encore un peu ici" );
                question(player);
                break;
              
	}
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    private static int getRandomNumberInRange(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
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
	System.out.println("1) Barman  \n2) Jouer \n3) Seduire \n4) PlayPiano \n5) Sherif  \n6) leave");
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
