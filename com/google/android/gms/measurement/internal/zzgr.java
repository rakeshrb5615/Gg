package com.google.android.gms.measurement.internal;
final class zzgr implements java.lang.Runnable {
    final synthetic int zza;
    final synthetic String zzb;
    final synthetic Object zzc;
    final synthetic Object zzd;
    final synthetic Object zze;
    final synthetic com.google.android.gms.measurement.internal.zzgu zzf;

    public zzgr(com.google.android.gms.measurement.internal.zzgu p1, int p2, String p3, Object p4, Object p5, Object p6)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p6;
        java.util.Objects.requireNonNull(p1);
        this.zzf = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzhf v0_0 = this.zzf;
        String v1_1 = v0_0.zzu.zzd();
        if (!v1_1.zzv()) {
            android.util.Log.println(6, v0_0.zzn(), "Persisted config not initialized. Not logging error/warn");
            return;
        } else {
            if (v0_0.zzr() == 0) {
                String v2_2 = v0_0.zzu;
                if (!v2_2.zzc().zzj()) {
                    v2_2.zzaU();
                    v0_0.zzs(99);
                } else {
                    v2_2.zzaU();
                    v0_0.zzs(67);
                }
            }
            if (v0_0.zzt() < 0) {
                v0_0.zzu.zzc().zzi();
                v0_0.zzu(133005);
            }
            String v2_10 = this.zza;
            long v3_2 = v0_0.zzr();
            int v4_1 = v0_0.zzt();
            com.google.android.gms.measurement.internal.zzhf v0_1 = this.zzb;
            String v6_0 = this.zzc;
            String v7_0 = this.zzd;
            int v8_0 = this.zze;
            String v2_12 = "01VDIWEA?".charAt(v2_10);
            String v6_1 = com.google.android.gms.measurement.internal.zzgu.zzo(1, v0_1, v6_0, v7_0, v8_0);
            StringBuilder v9_3 = new StringBuilder((((((String.valueOf(v2_12).length() + 1) + String.valueOf(v3_2).length()) + String.valueOf(v4_1).length()) + 1) + v6_1.length()));
            v9_3.append("2");
            v9_3.append(v2_12);
            v9_3.append(v3_2);
            v9_3.append(v4_1);
            v9_3.append(":");
            v9_3.append(v6_1);
            String v2_14 = v9_3.toString();
            if (v2_14.length() > 1024) {
                v2_14 = v0_1.substring(0, 1024);
            }
            com.google.android.gms.measurement.internal.zzhf v0_3 = v1_1.zzb;
            if (v0_3 != null) {
                v0_3.zza(v2_14, 1);
            }
            return;
        }
    }
}
