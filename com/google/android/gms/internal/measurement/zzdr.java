package com.google.android.gms.internal.measurement;
final class zzdr extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic android.content.Context zza;
    final synthetic android.os.Bundle zzb;
    final synthetic com.google.android.gms.internal.measurement.zzfb zzc;

    public zzdr(com.google.android.gms.internal.measurement.zzfb p1, android.content.Context p2, android.os.Bundle p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        super(p1, 1);
        return;
    }

    public final void zza()
    {
        com.google.android.gms.dynamic.IObjectWrapper v4_0 = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_0);
        long v5_0 = com.google.android.gms.measurement.internal.zzhu.zza(v4_0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_0);
        int v7_0 = v4_0.getResources();
        if (android.text.TextUtils.isEmpty(v5_0)) {
            v5_0 = com.google.android.gms.measurement.internal.zzhu.zza(v4_0);
        }
        int v7_2;
        long v5_1 = com.google.android.gms.measurement.internal.zzhu.zzc("google_analytics_force_disable_updates", v7_0, v5_0);
        com.google.android.gms.internal.measurement.zzfb v6_0 = this.zzc;
        if ((v5_1 != 0) && (v5_1.booleanValue())) {
            v7_2 = 0;
        } else {
            v7_2 = 1;
        }
        v6_0.zzR(v6_0.zzc(v4_0, v7_2));
        if (v6_0.zzQ() != null) {
            int v14;
            int v7_5 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(v4_0, "com.google.android.gms.measurement.dynamite");
            com.google.android.gms.internal.measurement.zzcr v0_1 = com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(v4_0, "com.google.android.gms.measurement.dynamite");
            int v8_1 = Math.max(v7_5, v0_1);
            if ((!Boolean.TRUE.equals(v5_1)) && (v0_1 >= v7_5)) {
                v14 = 0;
            } else {
                v14 = 1;
            }
            ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(v6_0.zzQ())).initialize(com.google.android.gms.dynamic.ObjectWrapper.wrap(v4_0), new com.google.android.gms.internal.measurement.zzdd(133005, ((long) v8_1), v14, this.zzb, com.google.android.gms.measurement.internal.zzhu.zza(v4_0)), this.zzh);
            return;
        } else {
            android.util.Log.w(v6_0.zzO(), "Failed to connect to measurement client.");
            return;
        }
    }
}
