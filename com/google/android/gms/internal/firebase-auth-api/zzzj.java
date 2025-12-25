package com.google.android.gms.internal.firebase-auth-api;
public final class zzzj {
    public static final com.google.android.gms.internal.firebase-auth-api.zzzj zza;
    public static final com.google.android.gms.internal.firebase-auth-api.zzzj zzb;
    public static final com.google.android.gms.internal.firebase-auth-api.zzzj zzc;
    public static final com.google.android.gms.internal.firebase-auth-api.zzzj zzd;
    public static final com.google.android.gms.internal.firebase-auth-api.zzzj zze;
    private final com.google.android.gms.internal.firebase-auth-api.zzzn zzf;

    static zzzj()
    {
        com.google.android.gms.internal.firebase-auth-api.zzzj.zza = new com.google.android.gms.internal.firebase-auth-api.zzzj(new com.google.android.gms.internal.firebase-auth-api.zzzs());
        com.google.android.gms.internal.firebase-auth-api.zzzj.zzb = new com.google.android.gms.internal.firebase-auth-api.zzzj(new com.google.android.gms.internal.firebase-auth-api.zzzw());
        new com.google.android.gms.internal.firebase-auth-api.zzzj(new com.google.android.gms.internal.firebase-auth-api.zzzy());
        new com.google.android.gms.internal.firebase-auth-api.zzzj(new com.google.android.gms.internal.firebase-auth-api.zzzv());
        com.google.android.gms.internal.firebase-auth-api.zzzj.zzc = new com.google.android.gms.internal.firebase-auth-api.zzzj(new com.google.android.gms.internal.firebase-auth-api.zzzr());
        com.google.android.gms.internal.firebase-auth-api.zzzj.zzd = new com.google.android.gms.internal.firebase-auth-api.zzzj(new com.google.android.gms.internal.firebase-auth-api.zzzt());
        com.google.android.gms.internal.firebase-auth-api.zzzj.zze = new com.google.android.gms.internal.firebase-auth-api.zzzj(new com.google.android.gms.internal.firebase-auth-api.zzzu());
        return;
    }

    private zzzj(com.google.android.gms.internal.firebase-auth-api.zzzp p3)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zziv.zzb()) {
            if (!com.google.android.gms.internal.firebase-auth-api.zzaaf.zza()) {
                this.zzf = new com.google.android.gms.internal.firebase-auth-api.zzzl(p3, 0);
                return;
            } else {
                this.zzf = new com.google.android.gms.internal.firebase-auth-api.zzzm(p3, 0);
                return;
            }
        } else {
            this.zzf = new com.google.android.gms.internal.firebase-auth-api.zzzo(p3, 0);
            return;
        }
    }

    public static varargs java.util.List zza(String[] p4)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        int v1 = p4.length;
        int v2 = 0;
        while (v2 < v1) {
            java.security.Provider v3_1 = java.security.Security.getProvider(p4[v2]);
            if (v3_1 != null) {
                v0_1.add(v3_1);
            }
            v2++;
        }
        return v0_1;
    }

    public final Object zza(String p2)
    {
        return this.zzf.zza(p2);
    }
}
