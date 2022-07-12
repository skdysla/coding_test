class Solution {
    public String solution(int a, int b) {
        if(a < 1 || a > 12)
            return null;
        
        int dayList[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String dayOfWeekList[] = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int month = a - 1;
        int mDay = dayList[month];
        
        if(b > mDay)
            return null;
        
        int total = 0;
        for(int i = 0; i < month; i++){
            total += dayList[i];
        }
        total += b;
        
        return dayOfWeekList[total % 7];
    }
}