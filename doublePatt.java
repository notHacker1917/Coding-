import java.util.*;
class doublePatt{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=n;i>=0;i--){
      for (int j=n;j>=i;j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }
    for(int i=1;i<=n;i++){
      for(int j=5;j>=i;j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
