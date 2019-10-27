package org.quickstart.jooby.java;

import org.jooby.Jooby;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
    get("/", () -> "Hello World Jooby java!");
  }

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
