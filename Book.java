import java.util.Scanner;
class  Book{
    private String title;
    private String author;
    private String publisher;
    String isbn;
    int year;
    private double price;
    int quantity;
    static Scanner sc=new Scanner(System.in);

    Book(){
        this.title="JAVA";
        this.author="SANDEEP KULANGE";
        this.publisher="CDAC MUMBAI";
        this.isbn="12345";
        this.year=2023;
        this.price=430.55;
        this.quantity=100;
    }
    void printdetails(){
        System.out.println("Title :"+this.title);
        System.out.println("Author :"+author);
        System.out.println("Publisher :"+publisher);
        System.out.println("ISBN :"+isbn);
        System.out.println("Year of publication :"+year);
        System.out.println("Price :"+price);
        System.out.println("Quantity :"+quantity);
    }
    void increaseQuantity(){
        System.out.println("enter the quantity through which book is increased");
        int increasedValue=sc.nextInt();
        this.quantity= quantity+ increasedValue;
    }
    void decreaseQuantity(){
        System.out.println("enter the quantity through which book is deccreased");
        int decreasedValue=sc.nextInt();
        this.quantity= quantity - decreasedValue;
    }
    double getInventoryValue(){
         return (this.quantity*this.price);
    }
    void printRecoard(){
        double value=getInventoryValue();
        System.out.println("Total value of the inventory"+value);  
    }
    static int menu(){
        System.out.println("0.exit");
        System.out.println("1.show the details  of the book");
        System.out.println("2.Increase quantity of book");
        System.out.println("3.Decrease quantity of book");
        System.out.println("4.Invetory value of the book");
        System.out.print("enter number: ");
        return sc.nextInt();
    }
}
class Management{
    public static void main(String args []){
        Book b= new Book();
        int choice;
        while((choice=Book.menu())!=0)
        {
            switch(choice){
               case 1:
                 b.printdetails();
            break;
                case 2:
                 b.increaseQuantity();
            break;
                 case 3:
                 b.decreaseQuantity();
            break;
                 case 4:
                 b.printRecoard();
            break;
            }

        }

    }
}