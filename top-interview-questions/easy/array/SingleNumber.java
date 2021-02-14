class Solution {
    public int singleNumber(int[] nums) {
        
        // Bit Manipulation Approach
        // a ^ 0 = a
        // a ^ a = 0
        // Therefore, a ^ b ^ a = (a ^ a) ^ b = b
        
        int a = 0;
        
        for (int num : nums) {
            a ^= num;
        }
        
        return a;
        
    }
}
