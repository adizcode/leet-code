class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // One-Pass HashMap Approach
        
        // HashMap to store traversed numbers and their indices
        Map<Integer, Integer> numIndices = new HashMap<>();
        
        // Array to store the result
        int[] result = new int[2];
        
        // Go through the nums array once
        for (int i = 0; i < nums.length; i++) {
            
            // Calculate the difference between target and the current number
            int complement = target - nums[i];
            
            // The difference equals a previously stored number
            if (numIndices.containsKey(complement)) {
                
                // Update the result array, and break out of the loop
                result[0] = i;
                result[1] = numIndices.get(complement);
                break;
            }
            
            // Otherwise simply add this number to the HashMap and move on
            numIndices.put(nums[i], i);
        }
        
        // Output
        return result;
    }
}
