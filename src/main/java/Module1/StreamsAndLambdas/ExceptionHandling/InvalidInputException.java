package Module1.StreamsAndLambdas.ExceptionHandling;

// Custom checked exception
public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}