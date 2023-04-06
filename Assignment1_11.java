class Assignment1_11{

public static void main(String[] args){

String s=args[0];
char ch=s.charAt(0);
if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
{
System.out.println("INPUT IS CHARACTER");
if((ch>=97 && ch<=122))
{
    System.out.println("lower case  "+ch);
    System.out.println("Conversion In Upper Case  "+Character.toUpperCase(ch));
}
else
{
     System.out.println("UPPER CASE  "+ch);
     System.out.println("Conversion In Lower Case  "+Character.toLowerCase(ch));
}
}

if(ch>=48 && ch<=57)
{
System.out.println("INPUT IS INTEGER: "+ch);
System.out.println("code value INTEGER: "+Integer.hashCode(ch));
}

}
}
