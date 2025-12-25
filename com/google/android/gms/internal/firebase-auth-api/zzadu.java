package com.google.android.gms.internal.firebase-auth-api;
final class zzadu extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzajb zzv;

    public zzadu(y4.c p2, String p3)
    {
        super(2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "credential cannot be null");
        super.zzv = y0.d.j(p2, p3);
        return;
    }

    public final String zza()
    {
        return "signInWithCredential";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.internal.firebase-auth-api.zzaeo p3)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p2);
        p3.zza(this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        z4.e v0_1 = com.google.android.gms.internal.firebase-auth-api.zzacq.zza(this.zzc, this.zzk);
        ((z4.y) this.zze).a(this.zzj, v0_1);
        this.zzb(new z4.d0(v0_1));
        return;
    }
}
