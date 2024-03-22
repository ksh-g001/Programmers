class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()

        photo.forEach { pt->
            var yearScore = 0
            pt.forEach { p->
                val index = name.indexOf(p)
                if(index != -1){
                    yearScore += yearning[index]
                }
            }
            answer = answer.plus(yearScore)
        }

        return answer
    }
}