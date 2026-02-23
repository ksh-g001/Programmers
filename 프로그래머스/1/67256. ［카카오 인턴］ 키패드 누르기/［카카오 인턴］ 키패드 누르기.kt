import kotlin.math.abs

class Solution {
    val RIGHT = "R"
    val LEFT = "L"
    val keypad = createKeypad()

    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        var leftHand = intArrayOf(0,3)
        var rightHand = intArrayOf(2,3)

        numbers.forEach{ num ->
            answer += getTouchHand(hand, num, leftHand, rightHand)
        }

        return answer
    }

    private fun createKeypad(): HashMap<String, IntArray>{
        val keypad = HashMap<String, IntArray>()
        keypad["1"] = intArrayOf(0,0)
        keypad["2"] = intArrayOf(1,0)
        keypad["3"] = intArrayOf(2,0)
        keypad["4"] = intArrayOf(0,1)
        keypad["5"] = intArrayOf(1,1)
        keypad["6"] = intArrayOf(2,1)
        keypad["7"] = intArrayOf(0,2)
        keypad["8"] = intArrayOf(1,2)
        keypad["9"] = intArrayOf(2,2)
        keypad["*"] = intArrayOf(0,3)
        keypad["0"] = intArrayOf(1,3)
        keypad["#"] = intArrayOf(2,3)

        return keypad
    }

    private fun getTouchHand(hand: String, number: Int, leftHand: IntArray, rightHand: IntArray): String{
        val target = keypad[number.toString()]
        val diffLeft = target?.let { abs(leftHand[0] - it[0]) + abs(leftHand[1] - it[1]) }
        val diffRight = target?.let { abs(rightHand[0] - it[0]) + abs(rightHand[1] - it[1]) }

        if(number == 1 || number == 4 || number == 7){
            leftHand[0] = target!![0]
            leftHand[1] = target!![1]
            return LEFT
        }else if(number == 3 || number == 6 || number == 9){
            rightHand[0] = target!![0]
            rightHand[1] = target!![1]
            return RIGHT
        }

        if(diffLeft == null){
            throw Error("존재하지 않음")
        }

        if(diffLeft < diffRight!!){
            leftHand[0] = target!![0]
            leftHand[1] = target!![1]
            return LEFT
        }else if(diffLeft > diffRight){
            rightHand[0] = target!![0]
            rightHand[1] = target!![1]
            return RIGHT
        }else{
            if(hand=="right") {
                rightHand[0] = target!![0]
                rightHand[1] = target!![1]
               return RIGHT
            }
            else{
                leftHand[0] = target!![0]
                leftHand[1] = target!![1]
                return LEFT
            }
        }

    }
}