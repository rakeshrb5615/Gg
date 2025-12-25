package com.google.android.gms.internal.fido;
public abstract class zzch {
    private static final com.google.android.gms.internal.fido.zzch zza;
    private static final com.google.android.gms.internal.fido.zzch zzb;
    private static final com.google.android.gms.internal.fido.zzch zzc;
    private static final com.google.android.gms.internal.fido.zzch zzd;
    private static final com.google.android.gms.internal.fido.zzch zze;

    static zzch()
    {
        String v1_2 = Character.valueOf(61);
        com.google.android.gms.internal.fido.zzch.zza = new com.google.android.gms.internal.fido.zzcf("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", v1_2);
        com.google.android.gms.internal.fido.zzch.zzb = new com.google.android.gms.internal.fido.zzcf("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", v1_2);
        com.google.android.gms.internal.fido.zzch.zzc = new com.google.android.gms.internal.fido.zzcg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", v1_2);
        com.google.android.gms.internal.fido.zzch.zzd = new com.google.android.gms.internal.fido.zzcg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", v1_2);
        com.google.android.gms.internal.fido.zzch.zze = new com.google.android.gms.internal.fido.zzce("base16()", "0123456789ABCDEF");
        return;
    }

    public zzch()
    {
        return;
    }

    public static com.google.android.gms.internal.fido.zzch zzf()
    {
        return com.google.android.gms.internal.fido.zzch.zze;
    }

    public abstract void zzb();

    public abstract int zzc();

    public abstract com.google.android.gms.internal.fido.zzch zzd();

    public final String zzg(byte[] p3, int p4, int p5)
    {
        com.google.android.gms.internal.fido.zzap.zze(0, p5, p3.length);
        AssertionError v4_4 = new StringBuilder(this.zzc(p5));
        try {
            this.zzb(v4_4, p3, 0, p5);
            return v4_4.toString();
        } catch (java.io.IOException v3_1) {
            throw new AssertionError(v3_1);
        }
    }
}
