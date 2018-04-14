package forLoop;

import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę, następnie zostanią wyświetlona wszystkie liczby nieparzyste od 0 , a liczby te zostaną zsumowane");

        System.out.print("Podaj Liczbę: ");
        int x = in.nextInt();
        int suma = 0;

        for (int i = 1; i < x; i=i+2) {
            System.out.println(i);

            suma = suma + i;

        }
        System.out.println("Suma tych liczb to: " + suma);
    }
}
