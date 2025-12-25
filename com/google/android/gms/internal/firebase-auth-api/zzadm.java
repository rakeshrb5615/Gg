package com.google.android.gms.internal.firebase-auth-api;
final class zzadm extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzaan zzv;

    public zzadm(y4.s p2, String p3)
    {
        super(2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "credential cannot be null");
        p2.d = 0;
        super.zzv = new com.google.android.gms.internal.firebase-auth-api.zzaan(p2, p3);
        return;
    }

    public final String zza()
    {
        return "reauthenticateWithPhoneCredential";
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
