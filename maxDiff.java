import java.util.*;
class maxDiff{
	public static int ArrayChallenge(int[] arr){
		int diff = Integer.MIN_VALUE;
		int n = arr.length;
		int max_so_far = arr[n-1];
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > max_so_far) {
				max_so_far = arr[i];
			}
			else {
				diff = Integer.max(diff, max_so_far);
			}
		}
		return diff;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print(ArrayChallenge(arr));
	}
}
