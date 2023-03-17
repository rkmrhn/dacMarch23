import java.util.Scanner;
class Pattern7{
	public static void main(String[] args)
	{
		System.out.println("enter number of line upto which pattern is incrrasing");
		Scanner sc =new Scanner(System.in);
		int line=sc.nextInt();
		
		for(int i=1;i<=line;i++)
		{
			for(int j=line-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=line-1;i>=1;i--)
		{
			for(int k=line-1;k>=i;k--)
			 {
				 System.out.print(" ");
			 }
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			 
			 System.out.println();
			 
		}
	}
}
				
			