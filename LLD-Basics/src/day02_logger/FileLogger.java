package day02_logger;

public class FileLogger implements LogStrategy{
    @Override
    public void logMessage() {
        System.out.println("Implemented logger for File");
    }
}
