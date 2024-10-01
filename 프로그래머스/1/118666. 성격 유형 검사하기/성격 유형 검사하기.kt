class Solution {
    private var r = 0
    private var t = 0
    private var c = 0
    private var f = 0
    private var j = 0
    private var m = 0
    private var a = 0
    private var n = 0

    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""

        for (i in choices.indices){
            val s = classificate(survey[i], choices[i])
            val point = getPoint(choices[i])
            sum(s, point)
        }

        answer += if (t > r) "T" else "R"
        answer += if (f > c) "F" else "C"
        answer += if (m > j) "M" else "J"
        answer += if (n > a) "N" else "A"

        return answer
    }

    private fun classificate(survey: String, choice : Int) : Char {
        return if (choice < 4) survey[0] else survey[1]
    }

    private fun getPoint(choice : Int) : Int{
        return when(choice){
            1 -> 3
            2 -> 2
            3 -> 1
            4 -> 0
            5 -> 1
            6 -> 2
            7 -> 3
            else -> 0
        }
    }

    private fun sum(survey : Char, point : Int){
        when(survey){
            'R' -> {
                r += point
            }
            'T' -> {
                t += point
            }
            'C' -> {
                c += point
            }
            'F' -> {
                f += point
            }
            'J' -> {
                j += point
            }
            'M' -> {
                m += point
            }
            'A' -> {
                a += point
            }
            'N' -> {
                n += point
            }
            else -> {
                println("Unknown survey : $survey")
            }
        }
    }
}