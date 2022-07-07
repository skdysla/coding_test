class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        long n = (long) num;
        
        if(n == 1){
            return 0;
        }
        
        while(count < 500){
            if(n == 1){
                break;
            }else if(n % 2 == 0){
                n /= 2;
            }else if(n % 2 != 0){
                n = (n * 3) + 1;
            }
            count++;
        }
        
        if(count <= 500 && n == 1){
            answer = count;
        }else{
            answer = -1;
        }
        return answer;
    }
}