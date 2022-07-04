class Solution {
    public long solution(int a, int b) {
        long total = 0;
    
        for(int i = (a < b? a : b); i <= (a > b? a : b); i++){
            total += i;
        }
        
        return total;
    }
}