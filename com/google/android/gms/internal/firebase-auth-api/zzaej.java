package com.google.android.gms.internal.firebase-auth-api;
final class zzaej extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzaij zzv;

    public zzaej(com.google.android.gms.internal.firebase-auth-api.zzaij p2)
    {
        super(8);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        super.zzv = p2;
        return;
    }

    public final String zza()
    {
        return "verifyPhoneNumber";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.internal.firebase-auth-api.zzaeo p3)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p2);
        p3.zza(this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        return;
    }
}
