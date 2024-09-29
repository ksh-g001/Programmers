class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var key = 0

        when(n){
            0 ->{return answer}
            1 ->{return ++answer}
            2 ->{ answer = 3
                return answer}
            else ->{}
        }
        
        answer = 1 + n

        for(i in 2..n-1){
            if(n%i == 0){
                answer+=i
                key = n/i

                if(key == 2){
                    break
                }
            }
        }

        return answer
    }
}