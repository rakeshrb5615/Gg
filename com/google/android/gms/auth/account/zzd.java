package com.google.android.gms.auth.account;
public abstract class zzd extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.auth.account.zze {

    public static com.google.android.gms.auth.account.zze zzb(android.os.IBinder p2)
    {
        if (p2 != 0) {
            com.google.android.gms.auth.account.zzc v0_1 = p2.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
            if (!(v0_1 instanceof com.google.android.gms.auth.account.zze)) {
                return new com.google.android.gms.auth.account.zzc(p2);
            } else {
                return ((com.google.android.gms.auth.account.zze) v0_1);
            }
        } else {
            return 0;
        }
    }
}
