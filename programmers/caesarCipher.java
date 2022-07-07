class Solution {
    public String solution(String s, int n) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;

        // char[] tmp = s.toCharArray();
        
        // for(int i = 0; i < tmp.length; i++){
        //     int num = (int)tmp[i];
        //     int num2 = (int)(tmp[i] + n);
        //     if((num >= 65 && num <= 90) && (num2 >= 65 && num2 <= 90)){
        //         tmp[i] = (char)num2;   
        //     }else if((num >= 97 && num <= 122) && (num2 >= 97 && num2 <= 122)){
        //         tmp[i] = (char)num2;   
        //     }else if(num == 32){
        //         continue;
        //     }else{
        //         tmp[i] = (char)(num2 - 26);
        //     }
        // }
        
        // result = String.valueOf(tmp).replace("\n", " ");
        // return result;
    }
}