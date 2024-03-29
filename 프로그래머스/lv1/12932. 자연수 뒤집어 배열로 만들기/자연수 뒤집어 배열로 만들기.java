class Solution
{
	public int[] solution(long n)
	{
		int[] answer = {};
		int length = 0;
		
		for(long i=n; i>0; i/=10)
			length++;
		
		answer = new int[length];
		
		for(int i=0; i<length; i++)
		{
			answer[i] = (int) (n%10);
			n/=10;
		}
		
		return answer;
	}
}