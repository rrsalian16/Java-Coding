import java.util.Scanner;
class S
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of row");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==0||i==n-1)&&(j!=0&&j!=n-1)||(j==0)&&(i!=0&&i<n/2)||(j==n-1)&&(i!=n-1&&i>n/2)||(i==n/2)&&(j!=0&&j!=n-1))
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
