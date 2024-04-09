//WAP that counts the number of objects created using static.
public class ObjectCountStatic {

    static int objectCount = 0; 

   public void ObjectCount() {
       objectCount++; 
       System.out.println("Object= " +objectCount+" created");
   }

   public static int getObjectCount() {
       return objectCount;  
   }

   public static void main(String[] args) {
       // Create multiple objects to demonstrate counting
       ObjectCountStatic abc = new ObjectCountStatic();
       ObjectCountStatic def = new ObjectCountStatic();
       ObjectCountStatic ghi = new ObjectCountStatic();
       abc.ObjectCount();
       def.ObjectCount();
       ghi.ObjectCount();

       
       System.out.println("Total objects created: " + ObjectCountStatic.getObjectCount());
   }
}
