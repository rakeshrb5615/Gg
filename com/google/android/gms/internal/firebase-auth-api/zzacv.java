package com.google.android.gms.internal.firebase-auth-api;
final class zzacv extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final y4.o zzv;
    private final String zzw;
    private final String zzx;
    private final String zzy;

    public zzacv(y4.o p2, String p3, String p4, String p5)
    {
        super(2);
        if (com.google.android.gms.common.internal.Preconditions.checkNotNull(p2) != null) {
            throw new ClassCastException();
        } else {
            super.zzw = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
            super.zzx = p4;
            super.zzy = p5;
            return;
        }
    }

    public final String zza()
    {
        return "finalizeMfaEnrollment";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p8, com.google.android.gms.internal.firebase-auth-api.zzaeo p9)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p8);
        p9.zza(0, this.zzw, this.zzx, this.zzy, this.zzb);
        return;
    }

    public final void zzb()
    {
        ((z4.y) this.zze).a(this.zzj, com.google.android.gms.internal.firebase-auth-api.zzacq.zza(this.zzc, this.zzk));
        this.zzb(0);
        return;
    }
}
