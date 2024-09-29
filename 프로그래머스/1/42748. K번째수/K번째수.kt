class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        
        for (i in commands){
            val edited = array.copyOfRange(i[0]-1, i[1])
            if (edited.isEmpty()){
                answer = answer.plus(array[i[0]-1])
            }else{
                 edited.sort()
                answer = answer.plus(edited[(i[2]-1)])
            }
        }
        return answer
    }
}