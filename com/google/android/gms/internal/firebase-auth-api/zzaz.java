package com.google.android.gms.internal.firebase-auth-api;
public final class zzaz implements com.google.android.gms.internal.firebase-auth-api.zzbv {
    private final java.io.InputStream zza;

    private zzaz(java.io.InputStream p1)
    {
        this.zza = p1;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzbv zza(byte[] p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzaz(new java.io.ByteArrayInputStream(p2));
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzvv zza()
    {
        try {
            Throwable v0_1 = com.google.android.gms.internal.firebase-auth-api.zzvv.zza(this.zza, com.google.android.gms.internal.firebase-auth-api.zzaku.zza());
            this.zza.close();
            return v0_1;
        } catch (Throwable v0_2) {
            this.zza.close();
            throw v0_2;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzxh zzb()
    {
        try {
            Throwable v0_1 = com.google.android.gms.internal.firebase-auth-api.zzxh.zza(this.zza, com.google.android.gms.internal.firebase-auth-api.zzaku.zza());
            this.zza.close();
            return v0_1;
        } catch (Throwable v0_2) {
            this.zza.close();
            throw v0_2;
        }
    }
}
