import java.util.Scanner;
class Loop4{
	public static void main(String[] args)
	{ 
	  System.out.println("enter the number of lines");
	  Scanner sc=new Scanner(System.in);
	  int line=sc.nextInt();
	  for(int i=1;i<=line;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(i+" ");
		  }
		  System.out.println();
	  }
	}
}