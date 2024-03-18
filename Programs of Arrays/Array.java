import java.util.*;

class Array
{
	public static void main(String args[])
	{
		int i,j,a[][],b[][],k,sum=0,n;
		
		a = new int[10][10];
		b = new int[10][10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Enter the Dimension of Matrix : ");
		n=sc.nextInt();

		System.out.println("\n Enter "+n*n+" Elements for First Matrix: ");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j]=sc.nextInt();

		System.out.println("\n Enter "+n*n+" Elements for Second Matrix: ");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				b[i][j]=sc.nextInt();

		System.out.println("\n The First MATRIX is : ");
		for(i=0;i<n;i++)
		{
			System.out.print("\n");

			for(j=0;j<n;j++)
				System.out.print("  "+a[i][j]);
		}

		System.out.println("\n The Second MATRIX is : ");
		for(i=0;i<n;i++)
		{
			System.out.print("\n");

			for(j=0;j<n;j++)
				System.out.print("  "+b[i][j]);
		}

		System.out.println("\n\n Multiplication MATRIX is : ");
		for(i=0;i<n;i++)
		{
			System.out.print("\n");
			for(j=0;j<n;j++)
			{
				for(k=0;k<n;k++)
				{
					sum=sum+a[i][k]*b[k][j];
				}

				System.out.print("  "+sum);
				sum=0;
			}
		}				
	}
}