package com.google.android.gms.internal.firebase-auth-api;
final class zzade extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final y4.s zzv;

    public zzade(y4.s p2)
    {
        super(2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "credential cannot be null");
        super.zzv = p2;
        return;
    }

    public final String zza()
    {
        return "linkPhoneAuthCredential";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p3, com.google.android.gms.internal.firebase-auth-api.zzaeo p4)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p3);
        p4.zza(new com.google.android.gms.internal.firebase-auth-api.zzahz(((z4.e) this.zzd).a.zzf(), com.google.android.gms.internal.firebase-auth-api.zzafw.zza(this.zzv)), this.zzb);
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
