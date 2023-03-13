class Solution {
    fun solution(s: String): String {
        var answer = ""
    var l = 1
    var list = s.split(" ")

    for(i in list.indices){
        l=1
        for (j in list[i]) {
            if(l % 2 == 0){
                answer+= j.toLowerCase()
            }
            else{
                answer+=j.toUpperCase()
            }
            l++
        }
        if(i != list.lastIndex)
            answer+=" "

    }

    return answer
    }
}