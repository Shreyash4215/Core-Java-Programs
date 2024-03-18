import java.util.*;

class Ass4ArrOppWthSwitch
{
	public static void main(String args[])
	{
		int i,temp,j,sum=0,n,flag=0,cnt=0,srch,min,max,arr[],ch,arr2[],l,arr3[],s,k,c=1;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.print("\n\t ****************MENU*********** ");
		System.out.print("\n\t 1.Sum of Array Element ");
		System.out.print("\n\t 2.Min And Max In Array");
		System.out.print("\n\t 3.Array Sort ");
		System.out.print("\n\t 4.Search And Its Position");
		System.out.print("\n\t 5.Intersection  ");
		System.out.print("\n\t 6.Union");
		System.out.print("\n\t 7.Exit ");
		System.out.println("\n\t ******************************** ");
		
		System.out.print("\n\t Enter Your Choice : ");		
		ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
			{
				System.out.print("\n\t How Many Numbers You want?: ");
				n=sc.nextInt();
				
				arr = new int[n];
				
				System.out.println("\n\t Enter "+n+" Numbers : ");
				for(i=0;i<n;i++)
					arr[i]=sc.nextInt();
				
				for(i=0;i<n;i++)
				{
					sum=sum+arr[i];
				}
						
				System.out.println("\n\t Addition of array elements is "+sum);
		
				break;
			}
			
			case 2:
			{
				System.out.print("\n\t How Many Numbers You want?: ");
				n=sc.nextInt();
				
				arr = new int[n];
				
				System.out.print("\n\t Enter "+n+" Numbers : ");
				for(i=0;i<n;i++)
					arr[i]=sc.nextInt();
				
				min=max=arr[0];
				
				for(i=0;i<n;i++)
				{
					if(min>arr[i])
						min=arr[i];
					if(max<arr[i])
						max=arr[i];
				}
				
				System.out.println("\n\t smallest element in array is: "+min);
				System.out.println("\n\t largest element in array is : "+max);
				break;
			}
			
			case 3:
			{
				System.out.print("\n\t How Many Numbers You want?: ");
				n=sc.nextInt();
				
				arr = new int[n];
				
				System.out.print("\n\t Enter "+n+" Numbers : ");
				for(i=0;i<n;i++)
					arr[i]=sc.nextInt();
				
						
				for(i=0;i<n;i++)
					for(j=i+1;j<n;j++)
					{
						if(arr[i]>arr[j])
						{
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;					
						}
					}
						
				System.out.println("\n\t Sorted Array Is :");
				 for(i=0;i<n;i++)
					 System.out.println("\n\t"+arr[i]);
				 break;
			}
			
			case 4:
			{
				System.out.print("\n\t How Many Numbers You want?: ");
				n=sc.nextInt();
				
				arr = new int[n];
				
				System.out.print("\n\t Enter "+n+" Numbers : ");
				for(i=0;i<n;i++)
					arr[i]=sc.nextInt();
				
				System.out.print("\n\t Enter  Numbers To Search : ");
				srch=sc.nextInt();
				
				for(i=0;i<n;i++)
				{
					if(srch==arr[i])
					{
						flag=1;
						cnt++;
					}
					if(flag==1)
					{
						System.out.println("\n\t "+srch+" elements found at Position "+i+" in arraY");
						flag=0;
					}
				}
				
				System.out.println("\n\t "+srch+" element found "+cnt+" times in array");
				break;		
			}
			case 5:
			{
				System.out.print("\n\t How Many Numbers You want? for 1st array: ");
				n=sc.nextInt();
				
				arr = new int[n];
				
				System.out.print("\n\t Enter "+n+" Numbers : ");
				for(i=0;i<n;i++)
					arr[i]=sc.nextInt();				
				
				System.out.print("\n\t How Many Numbers You want? for 2nd array: ");
				l=sc.nextInt();
				
				arr2 = new int[l];
				
				System.out.print("\n\t Enter "+l+" Numbers : ");
				for(i=0;i<l;i++)
					arr2[i]=sc.nextInt();
				
				s=(l+n)-1;
				
				arr3 = new int[s];
				
				for(i=0;i<n;i++)
				{
					for(j=0;j<l;j++)
					{								
						if(arr[i]==arr2[j])
						{
							c++;
							for(k=c-2;k<c-1;k++)
							{						
								arr3[k]=arr[i];
							}
						}
					
					}
				}
				
				System.out.println("\n\t Intersection of Two Array is : ");
					for(i=0;i<c-1;i++)
						System.out.println("\n\t"+arr3[i]);
					break;
			}
			case 6:
			{
				System.out.print("\n\t How Many Numbers You want? for 1st array: ");
				n=sc.nextInt();
				
				arr = new int[n];
				
				System.out.print("\n\t Enter "+n+" Numbers : ");
				for(i=0;i<n;i++)
					arr[i]=sc.nextInt();				
				
				System.out.print("\n\t How Many Numbers You want? for 2nd array: ");
				l=sc.nextInt();
				
				arr2 = new int[l];
				
				System.out.print("\n\t Enter "+l+" Numbers : ");
				for(i=0;i<l;i++)
					arr2[i]=sc.nextInt();
				
				s=l+n;
				
				arr3 = new int[s];
				
				for(i=0;i<n;i++)
				{														
					for(k=c-1;k<c;k++)
						{						
							arr3[k]=arr[i];
						}						
					c++;
				}
				
				for(i=0;i<l;i++)
				{
					for(k=c-1;k<c;k++)
						{						
							arr3[k]=arr2[i];
						}						
					c++;
				}
				for(i=0;i<c-1;i++)
					{	
						for(j=i+1;j<c-1;j++)
						{	
							if(arr3[i]==arr3[j])
							{					
								c--;
								for(k=j;k<c-1;k++)
								{
								arr3[k]=arr3[k+1];
								}
								j--;
							}
						}			
					}
				for(i=0;i<c-1;i++)
					for(j=i+1;j<c-1;j++)
					{
						if(arr3[i]>arr3[j])
						{
							temp=arr3[i];
							arr3[i]=arr3[j];
							arr3[j]=temp;					
						}
					}	
				System.out.println("\n\t Union of Two Array is : ");
					for(i=0;i<c-1;i++)
						System.out.println("\n\t"+arr3[i]);
					break;
			}
			case 7:
			{
				System.exit(0);
			}
		}
	  }
	}
}