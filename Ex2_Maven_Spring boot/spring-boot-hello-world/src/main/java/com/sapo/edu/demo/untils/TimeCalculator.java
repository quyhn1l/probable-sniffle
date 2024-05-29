package com.sapo.edu.demo.untils;
import org.apache.commons.lang3.time.StopWatch;

public class TimeCalculator {
    public static long measureExecutionTime(Runnable task) {
        StopWatch stopWatch = StopWatch.createStarted();
        try {
            task.run();
        } finally {
            stopWatch.stop();
        }
        return stopWatch.getTime();
    }
}
