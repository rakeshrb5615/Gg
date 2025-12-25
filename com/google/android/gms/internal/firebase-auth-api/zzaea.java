package com.google.android.gms.internal.firebase-auth-api;
final class zzaea extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzaiu zzv;

    public zzaea(z4.h p2, String p3)
    {
        super(12);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        super.zzv = com.google.android.gms.internal.firebase-auth-api.zzaiu.zza(com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2.a), p3);
        return;
    }

    public final String zza()
    {
        return "startMfaEnrollment";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.internal.firebase-auth-api.zzaeo p3)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p2);
        p3.zza(this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        this.zzb(this.zzt);
        return;
    }
}
