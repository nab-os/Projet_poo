package chiens;

import iut.ObjetTouchable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe permettant de g�rer les objetBase, c'est � dire tout les objets.
 */
public abstract class ObjetBase extends ObjetTouchable {
	
    protected Lac l;
    protected ArrayList<Type> listeAlimentation = new ArrayList<>();

    public ObjetBase(String nom, int x, int y) {
        super(Lac.getInstance(),nom, x, y);
    }

    /**
     * Fonction qui verifie si l'objet de base est ou non un omnivore, en renvoyant true ou false.
     * @return 
     */
    public ArrayList<Type> getAlimentation(){
        return listeAlimentation;
    }

    public Type getType() {
        return null;
    }
        
    public void estMange(){

        try {
            Lac.getInstance().remove(this);
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(ObjetBase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void estMort(){
        System.out.println("est Mort");
        Lac.getInstance().add(new Cadavre(this.getLeft(), this.getTop()));
        
        try {
            Lac.getInstance().remove(this);
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(ObjetBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * Renvoie la distance entre deux entit�s
     * @param o
     * @return 
     */
    public int distance(ObjetBase o) {
        return 0;
    }

    /**
     * Renvoie l'objet de type t le pres
     * @param t
     * @return      
     */
    public ObjetBase plusPres(Type t) {
        return null;
    }
}