class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0

        for (i in 0 until t.length){
            if (i+p.length > t.length)
                break

            if (t.subSequence(i, i+p.length).toString() <= p)
                answer++
        }

        return answer
    }
}