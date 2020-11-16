package projet.java.western;
import java.util.Comparator;

/* Classe de comparaison */
public class Armecomparator implements Comparator {
    
    /* Méthode permetant de trier par prix */
    public int compare(Object o1,Object o2) {
        Arme arme1=(Arme) o1;
        Arme arme2=(Arme) o2;
        
        if(arme1.getprix()> arme2.getprix()){
            return -1;
        }
        
        if(arme1.getprix()< arme2.getprix()){
            return 1;
        }
        return 0;
        
    }
   
}
