import java.util.Scanner;
class Loop7{
	public static void main(String[] args)
	{ 
	  System.out.println("enter the number of lines");
	  Scanner sc=new Scanner(System.in);
	  int line=sc.nextInt();
	  for(int i=1;i<=line;i++)
	  {
		  for(int j=line-i;j>=1;j--)
		  {
			  System.out.print(" ");
		  }
		   for(int k=1;k<=i;k++)
		   {
			  System.out.print(k+" ");
		   }
		  System.out.println();
	  }
	}
}