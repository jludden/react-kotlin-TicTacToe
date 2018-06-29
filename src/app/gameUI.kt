package app

import kotlinx.html.DIV
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.*

fun RBuilder.gameUI(g: Game, listener: CellClickListener) {
    div("game") {
//        h1 { +"Hello world" }
        gameBoard(g, listener)

    }
}


interface CellClickListener {
    fun cellClick(i: Int)
}

private fun RBuilder.gameBoard(g: Game, listener: CellClickListener) {
    div("game-board") {
        div("board-row") {

            val squares = g.history[g.stepNumber]

            for(rows in 0..2) {
                div("board-row") {
                    for(cell in 0..2) {
                        square(squares, listener, cell + 3*rows)
//                        square(squares[cell + 3*rows])
                    }
                }
            }

        }
    }
}

private fun RDOMBuilder<DIV>.square(squares: Array<Char?>,
                                    listener: CellClickListener, i: Int) {
    div("square") {
        button {
            +"${squares[i]}"
            attrs.onClickFunction = {
                console.log("button click")
                listener.cellClick(i)
            }
        }
    }
}


//
//        div {
//            attrs.title = "Tooltip"
//
//            //not type safe
//            attrs.style = js{
//                display = "flex"
//            } //explicitly casting to String is not safe
//
//
//            h1 {
//                +"Create React JAL"
//            }
//
//            someUI()
//            someUI()
//            someUI()
//        }
private fun RDOMBuilder<DIV>.someUI() {
    div {
        div { b { +"Player Hand" } }
        div { +"card goes here" }
        div { b { +"12 Points" } }
    }
}



