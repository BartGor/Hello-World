package foriLoops;

public class foriDemo {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
        System.out.println("*********************");
        int[] tab = {10, 20, 30};

        for (int i = 0; i < tab.length; i++) {
            System.out.println("wartości tablicy tab: " + tab[i] + "na indexie: " + i);
        }
        System.out.println("******************");
        for (int tabs:
             tab) {
            System.out.println(tabs);
        }
        System.out.println("***************");
        String[] cars= {"audi", "bmw", "vw"} ;

        for(String car:cars)
            System.out.print(car+", ");
    }

}
