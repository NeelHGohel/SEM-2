import java.io.*;

public class StudentDemo {

    public static void main(String[] args) {
        String filename = "Student.txt";
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(filename));

            br.write("Prem,18\n");
            br.write("Neel,19\n");
            br.write("Jeneesh,20\n");
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br1 = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br1.readLine()) != null) {
                String temp[] = line.split(",");
                String name = temp[0];
                int age = Integer.parseInt(temp[1]);
                Student s1 = new Student(name, age);
                System.out.println(s1);
            }
            br1.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name : " + name + " , Age : " + age;
    }
}