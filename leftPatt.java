import java.util.*;
class leftPatt{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      for(int k=n-1;k>i;k--){
        System.out.print("_");
      }
      for(int j=0;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
