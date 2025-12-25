package com.google.android.gms.internal.firebase-auth-api;
final class zzau extends com.google.android.gms.internal.firebase-auth-api.zzah {
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzar zza;

    public zzau(com.google.android.gms.internal.firebase-auth-api.zzar p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final synthetic Object get(int p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzu.zza(p3, com.google.android.gms.internal.firebase-auth-api.zzar.zza(this.zza));
        Object v3_3 = (p3 * 2);
        Object v0_4 = com.google.android.gms.internal.firebase-auth-api.zzar.zzb(this.zza)[v3_3];
        java.util.Objects.requireNonNull(v0_4);
        Object v3_2 = com.google.android.gms.internal.firebase-auth-api.zzar.zzb(this.zza)[(v3_3 + 1)];
        java.util.Objects.requireNonNull(v3_2);
        return new java.util.AbstractMap$SimpleImmutableEntry(v0_4, v3_2);
    }

    public final int size()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzar.zza(this.zza);
    }
}
