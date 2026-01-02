/* 
Leetcode : 66
https://leetcode.com/problems/plus-one/description/?envType=daily-question&envId=2026-01-01


*/



class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i>=0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int newDigits[] = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    
}