package com.google.android.gms.internal.firebase-auth-api;
final class zzabm implements com.google.android.gms.internal.firebase-auth-api.zzafv {
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzael zza;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzafv zzb;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzabj zzc;

    public zzabm(com.google.android.gms.internal.firebase-auth-api.zzabj p1, com.google.android.gms.internal.firebase-auth-api.zzael p2, com.google.android.gms.internal.firebase-auth-api.zzafv p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void zza(Object p12)
    {
        if (android.text.TextUtils.isEmpty(((com.google.android.gms.internal.firebase-auth-api.zzajj) p12).zze())) {
            com.google.android.gms.internal.firebase-auth-api.zzaar.zza(this.zzc.zza, new com.google.android.gms.internal.firebase-auth-api.zzahv(((com.google.android.gms.internal.firebase-auth-api.zzajj) p12).zzd(), ((com.google.android.gms.internal.firebase-auth-api.zzajj) p12).zzb(), Long.valueOf(((com.google.android.gms.internal.firebase-auth-api.zzajj) p12).zza()), "Bearer"), 0, "phone", Boolean.valueOf(((com.google.android.gms.internal.firebase-auth-api.zzajj) p12).zzf()), 0, this.zza, this.zzb);
            return;
        } else {
            this.zza.zza(new com.google.android.gms.common.api.Status(17025), new y4.s(0, 0, ((com.google.android.gms.internal.firebase-auth-api.zzajj) p12).zzc(), ((com.google.android.gms.internal.firebase-auth-api.zzajj) p12).zze(), 1));
            return;
        }
    }

    public final void zza(String p2)
    {
        this.zzb.zza(p2);
        return;
    }
}
