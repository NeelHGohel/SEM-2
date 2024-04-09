import java.util.Scanner;
class Complex{
	int x;
	int y;
		Complex(int x,int y){
			this.x=x;
			this.y=y;
		}	

		void add(Complex c1,Complex c2){
			this.x=c1.x+c2.x;
			this.y=c1.y+c2.y;
			System.out.println("Solution is: "+x+" + "+y+"i");
		}
}

		public class ComplexNumber{
			public static void main(String[]args){
					int x=0;
					int y=0;
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter x and y for Equation 1: ");
					x = sc.nextInt();
					y = sc.nextInt();
					Complex c1=new Complex(x,y);
					System.out.print("Enter x and y for Equation 2: ");
					x = sc.nextInt();
					y = sc.nextInt();
					Complex c2=new Complex(x,y);
					Complex c3=new Complex(0,0);
					c3.add(c1,c2);
			}
		}