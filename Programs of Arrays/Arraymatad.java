import java.util.*;

class Arraymatad 
{
 
	public static void main(String args[])
	{
		int n,a[][],b[][],l[][],i,j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Dimension for Matrix = ");
		n = sc.nextInt();
		
		
		a = new int[n][n]; //Memory alloacation
		
		System.out.println("Enter "+(n*n)+" elements for 1st matrix= ");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j] = sc.nextInt();
				
		b = new int[n][n]; //Memory alloacation
		
		System.out.println("Enter "+(n*n)+" elements for 2st matrix= ");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				b[i][j] = sc.nextInt();
		
			System.out.println("\n 1st matrix is = ");
		for(i=0;i<n;i++)
		{
			System.out.print("\n");
			for(j=0;j<n;j++)
				System.out.print("\t"+a[i][j]);
		}
		
		System.out.println("\n 2st matrix is = ");
		for(i=0;i<n;i++)
		{
			System.out.print("\n");
			for(j=0;j<n;j++)
				System.out.print("\t"+b[i][j]);
		}
		
        l = new int[n][n];
		
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
             l[i][j] = a[i][j] + b[i][j];			
		

		
		System.out.println("\n Adition of two matrix  = ");
		for(i=0;i<n;i++)
		{
			System.out.print("\n");
			for(j=0;j<n;j++)
				System.out.print("\t"+l[i][j]);
		}
		
	}
}