class MovingObject{
    int id_no=1;
}

class Vehcile extends MovingObject{
    int id_no=2;
    public int prop(){
        return super.id_no;
    }
    
}
class Car extends Vehcile{
    int id_no=3;

    public void printId(){
        int id_no=4;
        System.out.println("Local: "+id_no);
        System.out.println("Instance: "+this.id_no);
        System.out.println("Super: "+super.id_no);
        System.out.println("Super ka Super: "+super.prop());

    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.printId();
    }
}
