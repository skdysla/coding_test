class Solution {
    public String solution(String s) {
        String answer = "";
        
        int length = s.length();
        int idx = length / 2;
        
        if(length % 2 == 0)
            answer = s.substring(idx-1, idx+1);
        else
            answer = s.substring(idx, idx+1);
        
        return answer;
    }
}