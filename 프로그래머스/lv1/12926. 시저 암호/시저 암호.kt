class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        var char : Char

        for(c in s){
            if(c == ' '){
                answer += c
            } else{
                if(c.isUpperCase()) {
                    char = ((c.code + n-'A'.code)%26 + 'A'.code).toChar()
                    answer += char
                }else{
                    char = ((c.code + n-'a'.code)%26 + 'a'.code).toChar()
                    answer += char
                }
            }
        }
        return answer
    }
}