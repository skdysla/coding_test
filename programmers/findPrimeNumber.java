import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int cnt = 0;
        int isPrime[] = new int[n+1];
        Arrays.fill(isPrime, 1);
        
        isPrime[0] = isPrime[1] = 0;
        for(int i = 2; i * i <= n; i++){
            if(isPrime[i] == 1)
                for(int j = i * i; j <= n; j+=i)
                    isPrime[j] = 0;
        }
        
        for(int i : isPrime)
            if(i == 1)
                cnt++;
        
        return cnt;
    }
}