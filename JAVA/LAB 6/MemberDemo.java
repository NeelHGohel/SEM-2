class Member{
    String name;
    int age;
    String phoneNumber;
    String address;
    float salary;

    public Member(String name, int age, String phoneNumber, String address, float salary){
        this.name=name;
        this.age=age;
        this.phoneNumber= phoneNumber;
        this.address=address;
        this.salary=salary;
    }

    public void printSalary(){
        System.out.println("Name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("phoneNumber: "+this.phoneNumber);
        System.out.println("Adress: "+this.address);
        System.out.println("Salary: "+this.salary);
        
    }
}
class Employee extends Member{
    String specialization;
    public Employee(String name, int age, String phoneNumber, String address, float salary, String specialization){
        super(name, age, phoneNumber, address, salary);
        this.specialization=specialization; //geters
    }
    public void printSalary(){
        super.printSalary();
        System.out.println("Spelization: "+this.specialization);   //Seters
    }
}
class Manager extends Member{
    String department;
    public Manager(String name, int age, String phoneNumber, String address, float salary, String department){
        super(name, age, phoneNumber, address, salary);
        this.department=department;
    }
    public void printSalary(){
        super.printSalary();
        System.out.println("department: "+this.department);
    }
}

public class MemberDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("PT", 12, "1111111", "jivraj park", 12.0f, "fronted");
        e1.printSalary();
        Manager m1 = new Manager("NG", 19, "123456789", "vijay plot", 12.0f, "CSE");
        m1.printSalary();
    }
}
