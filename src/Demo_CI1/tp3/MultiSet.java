package Demo_CI1.tp3;
/**
 * @overview Les MultiSets sont des ensembles non bornés d'entiers qui
 * peuvent contenir des doublons.
 * Ils sont mutables.
 * De manière générale, un MultiSet est défini comme {x1,...,xn}
 * où x1,...,xn sont des entiers.
 * @invariant size = #this
 */
public interface MultiSet {

    // Type mutable -> toutes les méthodes qui modifient this
    // modifient directement this, donc pas de type de retour

    /**
     * @modifies this
     * @effects this_post = this U {i}
     */
    public void insert(int i);

    /**
     * @modifies this
     * @effects this_post = this \ {i} (toutes les occurences)
     */
    public void remove(int i);

    /**
     * @return true si i appartient à this, sinon false
     */
    public boolean isIn(int i);

    /**
     * @return la cardinalité de this
     */
    public int size();

    /**
     * @requires i appartient à this
     * @return retourne le nombre d'occurence de i
     */
    public int numberOfOccurence(int i);

    /**
     * @requires this est non vide
     * @return retourne un élément de this
     */
    public int choose();

}
