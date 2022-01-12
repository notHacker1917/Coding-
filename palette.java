import java.uitl.*;
class palette{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[n+1];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int temp=0;
		arr[0]=1;
		for(int i=1;i<=n;i++){
			int fun1=i-m-1;
			int fun2=i-1;
			if(s>=0){
				temp=temp-arr[fun1];
			}
			temp=temp+arr[fun2];
			arr[i]=temp;
		}
		System.out.println(arr[n]);
	}
}
