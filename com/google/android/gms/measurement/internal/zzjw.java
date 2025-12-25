package com.google.android.gms.measurement.internal;
final class zzjw implements p4.a {
    final synthetic com.google.android.gms.measurement.internal.zzoh zza;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzb;

    public zzjw(com.google.android.gms.measurement.internal.zzlj p1, com.google.android.gms.measurement.internal.zzoh p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    private final void zza()
    {
        com.google.android.gms.measurement.internal.zzhd v0_1 = this.zzb.zzu;
        android.os.Bundle v1_3 = v0_1.zzd().zzf();
        String v2_4 = this.zza;
        v1_3.put(v2_4.zzc, Long.valueOf(v2_4.zzb));
        com.google.android.gms.measurement.internal.zzhd v0_2 = v0_1.zzd();
        String v2_2 = new int[v1_3.size()];
        long[] v3_1 = new long[v1_3.size()];
        String v4_0 = 0;
        while (v4_0 < v1_3.size()) {
            v2_2[v4_0] = v1_3.keyAt(v4_0);
            v3_1[v4_0] = ((Long) v1_3.valueAt(v4_0)).longValue();
            v4_0++;
        }
        android.os.Bundle v1_1 = new android.os.Bundle();
        v1_1.putIntArray("uriSources", v2_2);
        v1_1.putLongArray("uriTimestamps", v3_1);
        v0_2.zzi.zzb(v1_1);
        return;
    }

    public final void onFailure(Throwable p7)
    {
        Object v2_6;
        Object v0_0 = this.zzb;
        v0_0.zzg();
        v0_0.zzam(0);
        com.google.android.gms.measurement.internal.zzgs v1_5 = v0_0.zzu;
        if (!v1_5.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaT)) {
            v2_6 = 2;
        } else {
            v2_6 = v0_0.zzaq(p7);
        }
        Object v2_7 = (v2_6 - 1);
        if (v2_7 == null) {
            v1_5.zzaV().zze().zzc("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", com.google.android.gms.measurement.internal.zzgu.zzl(v0_0.zzu.zzv().zzj()), com.google.android.gms.measurement.internal.zzgu.zzl(p7.toString()));
            v0_0.zzao(1);
            v0_0.zzy().add(this.zza);
            return;
        } else {
            if (v2_7 == 1) {
                v0_0.zzy().add(this.zza);
                if (v0_0.zzan() <= ((Integer) com.google.android.gms.measurement.internal.zzfy.zzaw.zzb(0)).intValue()) {
                    v1_5.zzaV().zze().zzd("registerTriggerAsync failed. App ID, delay in seconds, throwable", com.google.android.gms.measurement.internal.zzgu.zzl(v0_0.zzu.zzv().zzj()), com.google.android.gms.measurement.internal.zzgu.zzl(String.valueOf(v0_0.zzan())), com.google.android.gms.measurement.internal.zzgu.zzl(p7.toString()));
                    v0_0.zzai(v0_0.zzan());
                    v0_0.zzao((v0_0.zzan() + v0_0.zzan()));
                    return;
                } else {
                    v0_0.zzao(1);
                    v1_5.zzaV().zze().zzc("registerTriggerAsync failed. May try later. App ID, throwable", com.google.android.gms.measurement.internal.zzgu.zzl(v0_0.zzu.zzv().zzj()), com.google.android.gms.measurement.internal.zzgu.zzl(p7.toString()));
                    return;
                }
            } else {
                v1_5.zzaV().zzb().zzc("registerTriggerAsync failed. Dropping URI. App ID, Throwable", com.google.android.gms.measurement.internal.zzgu.zzl(v0_0.zzu.zzv().zzj()), p7);
                this.zza();
                v0_0.zzao(1);
                v0_0.zzz();
                return;
            }
        }
    }

    public final void onSuccess(Object p4)
    {
        p4 = this.zzb;
        p4.zzg();
        this.zza();
        p4.zzam(0);
        p4.zzao(1);
        p4.zzu.zzaV().zzj().zzb("Successfully registered trigger URI", this.zza.zza);
        p4.zzz();
        return;
    }
}
