class Solution {
    fun solution(players:Array<String>, calling: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        val playersMap = HashMap<String, Int>()
        val playerIndexMap = HashMap<Int, String>()

        players.forEachIndexed { index, player ->
            playersMap[player] = index
            playerIndexMap[index] = player
        }

        calling.forEach { calling->
            val callingIndex = playersMap[calling]
            callingIndex?.let { index->
                val previousPlayer = playerIndexMap[index-1]
                previousPlayer?.let{ previousPlayer ->
                    val previous = index - 1
                    playersMap[calling] = previous
                    playersMap[previousPlayer] = index
                    playerIndexMap[index] = previousPlayer
                    playerIndexMap[previous]= calling
                }
            }
        }
        answer = playersMap.entries.sortedBy { it.value }.map { it.key }.toTypedArray()

        return answer
    }
}