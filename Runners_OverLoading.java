class Runners_OverLoading 
{
	public static void main(String args) 
	{
		System.out.println("main (String)");
	}
	public static void main(String[] args) {
		System.out.println("main (String [])");
		main("abc");
		main(new int[5]);
		main(5);
	}

	public static void main(int args) {
		System.out.println("main (int [])");
	}

	public static void main(int[] args) {
		System.out.println("main new int[]");
	} 
}
