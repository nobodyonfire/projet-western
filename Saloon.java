
package projet.java.western;
import java.util.Scanner; 
import projet.java.western.Barman;





public class Saloon extends Location implements Move_Location{
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final Arme Couteau = new Arme("Couteau", 10, 10, 100, 0);
    
    protected String Name;
    
    public Saloon(String Nom,int Danger,String Name){
        super(Nom,Danger);
        this.Name=Name;
        introduction(Nom);
    }
    
    public void introduction(String Nom){
        System.out.println();
        System.out.println(ANSI_RED + "Le nouveau saloon : " + Nom +", viens d'apparaitre dans la ville"+ANSI_RESET);
        System.out.println();
    }
    
    
    public void boire(){
        
        Barman Barman = new Barman("Luis","7 ième ciel",Couteau,"Barman" ,0,1000);       
        Barman.questionboisson();
        
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
    
    
    
    
    
    
    public void display_menu() 
    {
	System.out.println("1) Barman  \n2) Jouer \n3) Seduire \n4) PlayPiano \n5) leave");
	System.out.print("Selection: ");  
    }
    
    
    public void question() 
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
            boire();
	    break;
  
	    case 2:
            System.out.println();
	    System.out.println ( "You picked option 2" );
	    question();
	    break;
  
	    case 3:
	    System.out.println ( "You picked option 3" );
	    question();
	    break;
            case 5:
                System.out.println("I'm gonna leave this place");
                changelocation();
	    default:
            question();
            System.out.println();
	    System.err.println ( "Unrecognized option" );
	    break;
              
	}
    }
    
    
    
    public void display_menututo() 
    {
	System.out.println("1) Barman  \n2) Jouer \n3) Seduire \n4) PlayPiano \n6) leave");
	System.out.print("Selection: ");
        
        
    }
    
    public void questiontuto()
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
            boire();
	    break;
	    default:
            System.out.println();
	    System.out.println(ANSI_GREEN+ "Il faut aller voir le barman !" +ANSI_RESET);
            questiontuto();
	    break;     
            
	}
    }
    
    public void display_menututo2() 
    {
	System.out.println("1) Barman  \n2) Jouer \n3) Seduire \n4) PlayPiano \n5) Sherif  \n6) leave");
	System.out.print("Selection: ");
        
        
    }
    
    public void questiontuto2()
    {   
        System.out.println();
	System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans le saloon !"+ ANSI_RESET);
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
    
    
    public void display_location()
    {
        System.out.print("Selection: ");
        System.out.println("1) Townhall  \n2) Bank \n3) Weapon Shop \n4) Outside the town \n5) Stay");
	
    }
    
    
    @Override
    public void changelocation() {
        
        System.out.println("Où voulez-vous aller ?");
        Scanner q = new Scanner(System.in);
        
        display_location();
        
        switch (q.nextInt()) 
	{
   
	    case 1:
            System.out.println();    
	    System.out.println ("Allons voir si le sherif à de nouvelles choses.." );
	    break;
  
	    case 2:
            System.out.println();
	    System.out.println ("Allons faire un tour à la banque..");
	    break;
  
	    case 3:
	    System.out.println ( "Allons acheter une nouvelle arme..");
	    break;
            case 4:
 
            System.out.println();   
	    System.err.println ( "Allons à l'aventure !" );
	    break;
            
            case 5:
 
            System.out.println();
	    System.err.println ( "Hum , je vais rester encore un peu ici" );
            question();
	    break;
              
	}
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
 
    

  
}
