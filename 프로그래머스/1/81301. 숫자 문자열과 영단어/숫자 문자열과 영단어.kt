class Solution {
    fun solution(s: String): Int {
    var answer: Int = 0
    var cnt = 1
    var intArray = mutableListOf<Int>()
    var stringNumber = ""
    
    s.forEach { c ->
        if (c.isDigit()) {
            intArray.add(c.code - '0'.code)
        } else {
            stringNumber += c
            if (getNumber(stringNumber) != -1) {
                val num = getNumber(stringNumber)
                intArray.add(num)
                stringNumber = ""
            }
        }
    }

    intArray.reverse()

    intArray.forEach {
        answer += cnt * it
        cnt *=10
    }

    return answer
}

private fun getNumber(s : String) : Int {
    return when(s){
        "zero"-> 0
        "one" -> 1
        "two" -> 2
        "three" -> 3
        "four" -> 4
        "five" -> 5
        "six" -> 6
        "seven" -> 7
        "eight" -> 8
        "nine" -> 9
        else -> -1 
    }
}
}