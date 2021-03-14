package Demo_CI1.tp3;
/**
 * @overview Compteur0 représente un compteur de valeur initiale 0
 * et toujours supérieur ou égale à 0.
 * Compteur0 peut être incrémenté ou décrémenté par pas de 1.
 * Compteur0 est mutable.
 * @specfield compteur : int
 * @invariant : compteur est toujours positif ou égale à 0
 */

public class Compteur0 {

    int i=0;


    /**
     * @modifies this.compteur
     * @effects this_post.compteur = this.compteur + 1
     */
    public void incr(){
        i++;
    }

    /**
     * @modifies this
     * @effects this_post = this - 1 si compteur > 0, sinon ne fait rien
     */
    public void decr() {
        if (i>0)i--;
    }


}
