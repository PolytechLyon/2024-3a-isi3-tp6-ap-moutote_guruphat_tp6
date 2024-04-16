package fr.polytech.sim.log;

public class LoggerStaticFactory {
    public static Logger fabricate(String name) {
        return new TimestampedLoggerDecorator(new ConsoleLogger(name));
    }
}
