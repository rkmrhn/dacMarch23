import java.util.Scanner;
class Pattern12{
	public static void main(String[] args)
	{
		System.out.println("enter number of line upto which pattern is decreasing");
		Scanner sc =new Scanner(System.in);
		int line=sc.nextInt();
		for(int i=1;i<=line;i++)
		{
			for(int j=i;j<=line;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		for(int i=2;i<=line;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	