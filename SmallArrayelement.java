import java.util.*;
class SmallArrayelement 
{
	public static void main(String[] args) 
	{
		SmallArrayelement ao= new SmallArrayelement();
		int arr[]=ao.readArr();
		System.out.println("Enter the elements are");
		ao.display(arr);
		int k=ao.getssmallElements(arr);
		System.out.println("Small Array Element is "+ k);
	}


	// read the array elemets
		int[] readArr() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Size of the array");
			int n= sc.nextInt();
			int arr[]= new int[n];
			System.out.println("Enter the Elements of the Array");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			return arr;
		}
		void display(int ele[]) {
			for(int i=0; i<ele.length; i++) {
				System.out.print(ele[i]);
				if(i<ele.length-1) {
					System.out.print(",");
				}
			}
		}
		public int getssmallElements(int arr[]) {
			int smallele=arr[0];
			for (int i=0;i<arr.length;i++) 
			{
				if(arr[i] <smallele) {
					smallele=arr[i];
				}
			}
			return smallele;

		}


}
