class Runners_Fabonacci 
{
		
	public static void main(String[] args) 
	{
		 int a=0;
	     int b=1;
	     int c;
		 System.out.print(a+"  "+b);
	 for(int i=2; i<=10;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
	
	 }
	}
}
// output  0  1 1 2 3 5 8 13 21 34 55
