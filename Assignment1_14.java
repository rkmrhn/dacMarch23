class Assignment1_14{

public static void main(String[] args){
    Short num=47;
    Short srt=new Short(num);

    byte num1=srt.byteValue();
    System.out.println(num1);

    short num2=srt.shortValue();
    System.out.println("Short: "+num2);

    int num3=srt.intValue();
    System.out.println("Int: "+num3);

    long num4=srt.longValue();
    System.out.println("Long: "+num4);

    float num5=srt.floatValue();
    System.out.println("Float: "+num5);

    double num6=srt.doubleValue();
    System.out.println("Double: "+num6);
}}