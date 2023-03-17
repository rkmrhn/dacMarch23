import java.util.Scanner;
class Pattern16{
	public static void main(String[] args)
	{
		System.out.println("enter number of line");
		Scanner sc =new Scanner(System.in);
		int line=sc.nextInt();
		for(int i=0;i<line;i++)
		{
			for (int j=0;j<line;j++)
			{    int k=i+j;
				if(k==line-1 || j==line-1 || i==line-1)
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
			
			