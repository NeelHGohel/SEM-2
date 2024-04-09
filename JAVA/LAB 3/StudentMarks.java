/**
 * The StudentMarks class calculates the percentage of a student's marks and determines their division
 * based on the percentage.
 */
import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        double percentage, Maths, java, WD, English, Physics;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained by the Student ");
        System.out.print("Student marks of Java ");
        java=sc.nextDouble();
        System.out.print("Student marks of Maths ");
        Maths=sc.nextDouble();
        System.out.print("Student marks of Web Designing ");
        WD=sc.nextDouble();
        System.out.print("Student marks of English ");
        English=sc.nextDouble();
        System.out.print("Student marks of Physics ");
        Physics=sc.nextDouble();
        percentage=(Maths+java+WD+English+Physics)*100/500.0;
        System.out.printf("You got %.2f percent\n",percentage);

        if (percentage>100) {
            System.out.println("Invalid Input");
        }
         else if (percentage>=60 && percentage<=100) {
            System.out.println("You got First division");   
        }
        else if (percentage>50 && percentage<59) {
            System.out.println("You got second division");
        }
        else if (percentage>40 && percentage<49) {
            System.out.println("You got Third division");
        }
        else if (percentage<40) {
            System.out.println("You are fail Better luck next time");
        }
    }
}