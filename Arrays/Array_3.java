class Array_3 
{
	public static void main(String[] args) 
	{
		int a[]={3, 1, 2, 5, 4};
		sum(a);
		
	}
	public static void sum(int a[]) {
		
		int total=0;

		for(int num : a) {
			
			total=total+num;
					}
					System.out.println(total);
	}
}
