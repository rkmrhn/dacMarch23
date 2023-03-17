import java.util.Scanner;
class Loop18{
	public static void main(String[] args)
	{
		System.out.println("enter the number of line");
		Scanner sc=new Scanner(System.in);
		char line=sc.next().charAt(0);
		char x=line;
		for(char i='A';i<=line;i++)
		{
			for(char j='A';j<=x;j++)
				System.out.print(j+" ");
			System.out.println();
			x--;
		}
	}
}