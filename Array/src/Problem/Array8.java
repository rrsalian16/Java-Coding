package Problem;
import java.util.Scanner;
/***************************************************************************

8.	WAP to find the product of all even numbers in a array

INPUT :
7
1     4     2      1       4    3     3  

OUTPUT:
32

 ******************************************************************************/
public class Array8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int prd=1;
		for(int i=0;i<n;i++) {
			if(ar[i]%2==0) {
				prd*=ar[i];
			}
		}
		System.out.println(prd);
	}

}
