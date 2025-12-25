package com.google.android.gms.internal.auth;
final class zzai implements com.google.android.gms.auth.account.WorkAccountApi$AddAccountResult {
    private static final android.accounts.Account zza;
    private final com.google.android.gms.common.api.Status zzb;
    private final android.accounts.Account zzc;

    static zzai()
    {
        com.google.android.gms.internal.auth.zzai.zza = new android.accounts.Account("DUMMY_NAME", "com.google");
        return;
    }

    public zzai(com.google.android.gms.common.api.Status p1, android.accounts.Account p2)
    {
        this.zzb = p1;
        if (p2 == null) {
            p2 = com.google.android.gms.internal.auth.zzai.zza;
        }
        this.zzc = p2;
        return;
    }

    public final android.accounts.Account getAccount()
    {
        return this.zzc;
    }

    public final com.google.android.gms.common.api.Status getStatus()
    {
        return this.zzb;
    }
}
