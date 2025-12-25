package com.google.android.gms.internal.firebase-auth-api;
final class zzaef extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final y4.s zzv;

    public zzaef(y4.s p2)
    {
        super(2);
        super.zzv = ((y4.s) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        return;
    }

    public final String zza()
    {
        return "updatePhoneNumber";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p3, com.google.android.gms.internal.firebase-auth-api.zzaeo p4)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p3);
        p4.zza(new com.google.android.gms.internal.firebase-auth-api.zzahz(((z4.e) this.zzd).a.zzf(), com.google.android.gms.internal.firebase-auth-api.zzafw.zza(this.zzv)), this.zzb);
        return;
    }

    public final void zzb()
    {
        ((z4.y) this.zze).a(this.zzj, com.google.android.gms.internal.firebase-auth-api.zzacq.zza(this.zzc, this.zzk));
        this.zzb(0);
        return;
    }
}
