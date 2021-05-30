package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val sadNumbers: MutableList<Int> = sadArray.toMutableList()

        var i = 1
        while (i < sadNumbers.size - 1) {
            if (sadNumbers[i] > sadNumbers[i - 1] + sadNumbers[i + 1]) {
                sadNumbers.removeAt(i)
                if (i > 1) i--
            } else {
                i++
            }
        }

        return sadNumbers.toIntArray()
    }
}
