class Runner_static_Nonstatic 
{

	void m1() {  // non static method  it gets memeory when create object using new keyword
		System.out.println("Non-Static method");  
	}
	static void m2() {
		System.out.println("static method");
	}
	public static void main(String[] args) 
	{
		Runner_static_Nonstatic  RsN=new Runner_static_Nonstatic();  // new keyword creates memory no of times  (Object)
			Runner_static_Nonstatic  RsN1=new Runner_static_Nonstatic(); //(Object)
		RsN.m1();
		RsN1.m1();
		Runner_static_Nonstatic.m2();
		m2();
		System.out.println("Hello World!");
	}
}
