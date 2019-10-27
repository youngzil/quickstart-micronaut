package org.quickstart.micronaut.gateway;

import io.reactivex.Flowable;

/**
 * @author youngzil@163.com
 * @description TODO
 * @createTime 2019/10/27 10:24
 */
public interface BooksFetcher {
  Flowable<Book> fetchBooks();
}
