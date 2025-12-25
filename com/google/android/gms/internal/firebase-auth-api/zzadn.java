package com.google.android.gms.internal.firebase-auth-api;
final class zzadn extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzaie zzv;

    public zzadn(String p2, String p3, String p4, String p5)
    {
        super(15);
        super.zzv = com.google.android.gms.internal.firebase-auth-api.zzaie.zzg().zzd(p2).zza(p3).zzc(p5).zzb(p4).zza(com.google.android.gms.internal.firebase-auth-api.zzahg.zza).zza();
        return;
    }

    public final String zza()
    {
        return "revokeAccessToken";
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
