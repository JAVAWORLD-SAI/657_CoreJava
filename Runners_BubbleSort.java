import java .util.*;
public class Runners_BubbleSort {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                //int arr[] ={3,60,35,2,45,320,5};  
              Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Size of the array");
			int n= sc.nextInt();
			int arr[]= new int[n];
			System.out.println("Enter the Elements of the Array");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}