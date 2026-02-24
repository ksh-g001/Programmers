import kotlin.math.ceil

class Solution {
fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    val deployDays = mutableListOf<Int>()
    for (i in progresses.indices) {
        val remain = 100 - progresses[i]
        val day = (remain + speeds[i] - 1) / speeds[i]   // 올림 나눗셈
        deployDays.add(day)
    }

    val result = mutableListOf<Int>()
    var previous = deployDays[0]
    var cnt = 1

    for (i in 1 until deployDays.size) {
        val day = deployDays[i]
        if (day <= previous) {
            cnt++
        } else {
            result.add(cnt)
            cnt = 1
            previous = day
        }
    }
    result.add(cnt) // 마지막 묶음 추가

    return result.toIntArray()
}
}