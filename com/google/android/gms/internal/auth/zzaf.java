package com.google.android.gms.internal.auth;
final class zzaf extends com.google.android.gms.internal.auth.zzah {
    final synthetic com.google.android.gms.internal.auth.zzag zza;

    public zzaf(com.google.android.gms.internal.auth.zzag p1)
    {
        this.zza = p1;
        return;
    }

    public final void zzc(boolean p3)
    {
        com.google.android.gms.common.api.Status v3_1;
        com.google.android.gms.internal.auth.zzag v0 = this.zza;
        if (p3 == null) {
            v3_1 = com.google.android.gms.internal.auth.zzal.zza();
        } else {
            v3_1 = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
        v0.setResult(new com.google.android.gms.internal.auth.zzak(v3_1));
        return;
    }
}
