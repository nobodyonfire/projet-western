/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java.western;

import java.util.Comparator;

/**
 *
 * @author ASUS
 */
public class ArmecomparatorAcc implements Comparator {
    
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
