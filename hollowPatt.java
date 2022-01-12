import java.util.*;
class hollowPatt{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();int temp=1;
    for(int i=1; i<=n; i++){
      for(int j=i; j<=n; j++){
        System.out.print(" ");
      }
     for(int k=1; k<=2*i; k++)
     {
       if(k==1 || k==2*i-1)
        System.out.print(temp);
       else
        System.out.print(" ");
     }
     temp++;
     System.out.println(" ");
   }
   temp=n-1;
   for(int i=n-1;i>=1;i--){
     for(int j=n;j>=i;j--){
       System.out.print(" ");
     }
     for(int k=1; k<=2*i; k++){
       if(k==1 || k==2*i-1)
        System.out.print(temp);
       else
        System.out.print(" ");
     }
     temp--;
     System.out.println(" ");
   }
  }
}
