import java.util.Scanner;
class Pattern4{
	public static void main(String[] args)
	{
		System.out.println("enter number of line");
		Scanner sc =new Scanner(System.in);
		int line=sc.nextInt();
		for(int i=0;i<line;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=line-i;k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
			
			