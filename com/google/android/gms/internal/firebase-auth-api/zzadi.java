package com.google.android.gms.internal.firebase-auth-api;
final class zzadi extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzagx zzv;

    public zzadi(y4.d p3, String p4)
    {
        super(2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Credential cannot be null");
        super.zzv = new com.google.android.gms.internal.firebase-auth-api.zzagx(p3, 0, p4);
        return;
    }

    public final String zza()
    {
        return "reauthenticateWithEmailLink";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.internal.firebase-auth-api.zzaeo p3)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p2);
        p3.zza(this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        com.google.android.gms.common.api.Status v0_4 = com.google.android.gms.internal.firebase-auth-api.zzacq.zza(this.zzc, this.zzk);
        if (!((z4.e) this.zzd).b.a.equalsIgnoreCase(v0_4.b.a)) {
            this.zza(new com.google.android.gms.common.api.Status(17024));
            return;
        } else {
            ((z4.y) this.zze).a(this.zzj, v0_4);
            this.zzb(0);
            return;
        }
    }
}
