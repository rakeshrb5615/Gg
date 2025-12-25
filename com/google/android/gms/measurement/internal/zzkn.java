package com.google.android.gms.measurement.internal;
final class zzkn implements com.google.android.gms.measurement.internal.zzpo {
    final synthetic com.google.android.gms.measurement.internal.zzlj zza;

    public zzkn(com.google.android.gms.measurement.internal.zzlj p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final void zza(String p3, String p4, android.os.Bundle p5)
    {
        if (android.text.TextUtils.isEmpty(p3)) {
            this.zza.zzB("auto", "_err", p5);
            return;
        } else {
            this.zza.zzI("auto", "_err", p5, p3);
            return;
        }
    }
}
