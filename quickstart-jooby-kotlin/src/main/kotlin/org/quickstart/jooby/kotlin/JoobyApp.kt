package org.quickstart.jooby.kotlin

import org.jooby.*

/**
 * Kotlin stater project.
 */
class App : Kooby({

    get {
        val name = param("name").value("Jooby")
        "Hello World $name! kotlin"
    }

})

/**
 * Run application:
 */
fun main(args: Array<String>) {
    run(::App, *args)
}