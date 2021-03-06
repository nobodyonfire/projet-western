package projet.java.western;

import static projet.java.western.ProjetJavaWestern.clearScreen;
import static projet.java.western.ProjetJavaWestern.sleep;

/* Classe Player qui est un personnage */
public class Player extends Personnages{
    
    /* Initialisation des variables */
    int etat;
    int HP;
    public Niveau niveau;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    private static final Arme Couteau = new Arme("Couteau", 10, 9, 100, 0);
    public Brigand brigand;
    boolean quetedone=false;
    
  /* Constructeur */  
  public Player(String Name, Location Location, Arme Gun , String Job , Niveau niveau, int Argent, int etat, int HP,Brigand brigand,boolean quetedone) {
        super(Name,Location,Gun,Job,Argent);
        this.niveau = niveau;
        this.etat = etat;
        this.HP = HP;
        this.brigand =null;
        this.quetedone=quetedone;
        this.Gun=Couteau;

        
    }
    
  /* Méthode pour faire parler le joueur */
   @Override 
   public void introduceYourself(){
        talk("Il est temps de rendre l'honneur et la prospérité à ce village !"); 
   }
   
   /* Méthode qui permet de personaliser le message du SETGUN */
   @Override
   public void SetGun(Arme Gun){
        this.Gun = Gun;
        System.out.println("");
        System.out.println(ANSI_BLUE + "Vous avez obtenu un " + Gun.getname() + "."+ANSI_RESET);
        System.out.println("");
        sleep(1000);
    } 
   
   /* Méthode qui permet de personaliser le SET ARGENT */
   @Override
   public void SetArgent(int Argent){
        this.Argent = Argent;
    } 
   
  
   /* Mutators */
   public void SetHP(int HP){
       this.HP = HP;
       
   }
   
    
   public void setHP(int HP){
       this.HP = HP;
   }
   
   public void setBrigand(Brigand brigand){
       this.brigand=brigand;
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
   
    public void setquetedone(boolean quetedone){
        this.quetedone=quetedone;
    }
    
    
    /* Accessors*/
    public boolean getquetedone(){
        return this.quetedone;
    }
   
    public Brigand getBrigand(){
        return this.brigand;
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
    
    /* Méthode permettant d'enregistrer les informations du joueur dans un fichier grace à la classe save */
    public void playersave(Banque banque){
        String string="";
        string = string +getName().replaceAll("\\s", "#")+" "+"SantaMaria" +" "+ 0 +" "+this.Gun.getname().replaceAll("\\s", "#")+" "+ this.Gun.getpuissanceMax ()+" "+ this.Gun.getpuissanceMin ()+ " "+this.Gun.getaccuracy()+" " +this.Gun.getprix ()+ " "+this.getJob()+" "+this.niveau.GetLevel()+" "+ this.niveau.GetXp_actuel()+" "+this.niveau.GetXp_necessaire()+" "+this.getArgent()+" "+this.getetat()+" "+this.getHP()+" "+this.getquetedone()+" "+banque.GetStocke()+" "+ 45 ;
        save.Save(string);
    }

    /* Méthode permettant de faire convertir les informations du fichier dans les variables voulues */
    public void playerload(){
        
        Saloon le7iemeciel = new Saloon("Le 7 ième ciel",10,"NULL");
        Niveau rest = new Niveau(0,0,500);
        Player player = new Player("Billi", le7iemeciel ,Couteau, "NULL", rest, 0, 0, 100,null,false); 
        String string = save.lire();
        final String SEPARATEUR = " ";
        String mots[] = string.split(SEPARATEUR);
        setName(mots[0].replaceAll("#", "\\s"));
           
        Eglise SantaMaria = new Eglise("SantaMaria",10);
        this.setLocation(SantaMaria);
        //setLocation();
        this.Gun.Setname(mots[3].replaceAll("#", " "));
        this.Gun.SetpuissanceMax(Integer.parseInt((mots[4])));
        this.Gun.SetpuissanceMax(Integer.parseInt((mots[5])));
        this.Gun.Setaccuracy(Integer.parseInt((mots[6])));
        this.Gun.Setprix(Integer.parseInt((mots[7])));
        setJob(mots[8]);

        
        this.niveau.SetLevel(Integer.parseInt(mots[9]));

        this.niveau.SetXp_actuel(Double.parseDouble((mots[10])));
        this.niveau.SetXp_necessaire(Double.parseDouble((mots[11])));
        
        SetArgent(Integer.parseInt((mots[12])));
        setEtat(Integer.parseInt((mots[13])));

        
        SetHP(Integer.parseInt(mots[14]));
        setquetedone(Boolean.parseBoolean(mots[15]));
        
        
        clearScreen(50);
        map.printbienvenu(player,(mots[0].replaceAll("#", " ")),0);
        sleep(3000);
        clearScreen(50);
        }
    
   /* méthode permettant de soigner le joueur, et de ne pas dépasser les HP max */
   public void soin(int amount, Player player){
       
       if (player.HP + amount >= 100+15*player.niveau.GetLevel()){
           player.SetHP(100+15*player.niveau.GetLevel());}
       else{
           player.SetHP(player.HP + amount);
        }    
       if (amount>=0){
           System.out.println("");
           System.out.println(ANSI_BLUE + "Vous avez été soigné. Vous avez actuellement " + HP + " points de vie."+ANSI_RESET);
           System.out.println("");
       }
       else {
            System.out.println("");
            System.out.println(ANSI_BLUE + "Vous avez perdu des PV. Vous avez actuellement " + HP + " points de vie."+ANSI_RESET);
            System.out.println("");
       }
       
   }
   
   /* Méthode permettant d'ajuster l'argent d'un joueur en fonction de sa disponibilité */
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