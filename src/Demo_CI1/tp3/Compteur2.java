package Demo_CI1.tp3;
/**
 * @overview Compteur2 représente un compteur de valeur initiale -5.
 * Compteur2 peut être incrémenté par pas de 2
 * et décrémenter par pas de 1.
 * Compteur2 est mutable.
 */

public class Compteur2 {

    int i=-5;

    /**
     * @modifies this.compteur
     * @effects this_post.compteur = this.compteur + 2
     */
    public void incr(){
        i = i + 2;
    }

    /**
     * @modifies this.compteur
     * @effects this_post.compteur = this.compteur - 1
     */
    public void decr(int p){
        i = i - p;
    }
}
