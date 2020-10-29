
package projet.java.western;




public class Player extends Personnages{
    
    int etat;
    int HP;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    private static final Arme Couteau = new Arme("Couteau", 10, 9, 100, 0);
    
    
    public Player(String Name, Location Location, Arme Gun , String Job , int Niveau, int Argent, int etat, int HP) {
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
    } 
   
   public void SetHP(int HP){
       this.HP = HP;
       System.out.println("");
       System.out.println(ANSI_BLUE + "Vous avez été soigné. Vous avez actuellement " + HP + " points de vie."+ANSI_RESET);
       System.out.println("");
   }
   
   
   public void setName(String Name){
       if(Name.equals(null) || Name.equals("")){this.Name="Player";}else{this.Name=Name;}
   }
    public void setLocation(Location Location){
       this.Location = Location;
   }
    public void setJob(String Job){
       this.Job = Job;
   }
    public void setNiveau(int Niveau){
       this.Niveau = Niveau;
   }
    public void setEtat(int etat){
       this.etat = etat;
   }
   
   
    public String getName(){
     return this.Name;
    }
    
    public Location getLocation(){
     return this.Location;
    }
     public Arme getGun(){
     return this.Gun;
    }
    public String getJob(){
     return this.Job;
    }
    public int getNiveau(){
     return this.Niveau;
    }
    public int getArgent(){
     return this.Argent;
    }
    
    public int getetat(){
        return this.etat;
    }
    public int getHP(){
        return this.HP;
    }
    
    public void playersave(){
        String string="";
        string = string +getName()+" "+getLocation()+ " "+this.Gun.getname()+" "+ this.Gun.getpuissanceMax ()+" "+ this.Gun.getpuissanceMin ()+ " "+this.Gun.getaccuracy()+" " +this.Gun.getprix ()+ " "+getJob()+" "+getNiveau()+" "+getArgent()+" "+getetat()+" "+getHP() ;
        save.Save(string);
    }
    
    public void playerload(){
        Saloon le7iemeciel = new Saloon("Le 7 ième ciel",10,"NULL");
        Player player = new Player("Billi", le7iemeciel ,Couteau, "NULL", 1, 0, 0, 100); 
        String string = save.lire();
        final String SEPARATEUR = " ";
        String mots[] = string.split(SEPARATEUR);
        setName(mots[0]);
        //setLocation();
        this.Gun.Setname(mots[2]);
        this.Gun.SetpuissanceMax(Integer.parseInt((mots[3])));
        this.Gun.SetpuissanceMax(Integer.parseInt((mots[4])));
        this.Gun.Setaccuracy(Integer.parseInt((mots[5])));
        this.Gun.Setprix(Integer.parseInt((mots[6])));
        setJob(mots[7]);

        setNiveau(Integer.parseInt((mots[8])));
        SetArgent(Integer.parseInt((mots[9])));
        setEtat(Integer.parseInt((mots[10])));

        
        final String SEPARATEUR2 = "null";
        String mots2[] = mots[11].split(SEPARATEUR2);
        SetHP(100);

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
       if ( amount < 0){
           if (amount + player.Argent < 0 ){
               System.out.println("");
                System.out.println(ANSI_BLUE + "Vous n'avez pas assez d'argent." + ANSI_RESET);
                System.out.println("");
            }
           else{
               player.SetArgent(amount + player.Argent);
               System.out.println("");
               System.out.println(ANSI_BLUE + "Vous avez dépensé " + amount + " $." + ANSI_RESET);
               System.out.println("");
           }
       }      
       else{
           player.SetArgent(amount + player.Argent);  
           System.out.println("");
           System.out.println(ANSI_BLUE+"Vous avez obtenu " + amount + " $." + ANSI_RESET);
           System.out.println("");
       }
   
    }
}