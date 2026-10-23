// ==========================================================
// 1768. Merge Strings Alternately
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 1 ms (Beats 96%)
// Memory     : 42.5 MB (Beats 96%)
// Link       : https://leetcode.com/problems/merge-strings-alternately/
// ==========================================================

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        StringBuilder ans=new StringBuilder();
        int j=0;
        int n=word1.length();
        int m=word2.length();
        while(i<n||j<m){
            if(i<n){
                ans.append(word1.charAt(i));
            }
            if(j<m){
                ans.append(word2.charAt(j));
            }
            i++;
            j++;
        }
        return ans.toString();
    }
}