import java.util.*;

class Arraymatup 
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
				
		
		System.out.println("Upper traingular Matrix = ");
		for(i=0;i<r;i++)
		{
			System.out.print("\n");
			for(j=0;j<i;j++)
				System.out.print("\t ");
				for(j=(1*i);j<c;j++)
					System.out.print("\t"+a[i][j]);
		}
		
	}
}