import java.util.Scanner;
public class ConsonantsAndVowels {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a line ");
        String a=sc.nextLine();
        int v=0,c=0;
        for(int i=0;i<a.length();i++){
        char result=a.charAt(i);
        a=a.toLowerCase();
        String vowel="aeiou";
        if(vowel.indexOf(result)==-1){
            c++;
        }
        else{
            v++;
        }
        }
        System.out.println("Vowels "+v);
        System.out.println("Consonants "+c);
        
    }
}