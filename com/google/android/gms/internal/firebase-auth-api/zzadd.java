package com.google.android.gms.internal.firebase-auth-api;
final class zzadd extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final y4.d zzv;

    public zzadd(y4.d p2)
    {
        super(2);
        super.zzv = ((y4.d) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "credential cannot be null"));
        return;
    }

    public final String zza()
    {
        return "linkEmailAuthCredential";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p3, com.google.android.gms.internal.firebase-auth-api.zzaeo p4)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p3);
        com.google.android.gms.internal.firebase-auth-api.zzafh v0_3 = this.zzv;
        int v1_3 = this.zzd;
        v0_3.getClass();
        v0_3.d = ((z4.e) v1_3).a.zzf();
        v0_3.e = 1;
        p4.zza(new com.google.android.gms.internal.firebase-auth-api.zzagx(v0_3, 0, 0), this.zzb);
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
