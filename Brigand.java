package projet.java.western;

import java.util.Random;

/* Classe Brigand qui est un personnage */
public class Brigand extends Personnages {
    
    /* Initialisation des variables */
    public int niveau;
    protected Boolean EstEnPrison;
    public int HP;
    
    /* Constructeur */
    public Brigand(String Name, Location Location, Arme Gun ,Boolean EstEnPrison, int HP, int niveau) {
        super(Name,Location,Gun);
        this.niveau = niveau;
        this.EstEnPrison=EstEnPrison;
        this.HP = HP+niveau*25;

    }
    
   /* Accessors */ 
   public int getNiveau(){
        return this.niveau;
   }
    
    public Boolean getEstEnPrison(){
        return this.EstEnPrison;
    }
    
    public int getHP(){
        return this.HP;
    }
    
    /* Mutators */
   public void setNiveau(int niveau){
        this.niveau = niveau;
    }
    
    public void setEstEnPrison(Boolean EstEnPrison){
        this.EstEnPrison=EstEnPrison;
    }
    
    /* Méthode permettant de créer une liste de brigand ( non utilisé ) */
    public Brigand[] BrigandFarWest(int i,Location location,Arme arme,Brigand brigand){
         Brigand[] listebrigand2= {new Brigand("Jacob dit le tueur", location, arme,false, 11, niveau),
                                 new Brigand("Jose dit l'ecorcheur", location, arme,false, 13, niveau)   
          };
           Brigand[] listebrigand={};
           
           for (int j = 0; j < listebrigand.length; ++j) {
               listebrigand[j]=listebrigand2[j];
           }
           listebrigand[listebrigand.length]=listebrigand2[listebrigand.length];
                  
          return listebrigand;
     }
     
    /* Méthode permetant de créer un brigand avec un nom aléatoire */
    public static Brigand createBrigand(int i ,Location location,Arme arme, Player player){
        
        String[] nom={
        "Levi dit le Dust Devil",
        "Fredrick dit le Eagle",
        "Charles dit le Croaker",
        "Abraham dit le Sunrise",
        "Frederick dit le the Viper",
        "Cornelius dit le Raven",
        "Joseph dit le Gun Slinger",
        "Walter dit le Merciless",
        "Julius dit le Lonesome",
        "Henry dit le Integrity ",
        "Warren dit le Honor",
        "Ed dit le Horse Whisperer",
        "Everett dit le Jeopardy",
        "Anton dit le Demon Eyes",
        "Ernest dit le the Immortal",
        "Jasper dit le Coward",
        "August dit le Steel",
        "Dewey dit le Lone Rider",
        "Cornelius dit le Bullettooth",
        "Morris dit le the Loner"};
        
        
        Brigand brigand = new Brigand(nom[getRandomNumberInRange(0,19)],location,arme, false, 35, getRandomNumberInRange(player.niveau.level-1, player.niveau.level+1));
        return brigand;
    }
    
    /* Méthode qui permet d'avoir un nom entre min et max */
      private static int getRandomNumberInRange(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("MAX>MIN");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
     
    /* Méthode permettant d'associé le brigand et la récompense en XP */
     public double Drop_xp_curve(Brigand brigand){
         return (500 + Math.pow(15*brigand.niveau, 2));
     }
    
    
    
}