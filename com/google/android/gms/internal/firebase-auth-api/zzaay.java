package com.google.android.gms.internal.firebase-auth-api;
final class zzaay implements com.google.android.gms.internal.firebase-auth-api.zzafv {
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzael zza;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzaar zzb;

    public zzaay(com.google.android.gms.internal.firebase-auth-api.zzaar p1, com.google.android.gms.internal.firebase-auth-api.zzael p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final synthetic void zza(Object p13)
    {
        if (!((com.google.android.gms.internal.firebase-auth-api.zzagw) p13).zzf()) {
            com.google.android.gms.internal.firebase-auth-api.zzaar.zza(this.zzb, new com.google.android.gms.internal.firebase-auth-api.zzahv(((com.google.android.gms.internal.firebase-auth-api.zzagw) p13).zzd(), ((com.google.android.gms.internal.firebase-auth-api.zzagw) p13).zzb(), Long.valueOf(((com.google.android.gms.internal.firebase-auth-api.zzagw) p13).zza()), "Bearer"), 0, 0, Boolean.valueOf(((com.google.android.gms.internal.firebase-auth-api.zzagw) p13).zzg()), 0, this.zza, this);
            return;
        } else {
            this.zza.zza(new com.google.android.gms.internal.firebase-auth-api.zzaas(((com.google.android.gms.internal.firebase-auth-api.zzagw) p13).zzc(), ((com.google.android.gms.internal.firebase-auth-api.zzagw) p13).zze(), 0));
            return;
        }
    }

    public final void zza(String p2)
    {
        this.zza.zza(w0.a.k(p2));
        return;
    }
}
