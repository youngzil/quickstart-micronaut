package org.quickstart.micronaut.books

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


/**
 * @description TODO*
 * @author youngzil@163.com
 * @createTime 2019/10/27 09:44
 */
@CompileStatic
@Controller("/api")
class BooksController {

    private final BooksRepository booksRepository

    BooksController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository
    }

    @Get("/books")
    List<Book> list() {
        booksRepository.findAll()
    }
}