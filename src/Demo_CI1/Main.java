package Demo_CI1;

import Demo_CI1.exceptions.NotFoundException;

public class Main {


    public static void main(String[] args) {
        Compute c=new Compute();

        //c.compute();

        //c.computeBis();
        // Cette ligne de code plante le programme
        // Exception indiquée dans le terminale

        try {
            c.computeTer();
        } catch (NotFoundException e) {
            System.out.println(e.getClass());
            //System.out.println(e.getCause().toString());
        }

    }




}
