package com.google.android.gms.internal.firebase-auth-api;
final class zzaeh extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzahm zzv;

    public zzaeh(String p2, String p3, y4.a p4)
    {
        super(6);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        super.zzv = com.google.android.gms.internal.firebase-auth-api.zzahm.zza(p4, p2, p3);
        return;
    }

    public final String zza()
    {
        return "verifyBeforeUpdateEmail";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.internal.firebase-auth-api.zzaeo p3)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p2);
        p3.zzc(this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        this.zzb(0);
        return;
    }
}
