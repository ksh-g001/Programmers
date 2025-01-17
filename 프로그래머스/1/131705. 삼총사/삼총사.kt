class Solution {
    fun solution(number: IntArray): Int {
        var zero = 0
         for (i in number.indices){
            for(j in i+1..number.lastIndex){
                for (k in j+1..number.lastIndex){
                    if(number[i]+number[j]+number[k] == 0)
                        zero++
                }
            }
        }
        return zero
    }
}