import java.text.SimpleDateFormat
import java.util.Calendar

class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var term : String

        for(i in privacies.indices){
            term = findTerm(terms, privacies[i])
            if(compare(today, term, privacies[i]))
                answer = answer.plus(i+1)
        }
        
        return answer
    }
    
    fun compare(today : String, term: String, privacy : String) : Boolean{
        val theStipulatedTime = term.split(" ")[1].toInt()
        val date2 = privacy.split(" ")[0]

        val todayDate = Calendar.getInstance()
        val endDate =Calendar.getInstance()
        val sdf = SimpleDateFormat("yyyy.MM.dd")

        todayDate.time = sdf.parse(today)
        endDate.time = sdf.parse(date2)

        endDate.add(Calendar.MONTH, theStipulatedTime)

        val cmp = todayDate.compareTo(endDate)

        return cmp >= 0

    }

    fun findTerm(terms: Array<String>, privacy: String) : String {
        val privateTerm = privacy.split(" ")[1]
        val term : String

        for (i in terms.indices){
            if(privateTerm == terms[i].split(" ")[0])
                return terms[i]
        }
        return " "
    }
}