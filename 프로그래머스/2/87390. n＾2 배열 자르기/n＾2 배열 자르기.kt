import kotlin.math.max

class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var answer: IntArray = intArrayOf()
        val array = mutableListOf<Int>()

        for (cnt in  left..right){
            val quotient = cnt/n
            val remainder = cnt%n
            val e = max(quotient, remainder)
            array.add(e.toInt()+1)
        }

        answer = answer.plus(array)
        return answer
    }
}