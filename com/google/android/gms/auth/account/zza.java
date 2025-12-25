package com.google.android.gms.auth.account;
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.auth.account.zzb {

    public zza()
    {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 == 1) {
            boolean v1_5 = ((android.accounts.Account) com.google.android.gms.internal.auth.zzc.zza(p2, android.accounts.Account.CREATOR));
            com.google.android.gms.internal.auth.zzc.zzb(p2);
            this.zzb(v1_5);
        } else {
            if (p1 == 2) {
                boolean v1_1 = com.google.android.gms.internal.auth.zzc.zzf(p2);
                com.google.android.gms.internal.auth.zzc.zzb(p2);
                this.zzc(v1_1);
            } else {
                return 0;
            }
        }
        return 1;
    }
}
