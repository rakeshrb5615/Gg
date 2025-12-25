package com.google.android.gms.internal.measurement;
public final class zzt extends com.google.android.gms.internal.measurement.zzai {
    private final com.google.android.gms.internal.measurement.zzr zza;

    public zzt(com.google.android.gms.internal.measurement.zzr p6)
    {
        super("internal.logger");
        super.zza = p6;
        super.zze.put("log", new com.google.android.gms.internal.measurement.zzs(super, 0, 1));
        super.zze.put("silent", new com.google.android.gms.internal.measurement.zzp(super, "silent"));
        ((com.google.android.gms.internal.measurement.zzai) super.zze.get("silent")).zzm("log", new com.google.android.gms.internal.measurement.zzs(super, 1, 1));
        super.zze.put("unmonitored", new com.google.android.gms.internal.measurement.zzq(super, "unmonitored"));
        ((com.google.android.gms.internal.measurement.zzai) super.zze.get("unmonitored")).zzm("log", new com.google.android.gms.internal.measurement.zzs(super, 0, 0));
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg p1, java.util.List p2)
    {
        return com.google.android.gms.internal.measurement.zzao.zzf;
    }

    public final synthetic com.google.android.gms.internal.measurement.zzr zzb()
    {
        return this.zza;
    }
}
