class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // Create an empty HashSet
        // A HashSet performs CRUD operations in O(1) constant time
        Set<Integer> numSet = new HashSet<>();
        
        // Add each element to the set
        for (int num : nums) {
            
            // Element already exists in the set
            if (!numSet.add(num)) {
                return true;
            }
        }
        
        // No duplicate found
        return false;
    }
}
