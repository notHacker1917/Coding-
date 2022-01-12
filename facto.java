//Recursion
class facto{
  public static int fact(int n){
    if(n==0){
      return 1;
    }
    int ans=fact(n-1);
    return n*ans;
  }
  public static void main(String args[]){
    int n=3;
    int temp=fact(n);
    System.out.println(temp);
  }
}
