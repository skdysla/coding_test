class Solution {
    public int solution(int n) {
        int count = 1;
        boolean chk;
        
        long num = (long)n;
        
        for(long i = 3; i <= num; i+=2){
            chk = false;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    chk = true;
                    break;
                }
            }
            if(chk == false)
                count++;
        }
        
        return count;
    }
}