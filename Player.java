
package projet.java.western;




public class Player extends Personnages{
    
    int etat;
    int HP;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    
    
    public Player(String Name, String Location, Arme Gun , String Job , int Niveau, int Argent, int etat, int HP) {
        super(Name,Location,Gun,Job,Niveau,Argent);
        this.etat = etat;
        this.HP = HP;

        
    }
    
   @Override 
   public void introduceYourself(){
        talk("Il est temps de rendre l'honneur et la prospérité à ce village !"); 
   }
   
   @Override
   public void SetGun(Arme Gun){
        this.Gun = Gun;
        System.out.println("");
        System.out.println(ANSI_BLUE + "Vous avez obtenu un " + Gun.getname() + "."+ANSI_RESET);
        System.out.println("");
    } 
   
   @Override
   public void SetArgent(int Argent){
        this.Argent = Argent;
        System.out.println("");
        System.out.println(ANSI_BLUE+"Vous avez obtenu " + Argent  +" $."+ANSI_RESET);
        System.out.println("");
    } 
   
   public void SetHP(int HP){
       this.HP = HP;
       System.out.println("");
       System.out.println(ANSI_BLUE + "Vous avez été soigné. Vous avez actuellement " + HP + " points de vie."+ANSI_RESET);
       System.out.println("");
   }
   
     
    public int getHP(){
        return this.HP;
    }
    
    public Arme getGun(){
        return this.Gun;
    }
    
  
    
 
   
   public void soin(int amount, Player player){
       if (player.HP + amount >= 100){
           player.SetHP(100);
       }
       else{
           player.SetHP(player.HP + amount);
       }      
   }
   
   public void add_argent(int amount, Player player){
       player.SetArgent(amount + player.Argent);
   }
   
}