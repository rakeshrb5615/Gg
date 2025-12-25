package com.google.android.gms.internal.firebase-auth-api;
public final class zzbc implements com.google.android.gms.internal.firebase-auth-api.zzby {
    private final java.io.OutputStream zza;

    private zzbc(java.io.OutputStream p1)
    {
        this.zza = p1;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzby zza(java.io.OutputStream p1)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzbc(p1);
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzvv p2)
    {
        try {
            ((com.google.android.gms.internal.firebase-auth-api.zzvv) ((com.google.android.gms.internal.firebase-auth-api.zzalf) ((com.google.android.gms.internal.firebase-auth-api.zzvv$zza) p2.zzn()).zza().zze())).zza(this.zza);
            this.zza.close();
            return;
        } catch (Throwable v2_3) {
            this.zza.close();
            throw v2_3;
        }
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzxh p2)
    {
        try {
            p2.zza(this.zza);
            this.zza.close();
            return;
        } catch (Throwable v2_2) {
            this.zza.close();
            throw v2_2;
        }
    }
}
