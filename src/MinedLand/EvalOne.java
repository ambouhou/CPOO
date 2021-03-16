package MinedLand;

import MinedLand.ExplosiveMineException;
import MinedLand.IncendiaryMineException;
import MinedLand.UndetectedMineException;

/**
 * @overview EvalOne représente l'implémentation d'une simulation de traversée d'un terrain miné
 * EvalOne affiche le nombre de tentative qui ont été nécessaire à la traversée du terrain
 * EvalOne est immutable
 */

public class EvalOne {

    public static void main(String[] args) {
        int compteur = 0;
        boolean traverseIsNotOk;                                                                     // Initialisation de la variable booleanne permetant de sortir de la boucle
        do {
            compteur++;                                                                              // incrémentation de compteur
            traverseIsNotOk = traverser();                                                           // Appel de la méthode traverser() et affectation du résultat à la variable booleanne "traverseIsNotOk"
        } while (traverseIsNotOk);                                                                   // Tant que la traversée n'est pas effectuée, on boucle
        System.out.println(compteur + " tentative(s) a(ont) été nécessaire(s) pour traverser !");    // Affiche le nombre de tentative ayant été nécessaire pour traverser
    }


    /**
     * @modifies System.out
     * @effects Affiche dans le terminée qu'une tentative de traversée est effectuée et si une explosion à lieu durant la traversée
     * @return retourne Vrai si une mine n'a pas été détectée et retourne faux si une mine n'a pas explosée
     */
    public static boolean traverser() {
        System.out.println("Tentative de traversée");                                                 // Affiche qu'une tentative est effectuée
        for (int i = 0; i < 10; i++) {
            try {
                deminer();                                                                            // Appel de la méthode deminer()
            }
            catch (UndetectedMineException e){                                                        // Capture l'execption UndetectedMineException si elle est lancée
                System.out.println("BOUM !!!!");                                                      // Affiche qu'une mine à explosée
                return true ;
            }
        }
        return false;
    }

    /**
     * @modifies System.out
     * @effects Affiche dans le terminal quel type de mine à été neutralisée
     */
    public static void deminer(){
        try {
            creuser();                                                                                 // Appel de la méthode creuser()
        }
        catch (ExplosiveMineException e){                                                              // Capture l'execption ExplosiveMineException si elle est lancée
            System.out.println("Mine explosive neutralisée");                                          // et affiche qu'une mine explosive à été neutralisée
        }
        catch (IncendiaryMineException e){                                                             // Capture l'execption IncendiaryMineException
            System.out.println("Mine incendiaire neutralisée");                                        // et affiche qu'une mine incendiaire à été neutralisée
        }
    }

    /**
     * @modifies value
     * @effects affecte à la variable "value" une valeur aléatoir comprise entre 0 et 10 et lance une exception en fonction du résultat
     * @throws ExplosiveMineException jetée lorsque value est supérieur à 0 et inférieur à 3
     * @throws IncendiaryMineException jetée lorsque value est supérieur ou égale à 3 et inférieur à 7
     * @throws UndetectedMineException jetée lorsque value est supérieur ou égale à 7 et inférieur à 10
     */
    public static void creuser() throws ExplosiveMineException, IncendiaryMineException, UndetectedMineException {
        int value = (int) (Math.random() * 10);                                                        // Génère un nombre aléatoire entre 1 et 10
        if (value > 0 & value < 3) {                                                                   // Si ce nombre est compris entre 0 et 3,
            throw new ExplosiveMineException();                                                        // une exepction vérifiée "ExplosiveMineException" est lancée
        }
        else if (value >= 3 & value < 7) {                                                             // Si ce nombre est compris entre (ou égale à) 3 et 7,
            throw new IncendiaryMineException();                                                       // une exepction vérifiée "IncendiaryMineException" est lancée
        }
        else {                                                                                         // Sinon, il est comprit entre (ou égale à) 7 et 10 et
            throw new UndetectedMineException();                                                       // une exepction non-vérifiée "UndetectedMineException" est lancée
        }
    }
}

/**
 * Selon la norme java, les exceptions non-vérifiées et les exceptions vérifiées peuvent
 * recevoir un traitement différent en termes de spécification et de gestion (de l'exception).
 * En supposant qu'un de vos collègues ait suivi la norme java pour la spécification et
 * la gestion de l'exception (non-vérifiée), quelles différences trouverait-on
 * dans son code et ses spécifications, comparé aux vôtres (qui respectent
 * les bonnes pratiques vues dans le cours sur ce point)?
 *
 * - 1ère différence : Suivant la norme java, les exception non-vérifiée ne se trouve pas dans la signature.
 * Ce qui est le cas dans ce code qui suit les bonnes pratiques vue au cours.
 *
 * - 2ème différence : Suivant la norme java, il n'est pas nécessaire de définir "@throws UndetectedMineException" dans les spécifications
 * puisqu'il s'agit d'une exception non-verifiée.
 * Ce qui est le cas dans ce code qui suit les bonnes pratiques vue au cours.
 *
 * (Pensez différence entre exceptions vérifiées et non vérifiées d'un point
 * de vue documentation/spécification et pour le compilateur)
 */
