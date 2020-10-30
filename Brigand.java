
package projet.java.western;

import java.util.Random;





public class Brigand extends Personnages {
    
    protected int NombreCapture;
    protected Boolean EstEnPrison;
    public int HP;
    
    public Brigand(String Name, Location Location, Arme Gun , String Job , int Niveau, int Argent,int NombreCapture,Boolean EstEnPrison, int HP) {
        super(Name,Location,Gun,Job,Niveau,Argent);
        this.NombreCapture=NombreCapture;
        this.EstEnPrison=EstEnPrison;
        this.HP = HP;

    }
    
    public int getNombreCapture(){
        return this.NombreCapture;
    }
    
    public Boolean getEstEnPrison(){
        return this.EstEnPrison;
    }
    
    
    
    
    
    public void setNombreCapture(int NombreCapture){
        this.NombreCapture = NombreCapture;
    }
    
    public void setEstEnPrison(Boolean EstEnPrison){
        this.EstEnPrison=EstEnPrison;
    }
    
     public int getHP(){
        return this.HP;
    }
    
     
     public Brigand[] BrigandFarWest(int i,Location location,Arme arme,Brigand brigand){
          Brigand[] listebrigand2= {new Brigand("Jacob dit le tueur", location, arme, "Voleur" , 1, 0,1,false, 11),
                                 new Brigand("Jose dit l'ecorcheur", location, arme, "Voleur" , 1, 0,1,false, 13)   
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
        
        
        Brigand brigand = new Brigand(nom[getRandomNumberInRange(0,19)],location,arme, "Voleur" , 1, 0,1,false, 11);
        return brigand;
    }
    
      private static int getRandomNumberInRange(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
     
     
     
  
    
    @Override 
    public void introduceYourself(){
        super.introduceYourself();
        talk(" J'ai déjà " + this.NombreCapture+ " captures à mon actif "); 
    }
    
    
    
}