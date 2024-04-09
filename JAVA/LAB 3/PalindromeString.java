import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String a=sc.nextLine();
 		int s=0,e=a.length();
		boolean flag=true;
        char result=0,result1=0;
		while(s>e){
            result = a.charAt(s);
            result1= a.charAt(e);
			if(result!=result1){
				flag=false;
                System.out.println("String is not Palindrome");
				break;
			}
			else{
				s++;
				e--;
			}
		}
		System.out.println("String is Palindrome");

	}
}