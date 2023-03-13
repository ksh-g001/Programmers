class Solution {
    fun solution(n: Int): Int {
        var num = n
    var result = emptyArray<Int>()
    var answer: Int = 0
    var minus = 0
    var multier = 1

    while(num > 0){
        minus = num%3
        result = result.plus(minus)
        num/= 3
    }
    
    result.reverse()

    for(i in result){
        answer+=i*multier
        multier*=3
    }

    return answer
    }
}