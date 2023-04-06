class Assignment1_16{
    public static void main(String[] args){
        int num=666;
        String s=Integer.toString(num);// int to string 
        System.out.println(s);

        Integer n= new Integer(num);//int value to Integer instance
        String s1= new String("1234");
        Integer n1=new Integer(s1);//String instance to Integer instance
        int num1=n1.intValue();
        System.out.println(num1);

        String s3=Integer.toBinaryString(num);//binary String of int 
        String s4=Integer.toHexString(num);//hexadecial string of int
        String s5=Integer.toOctalString(num);//octal string of int
        System.out.println("binary "+s3+" hexadecimal "+s4+" octal "+s5);

    }
}