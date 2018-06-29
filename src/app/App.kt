package app

import react.*

interface AppState : RState {
    var g: Game
}

class App : RComponent<RProps, AppState>() {

    override fun AppState.init() {
        g = Game()
    }

    override fun RBuilder.render() {
        gameUI(state.g, object:CellClickListener {
            override fun cellClick(i: Int) {
                setState {
                    g.nextMove(i)

//                    console.log("button click $i")
//                    g.history[g.stepNumber][i] = 'Z'
//
//                    g.apply {
//                        val squares = history[stepNumber]
//                        if (calculateWinner(squares) != null
//                                || squares[i] != ' ' ) {
//
//                        }
//                        else {
//
//                            squares[i] = 'x'
//
//                        }
//                    }


                }
            }
        })
    }
}

fun RBuilder.app() = child(App::class) { }
