//Write a program in Java to demonstrate use of this keyword. Check 
//whether this can access the Static variables of the class or not.
public class This {
    public static void main(String[] args) {
        
        This a = new This(1);
        a.ThisArea();
        This b = new This(4);
        b.ThisArea();
        System.out.println("area: "+a.ThisArea());
        System.out.println("area: "+b.ThisArea());
    }
    int length;
    public This(int length){
        this.length=length;
    }
    public int ThisArea(){
        return this.length*this.length;
    }
}
