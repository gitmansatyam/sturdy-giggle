package day02_logger;

public class ConsoleLogger implements LogStrategy{

    @Override
    public void logMessage() {
        System.out.println("Implemented logger for console");
    }
}
