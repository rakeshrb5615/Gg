package com.google.android.gms.internal.firebase-auth-api;
final class zzadp extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzahm zzv;
    private final String zzw;

    public zzadp(String p3, y4.a p4, String p5, String p6, String p7)
    {
        super(4);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3, "email cannot be null or empty");
        com.google.android.gms.internal.firebase-auth-api.zzahm v0_3 = new com.google.android.gms.internal.firebase-auth-api.zzahm(p4.o);
        super.zzv = v0_3;
        v0_3.zzb(p3);
        v0_3.zza(p4);
        v0_3.zzc(p5);
        v0_3.zza(p6);
        super.zzw = p7;
        return;
    }

    public final String zza()
    {
        return this.zzw;
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.internal.firebase-auth-api.zzaeo p3)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p2);
        p3.zzb(this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        this.zzb(0);
        return;
    }
}
