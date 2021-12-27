import java.util.Scanner;
public class GradeConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberGrade = input.nextInt();

        if (numberGrade>=85) {
            System.out.println("A");
        }
        else if (numberGrade>=70) {
            System.out.println("B");
        }
        else if (numberGrade>=60) {
            System.out.println("C");
        }
        else if (numberGrade>=50) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}