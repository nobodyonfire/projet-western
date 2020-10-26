
package projet.java.western;
import java.util.Scanner; 




public class Saloon extends Location{
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    protected String Name;
    
    public Saloon(String Nom,int Danger,String Name){
        super(Nom,Danger);
        this.Name=Name;
        introduction(Nom);
    }
    
    public void introduction(String Nom){
        System.out.println(ANSI_RED + "Le nouveau saloon : " + Nom +", viens d'apparaitre dans la ville"+ANSI_RESET);

    }
    public void boire(){
        
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
    
    public void question()
    {
	System.out.println("Vous êtes dans le saloon !");
	System.out.println("Que voulez vous faire ?");
	Scanner q = new Scanner(System.in);
       
	
        display_menu();
        
	switch (q.nextInt()) 
	{
   
  
	    case 1:
	    System.out.println ("Il est temps de boire un coup !" );
            boire();
	    break;
  
	    case 2:
	    System.out.println ( "You picked option 2" );
	    question();
	    break;
  
	    case 3:
	    System.out.println ( "You picked option 3" );
	    question();
	    break;
	    default:
            question();
	    System.err.println ( "Unrecognized option" );
	    break;
            
            
            
	}
    }
 
    

  
}
