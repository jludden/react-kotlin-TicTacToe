package app

class Game(
        val history: ArrayList<CharArray> = ArrayList<CharArray>(),
        val stepNumber: Int = 0,
        val xIsNext: Boolean = true) {

    fun calculateWinner(squares: CharArray) : Winner {
        val lines = arrayOf(
                arrayOf(0, 1, 2),
                arrayOf(3, 4, 5),
                arrayOf(6, 7, 8),
                arrayOf(0, 3, 6),
                arrayOf(1, 4, 7),
                arrayOf(2, 5, 8),
                arrayOf(0, 4, 8),
                arrayOf(2, 4, 6)
        )

        for (i in 0..lines.size) {
            val (a, b, c) = lines[i] //kotlin destructuring declaration
            if (squares[a] == squares[b] && squares[a] == squares[c]) {
                return when(squares[a]) {
                    'X' -> Winner.X
                    'O' -> Winner.O
                    else -> Winner.NONE
                }
            }
        }
        return Winner.NONE
    }

    enum class Winner {
        X, O, NONE
    }
}