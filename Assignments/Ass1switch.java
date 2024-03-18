
class Ass1switch
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

        if(c>4)
		{
			System.out.printf("\n\t Invalid choice");
		}
		
		switch(c)
		{
			case 1:
			{
				System.out.println("\n\t Additon = "+(a+b));
				break;
			}
			case 2:
			{
				System.out.println("\n\t subtraction = "+(a-b));
				break;
			}
			case 3:
			{
				System.out.println("\n\t multiplication = "+(a*b));
				break;
			}
			case 4:
			{
				System.out.println("\n\t division = "+(a/b));
				break;
			}
			
		}
		
	}
}
