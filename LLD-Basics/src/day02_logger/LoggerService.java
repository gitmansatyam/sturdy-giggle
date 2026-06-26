package day02_logger;

public class LoggerService {
    private final LogStrategy logStrategy;

    public LoggerService(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
    }

    public void logMessage(){
        logStrategy.logMessage();
    }
}
