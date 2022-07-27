import java.math.*;

class Solution {
    public long solution(long price, long money, long count) {
        long p = price;
        long m = money;
        long c = count;
        
        for(long l = 1; l <= c; l++){
            m -= (p * l);
        }
        
        if(m < 0)
            return -m;
        return 0;
    }
}