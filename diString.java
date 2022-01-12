import java.util.*;
class diString{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int len = sc.length();
        int[] res = new int[len+1];

        int min = 0, max = len, index = 0;
        for(char c: S.toCharArray()){
            if(c=='I'){
                res[index++] = min++;
            } else {
                res[index++] = max--;
            }
        }
        res[index] = max;
        return res;
      }
    }    
