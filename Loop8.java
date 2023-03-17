import java.util.Scanner;
class Loop8{
	public static void main(String[] args)
	{ 
	  System.out.println("enter the number of lines");
	  Scanner sc=new Scanner(System.in);
	  int line=sc.nextInt();
	  int x=line;
	  for(int i=line;i>=1;i--)
	  {
		  for(int j=i-1;j>=1;j--)
		  {
			  System.out.print(" ");
		  }
		   for(int k=i;k<=line;k++)
		   {
			  System.out.print(k+" ");
		   }
		  System.out.println();
		  x--;
	  }
	}
}