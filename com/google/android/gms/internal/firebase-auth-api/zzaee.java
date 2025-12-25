package com.google.android.gms.internal.firebase-auth-api;
final class zzaee extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private String zzv;

    public zzaee(String p2)
    {
        super(2);
        super.zzv = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "provider cannot be null or empty");
        return;
    }

    public final String zza()
    {
        return "unlinkFederatedCredential";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p3, com.google.android.gms.internal.firebase-auth-api.zzaeo p4)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p3);
        p4.zzf(this.zzv, ((z4.e) this.zzd).a.zzf(), this.zzb);
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
