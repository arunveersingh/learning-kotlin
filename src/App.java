import com.arunveersingh.DisplayFunctions;

public class App {
    public static void main(String[] args) {
        System.out.println(DisplayFunctions.display("Hello, World"));

        DisplayFunctions.log("Hello World", 3);

        // it works because of JVM overloads
        DisplayFunctions.log("Hello World");

    }
}
