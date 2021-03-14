package Demo_CI1.tp3;

import java.util.ArrayList;

public class BaseMultiSet implements MultiSet{

    private ArrayList<Integer> set = new ArrayList<>();

    public void insert(int i) {
        set.add(i);
    }

    public void remove(int i) {
        set.removeIf(s->s==i);
    }

    public boolean isIn(int i) {
        return set.contains(i);
    }

    public int size() {
        return set.size();
    }

    public int numberOfOccurence(int i) {
        int occurences=0;
        for(int s:set){
            if(s==i)occurences++;
        }
        return occurences;
    }

    public int choose() {
        return set.get(0);
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
