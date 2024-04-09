public class Program6
{
public static void main (String[] args) 
{
int length=args.length;
    for(int i=0;i<length;i++)
    {
    String s=args[i];

        if (s.charAt(0)<65 || s.charAt(0)>90) {
        System.out.println("Error");
    }
    } 
    return;
    }
}
 

