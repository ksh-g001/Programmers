class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        int temp = 0;
            
        for(int i=0; i<sizes.length; i++)
                if(sizes[i][0]<sizes[i][1]){
                    temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
        
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0]>max1)
                max1=sizes[i][0];
            if(sizes[i][1]>max2)
                max2=sizes[i][1];
        }
        
        answer=max1*max2;
                
        return answer;
    }
}