class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        // position[0] = row, position[1] = col
        var position = intArrayOf(0, 0)

        // 시작점 S 찾기 (최소 수정: mapIndexed 대신 loop)
        run {
            for (r in park.indices) {
                val c = park[r].indexOf('S')
                if (c != -1) {
                    position = intArrayOf(r, c)
                    return@run
                }
            }
        }

        val maxRow = park.lastIndex
        val maxCol = park[0].lastIndex

        routes.forEach { route ->
            val (dir, stepStr) = route.split(" ")
            val forward = stepStr.toInt()

            when (dir) {
                "N" -> moveNorth(park, forward, position)
                "S" -> moveSouth(maxRow, park, forward, position)
                "W" -> moveWest(park, forward, position)
                "E" -> moveEast(maxCol, park, forward, position)
                else -> Unit
            }
        }

        return position
    }

    // 북쪽: row 감소
    private fun moveNorth(park: Array<String>, forward: Int, position: IntArray): IntArray {
        val newRow = position[0] - forward
        if (newRow < 0) return position

        val col = position[1]
        // 경로(목적지 포함) 검사: newRow..(currentRow-1)
        for (r in newRow..(position[0] - 1)) {
            if (park[r][col] == 'X') return position
        }

        position[0] = newRow
        return position
    }

    // 남쪽: row 증가
    private fun moveSouth(maxRow: Int, park: Array<String>, forward: Int, position: IntArray): IntArray {
        val newRow = position[0] + forward
        if (newRow > maxRow) return position

        val col = position[1]
        // 경로(목적지 포함) 검사: (currentRow+1)..newRow
        for (r in (position[0] + 1)..newRow) {
            if (park[r][col] == 'X') return position
        }

        position[0] = newRow
        return position
    }

    // 동쪽: col 증가
    private fun moveEast(maxCol: Int, park: Array<String>, forward: Int, position: IntArray): IntArray {
        val newCol = position[1] + forward
        if (newCol > maxCol) return position

        val row = position[0]
        // 경로(목적지 포함) 검사: (currentCol+1)..newCol
        for (c in (position[1] + 1)..newCol) {
            if (park[row][c] == 'X') return position
        }

        position[1] = newCol
        return position
    }

    // 서쪽: col 감소
    private fun moveWest(park: Array<String>, forward: Int, position: IntArray): IntArray {
        val newCol = position[1] - forward
        if (newCol < 0) return position

        val row = position[0]
        // 경로(목적지 포함) 검사: newCol..(currentCol-1)
        for (c in newCol..(position[1] - 1)) {
            if (park[row][c] == 'X') return position
        }

        position[1] = newCol
        return position
    }
}