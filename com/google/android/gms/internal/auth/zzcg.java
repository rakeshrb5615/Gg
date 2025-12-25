package com.google.android.gms.internal.auth;
public final class zzcg implements com.google.android.gms.internal.auth.zzcl {
    public static final String[] zza;
    private static final java.util.Map zzb;
    private final android.content.ContentResolver zzc;
    private final android.net.Uri zzd;
    private final Runnable zze;
    private final android.database.ContentObserver zzf;
    private final Object zzg;
    private volatile java.util.Map zzh;
    private final java.util.List zzi;

    static zzcg()
    {
        com.google.android.gms.internal.auth.zzcg.zzb = new r.e(0);
        com.google.android.gms.internal.auth.zzcg.zza = new String[] {"key", "value"});
        return;
    }

    private zzcg(android.content.ContentResolver p3, android.net.Uri p4, Runnable p5)
    {
        com.google.android.gms.internal.auth.zzcf v0_1 = new com.google.android.gms.internal.auth.zzcf(this, 0);
        this.zzf = v0_1;
        this.zzg = new Object();
        this.zzi = new java.util.ArrayList();
        p3.getClass();
        p4.getClass();
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        p3.registerContentObserver(p4, 0, v0_1);
        return;
    }

    public static com.google.android.gms.internal.auth.zzcg zza(android.content.ContentResolver p4, android.net.Uri p5, Runnable p6)
    {
        try {
            java.util.Map v1 = com.google.android.gms.internal.auth.zzcg.zzb;
            com.google.android.gms.internal.auth.zzcg v2_1 = ((com.google.android.gms.internal.auth.zzcg) v1.get(p5));
        } catch (Throwable v4_1) {
            throw v4_1;
        }
        if (v2_1 == null) {
            com.google.android.gms.internal.auth.zzcg v3_1 = new com.google.android.gms.internal.auth.zzcg(p4, p5, p6);
            try {
                v1.put(p5, v3_1);
            } catch (SecurityException) {
            }
            v2_1 = v3_1;
        }
        return v2_1;
    }

    public static declared_synchronized void zzd()
    {
        java.util.Map v1_3 = com.google.android.gms.internal.auth.zzcg.zzb.values().iterator();
        while (v1_3.hasNext()) {
            android.database.ContentObserver v2_1 = ((com.google.android.gms.internal.auth.zzcg) v1_3.next());
            v2_1.zzc.unregisterContentObserver(v2_1.zzf);
        }
        com.google.android.gms.internal.auth.zzcg.zzb.clear();
        return;
    }

    public final bridge synthetic Object zzb(String p5)
    {
        int v0_0 = this.zzh;
        if (v0_0 == 0) {
            try {
                v0_0 = this.zzh;
            } catch (Throwable v5_2) {
                throw v5_2;
            }
            if (v0_0 == 0) {
                int v0_1 = android.os.StrictMode.allowThreadDiskReads();
                try {
                    int v2_1 = ((java.util.Map) com.google.android.gms.internal.auth.zzcj.zza(new com.google.android.gms.internal.auth.zzce(this)));
                } catch (Throwable v5_1) {
                    android.os.StrictMode.setThreadPolicy(v0_1);
                    throw v5_1;
                }
                android.os.StrictMode.setThreadPolicy(v0_1);
                this.zzh = v2_1;
                v0_0 = v2_1;
            }
        }
        if (v0_0 == 0) {
            v0_0 = java.util.Collections.EMPTY_MAP;
        }
        return ((String) v0_0.get(p5));
    }

    public final java.util.Map zzc()
    {
        android.database.Cursor v1_1 = this.zzc.query(this.zzd, com.google.android.gms.internal.auth.zzcg.zza, 0, 0, 0);
        if (v1_1 != null) {
            try {
                String v0_1 = v1_1.getCount();
            } catch (String v0_3) {
                v1_1.close();
                throw v0_3;
            }
            if (v0_1 != null) {
                java.util.HashMap v2_2;
                if (v0_1 > 256) {
                    v2_2 = new java.util.HashMap(v0_1, 1065353216);
                } else {
                    v2_2 = new r.e(v0_1);
                }
                while (v1_1.moveToNext()) {
                    v2_2.put(v1_1.getString(0), v1_1.getString(1));
                }
                v1_1.close();
                return v2_2;
            } else {
                v1_1.close();
                return java.util.Collections.EMPTY_MAP;
            }
        } else {
            return java.util.Collections.EMPTY_MAP;
        }
    }

    public final void zze()
    {
        this.zzh = 0;
        com.google.android.gms.internal.auth.zzdc.zzd();
        Throwable v0_2 = this.zzi.iterator();
        while (v0_2.hasNext()) {
            ((com.google.android.gms.internal.auth.zzch) v0_2.next()).zza();
        }
        return;
    }
}
