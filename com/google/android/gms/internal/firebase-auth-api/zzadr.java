package com.google.android.gms.internal.firebase-auth-api;
final class zzadr extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final String zzv;

    public zzadr(String p2)
    {
        super(2);
        super.zzv = p2;
        return;
    }

    public final String zza()
    {
        return "signInAnonymously";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.internal.firebase-auth-api.zzaeo p3)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p2);
        p3.zzd(this.zzv, this.zzb);
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
