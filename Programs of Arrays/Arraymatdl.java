import java.util.*;

class Arraymatdl
{
 
	public static void main(String args[])
	{
		int r,c,a[][],i,j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Row and Col of Matrix = ");
		r = sc.nextInt();
		c = sc.nextInt();
		
		a = new int[r][c]; //Memory alloacation
		
		System.out.println("Enter "+(r*c)+" elements = ");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				a[i][j] = sc.nextInt();
				
		
		System.out.print("the daigonal of matrix is = ");
		for(i=0;i<r;i++)
		{
			for(j=i;j<=i;j++)
				System.out.print("\t"+a[i][j]);
		}
		
	}
}