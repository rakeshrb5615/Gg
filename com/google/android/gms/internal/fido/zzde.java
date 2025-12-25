package com.google.android.gms.internal.fido;
public final class zzde {
    static final java.nio.charset.Charset zza;
    static final java.nio.charset.Charset zzb;
    static final java.nio.charset.Charset zzc;
    public static final byte[] zzd;
    public static final java.nio.ByteBuffer zze;
    public static final com.google.android.gms.internal.fido.zzdd zzf;

    static zzde()
    {
        com.google.android.gms.internal.fido.zzde.zza = java.nio.charset.Charset.forName("US-ASCII");
        com.google.android.gms.internal.fido.zzde.zzb = java.nio.charset.Charset.forName("UTF-8");
        com.google.android.gms.internal.fido.zzde.zzc = java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] v2 = new byte[0];
        com.google.android.gms.internal.fido.zzde.zzd = v2;
        com.google.android.gms.internal.fido.zzde.zze = java.nio.ByteBuffer.wrap(v2);
        IllegalArgumentException v1_2 = new com.google.android.gms.internal.fido.zzdb(v2, 0, 0, 0, 0);
        try {
            v1_2.zza(0);
            com.google.android.gms.internal.fido.zzde.zzf = v1_2;
            return;
        } catch (com.google.android.gms.internal.fido.zzdf v0_4) {
            throw new IllegalArgumentException(v0_4);
        }
    }
}
