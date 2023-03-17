import java.util.Scanner;
class Pattern6{
	public static void main(String[] args)
	{
		System.out.println("enter the number of line");
		Scanner sc= new Scanner(System.in);
		int line=sc.nextInt();
		
		for(int i=line;i>=1;i--)
		{
			for(int k=line;k>i;k--)
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
