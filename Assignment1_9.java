class Assignment1_9{

public static void main(String[] args){
    byte num=111;
    Byte byt=new Byte(num);

    byte num1=byt.byteValue();
    System.out.println("Byte:-"+num1);

    short num2=byt.shortValue();
    System.out.println("Short:-"+num2);

    int num3=byt.intValue();
    System.out.println("Int:-"+num3);

    long num4=byt.longValue();
    System.out.println("Long:-"+num4);

    float num5=byt.floatValue();
    System.out.println("Float:-"+num5);

    double num6=byt.doubleValue();
    System.out.println("Double:-"+num6);
}
}

