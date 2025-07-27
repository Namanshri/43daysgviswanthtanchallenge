import java.util.*;
class Solution {
    public static boolean isPalindrome(String s) {
        int a = s.length();
        int b = (int) a;
        String s_new = "";
        for (int i =0;i<a;i++){
            if (97<= (int)(s.charAt(i)) && 122>=(int)(s.charAt(i))){
                s_new+=s.charAt(i);
            }
            else if((int)(s.charAt(i))>=65 && (int)(s.charAt(i))<=90){
                s_new = s_new + (char)((int)(s.charAt(i))+32);
            }
            else if((int)(s.charAt(i))<=57 && (int)(s.charAt(i))>=48){
                s_new +=s.charAt(i);
            }
        }

        int i = 0;
        int j = s_new.length()-1;
        boolean pflag = true;
        for(int x =0;x<=j;x++){
            if(s_new.charAt(i)!=s_new.charAt(j)){
                pflag = false;
            }
            i++;
            j--;
        }  
        return pflag; 
    }

 public static void main(String []args){
        isPalindrome("Hello");
    }
}