// Title: Valid Palindrome
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/valid-palindrome/

            while(right > left && !Character.isLetterOrDigit(s.charAt
                right--;
            }
            }
            (right))){
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase
            (s.charAt(right))){
                return false;
            }
        }
        return true;
        
            left++; right--;
