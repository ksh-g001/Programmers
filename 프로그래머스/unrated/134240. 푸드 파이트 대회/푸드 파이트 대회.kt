class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        var halfArray = ""
        for (i in 0..food.lastIndex){
            if(i == 0)
                continue
            else{
                for(j in 0 until (food[i]/2))
                    halfArray += i
            }
        }
        answer += halfArray + "0" + halfArray.reversed()

        return answer
    }
}