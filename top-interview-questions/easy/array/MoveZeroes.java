class Solution {
    public void moveZeroes(int[] nums) {
        
        // 2 Pointers Approach
        
        // One pointer points to the foremost zero
        // Another points to the foremost non-zero
        // Keep swapping until all zeroes have moved to the back, and all non-zeroes have moved to the front (in their relative order)
        
        // Find the foremost zero's index
        int foremostZero = 0;
        
        while (nums[foremostZero] != 0) {
            foremostZero++;
            
            // There are no zeroes
            if (foremostZero == nums.length) {
                return;
            }
        }
        
        // Foremost unsorted non-zero's index 
        // (All non-zeroes preceding the foremost zero are considered sorted)
        int foremostNonZero = foremostZero + 1;
        
        
        // Sort every unsorted non-zero
        while (foremostNonZero < nums.length) {
            
            // Make sure foremostNonZero does not point to a consecutive zero
            while (nums[foremostNonZero] == 0) {
                foremostNonZero++;
                
                // There are no unsorted non-zeroes left
                if (foremostNonZero == nums.length) {
                    return;
                }
            }
            
            // Swap the foremost zero and foremost non-zero (nearest to the front)
            swap(nums, foremostZero, foremostNonZero);
            
            // Move on to the next foremost zero and non-zero
            foremostZero++;
            foremostNonZero++;
        }
    }
    
    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
