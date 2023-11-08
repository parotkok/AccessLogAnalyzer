package org.example;

public class Statistics {
    private final int maxRequestsPerSeconds;
    private final double averageRequestsPerSeconds;

    public int getMaxRequestsPerSeconds() {
        return maxRequestsPerSeconds;
    }

    public double getAverageRequestsPerSeconds() {
        return averageRequestsPerSeconds;
    }

    public Statistics(int maxRequestsPerSeconds, double averageRequestsPerSeconds) {
        this.maxRequestsPerSeconds = maxRequestsPerSeconds;
        this.averageRequestsPerSeconds = averageRequestsPerSeconds;
    }
}
