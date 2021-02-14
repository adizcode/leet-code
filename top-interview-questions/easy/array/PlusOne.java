class Solution {
    public int[] plusOne(int[] digits) {
        
        // Standard Addition Approach
        // Add 1 to the LSD (Least Significant Digit), and carry over 1 if needed
        
        
        // Flag to check for overflow
        boolean needExtraDigit = false;
        
        
        // Traverse array from the back
        for (int i = digits.length - 1; i >= 0; i--) {
            
            // Increment the digit
            digits[i]++;
            
            // Make sure the digit's value does not exceed 9
            digits[i] %= 10;
            
            // If digit is not 0, break out of the loop
            if (digits[i] != 0) {
                break;
            }
            
            // If digit is 0, repeat the process on previous index (to carry over the 1)
            // In case, digit is 0 and there is no previous index, update the overflow flag
            else if (i == 0) {
                needExtraDigit = true;
            }
        }
        
        // In case of overflow
        if (needExtraDigit) {
            
            // Allocate a new array with n + 1 digits, set the MSD to 1 and copy over rest of the digits
            int[] moreDigits = new int[digits.length + 1];
            
            moreDigits[0] = 1;
            
            for (int i = 1; i < moreDigits.length; i++) {
                moreDigits[i] = digits[i - 1];
            }
            
            // Return the new array
            return moreDigits;
        }
        
        
        // Otherwise, return the modified digits array
        return digits;
    }
}
