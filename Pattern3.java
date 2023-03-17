import java.util.Scanner;
class Pattern3{
	public static void main(String[] args)
	{
		System.out.println("enter number of line");
		Scanner sc =new Scanner(System.in);
		int line=sc.nextInt();
	
		for(int i=0;i<line;i++)
		{
			for(int j=line-i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}