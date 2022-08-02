import java.util.*;
class Prime 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		
		System.out.println("Enter the prime numners 1 to"+n);
		for(int i=1; i<=n;i++) 
			{
			boolean isprime= true;
			for(int j=2; j<i; j++) 
				{
				if(i%j==0)
					{
				isprime=false;
				break;
			}
		}
		if(isprime) 
			System.out.println( "prime Numbers " + i);
			}
		System.out.println("Hello World!");
	}
}
