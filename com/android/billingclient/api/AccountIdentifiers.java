package com.android.billingclient.api;
public final class AccountIdentifiers {
    private final String zza;
    private final String zzb;

    public AccountIdentifiers(String p1, String p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public String getObfuscatedAccountId()
    {
        return this.zza;
    }

    public String getObfuscatedProfileId()
    {
        return this.zzb;
    }
}
