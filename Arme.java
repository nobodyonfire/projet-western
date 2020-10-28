
package projet.java.western;

public class Arme implements Comparable{
    String name;
    int puissanceMax;
    int puissanceMin;
    int accuracy;
    int prix;
    
    
    
    public Arme(String name, int puissanceMax, int puissanceMin, int accuracy, int prix){
        this.name = name;
        this.puissanceMax = puissanceMax;
        this.puissanceMin = puissanceMin;
        this.accuracy = accuracy;
        this.prix = prix;
    }
    
    
    
    public String getname(){
        return this.name;
    }
    public int getpuissanceMax (){
        return this.puissanceMax;
    }
    public int getpuissanceMin (){
        return this.puissanceMin;
    }
    public int getaccuracy (){
        return this.accuracy;
    }
    public int getprix (){
        return this.prix;
    }
    
 

    
    public void Setname(String name){
        this.name = name;
    } 
    public void SetpuissanceMax(int puissanceMax){
        this.puissanceMax = puissanceMax;
    } 
    public void SetpuissanceMin(int puissanceMin){
        this.puissanceMin = puissanceMin;
    } 
    public void Setaccuracy(int accuracy){
        this.accuracy = accuracy;
    } 
    public void Setprix(int prix){
        this.prix = prix;
    } 
    
    
    @Override
    public int compareTo(Object other) {
        Arme user1 = (Arme) other;
        int result = Double.toString(this.getpuissanceMax()).compareTo(Double.toString(user1.getpuissanceMax()));
        return result;

    }
}
