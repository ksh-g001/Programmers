class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val userReportHistories = HashMap<String, Array<String>>()
        val reportedMap = createReportedMap(id_list)

        report.forEach { string ->
            val list = string.split(" ")
            val user = list[0]
            val reported = list[1]

            if(!userReportHistories.getOrDefault(user, arrayOf()).contains(reported)) {
                reportedMap[reported] = reportedMap.getOrDefault(reported, 0) + 1
                userReportHistories[user] = userReportHistories.getOrDefault(user, arrayOf()).plus(reported)
            }
        }

        val suspended = reportedMap.filter { (_, value) -> value >= k }.keys

        id_list.forEach { user->
            val reported=userReportHistories[user]
            var count = 0

            reported?.forEach {
                if(suspended.contains(it))
                    count++
            }

            answer = answer.plus(count)
        }

        return answer
    }

    private fun createReportedMap(id_list: Array<String>): HashMap<String, Int> {
        val reports = hashMapOf<String, Int>()
        id_list.forEach { id ->
            reports[id] = 0
        }
        return reports
    }
}