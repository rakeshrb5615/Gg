package com.google.android.gms.internal.firebase-auth-api;
final class zzadt extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzajc zzv;

    public zzadt(String p2, String p3)
    {
        super(2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "token cannot be null or empty");
        super.zzv = new com.google.android.gms.internal.firebase-auth-api.zzajc(p2, p3);
        return;
    }

    public final String zza()
    {
        return "signInWithCustomToken";
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
