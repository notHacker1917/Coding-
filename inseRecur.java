import java.util.*;
class inseRecur{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    gameOver(arr, arr.length);
    System.out.println(Arrays.toString(arr));
  }
  static void gameOver(int arr[], int n){
    if(n<=1)
      return;
    gameOver(arr,n-1);
    int temp=arr[n-1];
    int j=n-2;
    while(j>=0 && arr[j]>temp){
      arr[j+1]=arr[j];z
      j--;
    }
    arr[j+1]=temp;
  }
}
