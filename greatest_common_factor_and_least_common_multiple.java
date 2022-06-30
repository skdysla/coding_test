class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int g_c_f = 1, l_c_m = 0;
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0 && m % i == 0){
                g_c_f = i;
            }
        }
        l_c_m = g_c_f * (n / g_c_f) * (m / g_c_f);
        
        answer[0] = g_c_f;
        answer[1] = l_c_m;
        return answer;
    }
}