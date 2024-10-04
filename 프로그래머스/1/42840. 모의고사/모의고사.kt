class Solution {
     fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        var firstScore = 0
        var secondScore = 0
        var thirdScore = 0

        val firstStudent = intArrayOf(1,2,3,4,5)
        val secondStudent = intArrayOf(2,1,2,3,2,4,2,5)
        val thirdStudent = intArrayOf(3,3,1,1,2,2,4,4,5,5)
        var cnt = 0

        if (answers.isEmpty())
            return intArrayOf(1,2,3)


        for (i in answers){
            if (firstStudent[cnt%5] == i)
                firstScore++

            if (secondStudent[cnt%8] == i)
                secondScore++
            
            if (thirdStudent[(cnt%10)] == i)
                thirdScore++
            cnt++
        }

        println("$firstScore\t$secondScore\t$thirdScore")
        val scores = intArrayOf(-1, firstScore, secondScore, thirdScore)
        val max = scores.maxOrNull() ?: 0
        answer = scores.indices.filter { scores[it] == max  }.toIntArray()
        return answer
    }
}