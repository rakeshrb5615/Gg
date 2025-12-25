package com.google.android.gms.common.stats;
public class ConnectionTracker {
    private static final Object zzb;
    private static volatile com.google.android.gms.common.stats.ConnectionTracker zzc;
    public final java.util.concurrent.ConcurrentHashMap zza;

    static ConnectionTracker()
    {
        com.google.android.gms.common.stats.ConnectionTracker.zzb = new Object();
        return;
    }

    private ConnectionTracker()
    {
        this.zza = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public static com.google.android.gms.common.stats.ConnectionTracker getInstance()
    {
        if (com.google.android.gms.common.stats.ConnectionTracker.zzc == null) {
            if (com.google.android.gms.common.stats.ConnectionTracker.zzc == null) {
                com.google.android.gms.common.stats.ConnectionTracker.zzc = new com.google.android.gms.common.stats.ConnectionTracker();
            }
        }
        com.google.android.gms.common.stats.ConnectionTracker v0_1 = com.google.android.gms.common.stats.ConnectionTracker.zzc;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1);
        return v0_1;
    }

    private final boolean zzb(android.content.Context p4, String p5, android.content.Intent p6, android.content.ServiceConnection p7, int p8, boolean p9, java.util.concurrent.Executor p10)
    {
        String v9_0 = p6.getComponent();
        try {
            if (v9_0 != null) {
                String v9_10 = v9_0.getPackageName();
                "com.google.android.gms".equals(v9_10);
                if ((com.google.android.gms.common.wrappers.Wrappers.packageManager(p4).getApplicationInfo(v9_10, 0).flags & 2097152) != 0) {
                    android.util.Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return 0;
                }
            }
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
        }
        java.util.concurrent.ConcurrentHashMap v4_2;
        if (!com.google.android.gms.common.stats.ConnectionTracker.zzc(p7)) {
            v4_2 = com.google.android.gms.common.stats.ConnectionTracker.zze(p4, p6, p7, p8, p10);
        } else {
            String v9_7 = ((android.content.ServiceConnection) this.zza.putIfAbsent(p7, p7));
            if ((v9_7 != null) && (p7 != v9_7)) {
                android.util.Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[] {p7, p5, p6.getAction()})));
            }
            try {
                v4_2 = com.google.android.gms.common.stats.ConnectionTracker.zze(p4, p6, p7, p8, p10);
            } catch (java.util.concurrent.ConcurrentHashMap v4_3) {
                this.zza.remove(p7, p7);
                throw v4_3;
            }
            if (v4_2 == null) {
                this.zza.remove(p7, p7);
                return 0;
            }
        }
        return v4_2;
    }

    private static boolean zzc(android.content.ServiceConnection p0)
    {
        if ((p0 instanceof com.google.android.gms.common.internal.zzr)) {
            return 0;
        } else {
            return 1;
        }
    }

    private static void zzd(android.content.Context p0, android.content.ServiceConnection p1)
    {
        try {
            p0.unbindService(p1);
        } catch (java.util.NoSuchElementException) {
        }
        return;
    }

    private static final boolean zze(android.content.Context p1, android.content.Intent p2, android.content.ServiceConnection p3, int p4, java.util.concurrent.Executor p5)
    {
        if (p5 == 0) {
            p5 = 0;
        }
        if ((!com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()) || (p5 == 0)) {
            return p1.bindService(p2, p3, p4);
        } else {
            return p1.bindService(p2, p4, p5, p3);
        }
    }

    public boolean bindService(android.content.Context p10, android.content.Intent p11, android.content.ServiceConnection p12, int p13)
    {
        return this.zzb(p10, p10.getClass().getName(), p11, p12, p13, 1, 0);
    }

    public void unbindService(android.content.Context p3, android.content.ServiceConnection p4)
    {
        if (com.google.android.gms.common.stats.ConnectionTracker.zzc(p4)) {
            java.util.concurrent.ConcurrentHashMap v0_4 = this.zza;
            if (v0_4.containsKey(p4)) {
                try {
                    com.google.android.gms.common.stats.ConnectionTracker.zzd(p3, ((android.content.ServiceConnection) v0_4.get(p4)));
                    this.zza.remove(p4);
                    return;
                } catch (Throwable v3_2) {
                    this.zza.remove(p4);
                    throw v3_2;
                }
            }
        }
        com.google.android.gms.common.stats.ConnectionTracker.zzd(p3, p4);
        return;
    }

    public void unbindServiceSafe(android.content.Context p1, android.content.ServiceConnection p2)
    {
        try {
            this.unbindService(p1, p2);
        } catch (IllegalArgumentException) {
        }
        return;
    }

    public final boolean zza(android.content.Context p9, String p10, android.content.Intent p11, android.content.ServiceConnection p12, int p13, java.util.concurrent.Executor p14)
    {
        return this.zzb(p9, p10, p11, p12, 4225, 1, p14);
    }
}
