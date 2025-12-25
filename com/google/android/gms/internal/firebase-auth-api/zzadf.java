package com.google.android.gms.internal.firebase-auth-api;
final class zzadf extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzajb zzv;

    public zzadf(y4.c p2, String p3)
    {
        super(2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "credential cannot be null");
        super.zzv = y0.d.j(p2, p3).zza(0);
        return;
    }

    public final String zza()
    {
        return "reauthenticateWithCredentialWithData";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.internal.firebase-auth-api.zzaeo p3)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p2);
        p3.zza(this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        com.google.android.gms.common.api.Status v0_3 = com.google.android.gms.internal.firebase-auth-api.zzacq.zza(this.zzc, this.zzk);
        if (!((z4.e) this.zzd).b.a.equalsIgnoreCase(v0_3.b.a)) {
            this.zza(new com.google.android.gms.common.api.Status(17024));
            return;
        } else {
            ((z4.y) this.zze).a(this.zzj, v0_3);
            this.zzb(new z4.d0(v0_3));
            return;
        }
    }
}
