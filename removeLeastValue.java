class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1){
            answer = new int[]{-1};
            return answer;
        }
        
        int least = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[least] > arr[i]){
                least = i;
            }
        }
        
        answer = new int[arr.length - 1];
        System.arraycopy(arr, 0, answer, 0, least);
        
        if(least != arr.length - 1){
            System.arraycopy(arr, least + 1, answer, least, arr.length - (least + 1));
        }

        return answer;
    }
}