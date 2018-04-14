package methods;



public class MethodsDemo {


    public static void main(String[] args) {
        String grade;
        String studentName;
        studentName="Tomek";
        grade = findGrades(90);
        displayGrade(studentName, grade);
        studentName="Benek";
        grade = findGrades(70);
        displayGrade(studentName, grade);


    }

    public static String findGrades(int score) {
        String grade = null;
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 75 && score <= 90) {
            grade = "B";

        } else if (score >= 60 && score <= 75) {
            grade = "C";

        } else if (score >= 0 && score <= 60) {
            grade = "D";
        } else {
            System.out.println("no score");
        }
        return grade;
    }

    public static void displayGrade(String studentName, String grade) {
        System.out.println("*****************************************");
        System.out.println("Imie studenta: " + studentName + " ocena na świadectwie: " + grade + ".");
        System.out.println("*****************************************");

    }
}
