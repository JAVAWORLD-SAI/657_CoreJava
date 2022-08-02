import java.util.*;
class Prime2 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		int i;
		if(n==1)
		{
			System.out.println("Prime numbers start form 2");
		}
		for(i=2; i<n; i++)
			if(n%i==0)
			{
				System.out.println("Not a prime Number " +n);
				break;
			}
			if(n==i)
				System.out.println("prime number "+ i);
		}
		}
