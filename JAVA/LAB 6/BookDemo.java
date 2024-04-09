/*Declare a class called book having author_name as private data 
member. Extend book class to have two sub classes called 
book_publication & paper_publication. Each of these classes have 
private member called title. Write a complete program to show 
usage of dynamic method dispatch (dynamic polymorphism) to display 
book or paper publications of given author.Use command line 
arguments for inputting data. */


class Book {
        private String author_name;
        public Book(){
            //constructor
        }
        Book(String a){
            author_name=a;
            //constructor
        }
        public void Print(){
            System.out.println("Author name: "+author_name);
            //Method
        }
    }
class book_publication extends Book{
    private String title;
    public book_publication(String title){
        //constructor
        this.title=title;
    }
        public void Print(){
            //Method
            System.out.println("Book Publication Title: "+title);
        }
}
class paper_publication extends Book{
    private String title;
    public paper_publication(String title){
        //constructor
        this.title=title;
    }
    public void Print(){
        //Method
        System.out.println("Paper Publication Title: "+title);
    }
}
class BookDemo {
    public static void main(String[] args) {
        String author_name;
        Book b1 = new Book("neel");
        b1.Print();
        b1= new book_publication("ABC");
        b1.Print();
        b1= new paper_publication("Darshan");
        b1.Print();
    }
}
