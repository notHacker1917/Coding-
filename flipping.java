import java.uitl.*;
class flipping{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int height=sc.nextInt();
    int n=height.length;
    if (n<=2)
      return 0;
    int lmax[]=new int[n];
    int temp=height[0];
    for(int i=1;i<n;i++){
      lmax[i]=temp;
      temp=Math.max(temp,height[i]);
    }
    int rmax[]=new int[n];
    temp=height[n-1];
    for(int i=n-2;i>=0;--i){
      rmax[i]=temp;
      temp=Math.max(temp,height[i]);
    }
    int sum=0;
    for(int i=1;i<n-1;i++){
      sum=sum+Math.max(0,Math.min(lmax[i],rmax[i])-height[i]);
    }
    return sum;
  }
}
