package com.google.android.gms.internal.firebase-auth-api;
final class zzaec extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzaec(String p2, String p3, String p4)
    {
        super(2);
        super.zzv = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        super.zzw = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        super.zzx = p4;
        return;
    }

    public final String zza()
    {
        return "unenrollMfa";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p4, com.google.android.gms.internal.firebase-auth-api.zzaeo p5)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p4);
        p5.zza(this.zzv, this.zzw, this.zzx, this.zzb);
        return;
    }

    public final void zzb()
    {
        ((z4.y) this.zze).a(this.zzj, com.google.android.gms.internal.firebase-auth-api.zzacq.zza(this.zzc, this.zzk));
        this.zzb(0);
        return;
    }
}
