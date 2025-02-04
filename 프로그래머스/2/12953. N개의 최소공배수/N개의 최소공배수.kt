class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr[0]
        for (i in 1..arr.lastIndex){
            answer = lcm(answer, arr[i])
        }
        return answer
    }

    private fun gcd(x : Int, y: Int) : Int = if(y == 0) x else gcd(y, x%y)

    private fun lcm(x : Int, y: Int) : Int = (x*y)/gcd(x, y)
}