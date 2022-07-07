class Solution {
    boolean solution(String s) {
        boolean chk = false;

        int pCnt = 0, yCnt = 0;
        char[] tmp = s.toLowerCase().toCharArray();
        
        for(int i = 0; i < tmp.length; i++){
            if(tmp[i] == 'p')
                pCnt++;
            else if(tmp[i] == 'y')
                yCnt++;
        }
        
        if(pCnt == yCnt || pCnt == 0 && yCnt == 0){
            chk = true;
        }

        return chk;
    }
}