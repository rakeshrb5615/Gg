package com.google.android.gms.internal.firebase-auth-api;
final class zzadw extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final String zzv;
    private final String zzw;
    private final String zzx;
    private final String zzy;

    public zzadw(String p2, String p3, String p4, String p5)
    {
        super(2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "email cannot be null or empty");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3, "password cannot be null or empty");
        super.zzv = p2;
        super.zzw = p3;
        super.zzx = p4;
        super.zzy = p5;
        return;
    }

    public final String zza()
    {
        return "signInWithEmailAndPassword";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p8, com.google.android.gms.internal.firebase-auth-api.zzaeo p9)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p8);
        p9.zzb(this.zzv, this.zzw, this.zzx, this.zzy, this.zzb);
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
