/**
 * The MaxOutOFThree class takes three numbers as input and determines the largest number among them.
 */
import java.util.Scanner;

public class MaxOutOFThree {
    public static void main(String[] args) {
        
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number ");
        a=sc.nextInt();
        System.out.print("Enter 2nd Numner ");
        b=sc.nextInt();
        System.out.print("Enter 3rd Number ");
        c=sc.nextInt();

        if (a>b) {
            if (a>c) {
                System.out.println("a is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }
        else if (b>a) {
            if (b>c) {
                System.out.println("b is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }
    }
}
