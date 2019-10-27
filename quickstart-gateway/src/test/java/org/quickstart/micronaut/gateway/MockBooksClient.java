package org.quickstart.micronaut.gateway;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.reactivex.Flowable;
import javax.inject.Singleton;

/**
 * @author youngzil@163.com
 * @description TODO
 * @createTime 2019/10/27 10:29
 */
@Singleton
@Requires(env = Environment.TEST)
public class MockBooksClient implements BooksFetcher {

  @Override
  public Flowable<Book> fetchBooks() {
    return Flowable.just(new Book("1491950358", "Building Microservices"), new Book("1680502395", "Release It!"),
        new Book("0321601912", "Continuous Delivery:"));
  }
}