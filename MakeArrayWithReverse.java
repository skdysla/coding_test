class Solution {
    public int[] solution(long n) {
        String[] tmp = String.valueOf(n).split("");
        int[] answer = new int[tmp.length];
        
        for(int i = 0; i < tmp.length; i++){
            answer[(tmp.length - 1) - i] = Integer.parseInt(tmp[i]);
        }
        
        return answer;
    }
}