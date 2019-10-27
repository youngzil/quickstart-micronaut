package org.quickstart.micronaut.gateway;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.reactivex.Maybe;
import javax.inject.Singleton;

/**
 * @author youngzil@163.com
 * @description TODO
 * @createTime 2019/10/27 10:29
 */
@Singleton
@Requires(env = Environment.TEST)
public class MockInventoryClient implements InventoryFetcher {

  @Override
  public Maybe<Integer> inventory(String isbn) {
    if (isbn.equals("1491950358")) {
      return Maybe.just(2);
    }
    if (isbn.equals("1680502395")) {
      return Maybe.just(0);
    }
    return Maybe.empty();
  }
}
