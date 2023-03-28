class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        answer = new int[2];
        
        if(m%n == 0)
        {
            answer[0] = n;
            answer[1] = m;
            return answer;
        }
        
        for(int i = n-1; i>0; i--)
            if(m%i == 0 && n%i == 0){
                answer[0]=i;
                break;
            }
        int i = 1;
        
        while(true){
            int j = m*i;
            if(j%n == 0 ){
                answer[1]=j;
                break;
            }
            i++;
        }
        return answer;
    }
}