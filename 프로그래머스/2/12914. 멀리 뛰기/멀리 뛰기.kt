class Solution {
    fun solution(n: Int): Long {
        var answer : Long = 0
        answer = fibonacci(n)
        return answer%1234567
    }

    fun fibonacci(n: Int) : Long {
        var result : Long = 2
        var fibo = mutableListOf<Long>(1,2,3)
        when(n){
            1-> result = 1
            2-> result = 2
            3-> result = 3
            else->{
                for (i in 2..n-1){
                   fibo.add((fibo[i-1]+fibo[i])%1234567)
                }
                result = fibo[n-1]
            }
        }

        return result
    }
}