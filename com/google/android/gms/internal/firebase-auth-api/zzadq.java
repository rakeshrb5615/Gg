package com.google.android.gms.internal.firebase-auth-api;
final class zzadq extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzahm zzv;

    public zzadq(String p3, y4.a p4)
    {
        super(6);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3, "token cannot be null or empty");
        com.google.android.gms.internal.firebase-auth-api.zzahm v0_3 = new com.google.android.gms.internal.firebase-auth-api.zzahm(4);
        super.zzv = v0_3;
        v0_3.zzd(p3);
        if (p4 != null) {
            v0_3.zza(p4);
        }
        return;
    }

    public final String zza()
    {
        return "sendEmailVerification";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.internal.firebase-auth-api.zzaeo p3)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p2);
        p3.zza(this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        this.zzb(0);
        return;
    }
}
