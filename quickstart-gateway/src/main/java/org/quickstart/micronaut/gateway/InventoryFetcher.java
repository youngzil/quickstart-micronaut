package org.quickstart.micronaut.gateway;

import io.reactivex.Maybe;

/**
 * @author youngzil@163.com
 * @description TODO
 * @createTime 2019/10/27 10:27
 */
public interface InventoryFetcher {
  Maybe<Integer> inventory(String isbn);
}
