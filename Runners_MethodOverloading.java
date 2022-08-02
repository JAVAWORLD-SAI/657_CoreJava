class Runners_MethodOverloading 
{
	static void m1() {
		System.out.println("Static m1  non parametormethod");
		m1(10);
	}
	static void m1(int a) {
		System.out.println("Static m2 Method parameter");
	}
	public static void main(String[] args) 
	{
		m1();
		m1(5);
	}
}
