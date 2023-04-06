import java.util.Scanner;
//BMI Calculator(weight/(height*height))
class BMICalculator{
    double weight;
    double height;
    BMICalculator(){
     this.setValue();
    }
    void setValue(){
        System.out.println("enter weight");
        Scanner sc=new Scanner(System.in);
        this.weight=sc.nextInt();
        System.out.println("enter height");
        this.height=sc.nextInt();
    }
    double calculateBMI(){
        return  weight/(height*height);
    }
    void getValue(){
        double BMI=this.calculateBMI();
        System.out.println("BMI value =" +BMI);
    }
    public static void main(String args[]){
        BMICalculator obj1=new BMICalculator();
        obj1.getValue();
    }
}