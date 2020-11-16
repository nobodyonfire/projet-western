package projet.java.western;
import java.util.Comparator;

/* Classe de comparaison */
public class ArmecomparatorMin implements Comparator {
    
    /* Méthode permetant de trier par Puissance Min*/
    public int compare(Object o1,Object o2) {
        Arme arme1=(Arme) o1;
        Arme arme2=(Arme) o2;
        
        if(arme1.getpuissanceMin()> arme2.getpuissanceMin()){
            return -1;
        }
        
        if(arme1.getpuissanceMin()< arme2.getpuissanceMin()){
            return 1;
        }
        return 0;
        
    }
   
}
