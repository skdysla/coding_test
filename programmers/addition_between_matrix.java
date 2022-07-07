class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int[arr1.length][];
        
        for(int r = 0; r < arr1.length; r++){
            answer[r] = new int[arr1[r].length];
            for(int c = 0; c < arr1[r].length; c++){
                answer[r][c] = arr1[r][c] + arr2[r][c];
            }
        }
        return answer;
    }
}