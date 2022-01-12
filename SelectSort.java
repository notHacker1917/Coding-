import java.util.*;
class SelectSort{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();int swap=0,compare=0;
    while(t!=0){
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      for(int i= 0;i<n-1;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
          if(arr[j]<arr[min])
          swap++;
          min=j;
          int temp=arr[min];
          arr[min]=arr[i];
          arr[i]=temp;
          compare++;
        }
      }
      for (int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      System.out.println("comparisons="+compare);
      System.out.println("Swap="+swap);
    t--;
    }
  }
}
