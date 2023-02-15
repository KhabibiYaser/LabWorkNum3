package Exceptions;


public class LowBatteryException extends Exception {
    public LowBatteryException(String text) {
        super(text);
    }
}
