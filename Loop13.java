import java.util.Scanner;
class Loop13{
	public static void main(String[] args)
	{ 
	  System.out.println("enter the number of lines");
	  Scanner sc=new Scanner(System.in);
	  char line=sc.next().charAt(0);
	  char x=line;
	   for(char i='A';i<=line;i++)
	    {
			for(int j=line-i;j>=1;j--)
			{
				System.out.print(" ");
			} 
			  for(char k=x;k<=line;k++)
			  {
				  System.out.print(i+" ");
			  }
			  System.out.println();
			  x--;
		}
	}
}
