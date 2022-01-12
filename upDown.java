import java.util.*;
class upDown{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      for(int k=n-1;k>i;k--){
        System.out.print(" ");
      }
      for(int j=0;j<=i;j++){
        System.out.print(" *");
      }
      System.out.println();
    }
    for(int i=0;i<n;i++){
      for(int k=0;k<=i;k++){
        System.out.print(" ");
      }
      for(int j=n-1;j>i;j--){
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}
