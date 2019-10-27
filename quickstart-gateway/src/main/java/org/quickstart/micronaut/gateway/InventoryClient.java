package org.quickstart.micronaut.gateway;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Maybe;

/**
 * @author youngzil@163.com
 * @description TODO
 * @createTime 2019/10/27 10:28
 */
@Client("inventory")
@Requires(notEnv = Environment.TEST)
public interface InventoryClient extends InventoryFetcher {
  @Override
  @Get("/api/inventory/{isbn}")
  Maybe<Integer> inventory(String isbn);
}
