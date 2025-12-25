package com.google.android.gms.internal.measurement;
public interface zzao {
    public static final com.google.android.gms.internal.measurement.zzao zzf;
    public static final com.google.android.gms.internal.measurement.zzao zzg;
    public static final com.google.android.gms.internal.measurement.zzao zzh;
    public static final com.google.android.gms.internal.measurement.zzao zzi;
    public static final com.google.android.gms.internal.measurement.zzao zzj;
    public static final com.google.android.gms.internal.measurement.zzao zzk;
    public static final com.google.android.gms.internal.measurement.zzao zzl;
    public static final com.google.android.gms.internal.measurement.zzao zzm;

    static zzao()
    {
        com.google.android.gms.internal.measurement.zzao.zzf = new com.google.android.gms.internal.measurement.zzat();
        com.google.android.gms.internal.measurement.zzao.zzg = new com.google.android.gms.internal.measurement.zzam();
        com.google.android.gms.internal.measurement.zzao.zzh = new com.google.android.gms.internal.measurement.zzag("continue");
        com.google.android.gms.internal.measurement.zzao.zzi = new com.google.android.gms.internal.measurement.zzag("break");
        com.google.android.gms.internal.measurement.zzao.zzj = new com.google.android.gms.internal.measurement.zzag("return");
        com.google.android.gms.internal.measurement.zzao.zzk = new com.google.android.gms.internal.measurement.zzaf(Boolean.TRUE);
        com.google.android.gms.internal.measurement.zzao.zzl = new com.google.android.gms.internal.measurement.zzaf(Boolean.FALSE);
        com.google.android.gms.internal.measurement.zzao.zzm = new com.google.android.gms.internal.measurement.zzas("");
        return;
    }

    public abstract String zzc();

    public abstract com.google.android.gms.internal.measurement.zzao zzcA();

    public abstract Double zzd();

    public abstract Boolean zze();

    public abstract java.util.Iterator zzf();

    public abstract com.google.android.gms.internal.measurement.zzao zzt();
}
