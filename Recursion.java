class Recursion 
{
	static void  print(int n) {

		if(n>0) {
			print(n-1);
				System.out.print(" " +n);
		}
	}
	public static void main(String[] args) 
	{
		print(10);
		System.out.println("Hello World!");
	}
}
