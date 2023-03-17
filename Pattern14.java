import java.util.Scanner;
class Pattern14{
	public static void main(String[] args)
	{
		System.out.println("enter number of line upto which pattern is decreasing");
		Scanner sc =new Scanner(System.in);
		int line=sc.nextInt();
		for(int i=line;i>=1;i--)
		{
			for(int j=i;j<line;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<line;i++)
		{
			for(int j=line-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=line;k>=line-i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
		
		