package com.google.android.gms.internal.firebase-auth-api;
final class zzabr implements com.google.android.gms.internal.firebase-auth-api.zzafv {
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzael zza;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzabs zzb;

    public zzabr(com.google.android.gms.internal.firebase-auth-api.zzabs p1, com.google.android.gms.internal.firebase-auth-api.zzael p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final synthetic void zza(Object p11)
    {
        if ((!android.text.TextUtils.isEmpty(((com.google.android.gms.internal.firebase-auth-api.zzajl) p11).zza())) && (!android.text.TextUtils.isEmpty(((com.google.android.gms.internal.firebase-auth-api.zzajl) p11).zzb()))) {
            com.google.android.gms.internal.firebase-auth-api.zzaar.zza(this.zzb.zza, new com.google.android.gms.internal.firebase-auth-api.zzahv(((com.google.android.gms.internal.firebase-auth-api.zzajl) p11).zzb(), ((com.google.android.gms.internal.firebase-auth-api.zzajl) p11).zza(), Long.valueOf(com.google.android.gms.internal.firebase-auth-api.zzahx.zza(((com.google.android.gms.internal.firebase-auth-api.zzajl) p11).zza())), "Bearer"), 0, 0, Boolean.FALSE, 0, this.zza, this);
            return;
        } else {
            this.zza.zza(w0.a.k("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
    }

    public final void zza(String p2)
    {
        this.zza.zza(w0.a.k(p2));
        return;
    }
}
