package com.google.android.gms.internal.firebase-auth-api;
final class zzaax implements com.google.android.gms.internal.firebase-auth-api.zzafv {
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzafs zza;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzael zzb;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzahv zzc;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzail zzd;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzaar zze;

    public zzaax(com.google.android.gms.internal.firebase-auth-api.zzaar p1, com.google.android.gms.internal.firebase-auth-api.zzafs p2, com.google.android.gms.internal.firebase-auth-api.zzael p3, com.google.android.gms.internal.firebase-auth-api.zzahv p4, com.google.android.gms.internal.firebase-auth-api.zzail p5)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        java.util.Objects.requireNonNull(p1);
        this.zze = p1;
        return;
    }

    public final synthetic void zza(Object p8)
    {
        Object v8_4 = ((com.google.android.gms.internal.firebase-auth-api.zzahl) p8).zza();
        if ((v8_4 != null) && (!v8_4.isEmpty())) {
            com.google.android.gms.internal.firebase-auth-api.zzaar.zza(this.zze, this.zzb, this.zzc, ((com.google.android.gms.internal.firebase-auth-api.zzahk) v8_4.get(0)), this.zzd, this.zza);
            return;
        } else {
            this.zza.zza("No users");
            return;
        }
    }

    public final void zza(String p2)
    {
        this.zza.zza(p2);
        return;
    }
}
