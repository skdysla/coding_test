class Solution {
    public long solution(long n) {
        long answer = 0;
        boolean chk = false;
        
        for(long i = 1; i * i <= n; i++){
            if(n == i * i){
                answer = ((i+1) * (i+1));
                chk = true;
            }
        }
        
        if(!chk){
            answer = -1;
        }
        
        return answer;
    }
}
