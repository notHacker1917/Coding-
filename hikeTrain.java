import java.util.*;
class hikeTrain {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(noClimb(n));
    }
    static int stairsClimb(int n){
        if(n<=1)
            return n;
        return stairsClimb(n-1)+stairsClimb(n-2);
        }
    static int noClimb(int n){
        return stairsClimb(n+1);
    }
}
