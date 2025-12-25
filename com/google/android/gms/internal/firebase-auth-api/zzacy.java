package com.google.android.gms.internal.firebase-auth-api;
final class zzacy extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final y4.o zzv;
    private final String zzw;
    private final String zzx;

    public zzacy(y4.o p2, String p3, String p4)
    {
        super(2);
        if (com.google.android.gms.common.internal.Preconditions.checkNotNull(p2) != null) {
            throw new ClassCastException();
        } else {
            super.zzw = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
            super.zzx = p4;
            return;
        }
    }

    public final String zza()
    {
        return "finalizeMfaSignIn";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p4, com.google.android.gms.internal.firebase-auth-api.zzaeo p5)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p4);
        p5.zza(this.zzw, 0, this.zzx, this.zzb);
        return;
    }

    public final void zzb()
    {
        com.google.android.gms.common.api.Status v0_3 = com.google.android.gms.internal.firebase-auth-api.zzacq.zza(this.zzc, this.zzk);
        int v1_7 = this.zzd;
        if ((v1_7 != 0) && (!((z4.e) v1_7).b.a.equalsIgnoreCase(v0_3.b.a))) {
            this.zza(new com.google.android.gms.common.api.Status(17024));
            return;
        } else {
            ((z4.y) this.zze).a(this.zzj, v0_3);
            this.zzb(new z4.d0(v0_3));
            return;
        }
    }
}
