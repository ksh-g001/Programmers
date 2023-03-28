class Solution {
    public int solution(int num) {
        int answer = 0;
        
        for(int i=0; i<=500; i++)
        {
            if(num==1)
            {    
                answer = i;
                return answer;
            }
            else if(num%2==0)
            {
                num/=2;
            }
            else if(num%2==1)
            {
                num*=3;
                num++;
            }
        }
        
        answer = -1;
        
        return answer;
    }
}