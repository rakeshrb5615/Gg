package com.google.android.gms.internal.firebase-auth-api;
final class zzan {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzan(Object p1, Object p2, Object p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final IllegalArgumentException zza()
    {
        return new IllegalArgumentException(v1.a.o(v1.a.r("Multiple entries with same key: ", String.valueOf(this.zza), "=", String.valueOf(this.zzb), " and "), String.valueOf(this.zza), "=", String.valueOf(this.zzc)));
    }
}
