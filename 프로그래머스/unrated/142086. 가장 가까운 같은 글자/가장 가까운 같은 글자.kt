class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var hashMap = HashMap<Char, Int>()


        for(i in s.indices){
            var c = s[i]

            if(hashMap[c] == null){
                answer = answer.plus(-1)
                hashMap[c] = i
                continue
            }
            answer = answer.plus(i- hashMap[c]!!)
            hashMap[c] = i
        }
            return answer
    }
}