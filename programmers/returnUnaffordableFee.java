import java.math.*;

class Solution {
    public long solution(long price, long money, long count) {
        long p = (long)price;
        long m = (long)money;
        long c = (long)count;
        
        for(long l = 1; l <= c; l++){
            m -= (p * l);
        }
        
        if(m < 0)
            return -m;
        return 0;
    }
}