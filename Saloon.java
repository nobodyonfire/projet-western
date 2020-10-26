
package projet.java.western;
import java.util.Scanner; 




public class Saloon extends Location{
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    
    protected String Name;
    
    public Saloon(String Nom,int Danger,String Name){
        super(Nom,Danger);
        this.Name=Name;
        introduction(Nom);
    }
    
    public void introduction(String Nom){
        System.out.println(ANSI_RED + "Le nouveau saloon : " + Nom +", viens d'apparaitre dans la ville"+ANSI_RESET);

    }
    public void boire(Barman Barman){
        Barman.questionboisson();
    }
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
    
    
    public void question(Barman Barman) 
    {
	System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans le saloon !"+ ANSI_RESET);
	System.out.println("Que voulez vous faire ?");
	Scanner q = new Scanner(System.in);
       
	
        display_menu();
        
	switch (q.nextInt()) 
	{
   
  
	    case 1:
            System.out.println();    
	    System.out.println ("Il est temps de boire un coup !" );
            boire(Barman);
	    break;
  
	    case 2:
            System.out.println();
	    System.out.println ( "You picked option 2" );
	    question(Barman);
	    break;
  
	    case 3:
	    System.out.println ( "You picked option 3" );
	    question(Barman);
	    break;
	    default:
            question(Barman);
            System.out.println();
	    System.err.println ( "Unrecognized option" );
	    break;
              
	}
    }
    
    
    
    public void display_menututo() 
    {
	System.out.println("1) Barman  \n2) Jouer \n3) Seduire \n4) PlayPiano \n5) leave");
	System.out.print("Selection: ");
        
        
    }
    
    public void questiontuto(Barman Barman)
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
            boire(Barman);
	    break;
	    default:
            System.out.println();
	    System.out.println(ANSI_GREEN+ "Il faut aller voir le barman !" +ANSI_RESET);
            questiontuto(Barman);
	    break;
            
            
            
	}
    }
    
    
 
    

  
}
