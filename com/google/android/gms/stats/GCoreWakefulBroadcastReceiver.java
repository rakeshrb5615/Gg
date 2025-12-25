package com.google.android.gms.stats;
public abstract class GCoreWakefulBroadcastReceiver extends m1.a {

    public GCoreWakefulBroadcastReceiver()
    {
        return;
    }

    public static boolean completeWakefulIntent(android.content.Context p0, android.content.Intent p1)
    {
        if (p1 != null) {
            return m1.a.completeWakefulIntent(p1);
        } else {
            return 0;
        }
    }
}
