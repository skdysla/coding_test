class Solution {
    public long solution(long n) {
        long answer = 0;

        String[] tmp_arr = (n + "").split("");
        
        int max;
        for(int i = 0; i < tmp_arr.length - 1; i++){
            max = i;
            for(int j = i+1; j < tmp_arr.length; j++){
                if(Integer.parseInt(tmp_arr[j]) > Integer.parseInt(tmp_arr[max])){
                    max = j;
                }
            }
            String tmp = tmp_arr[i];
            tmp_arr[i] = tmp_arr[max];
            tmp_arr[max] = tmp;
        }
        
        String result = "";
        for(String t : tmp_arr){
            result += t;
        }
        
        answer = Long.parseLong(result);
       
        return answer;
    }
}
