class Assignment1_8{

public static void main1(String[] args){

    byte b=12;
    String strByte=Integer.toString(b);
    System.out.println(strByte);
}
public static void main2(String[] args){
    byte b=111;
    Byte byt= new Byte(b);
    byte num=byt.byteValue();
    System.out.println(num);
}
public static void main(String[] args){
    String str =new String("123");
    Byte byt = new Byte(str);
    byte num=byt.byteValue();
    System.out.println(num);

}
}
