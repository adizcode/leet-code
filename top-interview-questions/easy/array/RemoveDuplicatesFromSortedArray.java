class Solution {
    public int removeDuplicates(int[] nums) {
        
        // Edge case
        if (nums.length == 0) {
            return 0;
        }
        
        // 2 Pointers Approach
        // i tracks the last unique number
        // j finds the next unique number
        
        int i = 0;
        int j = 1;
        
        while (j < nums.length) {
            
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
            
            j++;
        }
        
        return i + 1;
    }
}
