package org.quickstart.micronaut.gateway;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;

/**
 * @author youngzil@163.com
 * @description TODO
 * @createTime 2019/10/27 10:28
 */
@Controller("/api")
public class BooksController {

  private final BooksFetcher booksFetcher;
  private final InventoryFetcher inventoryFetcher;

  public BooksController(BooksFetcher booksFetcher, InventoryFetcher inventoryFetcher) {
    this.booksFetcher = booksFetcher;
    this.inventoryFetcher = inventoryFetcher;
  }

  @Get("/books")
  Flowable<Book> findAll() {

    Flowable<Book> books = booksFetcher.fetchBooks();
    books = books.flatMapMaybe(b -> inventoryFetcher.inventory(b.getIsbn())
        .filter(stock -> stock > 0)
        .map(stock -> {
          b.setStock(stock);
          return b;
        })
    );
    return books;

    /*return booksFetcher.fetchBooks()
        .flatMapMaybe(b -> inventoryFetcher.inventory(b.getIsbn())
            .filter(stock -> stock > 0)
            .map(stock -> {
              b.setStock(stock);
              return b;
            })
        );*/

  }
}
