package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var resultList = mutableListOf<String>()
        for (i in inputString.indices) {
            when (inputString[i]) {
                '<' -> {
                    resultList = getSubString(inputString.substring(i + 1), resultList, inputString[i],'>')
                }

                '(' -> {
                    resultList = getSubString(inputString.substring(i + 1), resultList, inputString[i], ')')
                }
                '[' -> {
                    resultList = getSubString(inputString.substring(i + 1), resultList, inputString[i], ']')
                }
            }
        }
        return resultList.toTypedArray()
    }

    private fun getSubString(str:String, res: MutableList<String>, open:Char, close:Char): MutableList<String> {
        var count = 0
        for (j in str.indices) {
            if (str[j] == open) count++
            if (str[j] == close && count == 0) {
                res.add(str.substring(0, j))
                break
            } else if (str[j] == close && count > 0) count--
        }

        return res
    }
}