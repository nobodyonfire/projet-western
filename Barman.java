
package projet.java.western;

import java.util.Scanner;





public class Barman extends Personnages{
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    
    public Barman(String Name, String Location, Arme Gun , String Job , int Niveau, int Argent) {
        super(Name,Location,Gun,Job,Niveau,Argent);
        
    }
    
    public void boire(){
        talkb("Je te sers quoi ?"); 
    }
    
    @Override 
    public void introduceYourself(){
    }
    
    public void sepresenter(){
      
        talkb( "Hey salut moi c'est " + Name + " .Je suis le barman de ce bar je te sers quelque chose ? ptite biere ?" ); 

    }
    
    
    
    
    
    
    public void display_menuboisson() 
    {
        System.out.println();
        talkb("Au menu j'ai : ");
        System.out.println();
	System.out.println("1) Jus de fruit  \n2) Vodka \n3) Ice Tea \n4) Bière \n5) quitter");
        System.out.println();
	talkb("Je vous mets quoi ?: ");
        System.out.print("Selection: ");
    }
    
    public void display_menuboissonbonus() 
    {   
        try {  Thread.sleep(2000); } catch (InterruptedException ie) {}
        System.out.println();
        talk("Je vous mets autre chose ? ");
	System.out.println("\n1) Jus de fruit  \n2) Vodka \n3) Ice Tea \n4) Bière \n5) quitter");
        System.out.print("Selection: ");
        choixboisson();
    }
    
    
    
    
    public void questionboisson()
    {
        display_menuboisson();
        choixboisson();
    }
    
    
    
    
    public void choixboisson(){
        
    Scanner q = new Scanner(System.in);
	switch (q.nextInt()) 
	{
   
	    case 1:
            System.out.println();    
	    talkb(" Monsieur veut donc un jus de pomme ! Qui suis-je pour juger.." );
            /* EFFET DE LA BOISSON */
            /* PAYEMENT */
            display_menuboissonbonus();
	    break;
  
	    case 2:
            System.out.println();
	    talkb( "Très bon choix ! je vous mets la dose " );
            /* EFFET DE LA BOISSON */
            /* PAYEMENT */
            display_menuboissonbonus();
	    break;
  
	    case 3:
	    talkb( "Vous plaisentez ?" );
            talkb( "Que voulez vous sérieusement ?");
            questionboisson();
	    break;
            
            case 4:
	    talkb( "Excellent , une pinte pour monsieur !" );
            /* EFFET DE LA BOISSON */
            /* PAYEMENT */
            display_menuboissonbonus();
	    break;
            
            case 5:
	    talkb( "Bonne journée à vous !" );
            /* EFFET DE LA BOISSON */
            
	    break;
            
	    default:
            questionboisson();
	    break;     
	}
    }
    
    
    
}
