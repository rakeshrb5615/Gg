package com.google.android.gms.internal.firebase-auth-api;
public final class zznb implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private static final String zza = "zznb";
    private final com.google.android.gms.internal.firebase-auth-api.zzba zzb;

    public zznb(String p1)
    {
        this.zzb = com.google.android.gms.internal.firebase-auth-api.zzmz.zza(p1);
        return;
    }

    private static void zza()
    {
        try {
            Thread.sleep(((long) ((int) (Math.random() * 4636737291354636288))));
        } catch (InterruptedException) {
        }
        return;
    }

    public final byte[] zza(byte[] p4, byte[] p5)
    {
        try {
            byte[] v4_3 = this.zzb.zza(p4, p5);
            return v4_3;
        } catch (byte[] v4_2) {
            throw v4_2;
        } catch (com.google.android.gms.internal.firebase-auth-api.zzba v0_2) {
            android.util.Log.w(com.google.android.gms.internal.firebase-auth-api.zznb.zza, "encountered a potentially transient KeyStore error, will wait and retry", v0_2);
            com.google.android.gms.internal.firebase-auth-api.zznb.zza();
            return this.zzb.zza(v4_3, p5);
        } catch (com.google.android.gms.internal.firebase-auth-api.zzba v0_2) {
            android.util.Log.w(com.google.android.gms.internal.firebase-auth-api.zznb.zza, "encountered a potentially transient KeyStore error, will wait and retry", v0_2);
            com.google.android.gms.internal.firebase-auth-api.zznb.zza();
            return this.zzb.zza(v4_3, p5);
        }
    }

    public final byte[] zzb(byte[] p4, byte[] p5)
    {
        try {
            byte[] v4_2 = this.zzb.zzb(p4, p5);
            return v4_2;
        } catch (com.google.android.gms.internal.firebase-auth-api.zzba v0_2) {
            android.util.Log.w(com.google.android.gms.internal.firebase-auth-api.zznb.zza, "encountered a potentially transient KeyStore error, will wait and retry", v0_2);
            com.google.android.gms.internal.firebase-auth-api.zznb.zza();
            return this.zzb.zzb(v4_2, p5);
        } catch (com.google.android.gms.internal.firebase-auth-api.zzba v0_2) {
            android.util.Log.w(com.google.android.gms.internal.firebase-auth-api.zznb.zza, "encountered a potentially transient KeyStore error, will wait and retry", v0_2);
            com.google.android.gms.internal.firebase-auth-api.zznb.zza();
            return this.zzb.zzb(v4_2, p5);
        }
    }
}
