fun main() {
    fun part1(input: List<String>): Int {
        val intList = input.map { value -> value.toInt() }
        var increaseCounter = 0;
        for (i in 1 until intList.size) {
            if (intList[i] > intList[i-1]) {
                increaseCounter += 1;
            }
        }

        return increaseCounter;
    }

    fun part2(input: List<String>): Int {
        val intList = input.map { value -> value.toInt() }
        var increaseCounter = 0;
        for (i in intList.indices) {
            if (i + 4 > intList.size) {
                break
            }
            
            val firstWindow = intList[i] + intList[i + 1] + intList[i + 2]
            val secondWindow = intList[i + 1] + intList[i + 2] + intList[i + 3]

            if (secondWindow > firstWindow) {
                increaseCounter += 1;
            }
        }

        return increaseCounter;
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
