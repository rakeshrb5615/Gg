package com.google.android.gms.internal.firebase-auth-api;
final class zzadj extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final String zzv;
    private final String zzw;
    private final String zzx;
    private final String zzy;

    public zzadj(String p2, String p3, String p4, String p5)
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
        return "reauthenticateWithEmailPasswordWithData";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p8, com.google.android.gms.internal.firebase-auth-api.zzaeo p9)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p8);
        p9.zzb(this.zzv, this.zzw, this.zzx, this.zzy, this.zzb);
        return;
    }

    public final void zzb()
    {
        com.google.android.gms.common.api.Status v0_3 = com.google.android.gms.internal.firebase-auth-api.zzacq.zza(this.zzc, this.zzk);
        if (!((z4.e) this.zzd).b.a.equalsIgnoreCase(v0_3.b.a)) {
            this.zza(new com.google.android.gms.common.api.Status(17024));
            return;
        } else {
            ((z4.y) this.zze).a(this.zzj, v0_3);
            this.zzb(new z4.d0(v0_3));
            return;
        }
    }
}
