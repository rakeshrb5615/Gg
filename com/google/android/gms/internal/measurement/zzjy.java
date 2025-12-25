package com.google.android.gms.internal.measurement;
final class zzjy implements com.google.android.gms.internal.measurement.zzjv {
    private static com.google.android.gms.internal.measurement.zzjy zza;
    private final android.content.Context zzb;
    private final android.database.ContentObserver zzc;
    private boolean zzd;

    private zzjy()
    {
        this.zzd = 0;
        this.zzb = 0;
        this.zzc = 0;
        return;
    }

    private zzjy(android.content.Context p2)
    {
        this.zzd = 0;
        this.zzb = p2;
        this.zzc = new com.google.android.gms.internal.measurement.zzjw(this, 0);
        return;
    }

    public static com.google.android.gms.internal.measurement.zzjy zza(android.content.Context p4)
    {
        if (com.google.android.gms.internal.measurement.zzjy.zza == null) {
            String v1_1;
            if (a.a.k(p4, "com.google.android.providers.gsf.permission.READ_GSERVICES") != 0) {
                v1_1 = new com.google.android.gms.internal.measurement.zzjy();
            } else {
                v1_1 = new com.google.android.gms.internal.measurement.zzjy(p4);
            }
            com.google.android.gms.internal.measurement.zzjy.zza = v1_1;
        }
        String v1_2 = com.google.android.gms.internal.measurement.zzjy.zza;
        if ((v1_2 != null) && ((v1_2.zzc != null) && (!v1_2.zzd))) {
            try {
                p4.getContentResolver().registerContentObserver(com.google.android.gms.internal.measurement.zzjg.zza, 1, com.google.android.gms.internal.measurement.zzjy.zza.zzc);
                SecurityException v4_2 = com.google.android.gms.internal.measurement.zzjy.zza;
                v4_2.getClass();
                v4_2.zzd = 1;
            } catch (SecurityException v4_3) {
                android.util.Log.e("GservicesLoader", "Unable to register Gservices content observer", v4_3);
            }
        }
        SecurityException v4_4 = com.google.android.gms.internal.measurement.zzjy.zza;
        v4_4.getClass();
        return v4_4;
    }

    public static declared_synchronized void zzc()
    {
        android.content.ContentResolver v1_0 = com.google.android.gms.internal.measurement.zzjy.zza;
        if (v1_0 != null) {
            android.database.ContentObserver v2_2 = v1_0.zzb;
            if ((v2_2 != null) && ((v1_0.zzc != null) && (v1_0.zzd))) {
                v2_2.getContentResolver().unregisterContentObserver(com.google.android.gms.internal.measurement.zzjy.zza.zzc);
            }
        }
        com.google.android.gms.internal.measurement.zzjy.zza = 0;
        return;
    }

    public final String zzb(String p4)
    {
        NullPointerException v0_0 = this.zzb;
        if ((v0_0 != null) && (!com.google.android.gms.internal.measurement.zzjm.zzb(v0_0))) {
            try {
                return ((String) com.google.android.gms.internal.measurement.zzjv.zzh(new com.google.android.gms.internal.measurement.zzjx(this, p4)));
            } catch (NullPointerException v0_2) {
                android.util.Log.e("GservicesLoader", "Unable to read GServices for: ".concat(p4), v0_2);
            } catch (NullPointerException v0_2) {
            } catch (NullPointerException v0_2) {
            }
        }
        return 0;
    }

    public final String zzd(String p3)
    {
        android.content.ContentResolver v0_0 = this.zzb;
        v0_0.getClass();
        return com.google.android.gms.internal.measurement.zzjf.zza(v0_0.getContentResolver(), p3, 0);
    }

    public final bridge synthetic Object zze(String p1)
    {
        return this.zzb(p1);
    }
}
