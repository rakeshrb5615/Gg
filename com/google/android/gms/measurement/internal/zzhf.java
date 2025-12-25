package com.google.android.gms.measurement.internal;
public final class zzhf {
    final String zza;
    final synthetic com.google.android.gms.measurement.internal.zzhh zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    public synthetic zzhf(com.google.android.gms.measurement.internal.zzhh p1, String p2, long p3, byte[] p5)
    {
        String v1_7;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("health_monitor");
        if (p3 <= 0) {
            v1_7 = 0;
        } else {
            v1_7 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1_7);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = p3;
        return;
    }

    private final void zzc()
    {
        android.content.SharedPreferences$Editor v0_0 = this.zzb;
        v0_0.zzg();
        long v1_2 = v0_0.zzu.zzaZ().currentTimeMillis();
        android.content.SharedPreferences$Editor v0_1 = v0_0.zzd().edit();
        v0_1.remove(this.zzc);
        v0_1.remove(this.zzd);
        v0_1.putLong(this.zza, v1_2);
        v0_1.apply();
        return;
    }

    private final long zzd()
    {
        return this.zzb.zzd().getLong(this.zza, 0);
    }

    public final void zza(String p11, long p12)
    {
        android.content.SharedPreferences$Editor v12_0 = this.zzb;
        v12_0.zzg();
        if (this.zzd() == 0) {
            this.zzc();
        }
        if (p11 == null) {
            p11 = "";
        }
        String v0_0 = this.zzc;
        long v4_0 = v12_0.zzd().getLong(v0_0, 0);
        if (v4_0 > 0) {
            long v6_1 = (v12_0.zzu.zzk().zzf().nextLong() & 9223372036854775807);
            long v4_1 = (v4_0 + 1);
            long v8_1 = (9223372036854775807 / v4_1);
            android.content.SharedPreferences$Editor v12_2 = v12_0.zzd().edit();
            if (v6_1 < v8_1) {
                v12_2.putString(this.zzd, p11);
            }
            v12_2.putLong(v0_0, v4_1);
            v12_2.apply();
            return;
        } else {
            android.content.SharedPreferences$Editor v12_4 = v12_0.zzd().edit();
            v12_4.putString(this.zzd, p11);
            v12_4.putLong(v0_0, 1);
            v12_4.apply();
            return;
        }
    }

    public final android.util.Pair zzb()
    {
        String v1_1;
        android.util.Pair v0_0 = this.zzb;
        v0_0.zzg();
        v0_0.zzg();
        String v1_5 = this.zzd();
        if (v1_5 != 0) {
            v1_1 = Math.abs((v1_5 - v0_0.zzu.zzaZ().currentTimeMillis()));
        } else {
            this.zzc();
            v1_1 = 0;
        }
        long v5_2 = this.zze;
        if (v1_1 >= v5_2) {
            if (v1_1 <= (v5_2 + v5_2)) {
                String v1_4 = v0_0.zzd().getString(this.zzd, 0);
                long v5_4 = v0_0.zzd().getLong(this.zzc, 0);
                this.zzc();
                if ((v1_4 != null) && (v5_4 > 0)) {
                    return new android.util.Pair(v1_4, Long.valueOf(v5_4));
                } else {
                    return com.google.android.gms.measurement.internal.zzhh.zza;
                }
            } else {
                this.zzc();
                return 0;
            }
        } else {
            return 0;
        }
    }
}
