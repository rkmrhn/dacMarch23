import java.util.Scanner;
class Loop14{
	public static void main(String[] args)
	{
		System.out.println("enter the number of line");
		Scanner sc=new Scanner(System.in);
		int line=sc.nextInt();
		int x=line;
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=x;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			x--;
		}
	}
}
	