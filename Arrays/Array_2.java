class Array_2 
{
	static int age[]={10,87,25,62};
	
				static int sum =0;
			    static 	int avg;

	public static void main(String[] args) 
	{
		System.out.println("age of index 0  " +age[0]);
		System.out.println("age of index 1  " +age[1]);
		System.out.println("age of index 2  " +age[2]);
		System.out.println("age of index 3  " +age[3]);


		System.out.println("////////////////////////////////");

		for(int i=0; i<age.length; i++) {
			System.out.println(age[i]);
		}
	
	System.out.println(age.length+ "  length");
		System.out.println("////////////////////////////////");

	for(int i=0; i<=age.length-1;  i++) {
		System.out.println(age[i]);
	}
		System.out.println("////////////////////////////////");
			System.out.println("For each loop");
		for(int num : age) {
			System.out.println(num);
		}
			System.out.println("sum and average");


				for(int num: age) {
					sum= sum+num;
				}

			  int length= age.length;

			 avg= sum/length;

 
			 	System.out.println("Sum "+ sum);
				System.out.println("avg  "+ avg);

	}
}
