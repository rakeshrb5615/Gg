package com.google.android.recaptcha.internal;
public abstract class zzkh {
    private static final com.google.android.recaptcha.internal.zzkh zza;
    private static final com.google.android.recaptcha.internal.zzkh zzb;

    static zzkh()
    {
        int v2_7;
        char[] v1_3 = Character.valueOf(61);
        com.google.android.recaptcha.internal.zzkh.zza = new com.google.android.recaptcha.internal.zzke("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", v1_3);
        com.google.android.recaptcha.internal.zzkh.zzb = new com.google.android.recaptcha.internal.zzke("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", v1_3);
        new com.google.android.recaptcha.internal.zzkg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", v1_3);
        new com.google.android.recaptcha.internal.zzkg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", v1_3);
        com.google.android.recaptcha.internal.zzkd v0_5 = new com.google.android.recaptcha.internal.zzkd("base16()", "0123456789ABCDEF".toCharArray());
        new com.google.android.recaptcha.internal.zzkg(v0_5, 0);
        char[] v1_5 = new char[512];
        int v4 = 0;
        if (com.google.android.recaptcha.internal.zzkd.zze(v0_5).length != 16) {
            v2_7 = 0;
        } else {
            v2_7 = 1;
        }
        com.google.android.recaptcha.internal.zzjf.zza(v2_7);
        while (v4 < 256) {
            v1_5[v4] = v0_5.zza((v4 >> 4));
            v1_5[(v4 | 256)] = v0_5.zza((v4 & 15));
            v4++;
        }
        return;
    }

    public zzkh()
    {
        return;
    }

    public static com.google.android.recaptcha.internal.zzkh zzg()
    {
        return com.google.android.recaptcha.internal.zzkh.zza;
    }

    public static com.google.android.recaptcha.internal.zzkh zzh()
    {
        return com.google.android.recaptcha.internal.zzkh.zzb;
    }

    public abstract int zza();

    public abstract void zzb();

    public abstract int zzc();

    public abstract int zzd();

    public CharSequence zze(CharSequence p1)
    {
        throw 0;
    }

    public final String zzi(byte[] p3, int p4, int p5)
    {
        com.google.android.recaptcha.internal.zzjf.zzd(0, p5, p3.length);
        AssertionError v4_4 = new StringBuilder(this.zzd(p5));
        try {
            this.zzb(v4_4, p3, 0, p5);
            return v4_4.toString();
        } catch (java.io.IOException v3_1) {
            throw new AssertionError(v3_1);
        }
    }

    public final byte[] zzj(CharSequence p4)
    {
        try {
            com.google.android.recaptcha.internal.zzkf v4_1 = this.zze(p4);
            byte[] v0_4 = this.zzc(v4_1.length());
            byte[] v1 = new byte[v0_4];
            com.google.android.recaptcha.internal.zzkf v4_3 = this.zza(v1, v4_1);
        } catch (com.google.android.recaptcha.internal.zzkf v4_2) {
            throw new IllegalArgumentException(v4_2);
        }
        if (v4_3 != v0_4) {
            byte[] v0_0 = new byte[v4_3];
            System.arraycopy(v1, 0, v0_0, 0, v4_3);
            return v0_0;
        } else {
            return v1;
        }
    }
}
