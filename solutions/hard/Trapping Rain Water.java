// Title: Trapping Rain Water
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/trapping-rain-water/

        }
            right_max[i] = Math.max(height[i], right_max[i+1]);
        for(int i=n-2; i>=0; i--){
        right_max[n-1] = height[n-1];
        int right_max[] = new int[n];
        }
            left_max[i] = Math.max(height[i], left_max[i-1]);
        for(int i=1; i<n; i++){
        left_max[0] = height[0];
        int water = 0;
        for(int i=0; i<n; i++){
            int x = Math.min(left_max[i], right_max[i]);
            water += x-height[i];
        }
