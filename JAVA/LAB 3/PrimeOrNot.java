/**
 * The PrimeOrNot class determines whether a given number is prime or not.
 */
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        int a;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        a=sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<a;i++){
            if (a%i==0) {
                   isprime=false;             
            }
        }
     if (isprime==true) {
        System.out.println("Number is prime");
     }   
     else{
        System.out.println("Number is not Prime");
     }
    }
}
