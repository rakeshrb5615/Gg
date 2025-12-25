package com.google.android.gms.internal.firebase-auth-api;
final class zzacx extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final String zzv;

    public zzacx(String p2)
    {
        super(1);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "refresh token cannot be null");
        super.zzv = p2;
        return;
    }

    public final String zza()
    {
        return "getAccessToken";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.internal.firebase-auth-api.zzaeo p3)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p2);
        p3.zzb(this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        if (android.text.TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzv);
        }
        ((z4.y) this.zze).a(this.zzj, this.zzd);
        this.zzb(z4.n.a(this.zzj.zzc()));
        return;
    }
}
