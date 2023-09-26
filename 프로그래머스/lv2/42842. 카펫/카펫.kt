class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        val totalNum = brown + yellow
        for(h in 3 .. totalNum){
            if(totalNum % h == 0){
                val w = totalNum / h
                if((w-2)*(h-2) == yellow){
                    answer = answer.plus(intArrayOf(w, h))
                    break
                }
            }
        }

        return answer
    }
}