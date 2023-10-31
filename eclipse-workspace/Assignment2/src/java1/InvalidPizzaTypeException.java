package java1;

class InvalidPizzaTypeException extends Exception {
    public InvalidPizzaTypeException(String message) {
        super(message);
    }
}

class InvalidPizzaSizeException extends Exception {
    public InvalidPizzaSizeException(String message) {
        super(message);
    }
}