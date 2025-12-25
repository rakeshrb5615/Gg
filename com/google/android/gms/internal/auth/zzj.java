package com.google.android.gms.internal.auth;
public abstract class zzj extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzk {

    public zzj()
    {
        super("com.google.android.gms.auth.account.data.IBundleCallback");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 2) {
            return 0;
        } else {
            int v1_5 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(p2, com.google.android.gms.common.api.Status.CREATOR));
            android.os.Bundle v3_2 = ((android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(p2, android.os.Bundle.CREATOR));
            com.google.android.gms.internal.auth.zzc.zzb(p2);
            this.zzb(v1_5, v3_2);
            return 1;
        }
    }
}
