package com.google.android.gms.internal.measurement;
public final class zzlr {
    static final com.google.android.gms.internal.measurement.zzlr zza = None;
    public static final synthetic int zzb = 0;
    private static volatile boolean zzc = False;
    private static volatile com.google.android.gms.internal.measurement.zzlr zzd;
    private final java.util.Map zze;

    static zzlr()
    {
        com.google.android.gms.internal.measurement.zzlr.zza = new com.google.android.gms.internal.measurement.zzlr(1);
        return;
    }

    public zzlr()
    {
        this.zze = new java.util.HashMap();
        return;
    }

    public zzlr(boolean p1)
    {
        this.zze = java.util.Collections.EMPTY_MAP;
        return;
    }

    public static com.google.android.gms.internal.measurement.zzlr zza()
    {
        Class v0 = com.google.android.gms.internal.measurement.zzlr.zzd;
        if (v0 == null) {
            com.google.android.gms.internal.measurement.zzlr v1_1 = com.google.android.gms.internal.measurement.zzlr.zzd;
            if (v1_1 == null) {
                com.google.android.gms.internal.measurement.zzlr v1_3 = com.google.android.gms.internal.measurement.zzlz.zzb(com.google.android.gms.internal.measurement.zzlr);
                com.google.android.gms.internal.measurement.zzlr.zzd = v1_3;
                return v1_3;
            } else {
                return v1_1;
            }
        } else {
            return v0;
        }
    }

    public final com.google.android.gms.internal.measurement.zzme zzb(com.google.android.gms.internal.measurement.zznm p2, int p3)
    {
        return ((com.google.android.gms.internal.measurement.zzme) this.zze.get(new com.google.android.gms.internal.measurement.zzlq(p2, p3)));
    }
}
