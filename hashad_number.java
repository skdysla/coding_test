class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        String num = x + "";
        
        for(int i = 0; i < num.length(); i++){
            String tmp = num.substring(i, i+1);
            sum += Integer.parseInt(tmp);
        }
        
        if(x % sum != 0){
            answer = false;
        }
        
        return answer;
    }
}