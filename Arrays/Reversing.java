class Reversing 
{
	public static void main(String[] args) 
	{
		int arr[]={24,45,36,21,32};
		int n= arr.length;
		for(int l : arr){
		System.out.println(l);
		}
		System.out.println("length of the array  " + n);
			int temp;
		for(int i=0;  i<n/2; i++) {
			temp=arr[i];
			arr[i]= arr[n-i-1];
			arr[n-i-1]= temp;
		}
		System.out.println("after reversing");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
