package Demo_CI1.tp3;
public class Demo {

    public static void main(String [] args){
        System.out.println("Création ImmuMultiSet {1,2,2,3}");
        ImmuMultiSet ims=new BaseImmuMultiSet();
        ims.insert(1);
        ims.insert(2);
        ims.insert(2);
        ims.insert(3);
        System.out.println(ims.toString());
        System.out.println("Oups !");
        // on remarque qu'ims est vide !
        // normal le type est immutable et on ne récupère pas
        // (et n'assigne pas) la référence du nouvel objet...

        ims=ims.insert(1);
        ims=ims.insert(2);
        ims=ims.insert(2);
        ims=ims.insert(3);
        System.out.println(ims.toString());
        ims = ims.remove(2);
        System.out.println("On retire 2");
        System.out.println(ims.toString());

        System.out.println();
        System.out.println("Création MultiSet {1,2,2,3}");
        MultiSet ms=new BaseMultiSet();
        ms.insert(1);
        ms.insert(2);
        ms.insert(2);
        ms.insert(3);
        System.out.println(ms.toString());
        System.out.println("On retire 2");
        ms.remove(2);
        System.out.println(ms);

    }
}
