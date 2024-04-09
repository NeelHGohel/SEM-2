import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit , calsius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit ");
        fahrenheit = sc.nextDouble();
        calsius= fahrenheit-32*5/9;
        System.out.print("Temperature in Calsius = ");
        System.out.println(calsius);
    }
}
