package day02_logger;

public class Main {

    public static void main(String[] args) {

        LogStrategy fileLogger = new FileLogger();

        LoggerService service = new LoggerService(fileLogger);
        service.logMessage();
    }

}
