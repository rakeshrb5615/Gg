package com.google.android.gms.common.stats;
public class WakeLockTracker {
    private static final com.google.android.gms.common.stats.WakeLockTracker zza;

    static WakeLockTracker()
    {
        com.google.android.gms.common.stats.WakeLockTracker.zza = new com.google.android.gms.common.stats.WakeLockTracker();
        return;
    }

    public WakeLockTracker()
    {
        return;
    }

    public static com.google.android.gms.common.stats.WakeLockTracker getInstance()
    {
        return com.google.android.gms.common.stats.WakeLockTracker.zza;
    }

    public void registerAcquireEvent(android.content.Context p1, android.content.Intent p2, String p3, String p4, String p5, int p6, String p7)
    {
        return;
    }

    public void registerDeadlineEvent(android.content.Context p1, String p2, String p3, String p4, int p5, java.util.List p6, boolean p7, long p8)
    {
        return;
    }

    public void registerEvent(android.content.Context p1, String p2, int p3, String p4, String p5, String p6, int p7, java.util.List p8)
    {
        return;
    }

    public void registerEvent(android.content.Context p1, String p2, int p3, String p4, String p5, String p6, int p7, java.util.List p8, long p9)
    {
        return;
    }

    public void registerReleaseEvent(android.content.Context p1, android.content.Intent p2)
    {
        return;
    }
}
