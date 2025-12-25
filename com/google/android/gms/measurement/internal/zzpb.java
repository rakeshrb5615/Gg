package com.google.android.gms.measurement.internal;
final class zzpb implements com.google.android.gms.measurement.internal.zzpo {
    final synthetic com.google.android.gms.measurement.internal.zzpg zza;

    public zzpb(com.google.android.gms.measurement.internal.zzpg p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final void zza(String p3, String p4, android.os.Bundle p5)
    {
        if (!android.text.TextUtils.isEmpty(p3)) {
            this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzpa(this, p3, p4, p5));
            return;
        } else {
            com.google.android.gms.measurement.internal.zzgs v3_1 = this.zza;
            if (v3_1.zzax() != null) {
                v3_1.zzax().zzaV().zzb().zzb("AppId not known when logging event", p4);
            }
            return;
        }
    }
}
