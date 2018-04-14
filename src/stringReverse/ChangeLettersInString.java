package stringReverse;

import java.util.Scanner;

public class ChangeLettersInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter text to reverse: ");
        String original = sc.nextLine();

        while (original.isEmpty() || original == null) {
            System.out.println("Text cannot be null, please enter text again: ");
            original = sc.nextLine();

        }
        sc.close();

        ChangeLettersInString changeLettersInString = new ChangeLettersInString();
        String reversed = changeLettersInString.reverseString(original);
        System.out.println(reversed);

    }

    public static String reverseString(String reversed) {

        String reverse = "";

        for (int i = reversed.length() - 1; i >= 0; i--) {
            reverse = reverse + reversed.charAt(i);

        }
        return reverse;
    }
}
