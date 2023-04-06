class Assignment1_13{

public static void main1(String[] args){
    short num=3334;
    String s=Short.toString(num);
    System.out.println(s);
}
public static void main2(String[] args){
    short num=3456;
    Short srt= new Short(num);
    short num1=srt.shortValue();
    System.out.println(num1);
}
public static void main(String[] args){
    String s=new String("3377");
    Short srt=new Short(s);
    short num2=srt.shortValue();
    System.out.println(num2);


}}