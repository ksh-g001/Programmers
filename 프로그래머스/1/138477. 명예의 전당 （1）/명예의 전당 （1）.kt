class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: MutableList<Int> = mutableListOf()
        val honorList = MutableList(k){-1}

        score.forEach {
            insertSort(honorList, it, answer)
        }

        return answer.toIntArray()
    }

    fun insertSort(honorList: MutableList<Int>, new : Int, answer : MutableList<Int>) {
        for (i in honorList.indices){
            if (honorList[i] < new){
                honorList.add(i, new)
                honorList.removeLast()
                val notMinus = honorList.filter { it>-1 }
                answer.add(notMinus.last())
                return
            }
        }
        val notMinus = honorList.filter { it>-1 }
        answer.add(notMinus.last())
    }
}