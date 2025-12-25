package com.google.android.gms.internal.measurement;
final class zzet extends com.google.android.gms.internal.measurement.zzeq {
    final synthetic android.os.Bundle zza;
    final synthetic android.app.Activity zzb;
    final synthetic com.google.android.gms.internal.measurement.zzfa zzc;

    public zzet(com.google.android.gms.internal.measurement.zzfa p1, android.os.Bundle p2, android.app.Activity p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        super(p1.zza, 1);
        return;
    }

    public final void zza()
    {
        int v1_0;
        android.os.Bundle v0_0 = this.zza;
        if (v0_0 == null) {
            v1_0 = 0;
        } else {
            v1_0 = new android.os.Bundle();
            if (v0_0.containsKey("com.google.app_measurement.screen_service")) {
                android.os.Bundle v0_1 = v0_0.get("com.google.app_measurement.screen_service");
                if ((v0_1 instanceof android.os.Bundle)) {
                    v1_0.putBundle("com.google.app_measurement.screen_service", ((android.os.Bundle) v0_1));
                }
            }
        }
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zza.zzQ())).onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza(this.zzb), v1_0, this.zzi);
        return;
    }
}
