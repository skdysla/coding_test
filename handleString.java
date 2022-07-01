class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        String tmp = s.replaceAll("[^0-9]", "");
        int length = s.length();
        
        if((length == 4 || length == 6) && s.equals(tmp)){
            answer = true;
        }
        
        return answer;
    }
}