import java.util.*;
class recuNatural{
  public static int natural(int n){
    if (n==1)
      return n;
      return natural(n);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
      System.out.println(natural(n));
  }
}
