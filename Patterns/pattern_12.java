
public class pattern_12
{  
    public static void main(String[] args) //driver function
    {
		for(int i=1; i<=5; i++) {
			
			for(int j=3; j>=i; j--) {
				System.out.print (" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	} 
}