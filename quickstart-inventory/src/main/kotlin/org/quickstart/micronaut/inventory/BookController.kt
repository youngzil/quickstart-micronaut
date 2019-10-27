package org.quickstart.micronaut.inventory

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

/**
 * @description TODO
 *
 * @author youngzil@163.com
 * @createTime 2019/10/27 10:13
 */
@Controller("/api")
class BooksController {

    @Produces(MediaType.TEXT_PLAIN)
    @Get("/inventory/{isbn}")
    fun inventory(isbn: String): HttpResponse<Int> {
        return when (isbn) {
            "1491950358" -> HttpResponse.ok(2)
            "1680502395" -> HttpResponse.ok(3)
            else -> HttpResponse.notFound()
        }
    }
}