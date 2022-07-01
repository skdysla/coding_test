import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String result = "";
        
        if(n < 1 || n > 26){
            return null;
        }
        
        char[] tmp = s.toCharArray();
        
        for(int i = 0; i < tmp.length; i++){
            int num = (int)(tmp[i] + n);
            if(num == 32){
                continue;
            }else if(num > 90 || num > 122){
                tmp[i] = (char)(num - 26);
            }else{
                tmp[i] = (char)num;
            }
        }
        
        for(char t : tmp){
            if((int)t == 10){
                result += " ";
            }
            else{
                result += t;
            }
        }
        
        return result;
    }
}
