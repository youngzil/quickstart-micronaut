package org.quickstart.micronaut.books

import groovy.transform.CompileStatic

import javax.inject.Singleton

/**
 * @author youngzil@163.com
 * @description TODO
 * @createTime 2019/10/27 09:51
 */
@CompileStatic
@Singleton
class BooksRepositoryImpl implements BooksRepository {

    @Override
    List<Book> findAll() {
        [
                new Book("1491950358", "Building Microservices"),
                new Book("1680502395", "Release It!"),
        ]
    }
}
