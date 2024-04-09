//write a program to create circle class with area function to ƒind area of circle.
import java.util.Scanner;
class Circle{
    public static void area(){
        System.out.println("Enter radius= ");
        Scanner sc= new Scanner(System.in);
        double r= sc.nextDouble();
        double area= Math.PI*r*r;
        System.out.println("Area of Circle is ="+area);
    }
}
public class CircleClass {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area();
        
    }
}
