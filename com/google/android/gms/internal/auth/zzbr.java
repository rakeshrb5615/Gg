package com.google.android.gms.internal.auth;
final class zzbr extends com.google.android.gms.internal.auth.zzbd {
    final synthetic com.google.android.gms.internal.auth.zzbs zza;

    public zzbr(com.google.android.gms.internal.auth.zzbs p1)
    {
        this.zza = p1;
        return;
    }

    public final void zzc(String p3)
    {
        if (p3 == null) {
            this.zza.setResult(new com.google.android.gms.internal.auth.zzbv(new com.google.android.gms.common.api.Status(3006)));
            return;
        } else {
            this.zza.setResult(new com.google.android.gms.internal.auth.zzbv(p3));
            return;
        }
    }
}
