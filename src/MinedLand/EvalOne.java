import MinedLand.ExplosiveMineException;
import MinedLand.IncendiaryMineException;
import MinedLand.UndetectedMineException;

/**
 * @overview EvalOne représente l'implémentation d'une simulation de traversée d'un terrain miné
 * EvalOne est immutable
 * EvalOne
 * Compteur2 représente un compteur de valeur initiale -5.
 * Compteur2 peut être incrémenté par pas de 2
 * et décrémenter par pas de 1.
 * Compteur2 est mutable.
 */

public class EvalOne {


    /**
     * @requires (PRE) condition
     * @modifies les éléments modifiés (POST)
     * @effects quelles sont les modifications sur ces éléments (POST)
     * @return indique ce qui sera retourné (POST)
     * @throws UndetectedMineException jetée et cas de figure
     * /!\  SI PRE ALORS POST  /!\
     */

    public static void main(String[] args) {
        int compteur = 0;
        boolean traverseIsNotOk;

        do {
            compteur++;
            traverseIsNotOk = traverser();
        } while (traverseIsNotOk);
        System.out.println(compteur + " tentative(s) a(ont) été nécessaire(s) pour traverser !");
    }


    /**
     * @return retourne Vrai si une mine n'a pas été détectée
     * @throws UndetectedMineException jetée et cas de figure
     */
    public static boolean traverser() {
        System.out.println("Tentative de traversée");
        for (int i = 0; i < 10; i++) {
            try {
                deminer();
            }
            catch (UndetectedMineException e){
                System.out.println("BOUM !!!!");
                return true ;
            }
        }
        return false;
    }

    public static void deminer(){
        try {
            creuser();
        }
        catch (ExplosiveMineException e){
            System.out.println("Mine explosive neutralisée");
        }
        catch (IncendiaryMineException e){
            System.out.println("Mine incendiaire neutralisée");
        }
    }

    /**
     * @throws ExplosiveMineException jetée lorsque value est supérieur à 0 et inférieur à 3
     * @throws IncendiaryMineException jetée lorsque value est supérieur ou égale à 3 et inférieur à 7
     * @throws UndetectedMineException jetée lorsque value est supérieur ou égale à 7
     */
    public static void creuser() throws ExplosiveMineException, IncendiaryMineException {
        int value = (int) (Math.random() * 10);        //génère un nombre aléatoire entre 1 et 10
        if (value > 0 & value < 3) {
            throw new ExplosiveMineException();
        }
        else if (value >= 3 & value < 7) {
            throw new IncendiaryMineException();
        }
        else {
            throw new UndetectedMineException();
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
 * - 1ère différence :
 * - 2ème différence :
 *
 * (Pensez différence entre exceptions vérifiées et non vérifiées d'un point
 * de vue documentation/spécification et pour le compilateur)
 */

/*
La methode main() est l'entree du programme. Elle appelle autant de fois que necessaire la methode tra-
verser() et indique le nombre de tentatives qui ont ete necessaires pour traverser le terrain mine.

La methode traverser() indique dans le terminal qu'une tentative de traversee a lieu. Ensuite, elle appelle
la methode deminer() 10 fois. Lors de ces 10 appels a deminer(), une Execption de type Undetected-
MineException peut survenir, l'information sera indiquee dans le terminal (Ex. : "Boum!") et la methode
traverser() retournera alors False ; sinon elle retournera True a la n des 10 appels. Attention a ne pas
laisser transparaitre ces details d'implementation dans votre specication !

La methode deminer() est une methode qui appelle la methode creuser(), elle neutralise (capture) toute
exception ExplosiveMineException ou IncendiaryMineException qui surviendrait. La methode indique
dans le terminal quelle mine (Exception) a ete neutralisee (attrapee) ou si aucune mine n'a ete trouvee.

La methode creuser() est une methode qui lance aleatoirement une exception veriee ExplosiveMineEx-
ception ou IncendiaryMineException ; ou encore une exception non veriee UndetectedMineException.
Le code present dans classe assigne une valeur aleatoire entre 1 et 10 a la variable value, vous utiliserez cette
derniere pour le lancement de vos exceptions (Ex. : si entre 1 et 3 alors, si entre 4 et 7 alors...).

 */
