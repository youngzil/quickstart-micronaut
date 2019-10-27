package org.quickstart.micronaut.books

import io.micronaut.retry.annotation.Fallback
import io.reactivex.Single

/**
 * @description TODO*
 * @author youngzil@163.com
 * @createTime 2019/10/27 16:44
 */
@Fallback
class HelloFallbackClient {
    Single<String> hello(String name) {
        return Single.just("Hello fallback $name")
    }
}