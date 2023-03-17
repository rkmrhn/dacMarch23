import java.util.Scanner;
class Pattern8{
	public static void main(String[] args)
	{
		System.out.println("enter number of line upto which pattern is incrrasing");
		Scanner sc =new Scanner(System.in);
		int line=sc.nextInt();
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		      for(int i=line-1;i>=1;i--)
		      {
				  for(int j=i;j>=1;j--)
				  {
					  System.out.print("*");
				  }
				  System.out.println();
			  }
			
	}
}