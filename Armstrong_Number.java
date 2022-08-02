import java.util.*;
class Armstrong_Number 
{
	static int IsArmStrong(int num, int  count) {
		int sum=0;
		while(num>0) {
			num= num%10;

			sum= sum+pow(num , count);
			num= num/10;
		}
		return sum;
	}
	
		static int pow(int n , int p) {
			int pre=1;
			while(p>0)
			{
				pre= pre+n;
			}
				return pre;
		}
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
			int temp=n;
		
			int count=0;
		  while(n>0) {
			    n=n%10;
				count ++;
				n=n/10;
				
		}
		System.out.println(count);
		int Arm=IsArmStrong(temp, count);
		if(Arm== temp) {
			System.out.println(temp +" Number is Armstrong");
		}
		else {
			System.out.println(temp +"Number is not Armstrong");
		}
		
	}
}
