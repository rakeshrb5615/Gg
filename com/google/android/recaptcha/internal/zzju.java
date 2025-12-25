package com.google.android.recaptcha.internal;
final class zzju extends com.google.android.recaptcha.internal.zzjv implements java.io.Serializable {
    final byte[] zza;

    public zzju(byte[] p1)
    {
        p1.getClass();
        this.zza = p1;
        return;
    }

    public final int zza()
    {
        IllegalStateException v0_0 = this.zza;
        String v1_0 = v0_0.length;
        if (v1_0 < 4) {
            throw new IllegalStateException(com.google.android.recaptcha.internal.zzji.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", new Object[] {Integer.valueOf(v1_0)})));
        } else {
            return (((v0_0[3] & 255) << 24) | (((v0_0[0] & 255) | ((v0_0[1] & 255) << 8)) | ((v0_0[2] & 255) << 16)));
        }
    }

    public final int zzb()
    {
        return (this.zza.length * 8);
    }

    public final boolean zzc(com.google.android.recaptcha.internal.zzjv p7)
    {
        if (this.zza.length != p7.zze().length) {
            return 0;
        } else {
            int v3 = 1;
            int v1_0 = 0;
            while(true) {
                int v4_0 = this.zza;
                if (v1_0 >= v4_0.length) {
                    break;
                }
                int v4_2;
                if (v4_0[v1_0] != p7.zze()[v1_0]) {
                    v4_2 = 0;
                } else {
                    v4_2 = 1;
                }
                v3 &= v4_2;
                v1_0++;
            }
            return v3;
        }
    }

    public final byte[] zzd()
    {
        return ((byte[]) this.zza.clone());
    }

    public final byte[] zze()
    {
        return this.zza;
    }
}
