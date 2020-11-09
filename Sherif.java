package projet.java.western;
import java.util.Scanner; 



public class Sherif extends CowBoy{
    
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    protected int NombreDeCapture;
    
    public Sherif(String Name, Location Location, Arme Gun , String Job, int Argent,int TruthLevel,String FavoritePlate,int NombreDeCapture) {
        super(Name,Location,Gun,Job,Argent,TruthLevel,FavoritePlate);
        this.NombreDeCapture=NombreDeCapture;
        
    }
    
    
    public int getNombreDeCapture(){
        return this.NombreDeCapture;
    }
    
  
    
    
    public void setNombreDeCapture(int NombreDeCapture){
        this.NombreDeCapture = NombreDeCapture;
    }
    
    
    
    @Override 
    public void introduceYourself(){
        super.introduceYourself();
        talkb(" Je suis également le Sherif de cette ville et j'ai déjà "+this.NombreDeCapture+ " captures à mon actif !"); 
    }
    
    
    public String StoryTelling(){
        String say = " Toi le nouveau! Tu viens jouer les chasseurs de prime à Widowchapel. \n"+ ANSI_GREEN
                + "           Quelle erreur minable. On n'appelle pas cette ville Widowchapel pour rien. \n"+ANSI_GREEN
        + "           C'est ici que viennent se recueillir les femmes qui ont perdu leurs maris \n"+ANSI_GREEN
        + "           Mais toi tu m'as l'air d'être un chasseur de prime déterminé.";
        super.talkb(ANSI_GREEN+ say+ANSI_RESET);
        Scanner scanner = new Scanner(System.in);
        talkb( "Quel est ton nom cowboy ?" );
        System.out.println();
        String Player_name = scanner.nextLine();
        System.out.println();
        talkb("Ainsi soit-il " + Player_name + ". Bienvenue en enfer.");
        return Player_name;
    }
}
