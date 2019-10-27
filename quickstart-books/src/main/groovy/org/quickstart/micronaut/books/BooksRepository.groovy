package org.quickstart.micronaut.books


/**
 * @description TODO*
 * @author youngzil@163.com
 * @createTime 2019/10/27 09:49
 */
interface BooksRepository {
    List<Book> findAll()
}