// Title: Palindrome Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/palindrome-number/

        if(x<0){
            return false;
        }
        while(x!=0){
        int rev = 0;
            rev = (rev*10) + (x % 10);
            x /= 10;
        }
        return org == rev;
        int org = x;
    public boolean isPalindrome(int x) {
class Solution {
