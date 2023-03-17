import java.util.Scanner;
class Pattern5{
	public static void main(String[] args)
	{
		System.out.println("enter number of line");
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
	}
}
				
			