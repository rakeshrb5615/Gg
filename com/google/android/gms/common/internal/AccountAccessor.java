package com.google.android.gms.common.internal;
public class AccountAccessor extends com.google.android.gms.common.internal.IAccountAccessor$Stub {

    public static android.accounts.Account getAccountBinderSafe(com.google.android.gms.common.internal.IAccountAccessor p4)
    {
        if (p4 == null) {
            return 0;
        } else {
            long v1 = android.os.Binder.clearCallingIdentity();
            try {
                Throwable v4_2 = p4.zzb();
                android.os.Binder.restoreCallingIdentity(v1);
                return v4_2;
            } catch (Throwable v4_1) {
                android.os.Binder.restoreCallingIdentity(v1);
                throw v4_1;
            }
        }
    }

    public final boolean equals(Object p1)
    {
        throw 0;
    }

    public final android.accounts.Account zzb()
    {
        throw 0;
    }
}
