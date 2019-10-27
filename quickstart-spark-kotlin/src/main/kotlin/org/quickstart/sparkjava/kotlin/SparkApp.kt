package org.quickstart.sparkjava.kotlin

import spark.Spark.*

fun main(args: Array<String>) {
    get("/") { req, res -> "Hello World Spark kotlin" }
}