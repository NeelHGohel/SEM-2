import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        double r,area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Circle ");
        r =sc.nextDouble();
        area= 3.14 * r * r ;
        System.out.printf("Area of circle is ");
        System.out.println(area);
    }
}
