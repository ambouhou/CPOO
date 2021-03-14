package Demo_CI1.tp3;

import java.util.ArrayList;

public class BaseImmuMultiSet implements ImmuMultiSet {

    private ArrayList<Integer> set = new ArrayList<>();

    public ImmuMultiSet insert(int i) {
        BaseImmuMultiSet newSet = this.clone();
        newSet.set.add(i);
        // Comme nous sommes dans le contexte BaseImmuMultiSet
        // soit +- dans la classe, on peut accéder aux variables membres
        // qui sont "Private"
        return newSet;
    }

    public ImmuMultiSet remove(int i) {
        BaseImmuMultiSet newSet = this.clone();
        while(newSet.isIn(i)){
            newSet.set.remove((Integer)i);
            // remove(i) -> remove(int i) retire à l'indice i
            // remove((Integer) i) -> cast pour forcer  remove(Object o) soit retire l'objet
            // remove d'un arrayList retire la première occurrence,
            // donc je boucle tant que nécessaire
            // System.out.println("Retrait de "+ i +": "+newSet );
        }
        // On peut aussi remplacer le while par
        // newSet.set.removeIf(s->s==i);

        //return this.clone().set.removeIf(s->s==1);
        //solution en une ligne : avantage concis, mais relecture...
        // CPOO : on s'attend à du code en plusieures lignes
        return newSet;
    }

    public boolean isIn(int i) {
        return set.contains(i);
    }

    public int size() {
        return set.size();
    }

    public int numberOfOccurence(int i) {
        int occurences=0;
        for(Integer s:set){
            if(s==i)occurences++;
        }
        return occurences;
    }

    public int choose() {
        return set.get(0);
    }

    public BaseImmuMultiSet clone() {
        BaseImmuMultiSet result = new BaseImmuMultiSet();
        for(Integer elt : this.set) {
            result.set.add(elt);
        }
        return result;
    }

    public String toString(){
        StringBuilder s=new StringBuilder("{");
        if(this.size()==0){
            return"{}";
        }
        for(Integer i: this.set){
            s.append(i+",");
        }
        s.replace(s.length()-1,s.length(),"}");
        return s.toString();
    }

}
