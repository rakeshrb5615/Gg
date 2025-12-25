package com.google.android.gms.internal.firebase-auth-api;
final class zzacw extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final String zzv;
    private final String zzw;

    public zzacw(String p2, String p3)
    {
        super(3);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "email cannot be null or empty");
        super.zzv = p2;
        super.zzw = p3;
        return;
    }

    public final String zza()
    {
        return "fetchSignInMethodsForEmail";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p3, com.google.android.gms.internal.firebase-auth-api.zzaeo p4)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p3);
        p4.zze(this.zzv, this.zzw, this.zzb);
        return;
    }

    public final void zzb()
    {
        java.util.List v1_1;
        if (this.zzl.zza() != null) {
            v1_1 = ((java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzl.zza()));
        } else {
            v1_1 = com.google.android.gms.internal.firebase-auth-api.zzah.zzg();
        }
        this.zzb(new y6.c(v1_1));
        return;
    }
}
