package chiens;

import iut.Objet;


/**
 * Classe permettant de créer des Ecrevisses et de gérer tout ce qu'ils font ou peuvent faire.
 * 
 * Hérite de Detritivore.
 */
public class Ecrevisse extends Detritivore {

    /**
     * Constructeur de la classe Ecrevisse.
     * @param x
     * @param y
     */
    public Ecrevisse(int x, int y) {
        super("Sprites/ecrevisse", x, y);
    }

    /**
     * Permet d'accéder aux variables contenu dans l'énumération Type.
     * @return 
     */
    @Override
    public Type getType() {
            return Type.Ecrevisse;
    }

    @Override
    public void effect(Objet objet) {
    }
    
    /**
    * Créé un nouvel animal + fait consommer de l'énergie vitale à la mère
    */
    @Override
    protected void mettreBas() {  
    
        l.add(new Ecrevisse(this.getLeft(), this.getTop()));
        this.vitalite -= this.vitaliteMax*0.1;
        
    }
    
}