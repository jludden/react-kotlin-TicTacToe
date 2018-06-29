package app

class Game(
        val history: ArrayList<Array<Char?>> = arrayListOf(arrayOfNulls(9)),
        val stepNumber: Int = 0,
        val xIsNext: Boolean = true) {

    fun nextMove(i: Int) {

        val squares = history[stepNumber]
        if (calculateWinner(squares) != null
           || squares[i] != null ) return

        squares[i] = if(xIsNext) 'X' else 'O'

//        val c : Array<Char?> = arrayOfNulls(9)


    }



    fun calculateWinner(squares: Array<Char?>) : Char? {
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
                return squares[a]
            }
        }
        return null
    }
}