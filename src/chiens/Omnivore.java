package chiens;

import iut.World;
import iut.Objet;

/**
 * Classe permettant de g�rer les Omnivores tout ce qu'ils font ou peuvent faire.
 * 
 * H�rite de Animal.
 */
public abstract class Omnivore extends Animal {

    /**
     * Constructeur de la classe Omnivore
     * @param g
     * @param nom
     * @param x
     * @param y
     */
    public Omnivore(String nom, int x, int y) {

        super(nom, x, y);
        listeAlimentation.add(Type.VegetalMarin);
        listeAlimentation.add(Type.Planorbe);

    }

    /**
     * Deplace l'objet
     * @param dt le temps ecoule en millisecondes depuis le precedent deplacement
     */
    @Override
    public void move(long dt) {
        this.move(vitesseX, vitesseY);
    }

    /**
     * Action : effet d'une collision entre l'objet et le parametre
     * @param o
     */
    @Override
    public void effect(Objet o) {
    }

	
}