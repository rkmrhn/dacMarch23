import java.util.Scanner;
class Loop9{
	public static void main(String[] args)
	{ 
	  System.out.println("enter the number of lines");
	  Scanner sc=new Scanner(System.in);
	  char line=sc.next().charAt(0);
	  for(char i='A';i<=line;i++)
	  {
		  for(int j=line-i;j>=1;j--)
		  {
			  System.out.print(" ");
		  }
		   for(char k='A';k<=i;k++)
		   {
			  System.out.print(k+" ");
		   }
		  System.out.println();
	  }
	}
}