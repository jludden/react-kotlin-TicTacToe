package app

import react.*
import react.dom.*
import logo.*
import ticker.*

interface AppState : RState {
    var g: Game
}

class App : RComponent<RProps, AppState>() {


    override fun AppState.init() {
        g = Game()
    }

    override fun RBuilder.render() {
        gameUI(state.g)
    }
}

fun RBuilder.app() = child(App::class) {}
