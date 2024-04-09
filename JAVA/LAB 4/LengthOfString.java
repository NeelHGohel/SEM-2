import java.util.*;
public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String=");
        String s1= sc.nextLine();
        int length= s1.length();
        System.out.println("Given String Length is=" +length);
        for(int i=(length/2);i<length;i++){
            System.out.print(s1.charAt(i));
        }
    }
}
