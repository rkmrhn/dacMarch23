import java.util.Scanner;
class Loop17{
	public static void main(String[] args)
	{
		System.out.println("enter the number of line");
		Scanner sc=new Scanner(System.in);
		int line=sc.nextInt();
		int x=1;
		
		for(int i=1;i<=line;i++)
		{   
	        
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				
				x++;
			
			}
			System.out.println();
			
			
		}
	}
}
	