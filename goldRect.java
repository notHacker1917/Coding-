import java.util.*;
class goldRect{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();int c=0;
    while(t!=0){
      double w=sc.nextInt();
      double h=sc.nextInt();
      if(w>h){
        if(w/h>=1.6 && w/h<=1.7){
          c=c+1;
        }
      }else{
        if( h/w>=1.6 && h/w<=1.7){
          c=c+1;
        }
      }
      t--;
    }
    System.out.println(c);
  }
}
