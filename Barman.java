package projet.java.western;

import java.util.Scanner;

/* Class Barman qui est un personnage */
public class Barman extends Personnages{
    
    /* Initialisation des valeurs */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    /*  Constructeur*/
    public Barman(String Name, Location Location, Arme Gun , String Job, int Argent) {
        super(Name,Location,Gun,Job,Argent);
        
    }
    
    /* Méthode pour afficher le barman qui parle */
    public void boire(Player player){
        talkb("Je te sers quoi ?"); 
    }
    
    /*  */
    @Override 
    public void introduceYourself(){
    }
    
    /* Méthode pour se présenter */
    public void sepresenter(){
      
        talkb( "Hey salut moi c'est " + Name + " .Je suis le barman de ce bar, je te sers quelque chose ? une ptite bière ?" ); 

    }
    
    /* Méthode pour afficher le menu Boisson */
    public void display_menuboisson() 
    {
        System.out.println("");
        talkb("Au menu j'ai : ");
        System.out.println();
	System.out.println("1) Jus de fruit  \n2) Vodka \n3) Ice Tea \n4) Bière \n5) quitter");
        System.out.println();
	talkb("Je vous mets quoi ?: ");
    }
    
    /* Méthode pour afficher le menu des boisson bonus */
    public void display_menuboissonbonus(Player player) 
    {   
        try {  Thread.sleep(1000); } catch (InterruptedException ie) {}
        System.out.println();
        talk("Je vous mets autre chose ? ");
	System.out.println("\n1) Jus de fruit  \n2) Vodka \n3) Ice Tea \n4) Bière \n5) quitter");
        questionboisson(player);
    }

    /* Méthode pour le choix de la boisson */
    public void questionboisson(Player player)
    {
        display_menuboisson();
        choixboisson(player);
    }
    
    /* Méthode qui permet à l'utilisateur de choisir sa boisson */
    public void choixboisson(Player player){
        int q = Test.test();
	switch (q) 
	{
   
	    case 1:
                System.out.println();   
                
                if (player.getArgent()-3>-1){
                    talkb(" Monsieur veut donc un jus de pomme ! Qui suis-je pour juger.." );
                    player.add_argent(-3, player);
                    player.soin(3, player);
                    
                }

                display_menuboissonbonus(player);

                break;
  
	    case 2:
                System.out.println();
                
                 if (player.getArgent()-10>-1){                
                    talkb( "Très bon choix ! je vous mets la dose " );
                    player.add_argent(-10, player);
                    player.soin(10, player);
                }


                display_menuboissonbonus(player);
                break;
  
	    case 3:
                talkb( "Vous plaisentez ?" );
                talkb( "Que voulez-vous sérieusement ?");
                questionboisson(player);
                break;
            
            case 4:
                if (player.getArgent()-8>-1){
                    talkb( "Excellent , une pinte pour monsieur !" );
                    player.add_argent(-8, player);
                    player.soin(8, player);
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
        talkb("Vous êtes nouveau ? Dans ce cas, la première tournée est gratuite pour vous !");
        int q = Test.test();
	switch (q) 
	{
   
	    case 1:
                System.out.println();   
                talkb(" Monsieur veut donc un jus de pomme ! Qui suis-je pour juger.." );
                break;
  
	    case 2:
               System.out.println();
                talkb( "Très bon choix ! je vous mets la dose " );
                break;
  
	    case 3:
                talkb( "Vous plaisentez ?" );
                talkb( "Que voulez-vous sérieusement ?");
                break;
            
            case 4:
                System.out.println();

                talkb( "Excellent , une pinte pour monsieur !" );
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
    
    /*  Méthode pour question tuto */
    public void questionboissontuto(Player player){
        display_menuboisson();
        choixboissontuto(player);
        
    }
    
    /*  */
    public void display_menuboissonbonustuto(Player player) 
    {   
        try {  Thread.sleep(1000); } catch (InterruptedException ie) {}
        System.out.println();
        questionboissontuto(player);
    }
    
}
