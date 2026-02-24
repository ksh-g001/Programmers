class Solution {
    fun solution(s: String): IntArray {
        val answer: IntArray = IntArray(s.length) {-1}
        val alpabetMap = HashMap<Char, Int>()
        s.forEachIndexed { index, char->
            if(alpabetMap[char] == null){
                alpabetMap[char] = index
            }else{
               val dist = index - alpabetMap.getOrDefault(char, 0)
                answer[index] = dist
                alpabetMap[char] = index
            }

        }
        return answer
    }
}