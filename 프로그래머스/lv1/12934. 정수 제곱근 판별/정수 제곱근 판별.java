import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = 0;
		long x = (long)Math.sqrt(n);
		
		if((long)Math.pow(x,2)==n)
        {
            x++;
			answer = (long)Math.pow(x, 2);
        }
		else
        {
			answer = -1;
        }
		
		return answer;
    }
}