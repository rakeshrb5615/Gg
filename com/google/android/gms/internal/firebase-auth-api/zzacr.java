package com.google.android.gms.internal.firebase-auth-api;
final class zzacr extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzaic zzv;

    public zzacr(String p2, String p3, String p4)
    {
        super(4);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "code cannot be null or empty");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3, "new password cannot be null or empty");
        super.zzv = new com.google.android.gms.internal.firebase-auth-api.zzaic(p2, p3, p4);
        return;
    }

    public final String zza()
    {
        return "confirmPasswordReset";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.internal.firebase-auth-api.zzaeo p3)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p2);
        p3.zza(this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        this.zzb(0);
        return;
    }
}
