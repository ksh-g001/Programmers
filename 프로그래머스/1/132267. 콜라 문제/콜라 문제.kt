class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var remain = n
        var new = 0

        while (remain>=a){
            new = (remain/a) *b
            answer +=new
            remain = new + (remain%a)
            println("answer : $answer\tremain : $remain")
        }
        return answer
    }
}

