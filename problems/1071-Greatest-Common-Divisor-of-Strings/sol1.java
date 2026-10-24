// ==========================================================
// 1071. Greatest Common Divisor of Strings
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 91%)
// Memory     : 42.9 MB (Beats 97%)
// Link       : https://leetcode.com/problems/greatest-common-divisor-of-strings/
// ==========================================================

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int a=str1.length();
        int b=str2.length();
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return str1.substring(0,a);
    }
}