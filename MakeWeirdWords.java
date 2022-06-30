class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        int idx = 0;
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        } 
        return answer;

        // String result = "";
        // String[] words_arr = s.split(" ", -1);
        
        // for(int i = 0; i < words_arr.length; i++){
        //     for(int j = 0; j < words_arr[i].length(); j++){
        //         if(j % 2 == 0){
        //             result += Character.toUpperCase(words_arr[i].charAt(j));
        //         }else{
        //             result += Character.toLowerCase(words_arr[i].charAt(j));
        //         }
        //     }
        //     if(i != words_arr.length - 1) result += " ";
        // }
        // return result;
    }
}