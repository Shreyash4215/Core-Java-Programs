import java.util.*;

class Ass5matMul
{
	public static void main(String args[])
	{
		int i,j,r,c,a[][],b[][],k,sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\t Enter the row & coloumn for 1st matrix: ");
		r=sc.nextInt();
		c=sc.nextInt();
		
		a=new int[r][c];
		
		System.out.println("\n\t Enter the "+(r*c)+" Element for 1st matrix: ");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				a[i][j]=sc.nextInt();
	
	
		b=new int[r][c];
		
		System.out.println("\n\t Enter the "+(r*c)+" Element for 2nd matrix: ");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				b[i][j]=sc.nextInt();
			
				
		System.out.println("\n\t Entered 1st matrix is: ");
		for(i=0;i<r;i++)
		{
			System.out.print("\n");
				for(j=0;j<c;j++)
					System.out.print("\t"+a[i][j]);
		}
		System.out.println("\n\t Entered 2st matrix is: ");
		for(i=0;i<r;i++)
		{
			System.out.print("\n");
				for(j=0;j<c;j++)
					System.out.print("\t"+b[i][j]);
		}
	
		System.out.println("\n\t Multiplication of matrix is: ");
		for(i=0;i<r;i++)
		{
			System.out.print("\n");
				for(j=0;j<c;j++)
				{
					sum=0;
					for(k=0;k<r;k++)
						sum=sum+(a[i][k]*b[k][j]);

					System.out.print("\t"+sum);
				}
		}
	}
}