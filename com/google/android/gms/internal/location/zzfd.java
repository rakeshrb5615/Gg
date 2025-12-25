package com.google.android.gms.internal.location;
public final class zzfd {

    public static boolean zza(java.util.concurrent.CountDownLatch p3, long p4, java.util.concurrent.TimeUnit p6)
    {
        int v0 = 0;
        try {
            long v4_2 = p6.toNanos(30);
            long v1_1 = (System.nanoTime() + v4_2);
        } catch (boolean v3_1) {
            if (v0 != 0) {
                Thread.currentThread().interrupt();
            }
            throw v3_1;
        }
        try {
            while(true) {
                p3 = p3.await(v4_2, java.util.concurrent.TimeUnit.NANOSECONDS);
                v4_2 = (v1_1 - System.nanoTime());
            }
        } catch (InterruptedException) {
            v0 = 1;
        }
        if (v0 != 0) {
            Thread.currentThread().interrupt();
        }
        return p3;
    }
}
