import java.util.*;
class Iterative{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++){
			A[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int index = binarySearch(A,n, key);

		if (index != -1) {
			System.out.println("Element found at index " + index);
		} else {
			System.out.println("Element not found in the array");
		}
	}
	public static int binarySearch(int A[],int n,int x){
       int low = 0, high = n - 1;
		while (low <= high){
			int mid = (low + high) / 2;
			if (x == A[mid]) {
				return mid;
			}
			else if (x < A[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
