
package projet.java.western;

import java.util.Random;





public class Brigand extends Personnages {
    
    public int niveau;
    protected Boolean EstEnPrison;
    public int HP;
    
    public Brigand(String Name, Location Location, Arme Gun , String Job, int Argent, Boolean EstEnPrison, int HP, int niveau) {
        super(Name,Location,Gun,Job,Argent);
        this.niveau = niveau;
        this.EstEnPrison=EstEnPrison;
        this.HP = HP;

    }
    
    public int getNiveau(){
        return this.niveau;
    }
    
    public Boolean getEstEnPrison(){
        return this.EstEnPrison;
    }
    
    
    
    
    
    public void setNiveau(int niveau){
        this.niveau = niveau;
    }
    
    public void setEstEnPrison(Boolean EstEnPrison){
        this.EstEnPrison=EstEnPrison;
    }
    
     public int getHP(){
        return this.HP;
    }
    
     
     public Brigand[] BrigandFarWest(int i,Location location,Arme arme,Brigand brigand){
          Brigand[] listebrigand2= {new Brigand("Jacob dit le tueur", location, arme, "Voleur" , 1,false, 11, niveau),
                                 new Brigand("Jose dit l'ecorcheur", location, arme, "Voleur" , 1,false, 13, niveau)   
          };
           Brigand[] listebrigand={};
           
           for (int j = 0; j < listebrigand.length; ++j) {
               listebrigand[j]=listebrigand2[j];
           }
           listebrigand[listebrigand.length]=listebrigand2[listebrigand.length];
                  
          return listebrigand;
     }
     
    public static Brigand createBrigand(int i ,Location location,Arme arme){
        
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
        
        
        Brigand brigand = new Brigand(nom[getRandomNumberInRange(0,19)],location,arme, "Voleur" , 1, false, 11, 5);
        return brigand;
    }
    
      private static int getRandomNumberInRange(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
     
     public double Drop_xp_curve(Brigand brigand){
         return (500+Math.pow(15*brigand.niveau, 2));
     }
    
}