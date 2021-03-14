package Demo_CI1.tp3;

import Demo_CI1.exceptions.*;

public class Num {

    /**
     * @requires (PRE) condition
     * @modifies les éléments modifiés (POST)
     * @effects quelles sont les modifications sur ces éléments (POST)
     * @return indique ce qui sera retourné (POST)
     * @throws exception jetée et cas de figure
     * /!\  SI PRE ALORS POST  /!\
     */

    /**
     * @requires n et d > 0
     * @return le plus grand denominateur commun de n et d
     */
    /*
    public static int pgcd(int n, int d){
        return 0;

    }*/

    /**
     * @return le pgcd de n et d, si n et d > 0, sinon
     * @throws NegativeArgumentException
     */
    public static int pgcd(int n, int d) throws NegativeArgumentException{
        if (d <= 0 || n <= 0) throw new NegativeArgumentException();
        else return  pgcd(d,n % d);
    }

    /**
     * @requires a est un tableau d'entiers non null et avec au moins un élément
     * @return la valeur de l'entier le plus grand du tableau a
     */
    public static int greatest(int[] a){
        int max= a[0];
        for(int i=0; i<a.length; i++){
            if (max < a[i]){
                max=a[i];
            }
        }
        return max;
    }

    /**
     * @requires a est un tableau d'entiers non null
     * @return un entier correspondant à la somme des éléments de a
     */
    public static int sum(int[] a){
        int total=0;
        for(int i=0; i<a.length; i++){
            total=total+a[i];
        }
        return total;
    }

    /**
     * @return true si p est pair, false sinon
     */
    public static boolean isEven(int p){
        if(p%2==0)return true;
        return false;
    }

    /**
     * @requires p est un naturel positif
     * @return true si p est un nombre premier, false sinon
     */
    public static boolean isPrime(int p){
        if(p<=1)return false;
        for(int i = 2; i*i<=p;i++){
            if (p%i == 0) return false;
            i++;
        }
        return true;
    }

    /**
     * @requires a et b sont des tableaux d'entiers, non null
     * @modifies a
     * @effects chaque élément de a est multiplié par la somme des éléments de b
     */
    public static void combine(int[] a, int[] b){
        int sum=sum(b);
        for(int i=0; i<a.length; i++){
            a[i]=sum * a[i];
        }
    }

    /**
     * @requires a est trié
     * @return i tel que tab[i] == x, sinon
     * @throws NotFoundException
     */
    public static int search(int[] a, int x) throws NotFoundException{
        for(int i=0; i<a.length; i++){
            if(a[i]==x) return i;
        }
        throw new NotFoundException(x + " n'est pas présent !");
    }

}
