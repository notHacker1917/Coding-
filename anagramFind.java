import java.util.*;
class anagramFind{
    static boolean compare(char arr1[], char arr2[]){
      int MAX = 256;
        for (int i = 0; i < MAX; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }
    static void search(String pat, String txt){
        int MAX = 256;
        char countP[] = new char[MAX];
        char countTW[] = new char[MAX];
        for (int i = 0; i <pat.length(); i++){
            (countP[pat.charAt(i)])++;
            (countTW[txt.charAt(i)])++;
        }
        for (int i = pat.length(); i < txt.length(); i++){
            if (compare(countP, countTW))
                System.out.println(i - pat.length());
            (countTW[txt.charAt(i)])++;
            countTW[txt.charAt(i-pat.length())]--;
        }
        if (compare(countP, countTW))
            System.out.println(txt.length() - pat.length());
    }
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      String txt= sc.nextLine();
      String pat= sc.nextLine();
      search(pat, txt);
    }
}
