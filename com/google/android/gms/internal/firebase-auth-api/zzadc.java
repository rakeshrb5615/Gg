package com.google.android.gms.internal.firebase-auth-api;
final class zzadc extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final y4.d zzv;
    private final String zzw;

    public zzadc(y4.d p3, String p4)
    {
        super(2);
        super.zzv = ((y4.d) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "credential cannot be null"));
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3.a, "email cannot be null");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3.b, "password cannot be null");
        super.zzw = p4;
        return;
    }

    public final String zza()
    {
        return "linkEmailAuthCredential";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p8, com.google.android.gms.internal.firebase-auth-api.zzaeo p9)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p8);
        y4.l v8_3 = this.zzv;
        p9.zza(v8_3.a, com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v8_3.b), ((z4.e) this.zzd).a.zzf(), this.zzd.x(), this.zzw, this.zzb);
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
