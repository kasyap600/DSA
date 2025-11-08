class Solution {
    public int totalMoney(int n) {
        int week = n / 7; 
        int day = n % 7; 
        
        return (week * (49 + 7 * week) + day * (2 * week + day + 1)) / 2;
    }
}