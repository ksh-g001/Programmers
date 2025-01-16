class Solution {
    fun solution(numbers: IntArray)
    : IntArray = numbers.flatMapIndexed { index, num ->
            numbers.map{ n -> num + n}
                .filterIndexed{ i, _ ->  i != index} }.sorted().toSet().toIntArray()
}