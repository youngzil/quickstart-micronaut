package org.quickstart.micronaut.books;

import groovy.transform.CompileStatic;
import groovy.transform.TupleConstructor;

/**
 * @author youngzil@163.com
 * @description TODO
 * @createTime 2019/10/27 09:50
 */
@CompileStatic
@TupleConstructor
class Book {
    String isbn
    String name
}
