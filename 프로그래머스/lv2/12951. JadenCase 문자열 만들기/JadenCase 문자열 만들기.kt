class Solution {
    fun solution(s: String): String {
        var answer = ""
        s.split(" ").map {
            if(it.isEmpty()) {
                answer += " "
            }
            else{
                answer += it[0].uppercase() + it.subSequence(1, it.length).toString().lowercase() + " "
            }
        }
        
        answer = answer.dropLast(1)
        
        return answer
    }
}