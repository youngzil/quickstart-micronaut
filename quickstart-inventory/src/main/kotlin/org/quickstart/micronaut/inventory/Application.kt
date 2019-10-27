package org.quickstart.micronaut.inventory

import io.micronaut.runtime.Micronaut

/**
 * The application is defined in this way so we can easily reference
 * a class to pass to [start][io.micronaut.runtime.Micronaut.start].
 *
 * @author James Kleeh
 * @since 1.0
 */
object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                 .packages("org.quickstart.micronaut.inventory")
//                 .packages("org.quickstart.micronaut.inventory","org.quickstart.micronaut.inventory.example")
                 .mainClass(Application.javaClass)
                 .start()
    }
}
