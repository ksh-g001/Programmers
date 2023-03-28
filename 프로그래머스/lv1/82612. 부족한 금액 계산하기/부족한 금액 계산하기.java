class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sub = money;
        
        for(long i=1; i<=count; i++)
        {
        	sub-=price*i;
        }
        
        if(sub>0)
            return answer;
            
        answer -= sub;   
        return answer;
    }
}