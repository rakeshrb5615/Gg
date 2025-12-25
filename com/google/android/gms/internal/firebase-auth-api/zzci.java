package com.google.android.gms.internal.firebase-auth-api;
public final class zzci {

    static zzci()
    {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.firebase-auth-api.zzci.getName());
        new java.util.concurrent.ConcurrentHashMap();
        java.util.HashSet v0_4 = new java.util.HashSet();
        v0_4.add(com.google.android.gms.internal.firebase-auth-api.zzba);
        v0_4.add(com.google.android.gms.internal.firebase-auth-api.zzbe);
        v0_4.add(com.google.android.gms.internal.firebase-auth-api.zzck);
        v0_4.add(com.google.android.gms.internal.firebase-auth-api.zzbg);
        v0_4.add(com.google.android.gms.internal.firebase-auth-api.zzbd);
        v0_4.add(com.google.android.gms.internal.firebase-auth-api.zzcc);
        v0_4.add(com.google.android.gms.internal.firebase-auth-api.zzsq);
        v0_4.add(com.google.android.gms.internal.firebase-auth-api.zzcg);
        v0_4.add(com.google.android.gms.internal.firebase-auth-api.zzcf);
        java.util.Collections.unmodifiableSet(v0_4);
        return;
    }

    private zzci()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzwx zza(String p2, com.google.android.gms.internal.firebase-auth-api.zzajv p3)
    {
        String v0_2 = com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(p2);
        if (!(v0_2 instanceof com.google.android.gms.internal.firebase-auth-api.zzcd)) {
            throw new java.security.GeneralSecurityException(v1.a.l("manager for key type ", p2, " is not a PrivateKeyManager"));
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzcd) v0_2).zzc(p3);
        }
    }
}
