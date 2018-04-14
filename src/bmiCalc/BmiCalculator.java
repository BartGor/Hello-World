package bmiCalc;

import java.util.Scanner;

import static java.lang.Math.*;

public class BmiCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj wsrost: ");
        double height = sc.nextDouble() / 100;   // wztrost w cm
        System.out.print("Podaj wagę: ");
        double weight = sc.nextDouble();     //waga w kg

        double bmi = weight / pow(height, 2); //BMI = waga/wzrost^2

        System.out.println("Twój współczynnik BMI wynosi: " + String.format("%.2f", bmi));

        if (bmi < 18.5) {
            System.out.println("Twój stan to: Niedowaga.");
        } else if (bmi >= 18.5 && bmi <= 24.99) {
            System.out.println("Twój stan to: Norma.");
        } else if (bmi >= 25 && bmi <= 29.99) {
            System.out.println("Twój stan to: Nadwaga.");
        } else if (bmi >= 30 && bmi <= 34.99) {
            System.out.println("Twój stan to: Otyłość I stopnia.");
        } else if (bmi >= 35 && bmi <= 39.99) {
            System.out.println("Twój stan to: Otyłość II stopnia.");
        } else if (bmi >= 40) {
            System.out.println("Twój stan to: Otyłość III stopnia.");
        } else {
            System.out.println("Błąd w obliczeniach");
        }

    }
}
