package com.google.android.gms.internal.firebase-auth-api;
final class zzacp extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final String zzv;
    private final String zzw;

    public zzacp(String p2, String p3)
    {
        super(7);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "code cannot be null or empty");
        super.zzv = p2;
        super.zzw = p3;
        return;
    }

    public final String zza()
    {
        return "applyActionCode";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p3, com.google.android.gms.internal.firebase-auth-api.zzaeo p4)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p3);
        p4.zza(this.zzv, this.zzw, this.zzb);
        return;
    }

    public final void zzb()
    {
        this.zzb(0);
        return;
    }
}
