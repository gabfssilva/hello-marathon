package hello.marathon;

import static spark.Spark.*;

public class Main {
    public static void main(String [] args) {
        get("/health", (req, res) -> "Application is running!");
    }
}
