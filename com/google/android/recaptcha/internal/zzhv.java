package com.google.android.recaptcha.internal;
public final class zzhv {
    private static final com.google.android.recaptcha.internal.zzhu zza;
    private final com.google.android.recaptcha.internal.zzhu zzb;
    private long zzc;

    static zzhv()
    {
        com.google.android.recaptcha.internal.zzhv.zza = new com.google.android.recaptcha.internal.zzhu(11, (20919936621 ^ ((long) Math.pow(4611686018427387904, 4629700416936869888))), ((long) Math.pow(4611686018427387904, 4631952216750555136)));
        return;
    }

    public zzhv(long p1, long p3, com.google.android.recaptcha.internal.zzhu p5)
    {
        this.zzb = p5;
        this.zzc = Math.abs(p1);
        return;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzhu zzb()
    {
        return com.google.android.recaptcha.internal.zzhv.zza;
    }

    public final long zza()
    {
        long v0_0 = this.zzb;
        long v0_5 = ((java.math.BigInteger.valueOf(v0_0.zzb()).multiply(java.math.BigInteger.valueOf(this.zzc)).mod(java.math.BigInteger.valueOf(v0_0.zza())).longValue() + 11) % this.zzb.zza());
        this.zzc = v0_5;
        return (v0_5 % 255);
    }
}
