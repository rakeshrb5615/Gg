package com.google.android.gms.common.internal;
public final class AccountType {
    public static final String GOOGLE = "com.google";
    public static final String[] zza;

    static AccountType()
    {
        com.google.android.gms.common.internal.AccountType.zza = new String[] {"com.google", "com.google.work", "cn.google"});
        return;
    }

    private AccountType()
    {
        return;
    }
}
