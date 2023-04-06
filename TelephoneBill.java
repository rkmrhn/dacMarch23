import java.util.Scanner;
class TelephoneBill{
    private String name;
    private String phoneNumber;
    private int numberOfCalls;
    private double duration;
    TelephoneBill(){
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
    return this.name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setNumberOfCalls(int numberOfCalls){
        this.numberOfCalls=numberOfCalls;
    }
    public int getNumberOfCalls(){
        return this.numberOfCalls;
    }
    public void setDurarion(double duration){
        this.duration=Math.ceil(duration);
    }
    public double getDuration(){
        return this.duration;
    }
}
class TelephoneBillTest{
    TelephoneBill tb=new TelephoneBill();
    static Scanner sc=new Scanner(System.in);
    private static int fixedCharge=10;
    private double billAmount;

    void acceptRecord(){
        System.out.println("Enter the name of cutomer");
        sc.nextLine();
        tb.setName(sc.nextLine());
        System.out.println("Enter the phone number of customer");
        tb.setPhoneNumber(sc.nextLine());
        System.out.println("Enter the Number of calls");
        tb.setNumberOfCalls(sc.nextInt());
        System.out.println("Enter the Call Duration");
        tb.setDurarion(sc.nextDouble());
    }
    double billCalculation(){
        
        if (tb.getNumberOfCalls()<=100)
        this.billAmount = TelephoneBillTest.fixedCharge + (tb.getNumberOfCalls())*.50;
        else if (tb.getNumberOfCalls()>100)
        this.billAmount = TelephoneBillTest.fixedCharge +100*0.5+(tb.getNumberOfCalls()-100)*.25;
        return this.billAmount;
    }
    void printRecord(){
        System.out.println("Customer Name: "+tb.getName());
        System.out.println("Custome Mobile Number: "+tb.getPhoneNumber());
        System.out.println("Customer Number of Calls: "+tb.getNumberOfCalls());
        System.out.println("Call Duration: "+tb.getDuration());
        System.out.println("Total Bill: "+this.billCalculation()+"$");
    }
    static int menu(){
        System.out.println("0.exit");
        System.out.println("1.Enter the details");
        System.out.println("2.See total bill");
        System.out.println("Enter");
        return sc.nextInt();
    }
}
class Calculate{
    public static void main(String [] args){
        TelephoneBillTest tbt= new TelephoneBillTest();
        int choice;
        while((choice=TelephoneBillTest.menu())!=0)
        {
            switch(choice){
                case 1:
                    tbt.acceptRecord();
                    break;
                case 2:
                    tbt.printRecord();  
                    break;  
            }
        }
    }
}