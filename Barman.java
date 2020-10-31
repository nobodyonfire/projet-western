
package projet.java.western;

import java.util.Scanner;





public class Barman extends Personnages{
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    
    
    public Barman(String Name, Location Location, Arme Gun , String Job , int Niveau, int Argent) {
        super(Name,Location,Gun,Job,Niveau,Argent);
        
    }
    
    public void boire(Player player){
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
        System.out.println("");
        talkb("Au menu j'ai : ");
        System.out.println();
	System.out.println("1) Jus de fruit  \n2) Vodka \n3) Ice Tea \n4) Bière \n5) quitter");
        System.out.println();
	talkb("Je vous mets quoi ?: ");
    }
    
    public void display_menuboissonbonus(Player player) 
    {   
        try {  Thread.sleep(1000); } catch (InterruptedException ie) {}
        System.out.println();
        talk("Je vous mets autre chose ? ");
	System.out.println("\n1) Jus de fruit  \n2) Vodka \n3) Ice Tea \n4) Bière \n5) quitter");
        questionboisson(player);
    }
    
    
    
    
    public void questionboisson(Player player)
    {
        display_menuboisson();
        choixboisson(player);
    }
    
    
    
    
    public void choixboisson(Player player){
     System.out.print("Selection: ");   
    Scanner q = new Scanner(System.in);
	switch (q.nextInt()) 
	{
   
	    case 1:
                System.out.println();   
                player.add_argent(-3, player);
                if (player.getArgent()-8>-1){
                    talkb(" Monsieur veut donc un jus de pomme ! Qui suis-je pour juger.." );
                    if (player.getHP()+10<101){
                        player.SetHP(player.getHP()+10);
                    }
                    else {
                        player.SetHP(100);
                    }
                    
                }

                display_menuboissonbonus(player);

                break;
  
	    case 2:
                System.out.println();
                player.add_argent(-10, player);
                 if (player.getArgent()-8>-1){
                    talkb( "Très bon choix ! je vous mets la dose " );
                    if (player.getHP()+50<101){
                        player.SetHP(player.getHP()+50);
                    }
                    else {
                        player.SetHP(100);
                    }
                }


                display_menuboissonbonus(player);
                break;
  
	    case 3:
                talkb( "Vous plaisentez ?" );
                talkb( "Que voulez vous sérieusement ?");
                questionboisson(player);
                break;
            
            case 4:
                player.add_argent(-8, player);
                if (player.getArgent()-8>-1){
                    talkb( "Excellent , une pinte pour monsieur !" );
                     player.SetHP(player.getHP()+5);
                }
                display_menuboissonbonus(player);
                break;
            
            
            case 5: 
                Saloon le7iemeciel = new Saloon("Le 7 ième ciel",10,"NULL");
                System.out.println("A plus tard " + player.getName() + ".");
                le7iemeciel.Menu(player);
    
            
	    break;
            
	    default:
            questionboisson(player);
	    break;     
	}
    }
    
    /* FONCTION DU BARMAN POUR LE TUTORIEL */
    
    
    public void choixboissontuto(Player player){
        talkb("Vous êtes nouveau ? Dans ce cas la première tournée est gratuite pour vous !");
        System.out.print("Selection: ");
        Scanner q = new Scanner(System.in);
	switch (q.nextInt()) 
	{
   
	    case 1:
                System.out.println();   
                player.add_argent(-3, player);
                if (player.getArgent()-8>-1){
                    talkb(" Monsieur veut donc un jus de pomme ! Qui suis-je pour juger.." );
                    if (player.getHP()+10<101){
                        player.SetHP(player.getHP()+10);
                    }
                    else {
                        player.SetHP(100);
                    }
                    
                }

                display_menuboissonbonustuto(player);          
                break;
  
	    case 2:
               System.out.println();
                player.add_argent(-10, player);
                 if (player.getArgent()-8>-1){
                    talkb( "Très bon choix ! je vous mets la dose " );
                    if (player.getHP()+50<101){
                        player.SetHP(player.getHP()+50);
                    }
                    else {
                        player.SetHP(100);
                    }
                }
                display_menuboissonbonustuto(player);
                break;
  
	    case 3:
                talkb( "Vous plaisentez ?" );
                talkb( "Que voulez vous sérieusement ?");
                questionboissontuto(player);
                break;
            
            case 4:
                System.out.println();
                player.add_argent(-8, player);
                if (player.getArgent()-8>-1){
                    talkb( "Excellent , une pinte pour monsieur !" );
                     player.SetHP(player.getHP()+5);
                }
                display_menuboissonbonustuto(player);
                break;
            
            case 5:               
                System.out.println();
            /* EFFET DE LA BOISSON */
            
	    break;
            
	    default:
            questionboissontuto(player);
	    break;     
	}
    }
    
    public void questionboissontuto(Player player){
        display_menuboisson();
        choixboissontuto(player);
        
    }
    
    public void display_menuboissonbonustuto(Player player) 
    {   
        try {  Thread.sleep(1000); } catch (InterruptedException ie) {}
        System.out.println();
        questionboissontuto(player);
    }
    
}
