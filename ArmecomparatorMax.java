package projet.java.western;
import java.util.Comparator;

/* Classe de comparaison */
public class ArmecomparatorMax implements Comparator {
    
    /* Méthode permetant de trier par Puissance Max*/
    public int compare(Object o1,Object o2) {
        Arme arme1=(Arme) o1;
        Arme arme2=(Arme) o2;
        
        if(arme1.getpuissanceMax()> arme2.getpuissanceMax()){
            return -1;
        }
        
        if(arme1.getpuissanceMax()< arme2.getpuissanceMax()){
            return 1;
        }
        return 0;
        
    }
   
}
