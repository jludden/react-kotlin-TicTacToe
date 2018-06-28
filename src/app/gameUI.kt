package app

import react.RBuilder
import react.dom.div
import react.dom.h1

fun RBuilder.gameUI(g: Game) {
    div("game") {
        h1 { "Hello world" }
    }
}