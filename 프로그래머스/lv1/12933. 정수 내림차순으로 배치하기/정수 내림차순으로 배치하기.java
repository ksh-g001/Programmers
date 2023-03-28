import java.util.Arrays;
import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = 0;
        Integer [] list = {};
        int lenght = 0;
        
        for(long i=n; i>0; i/=10)
            lenght++;
        
        list = new Integer[lenght];
        
        for(int i=0; i<lenght; i++)
        {
            list[i] = (int)(n%10);
            n/=10;
        }
        
        Arrays.sort(list);
        
        for(int i=0; i<lenght; i++)
        {
            answer += (long)(Math.pow(10, i)*list[i]);
        }
        
        return answer;
    }
}