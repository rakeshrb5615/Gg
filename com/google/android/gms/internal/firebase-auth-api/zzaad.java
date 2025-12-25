package com.google.android.gms.internal.firebase-auth-api;
final class zzaad extends java.lang.ThreadLocal {
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzaae zza;

    public zzaad(com.google.android.gms.internal.firebase-auth-api.zzaae p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    private final javax.crypto.Mac zza()
    {
        try {
            java.security.GeneralSecurityException v0_3 = ((javax.crypto.Mac) com.google.android.gms.internal.firebase-auth-api.zzzj.zzb.zza(com.google.android.gms.internal.firebase-auth-api.zzaae.zza(this.zza)));
            v0_3.init(com.google.android.gms.internal.firebase-auth-api.zzaae.zzb(this.zza));
            return v0_3;
        } catch (java.security.GeneralSecurityException v0_1) {
            throw new IllegalStateException(v0_1);
        }
    }

    public final synthetic Object initialValue()
    {
        return this.zza();
    }
}
