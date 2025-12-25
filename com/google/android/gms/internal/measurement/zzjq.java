package com.google.android.gms.internal.measurement;
final synthetic class zzjq implements java.util.function.Function {
    private final synthetic android.content.ContentResolver zza;
    private final synthetic android.net.Uri zzb;
    private final synthetic Runnable zzc;

    public synthetic zzjq(android.content.ContentResolver p1, android.net.Uri p2, Runnable p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final synthetic Object apply(Object p4)
    {
        return com.google.android.gms.internal.measurement.zzjr.zzf(this.zza, this.zzb, this.zzc, ((android.net.Uri) p4));
    }
}
