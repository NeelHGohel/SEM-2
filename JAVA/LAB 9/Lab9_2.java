public class Lab9_2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i <=20; i++) {
                try{
                    if (i%2==0) {
                        Thread.sleep(800);
                        System.out.println("even  "+i); 
                    }
                    else{
                        Thread.sleep(1000);
                        System.out.println("odd   "+i);
                    }
                    
                }
                catch(Exception e){
                    e.printStackTrace();
                }

        }
    }
}