import java.util.*;
class sliding{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    System.out.println(maxSum(n,arr,k));
  }
  static int maxSum(int n,int arr[],int k){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n-k+1;i++) {
      int temp=0;
      for(int j=0;j<k;j++)
        temp=temp+arr[i+j];
        max=Math.max(temp,max);
      }
    return max;
  }
}
  
