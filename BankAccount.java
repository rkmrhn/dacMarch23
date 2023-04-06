import java.util.Scanner;
class Account{
    private String name;
    private int accountNumber;
    private double balance;
    Account(){
        this.name=null;
        this.accountNumber=0;
        this.balance=0;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return this.balance;
    }
}
class Entry {
    Account acc= new Account();
    static Scanner sc=new Scanner(System.in);

    void acceptRecord(){

        System.out.println("Enter The Name");
        sc.nextLine();
        acc.setName(sc.nextLine());
        System.out.println("Generate a Unique Account Number");
        acc.setAccountNumber(sc.nextInt());
    }
    void checkAccountNumber(){
        System.out.println("Enter Account Number");
        int accnum=sc.nextInt();
        if (accnum != acc.getAccountNumber())
        {System.out.println("Incorrect Account Number: ");
         System.exit(0);
        }
    }
    void deposit(){
        this.checkAccountNumber();
        System.out.println("Enter the Amount to be Deposited");
        double dep=sc.nextDouble();
        double totalBalance= acc.getBalance()+dep;
        acc.setBalance(totalBalance);
    }
    void withdraw(){
        this.checkAccountNumber();
        System.out.println("Enter the Amount to be withdrawn");
        double withd=sc.nextDouble();
        if (withd<=acc.getBalance())
        {
        double totalBalance= acc.getBalance()-withd;
        acc.setBalance(totalBalance);
        }
        else
        System.out.println("Insufficient Balance");
    }
    void displayAccBalance(){
        this.checkAccountNumber();
        System.out.println("Your Account Balance is: "+ acc.getBalance());
    }
    void displayInfo(){
        this.checkAccountNumber();
        System.out.println("Account holder name: "+acc.getName());
        System.out.println("Total Balance: "+acc.getBalance());
    }

    static int menu(){
        System.out.println("0.Exit");
        System.out.println("1.Create a new account");
        System.out.println("2.Deposit money into an account");
        System.out.println("3.Withdraw money from an account");
        System.out.println("4.Display the account balance");
        System.out.println("5.Display the account holder's information");
        return sc.nextInt();
    }

}
class Bank{
    public static void main(String[] args){
    Entry e1= new Entry();
    int choice;
    while((choice=Entry.menu())!=0)
      {
        switch(choice){
            case 1:
                e1.acceptRecord();
                break;
            case 2:
                e1.deposit();
                break;   
            case 3:
                e1.withdraw();
                break;
            case 4:
                e1.displayAccBalance();
                break;   
            case 5:
                e1.displayInfo();
                break;      
            }
        }
    }
}