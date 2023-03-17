import java.util.Scanner;
class Loop2{
	public static void main(String[] args)
	{ 
	  System.out.println("enter the character of  last line");
	  Scanner sc=new Scanner(System.in);
	  char line=sc.next().charAt(0);
	  for(char i='A';i<=line;i++)
	  {
		  for(char j='A';j<=i;j++)
		  {
			  System.out.print(j+" ");
		  }
		  System.out.println();
	  }
	}
}