package com.google.android.gms.internal.measurement;
public interface zzak {

    public static com.google.android.gms.internal.measurement.zzao zzu(com.google.android.gms.internal.measurement.zzak p2, com.google.android.gms.internal.measurement.zzao p3, com.google.android.gms.internal.measurement.zzg p4, java.util.List p5)
    {
        if (!p2.zzj(p3.zzc())) {
            if (!"hasOwnProperty".equals(p3.zzc())) {
                throw new IllegalArgumentException(g2.g.l("Object has no function ", p3.zzc()));
            } else {
                com.google.android.gms.internal.measurement.zzh.zza("hasOwnProperty", 1, p5);
                if (!p2.zzj(p4.zza(((com.google.android.gms.internal.measurement.zzao) p5.get(0))).zzc())) {
                    return com.google.android.gms.internal.measurement.zzao.zzl;
                } else {
                    return com.google.android.gms.internal.measurement.zzao.zzk;
                }
            }
        } else {
            com.google.android.gms.internal.measurement.zzao v2_6 = p2.zzk(p3.zzc());
            if (!(v2_6 instanceof com.google.android.gms.internal.measurement.zzai)) {
                throw new IllegalArgumentException(g2.g.d(p3.zzc(), " is not a function"));
            } else {
                return ((com.google.android.gms.internal.measurement.zzai) v2_6).zza(p4, p5);
            }
        }
    }

    public static java.util.Iterator zzv(java.util.Map p1)
    {
        return new com.google.android.gms.internal.measurement.zzaj(p1.keySet().iterator());
    }

    public abstract boolean zzj();

    public abstract com.google.android.gms.internal.measurement.zzao zzk();

    public abstract void zzm();
}
