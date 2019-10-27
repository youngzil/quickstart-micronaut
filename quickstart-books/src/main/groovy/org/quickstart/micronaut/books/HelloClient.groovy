package org.quickstart.micronaut.books

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Single

/**
 * @description TODO*
 * @author youngzil@163.com
 * @createTime 2019/10/27 16:44
 */
@Client("/")
interface HelloClient {
    @Get('/hello/{name}')
    Single<String> hello(String name)
}
