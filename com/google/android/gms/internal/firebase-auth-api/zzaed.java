package com.google.android.gms.internal.firebase-auth-api;
final class zzaed extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final String zzv;

    public zzaed(String p2)
    {
        super(2);
        super.zzv = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "email cannot be null or empty");
        return;
    }

    public final String zza()
    {
        return "updateEmail";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p3, com.google.android.gms.internal.firebase-auth-api.zzaeo p4)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p3);
        p4.zzb(((z4.e) this.zzd).a.zzf(), this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        ((z4.y) this.zze).a(this.zzj, com.google.android.gms.internal.firebase-auth-api.zzacq.zza(this.zzc, this.zzk));
        this.zzb(0);
        return;
    }
}
