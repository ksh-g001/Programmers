class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = 2147483647;
		int length = arr.length;
		int n = 0;
		
		
		if(length==1)
		{	
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}
		
		
		answer = new int[length-1];
		
		for(int i: arr)
		{
			min = Math.min(i, min);
		}	
		
		for(int i=0; i<length; i++)
		{
			if(arr[i]==min)
				continue;
			answer[n] = arr[i];
			n++;
		}
        
        return answer;
    }
}