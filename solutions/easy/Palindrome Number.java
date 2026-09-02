// Title: Palindrome Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/palindrome-number/

        while(x != 0){
            rev = (rev*10)+x%10;
        }
            x /= 10;

        }
        int rev = 0;
        if(x<0 || (x % 10==0 && x!=0)){
            return false;
class Solution {
    public boolean isPalindrome(int x) {
        int palindrome = x;
