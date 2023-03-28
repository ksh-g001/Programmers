class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
		
		if(length!=4 && length!=6)
		{	
			answer = false;
			return answer;
		}
		
		answer = s.matches("[+-]?\\d*(\\.\\d+)?");
        
        
        return answer;
    }
}