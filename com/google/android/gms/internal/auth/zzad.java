package com.google.android.gms.internal.auth;
final class zzad extends com.google.android.gms.internal.auth.zzah {
    final synthetic com.google.android.gms.internal.auth.zzae zza;

    public zzad(com.google.android.gms.internal.auth.zzae p1)
    {
        this.zza = p1;
        return;
    }

    public final void zzb(android.accounts.Account p4)
    {
        com.google.android.gms.common.api.Status v2;
        com.google.android.gms.internal.auth.zzae v0 = this.zza;
        if (p4 == null) {
            v2 = com.google.android.gms.internal.auth.zzal.zza();
        } else {
            v2 = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
        v0.setResult(new com.google.android.gms.internal.auth.zzai(v2, p4));
        return;
    }
}
