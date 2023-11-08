package org.example;

public class Statistics {
    private final int maxRequestsPerSeconds;
    private final int averageRequestsPerSeconds;

    public int getMaxRequestsPerSeconds() {
        return maxRequestsPerSeconds;
    }

    public int getAverageRequestsPerSeconds() {
        return averageRequestsPerSeconds;
    }

    public Statistics(int maxRequestsPerSeconds, int averageRequestsPerSeconds) {
        this.maxRequestsPerSeconds = maxRequestsPerSeconds;
        this.averageRequestsPerSeconds = averageRequestsPerSeconds;
    }
}
