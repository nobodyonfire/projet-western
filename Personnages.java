
package projet.java.western;

import java.lang.constant.ConstantDesc;





public class Personnages {
    
    protected String Name;
    protected String Location;
    protected String Gun;
    protected String Job;
    protected int Niveau;
    protected int Argent;
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    
    public Personnages(String Name, String Location, String Gun , String Job , int Niveau, int Argent) {
        this.Name = Name;
        this.Location=Location;
        this.Gun=Gun;
        this.Job=Job;
        this.Niveau=Niveau;
        this.Argent=Argent;
        
        introduceYourself();
    }
    
    
    
    public String getName (){
        return this.Name;
    }
    public String getLocation (){
        return this.Location;
    }
    public String getGun (){
        return this.Gun;
    }
    public String getJob (){
        return this.Job;
    }
    public int Argent (){
        return this.Argent;
    }
    public int Niveau (){
        return this.Niveau;
    }
    
 
    
    
    
    
   
    
    public void SetName(String Name){
        this.Name = Name;
    } 
    public void SetLocation(String Location){
        this.Location = Location;
    } 
    public void SetJob(String Job){
        this.Job = Job;
    } 
    public void SetGun(String Gun){
        this.Gun = Gun;
    } 
    public void SetNiveau(int Niveau){
        this.Niveau = Niveau;
    } 
    public void SetArgent(int Argent){
        this.Argent = Argent;
    } 
    
    
    
    public void talk(String say){
        System.out.println(Name + " : " + say);
    }
    public void talkstr(String say){
        System.out.println(Name + " : " + say);
    }
    public void talkb(String say){
        System.out.println(ANSI_GREEN +Name + " : " + say + ANSI_RESET);
    }
    
    
    public void introduceYourself (){
        talk( " Bonjour à tous, je suis " + Name);
    }
    
    
}
