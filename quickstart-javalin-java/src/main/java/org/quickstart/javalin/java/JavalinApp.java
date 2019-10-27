package org.quickstart.javalin.java;

import io.javalin.Javalin;

public class JavalinApp {

  public static void main(String[] args) {
    Javalin app = Javalin.create().start(7000);
    app.get("/", ctx -> ctx.result("Hello World javalin java"));
  }
}
