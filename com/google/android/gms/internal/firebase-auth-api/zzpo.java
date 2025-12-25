package com.google.android.gms.internal.firebase-auth-api;
final class zzpo implements java.lang.Iterable {
    private final synthetic java.util.List zza;
    private final synthetic java.util.List zzb;

    public zzpo(com.google.android.gms.internal.firebase-auth-api.zzpl p1, java.util.List p2, java.util.List p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        return;
    }

    public final java.util.Iterator iterator()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzpq(this.zza.iterator(), this.zzb.iterator(), 0);
    }
}
