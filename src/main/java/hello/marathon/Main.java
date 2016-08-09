package hello.marathon;

import static spark.Spark.*;

public class Main {
    public static void main(String [] args) {
        get("/hello-marathon/health", (req, res) -> "Application is running!");
    }
}
