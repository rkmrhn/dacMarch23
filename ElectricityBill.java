import java.util.Scanner;
class ElectricityBill{
    private String name;
    private double unitsConsumed;
    private double billAmount;
    static Scanner sc= new Scanner(System.in);
ElectricityBill(){
    name=null;
    unitsConsumed= 0;
    billAmount= 0;

}
void setName(String name){
    this.name=name;
}
void setUnits(double unitsConsumed){
    this.unitsConsumed= unitsConsumed;
}
void acceptRecord(){
    System.out.println("Enter the customer Name:");
    sc.nextLine();
    setName(sc.nextLine());
    
    System.out.println("Enter the units consumed");
    setUnits(sc.nextDouble());
}
void calculateBillAmount(){
    if(this.unitsConsumed<=100)
    this.billAmount=this.unitsConsumed*5;
    else if(this.unitsConsumed>100 && this.unitsConsumed<=200)
    this.billAmount=100*5+(this.unitsConsumed-100)*7;
    else if(this.unitsConsumed>200)
    this.billAmount= 100*5 + 100*7+ (this.unitsConsumed-200)*10;
    this.display();
}
void display(){
    System.out.println("Name of customer: "+ this.name);
    System.out.println("Total units Consumed: "+ this.unitsConsumed);
    System.out.println("Total Amount of  Electricity Bill : "+ this.billAmount);
}
static int menu(){
    System.out.println("0.exit");
    System.out.println("1.Enter the details");
    System.out.println("2.Billing amount");
    System.out.println("Enter");
    return sc.nextInt();
}
}
class Calculate{
    public static void main(String[] args){
    ElectricityBill eb1= new ElectricityBill();
    System.out.println("WELCOME TO CDAC POWER CORPORATION LIMITED");
    int choice;
      while((choice=ElectricityBill.menu())!=0)
     {
        switch (choice)
        {
            case 1:
                eb1.acceptRecord();
                break;
            case 2:
                eb1.calculateBillAmount();
                break;
        }
      }
    }
}
