package fr.polytech.sim.log;

import java.time.Instant;
import java.util.Date;

public class TimestampedLoggerDecorator implements Logger {
    private final Logger logger;
    TimestampedLoggerDecorator(Logger logger) {
        this.logger = logger;
    }


    @Override
    public void log(String format, Object... args) {
        format = Date.from(Instant.now()).toString() + ":" + format;
        logger.log(format, args);
    }
}
