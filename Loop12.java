import java.util.Scanner;
class Loop12{
	public static void main(String[] args)
	{ 
	  System.out.println("enter the number of lines");
	  Scanner sc=new Scanner(System.in);
	  int line=sc.nextInt();
	  int x=line;
	  for(int i=1;i<=line;i++)
	  {
		  for(int j=line-i;j>=1;j--)
		  {
			  System.out.print(" ");
		  }
		   for(int k=x;k<=line;k++)
		   {
			  System.out.print(i+" ");
		   }
		  System.out.println();
		  x--;
	  }
	}
}