import java.util.Scanner;
class Loop5{
	public static void main(String[] args)
	{ 
	  System.out.println("enter the number of lines");
	  Scanner sc=new Scanner(System.in);
	  char line=sc.next().charAt(0);
	  for(char i='A';i<=line;i++)
	  {
		  for(int j='A';j<=i;j++)
		  {
			  System.out.print(i+" ");
		  }
		  System.out.println();
	  }
	}
}