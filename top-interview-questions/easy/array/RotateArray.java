class Solution {
    public void rotate(int[] nums, int k) {
        
        // Brute Force Approach
        
        // Calculate required rotations
        int rotateCount = k % nums.length;
        
        
        // Rotate array rotateCount times by 1 step
        for (int i = 0; i < rotateCount; i++) {
            
            // Store value of the last element
            int last = nums[nums.length - 1];
            
            // Copy value from previous indices to next indices
            for (int j = nums.length - 1; j > 0; j--) {
                
                nums[j] = nums[j - 1];
            }
            
            // Place the last element at the front
            nums[0] = last;
        }
    }
}
