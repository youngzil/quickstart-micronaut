package org.quickstart.micronaut.gateway;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;

/**
 * @author youngzil@163.com
 * @description TODO
 * @createTime 2019/10/27 10:25
 */
@Client("books")
@Requires(notEnv = Environment.TEST)
public interface BooksClient extends BooksFetcher {

  @Override
  @Get("/api/books")
  Flowable<Book> fetchBooks();

}
