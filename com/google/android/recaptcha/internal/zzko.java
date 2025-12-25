package com.google.android.recaptcha.internal;
public abstract class zzko implements com.google.android.recaptcha.internal.zzoi {
    protected int zza;

    public zzko()
    {
        this.zza = 0;
        return;
    }

    public static void zzc(Iterable p0, java.util.List p1)
    {
        com.google.android.recaptcha.internal.zzkn.zzd(p0, p1);
        return;
    }

    public int zza(com.google.android.recaptcha.internal.zzow p1)
    {
        throw 0;
    }

    public final com.google.android.recaptcha.internal.zzle zzb()
    {
        try {
            java.io.IOException v0_0 = this.zzo();
            String v1_3 = new byte[v0_0];
            RuntimeException v2_3 = new com.google.android.recaptcha.internal.zzlk(v1_3, 0, v0_0);
            this.zze(v2_3);
            v2_3.zzC();
            return new com.google.android.recaptcha.internal.zzlc(v1_3);
        } catch (java.io.IOException v0_2) {
            throw new RuntimeException(v1.a.l("Serializing ", this.getClass().getName(), " to a ByteString threw an IOException (should never happen)."), v0_2);
        }
    }

    public final byte[] zzd()
    {
        try {
            java.io.IOException v0_0 = this.zzo();
            String v1_3 = new byte[v0_0];
            RuntimeException v2_3 = new com.google.android.recaptcha.internal.zzlk(v1_3, 0, v0_0);
            this.zze(v2_3);
            v2_3.zzC();
            return v1_3;
        } catch (java.io.IOException v0_1) {
            throw new RuntimeException(v1.a.l("Serializing ", this.getClass().getName(), " to a byte array threw an IOException (should never happen)."), v0_1);
        }
    }
}
