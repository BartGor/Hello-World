import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Hello World!");

        System.out.print("Wprowadz liczbę: ");
        int luckyNum = userInput.nextInt();
        System.out.println("Twoja liczba to: "+luckyNum);

    }
}
