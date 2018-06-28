package index

import app.*
import kotlinext.js.*
import kotlinx.html.DIV
import kotlinx.html.style
import kotlinx.html.title
import react.dom.*
import kotlin.browser.*

fun main(args: Array<String>) {
    requireAll(require.context("src", true, js("/\\.css$/")))

    render(document.getElementById("root")) {
                app()

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
    }
}

private fun RDOMBuilder<DIV>.someUI() {
    div {
        div { b { +"Player Hand" } }
        div { +"card goes here" }
        div { b { +"12 Points" } }
    }
}
