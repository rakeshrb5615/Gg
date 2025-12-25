package com.google.android.gms.internal.play_billing;
final class zzbu {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzbu(Object p1, Object p2, Object p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final IllegalArgumentException zza()
    {
        String v2_0 = this.zza;
        return new IllegalArgumentException(v1.a.o(v1.a.r("Multiple entries with same key: ", String.valueOf(v2_0), "=", String.valueOf(this.zzb), " and "), String.valueOf(v2_0), "=", String.valueOf(this.zzc)));
    }
}
