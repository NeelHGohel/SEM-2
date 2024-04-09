import java.util.Scanner;

class Vowel{
	Scanner sc = new Scanner(System.in);
	String str1 = "quit";
	int count;
	int i=0;
	public void countVowels(){
		System.out.println("Just enter quit if you want to end the program....");
		while(i>=0){
	    System.out.print("Enter sentence no. " + (i+1) + " :- ");		
		String str=sc.nextLine();
		count=0;
		if(str.equals(str1)){
			break;
		}
		else{
			for (int j=0;j<str.length();j++) {
			if(str.charAt(j)==97||str.charAt(j)==101||str.charAt(j)==105||str.charAt(j)==111||str.charAt(j)==117){
				count++;
			}
			if(str.charAt(j)==65||str.charAt(j)==69||str.charAt(j)==73||str.charAt(j)==79||str.charAt(j)==85){
				count++;
			}
		   }
		}
		i++;
		System.out.println("Total Vowels used in this sentence are = "+count);
	  }
	}
}


public class VowelCount{
	public static void main(String[] args) {
		Vowel vc = new Vowel();
        vc.countVowels();
	}
}