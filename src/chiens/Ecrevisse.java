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
        
        this.sexe = ((int)(Math.random()*2)) > 0.5 ? Sexe.Male : Sexe.Femelle; //condition ternaire : (condition ? retourne ceci si vrai : cela si faux)
        System.out.println("Nouvelle Ecrevisse" + this.sexe);
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
            
        /*if((this.listeReproduction.contains(((ObjetBase)objet).getType())) && (this.sexe.equals(Sexe.Femelle)) && (((Animal)objet).sexe.equals(Sexe.Male))){
            
            if(this.phaseReprod()){
            
                if(!this.gestation)
                    this.seReproduit((ObjetBase) objet);
            
            }

        }
        
        if(this.listeAlimentation.contains(((ObjetBase)objet).getType())){
            
            if(this.isHungry()){
                
                this.seNourrit((ObjetBase)objet);
                
            }
            
        }*/    
        
        
    }
    
    /**
    * Créé un nouvel animal + fait consommer de l'énergie vitale à la mère
    */
    @Override
    protected void mettreBas() {  
    
        /*l.add(new Ecrevisse(this.getLeft(), this.getTop()));
        this.vitalite -= this.vitaliteMax*0.1;*/
        
    }
    
}