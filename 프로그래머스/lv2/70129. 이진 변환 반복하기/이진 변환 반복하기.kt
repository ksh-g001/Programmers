class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var repeatNum = 0
        var zeroNum = 0
        var conversionResult = s

        while(conversionResult != "1"){
            var nonzero = ""

            conversionResult.forEach {
                if(it == '0')
                    zeroNum++
                else{
                    nonzero += it
                }
            }

            conversionResult = convertFromNonzeroToLengthBinary(nonzero)
            repeatNum++
        }

        answer = answer.plus(intArrayOf(repeatNum, zeroNum))

        return answer
    }

    private fun convertFromNonzeroToLengthBinary(nonzero : String) : String {
        var lengthBinary = ""
        var length = nonzero.length

        while(length != 1){
            lengthBinary += length%2
            length = length.div(2)
        }
        lengthBinary += "1"

        return lengthBinary
    }
}