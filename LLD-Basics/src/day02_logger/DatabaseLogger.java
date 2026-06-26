package day02_logger;

public class DatabaseLogger implements LogStrategy{
    @Override
    public void logMessage() {
        System.out.println("Implemented logger for Database");
    }
}
