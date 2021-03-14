package Demo_CI1.tp3;
/**
 * @overview Compteur1 représente un compteur de valeur initiale 2
 * et toujours supérieur à 0.
 * Compteur1 peut être incrémenté en doublant la valeur courante
 * et décrémenter par pas de 1.
 * @specfield compteur : int
 * Compteur1 est mutable.
 */

public class Compteur1 {
    int i=2;

    /**
     * @modifies this.compteur
     * @effects this_post.compteur = this.compteur * 2
     */
    public void incr(){
        i = i * 2;
    }

    /**
     * @modifies this.compteur
     * @effects si compteur > 0, this_post.compteur = this.compteur - 1; sinon, ne fait rien
     */
    public void decr() {
        if(i>0)i--;

    }
}
