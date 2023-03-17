import java.util.Scanner;
class Pattern15{
	public static void main(String[] args)
	{
		System.out.println("enter number of line");
		Scanner sc =new Scanner(System.in);
		int line=sc.nextInt();
		for(int i=0;i<line;i++)
		{
			for (int j=0;j<line;j++)
			{
				if(j==0 || j==i || i==line-1)
				{
				  System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
			
			