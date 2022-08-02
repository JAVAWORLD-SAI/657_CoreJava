import java.util.*;
class Sum1ton 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the  number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum= sum+i;
		}
		System.out.println("Hello World!" + sum);
	}
}
