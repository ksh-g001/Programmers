class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val hashSet = win_nums.toHashSet()
        var min = 0
        var cnt = 0

        for(i in lottos){
            if(i==0){
                cnt++
            }
            else{
                if(hashSet.any { it==i })
                    min++
            }
        }

        answer=answer.plus(findRanking(min+cnt))
        answer=answer.plus(findRanking(min))
        return answer
    }
    
    fun findRanking(colect : Int) : Int {
        return when(colect){
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }
}