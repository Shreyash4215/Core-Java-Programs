import java.util.*;

class Ass5matupdl
{
	public static void main(String args[])
	{
		int i,j,r,c,a[][],k;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\t Enter the row & coloumn for 1st matrix: ");
		r=sc.nextInt();
		c=sc.nextInt();
		
		a=new int[r][c];
				
		System.out.println("\n\t Enter the "+(r*c)+" Element for 2nd matrix: ");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				a[i][j]=sc.nextInt();
			
		
		System.out.println("\n\t Entered matrix is: ");
		for(i=0;i<r;i++)
		{
			System.out.print("\n");
			for(j=0;j<i+1;j++)
			{				
				System.out.print("\t"+a[i][j]);
			}
		}
	
	
	}
}