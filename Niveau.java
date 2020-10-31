/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java.western;

/**
 *
 * @author Eloi Texier
 */
public class Niveau {
    
    int level;
    double xp_actuel;
    double xp_necessaire;
    
    public Niveau(int level, int xp_actuel, int xp_necessaire){
        this.level = level;
        this.xp_actuel = xp_actuel;
        this.xp_necessaire = xp_necessaire;
    }
    
    public void SetLevel(int level){
        this.level = level;
    }
    public int GetLevel(){
        return this.level;
    }
    public void SetXp_actuel(double xp){
        this.xp_actuel = xp;
    }
    public double GetXp_actuel(){
        return this.xp_actuel;
    }
    public void SetXp_necessaire(double xp){
        this.xp_necessaire = xp;
    }
    public double GetXp_necessaire(){
        return this.xp_necessaire;
    }
    
    public void add_xp(Player player, double xp){
        System.out.println("Vous avez gagné " + xp + " points d'expérience.");
        SetXp_actuel(xp + GetXp_actuel());
        levelup(player);
    }
    
    private void levelup(Player player){
        if (player.niveau.xp_actuel >= player.niveau.xp_necessaire){
            if (player.niveau.GetLevel() != 10){
                SetLevel(GetLevel()+1);
                System.out.println("Vous gagnez un niveau! Vous êtes mainteant niveau " + GetLevel() + ".");
                System.out.println("Vous obtenez 15 points de vie suppélementaire.");
                SetXp_actuel(GetXp_actuel() - GetXp_necessaire());
                CurveXp_necessaire(player);
                player.soin(1000, player);
            }
        }
    }
    
    private void CurveXp_necessaire(Player player){
        SetXp_necessaire(500 + 50*Math.pow(player.niveau.GetLevel(),2));        
    }
}
