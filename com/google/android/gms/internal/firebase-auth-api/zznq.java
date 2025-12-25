package com.google.android.gms.internal.firebase-auth-api;
public final class zznq {
    private static final java.util.logging.Logger zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zznq zzb;
    private java.util.concurrent.ConcurrentMap zzc;
    private java.util.concurrent.ConcurrentMap zzd;

    static zznq()
    {
        com.google.android.gms.internal.firebase-auth-api.zznq.zza = java.util.logging.Logger.getLogger(com.google.android.gms.internal.firebase-auth-api.zznq.getName());
        com.google.android.gms.internal.firebase-auth-api.zznq.zzb = new com.google.android.gms.internal.firebase-auth-api.zznq();
        return;
    }

    public zznq()
    {
        this.zzc = new java.util.concurrent.ConcurrentHashMap();
        this.zzd = new java.util.concurrent.ConcurrentHashMap();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zznq zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zznq.zzb;
    }

    private final declared_synchronized void zza(com.google.android.gms.internal.firebase-auth-api.zzbh p8, boolean p9, boolean p10)
    {
        String v0 = p8.zzb();
        if ((p10 != null) && (this.zzd.containsKey(v0))) {
            if (!((Boolean) this.zzd.get(v0)).booleanValue()) {
                String v9_2 = new StringBuilder("New keys are already disallowed for key type ");
                v9_2.append(v0);
                throw new java.security.GeneralSecurityException(v9_2.toString());
            } else {
            }
        }
        String v1_5 = ((com.google.android.gms.internal.firebase-auth-api.zzbh) this.zzc.get(v0));
        if (v1_5 != null) {
            if (!v1_5.getClass().equals(p8.getClass())) {
                String v5_1 = new StringBuilder("Attempted overwrite of a registered key manager for key type ");
                v5_1.append(v0);
                com.google.android.gms.internal.firebase-auth-api.zznq.zza.logp(java.util.logging.Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", v5_1.toString());
                String v1_8 = v1_5.getClass().getName();
                String v8_4 = p8.getClass().getName();
                StringBuilder v2_4 = new StringBuilder("typeUrl (");
                v2_4.append(v0);
                v2_4.append(") is already registered with ");
                v2_4.append(v1_8);
                v2_4.append(", cannot be re-registered with ");
                v2_4.append(v8_4);
                throw new java.security.GeneralSecurityException(v2_4.toString());
            } else {
            }
        }
        this.zzc.putIfAbsent(v0, p8);
        this.zzd.put(v0, Boolean.valueOf(p10));
        return;
    }

    private final declared_synchronized com.google.android.gms.internal.firebase-auth-api.zzbh zzc(String p4)
    {
        try {
            if (!this.zzc.containsKey(p4)) {
                StringBuilder v1_1 = new StringBuilder("No key manager found for key type ");
                v1_1.append(p4);
                v1_1.append(", see https://developers.google.com/tink/faq/registration_errors");
                throw new java.security.GeneralSecurityException(v1_1.toString());
            } else {
                return ((com.google.android.gms.internal.firebase-auth-api.zzbh) this.zzc.get(p4));
            }
        } catch (String v4_2) {
            throw v4_2;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzbh zza(String p1)
    {
        return this.zzc(p1);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzbh zza(String p6, Class p7)
    {
        String v6_1 = this.zzc(p6);
        if (!v6_1.zza().equals(p7)) {
            StringBuilder v7_2 = p7.getName();
            String v1_1 = String.valueOf(v6_1.getClass());
            String v6_3 = String.valueOf(v6_1.zza());
            StringBuilder v7_1 = v1.a.r("Primitive type ", v7_2, " not supported by key manager of type ", v1_1, ", which only supports: ");
            v7_1.append(v6_3);
            throw new java.security.GeneralSecurityException(v7_1.toString());
        } else {
            return v6_1;
        }
    }

    public final declared_synchronized void zza(com.google.android.gms.internal.firebase-auth-api.zzbh p1, com.google.android.gms.internal.firebase-auth-api.zziv$zza p2, boolean p3)
    {
        try {
            if (!p2.zza()) {
                throw new java.security.GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
            } else {
                this.zza(p1, 0, p3);
                return;
            }
        } catch (java.security.GeneralSecurityException v1_3) {
            throw v1_3;
        }
    }

    public final declared_synchronized void zza(com.google.android.gms.internal.firebase-auth-api.zzbh p2, boolean p3)
    {
        this.zza(p2, com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza, p3);
        return;
    }

    public final boolean zzb(String p2)
    {
        return ((Boolean) this.zzd.get(p2)).booleanValue();
    }
}
