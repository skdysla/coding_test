class Solution {
    public int solution(int n) {
        int total = 0;
        
        while(n > 0){
            total += n % 10;
            n /= 10;
        }

        return total;
    }
}