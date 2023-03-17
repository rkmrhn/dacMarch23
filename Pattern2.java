import java.util.Scanner;
class Pattern2{
	public static void main(String[] args)
	{
		System.out.println("enter number of line");
		Scanner sc =new Scanner(System.in);
		int line=sc.nextInt();
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=line-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			System.out.print("*");
            
            System.out.println();
		}
	}
}	