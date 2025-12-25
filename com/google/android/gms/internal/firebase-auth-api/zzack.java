package com.google.android.gms.internal.firebase-auth-api;
final class zzack implements com.google.android.gms.internal.firebase-auth-api.zzafv {
    private final synthetic y4.c0 zza;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzael zzb;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzaar zzc;

    public zzack(com.google.android.gms.internal.firebase-auth-api.zzaar p1, y4.c0 p2, com.google.android.gms.internal.firebase-auth-api.zzael p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void zza(Object p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzail v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzail();
        v0_1.zzd(((com.google.android.gms.internal.firebase-auth-api.zzahv) p4).zzc());
        com.google.android.gms.internal.firebase-auth-api.zzaar v1_5 = this.zza;
        if ((v1_5.c) || (v1_5.a != null)) {
            v0_1.zzb(v1_5.a);
        }
        com.google.android.gms.internal.firebase-auth-api.zzaar v1_1 = this.zza;
        if ((v1_1.d) || (v1_1.e != null)) {
            v0_1.zzg(v1_1.b);
        }
        com.google.android.gms.internal.firebase-auth-api.zzaar.zza(this.zzc, this.zzb, ((com.google.android.gms.internal.firebase-auth-api.zzahv) p4), v0_1, this);
        return;
    }

    public final void zza(String p2)
    {
        this.zzb.zza(w0.a.k(p2));
        return;
    }
}
