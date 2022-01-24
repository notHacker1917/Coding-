import java.util.*;
class postfix{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();

      System.out.println(postFix(str));
  }
  static int postFix(String str){
    Stack<Integer> stack=new Stack<>();
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      if(Character.isDigit(c))
        stack.push(c - '0');
      else{
        int val1 = stack.pop();
        int val2 = stack.pop();
        switch(c){
          
        case '+':
          stack.push(val2+val1);
          break;
        case '-':
          stack.push(val2- val1);
          break;
        case '/':
          stack.push(val2/val1);
          break;
        case '*':
          stack.push(val2*val1);
          break;
        }
      }
    }
    return stack.pop();
  }
}
