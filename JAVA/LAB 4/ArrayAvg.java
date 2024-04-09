import java.util.*;
public class ArrayAvg {
    public static void main(String[] args) {
        int []mynum = new int[4];
        int result=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four number ");
        for(int i=0;i<4;i++)
        {
            mynum[i]=sc.nextInt();
            result=result+mynum[i];
        }
        result=result/4;
        System.out.println("Avg is " +result);
    }   
}
