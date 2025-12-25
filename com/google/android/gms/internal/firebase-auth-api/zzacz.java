package com.google.android.gms.internal.firebase-auth-api;
final class zzacz extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzaht zzv;

    public zzacz(String p2, String p3)
    {
        super(10);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        super.zzv = com.google.android.gms.internal.firebase-auth-api.zzaht.zza(p2, p3);
        return;
    }

    public final String zza()
    {
        return "getRecaptchaConfig";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.internal.firebase-auth-api.zzaeo p3)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p2);
        p3.zza(this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        this.zzb(this.zzr);
        return;
    }
}
