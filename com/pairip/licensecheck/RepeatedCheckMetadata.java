package com.pairip.licensecheck;
public class RepeatedCheckMetadata {
    private final long durationToRetryMillis;
    private final long timeToRetryMillis;

    public RepeatedCheckMetadata(long p4, long p6)
    {
        if (p4 <= 0) {
            throw new IllegalArgumentException("Duration to retry must be positive.");
        } else {
            if (p6 <= 0) {
                throw new IllegalArgumentException("Time to retry must be positive.");
            } else {
                this.durationToRetryMillis = p4;
                this.timeToRetryMillis = p6;
                return;
            }
        }
    }

    public long getDurationToRetryMillis()
    {
        return this.durationToRetryMillis;
    }

    public long getTimeToRetryMillis()
    {
        return this.timeToRetryMillis;
    }
}
