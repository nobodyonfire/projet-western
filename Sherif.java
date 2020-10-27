
package projet.java.western;
import java.util.Scanner; 



public class Sherif extends CowBoy{
    
    protected int NombreDeCapture;
    
    public Sherif(String Name, String Location, String Gun , String Job , int Niveau, int Argent,int TruthLevel,String FavoritePlate,int NombreDeCapture) {
        super(Name,Location,Gun,Job,Niveau,Argent,TruthLevel,FavoritePlate);
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
        talk(" Je suis également le Sherif de cette ville et j'ai déjà "+this.NombreDeCapture+ " captures à mon actif !"); 
    }
    
    
    public String StoryTelling(){
        String say = " Toi le nouveau! Tu viens jouer les chasseurs de prime à Widowchapel. \n"
                + "           Quelle erreur minable. On appelle pas cette ville Widowchapel pour rien. \n"
        + "           C'est ici que viennent se recueillir les femmes qui ont perdu leurs maris \n"
        + "           Mais toi tu m'as l'air d'être un chasseur de prime déterminé.";
        super.talk(say);
        Scanner scanner = new Scanner(System.in);
        System.out.println( "           Quel est ton nom cowboy ?" );
        String Player_name = scanner.nextLine();
        System.out.println("Ainsi soit-il " + Player_name + ". Bienvenue en enfer.");
        return Player_name;
    }
}
