package com.google.android.gms.internal.firebase-auth-api;
final class zzadz extends com.google.android.gms.internal.firebase-auth-api.zzaff {
    private final com.google.android.gms.internal.firebase-auth-api.zzaaq zzv;

    public zzadz(y4.w p14, String p15, String p16, long p17, boolean p19, boolean p20, String p21, String p22, String p23, boolean p24)
    {
        super(8);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p14);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p15);
        super.zzv = new com.google.android.gms.internal.firebase-auth-api.zzaaq(p14, p15, p16, p17, p19, p20, p21, p22, p23, p24);
        return;
    }

    public final String zza()
    {
        return "startMfaSignInWithPhoneNumber";
    }

    public final void zza(com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.internal.firebase-auth-api.zzaeo p3)
    {
        this.zzg = new com.google.android.gms.internal.firebase-auth-api.zzafp(this, p2);
        p3.zza(this.zzv, this.zzb);
        return;
    }

    public final void zzb()
    {
        return;
    }
}
