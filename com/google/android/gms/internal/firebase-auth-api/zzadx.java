package com.google.android.gms.internal.firebase-auth-api;
final class zzadx extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final boolean zzaa;
    private final String zzab;
    private final String zzac;
    private final String zzad;
    private final boolean zzae;
    private final String zzv;
    private final String zzw;
    private final String zzx;
    private final long zzy;
    private final boolean zzz;

    public zzadx(z4.h p2, String p3, String p4, long p5, boolean p7, boolean p8, String p9, String p10, String p11, boolean p12)
    {
        super(8);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        super.zzv = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2.a);
        super.zzw = p3;
        super.zzx = p4;
        super.zzy = p5;
        super.zzz = p7;
        super.zzaa = p8;
        super.zzab = p9;
        super.zzac = p10;
        super.zzad = p11;
        super.zzae = p12;
        return;
    }

    public final String zza()
    {
        return "startMfaEnrollment";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p15, com.google.android.gms.internal.firebase-auth-api.zzaeo p16)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p15);
        p16.zza(this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzae, this.zzb);
        return;
    }

    public final void zzb()
    {
        return;
    }
}
