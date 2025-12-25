package com.google.android.gms.common;
public class zzy {
    private static final com.google.android.gms.common.zzy zze;
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    static zzy()
    {
        com.google.android.gms.common.zzy.zze = new com.google.android.gms.common.zzy(1, 3, 1, 0, 0, -1);
        return;
    }

    private zzy(boolean p1, int p2, int p3, String p4, Throwable p5, long p6)
    {
        this.zza = p1;
        this.zzd = p2;
        this.zzb = p4;
        this.zzc = p5;
        return;
    }

    public synthetic zzy(boolean p1, int p2, int p3, String p4, Throwable p5, long p6, byte[] p8)
    {
        this(0, 1, 5, 0, 0, -1);
        return;
    }

    public static com.google.android.gms.common.zzy zzb()
    {
        return com.google.android.gms.common.zzy.zze;
    }

    public static com.google.android.gms.common.zzy zzc(String p8)
    {
        return new com.google.android.gms.common.zzy(0, 1, 5, p8, 0, -1);
    }

    public static com.google.android.gms.common.zzy zzd(String p8, Throwable p9)
    {
        return new com.google.android.gms.common.zzy(0, 1, 5, p8, p9, -1);
    }

    public static com.google.android.gms.common.zzy zzf(int p8, long p9)
    {
        return new com.google.android.gms.common.zzy(1, p8, 1, 0, 0, p9);
    }

    public static com.google.android.gms.common.zzy zzg(int p8, int p9, String p10, Throwable p11)
    {
        return new com.google.android.gms.common.zzy(0, p8, p9, p10, p11, -1);
    }

    public String zza()
    {
        return this.zzb;
    }

    public final void zze()
    {
        if ((!this.zza) && (android.util.Log.isLoggable("GoogleCertificatesRslt", 3))) {
            String v0_4 = this.zzc;
            if (v0_4 == null) {
                android.util.Log.d("GoogleCertificatesRslt", this.zza());
            } else {
                android.util.Log.d("GoogleCertificatesRslt", this.zza(), v0_4);
                return;
            }
        }
        return;
    }
}
