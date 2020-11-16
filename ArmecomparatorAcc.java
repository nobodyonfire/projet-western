package projet.java.western;
import java.util.Comparator;

/* Classe de comparaison */
public class ArmecomparatorAcc implements Comparator {
    
    /* Méthode permetant de trier par accuracy */
    public int compare(Object o1,Object o2) {
        Arme arme1=(Arme) o1;
        Arme arme2=(Arme) o2;
        
        if(arme1.getaccuracy()> arme2.getaccuracy()){
            return -11;
        }
        
        if(arme1.getaccuracy()< arme2.getaccuracy()){
            return 1;
        }
        return 0;
        
    }
   
}
