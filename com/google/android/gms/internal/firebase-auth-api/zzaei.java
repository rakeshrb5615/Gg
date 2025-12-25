package com.google.android.gms.internal.firebase-auth-api;
final class zzaei extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final y4.c0 zzv;

    public zzaei(y4.c0 p2)
    {
        super(2);
        super.zzv = ((y4.c0) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "request cannot be null"));
        return;
    }

    public final String zza()
    {
        return "updateProfile";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p3, com.google.android.gms.internal.firebase-auth-api.zzaeo p4)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p3);
        p4.zza(((z4.e) this.zzd).a.zzf(), this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        ((z4.y) this.zze).a(this.zzj, com.google.android.gms.internal.firebase-auth-api.zzacq.zza(this.zzc, this.zzk));
        this.zzb(0);
        return;
    }
}
