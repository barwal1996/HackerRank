import java.util.*;
public class checkAnagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    static boolean isAnagram(String a ,String b){

        if(a.length()!=b.length()){
            return false;
        }

        a=a.toLowerCase();
        b=b.toLowerCase();

        int sum=0;
/*
Approach
the first for loop is used to select the characters from A to Z. Second nested for loop is 
used to find the occurence of the selected character in string A. If occurence of character
 is found in string A,sum is incremented.

Again if occurence of same character is found in string B, sum is decremented.

finally is sum is zero then they are anagrams.
*/
        for(char c = 'a';c<='z';c++){
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==c){
                    sum++;
                }
                if(b.charAt(i)==c){
                    sum--;
                }

            }
            if(sum!=0){
                return false;
            }
        }

        return true;
    }


}
