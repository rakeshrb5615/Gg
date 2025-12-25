package com.google.android.gms.internal.firebase-auth-api;
final class zzafn implements java.lang.Runnable {
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzafm zza;
    private final synthetic com.google.android.gms.internal.firebase-auth-api.zzafh zzb;

    public zzafn(com.google.android.gms.internal.firebase-auth-api.zzafh p1, com.google.android.gms.internal.firebase-auth-api.zzafm p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        if (!this.zzb.zza.zzh.isEmpty()) {
            Object[] v3_1 = new Object[0];
            this.zza.zza(((y4.u) this.zzb.zza.zzh.get(0)), v3_1);
        }
        return;
    }
}
