import java.util.*;

public class Calculator {
    public static void main(String[] args){
        int a,b;
        char oprator;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter oprator");
        oprator =  sc.next().charAt(0);
        System.out.println("Enter 1st number");
        a = sc.nextInt();
        System.out.println("Enter 2nd number");
        b = sc.nextInt();

        switch (oprator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if (b==0) {
                    System.out.println("Invalid division");
                    break;
                }
                else{
                    System.out.println(a/b);
                    break;
                }
            case '%':
                if (b==0) {
                    System.out.println("Invalid modulo");
                    break;
                }
                else{
                    System.out.println(a%b);
                    break;
                }
            default:
                System.out.println("Invalid oprator");
                break;
        }


    }
    
}
