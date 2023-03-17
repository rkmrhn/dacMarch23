import java.util.Scanner;
class Loop16{
	public static void main(String[] args)
	{
		System.out.println("enter the number of line");
		Scanner sc=new Scanner(System.in);
		int line=sc.nextInt();
		
		
		for(int i=line;i>=1;i--)
		{   
	       
			
			for(int j=line;j>=i;j--)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
			
			
		}
	}
}
	