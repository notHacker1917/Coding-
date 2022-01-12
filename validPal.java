import java.util.*;
class validPal{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int arr[]=sc.nextInt();
    if(arr==null || arr.length==0) {
      System.out.println("0");
    }
    int temp1=0,temp2=0,sum=0;
    int min=Integer.MAX_VALUE;
    while(temp2<arr.length) {
      sum=sum+num[temp2];
      if(sum>=s) {
        while (temp1<=temp2 && sum-arr[temp1]>=s) {
          sum=sum-num[temp1];
          temp1++;
        }
        min=Math.min(min,temp2-temp1+1);
        }
      temp2++;
    }
    if(min!=Integer.MAX_VALUE)
      System.out.println(min);
    else
      System.out.println("0");
  }
}
