class Solution {
    public String solution(String s) {
        String[] intArr = s.split(" "); 
        int min, max;
        min = max = Integer.parseInt(intArr[0]);
        
        for(int i = 1; i < intArr.length; i++){
            int tmp = Integer.parseInt(intArr[i]);
            if(min > tmp)
                min = tmp;
            if(max < tmp)
                max = tmp;
        }
        
        return min + " " + max;
    }
}