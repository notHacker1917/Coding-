import java.util.*;
class vPatt{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();int temp=1;
    temp=n;
    for(int i=n;i>=1;i--){
      for(int j=n;j>=i;j--){
        System.out.print(" ");
      }
      for(int k=1; k<=2*i; k++){
        if(k==1 || k==2*i-1)
          System.out.print((char)(temp+64));
        else
          System.out.print(" ");
        }
     temp--;
     System.out.println(" ");
   }
  }
}
