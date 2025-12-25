package com.google.android.gms.internal.firebase-auth-api;
final class zzabp implements com.google.android.gms.internal.firebase-auth-api.zzafv {
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzafv zza;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzahv zzb;
    private final synthetic String zzc;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzael zzd;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzabq zze;

    public zzabp(com.google.android.gms.internal.firebase-auth-api.zzabq p1, com.google.android.gms.internal.firebase-auth-api.zzafv p2, com.google.android.gms.internal.firebase-auth-api.zzahv p3, String p4, com.google.android.gms.internal.firebase-auth-api.zzael p5)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        java.util.Objects.requireNonNull(p1);
        this.zze = p1;
        return;
    }

    public final synthetic void zza(Object p7)
    {
        com.google.android.gms.internal.firebase-auth-api.zzabq v7_5 = ((com.google.android.gms.internal.firebase-auth-api.zzahl) p7).zza();
        if ((v7_5 != null) && (!v7_5.isEmpty())) {
            com.google.android.gms.internal.firebase-auth-api.zzahk v3_1 = ((com.google.android.gms.internal.firebase-auth-api.zzahk) v7_5.get(0));
            com.google.android.gms.internal.firebase-auth-api.zzail v4_1 = new com.google.android.gms.internal.firebase-auth-api.zzail();
            v4_1.zzd(this.zzb.zzc()).zza(this.zzc);
            com.google.android.gms.internal.firebase-auth-api.zzaar.zza(this.zze.zza, this.zzd, this.zzb, v3_1, v4_1, this.zza);
            return;
        } else {
            this.zza.zza("No users.");
            return;
        }
    }

    public final void zza(String p2)
    {
        this.zzd.zza(w0.a.k(p2));
        return;
    }
}
