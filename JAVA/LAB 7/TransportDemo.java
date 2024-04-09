// The Transport interface declares a deliver () method. The abstract class Animal is the super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is implemented by the Camel and Donkey classes. Write a test program that initialize an array of four Animal objects. If the object implements the Transport interface, the deliver () method is invoked.

interface Transport {
    public void deliver();
}

abstract class Animal {

    public void show() {

    }
}

class Tiger extends Animal {
    public void show() {
        System.out.println("Tiger");
    }
}

class Camel extends Animal implements Transport {
    public void deliver() {
        System.out.println("Camel");
    }
}

class Deer extends Animal {
    public void show() {
        System.out.println("Deer");
    }
}

class Donkey extends Animal implements Transport {

    public void deliver() {
        System.out.println("Donkey");
    }
}

public class TransportDemo {
    public static void main(String[] args) {
        Animal a[] = new Animal[4];
        a[0] = new Tiger();
        a[1] = new Camel();
        a[2] = new Deer();
        a[3] = new Donkey();
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Transport) {
                ((Transport) a[i]).deliver();
            } else {
                a[i].show();
            }
        }

    }
}