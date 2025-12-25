package com.google.android.gms.internal.auth-api-phone;
public abstract class zzf extends com.google.android.gms.internal.auth-api-phone.zzb implements com.google.android.gms.internal.auth-api-phone.zzg {

    public zzf()
    {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
        return;
    }

    public final boolean zza(int p2, android.os.Parcel p3, android.os.Parcel p4, int p5)
    {
        p4 = 0;
        if (p2 != 1) {
            return 0;
        } else {
            com.google.android.gms.common.api.Status v2_3 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth-api-phone.zzc.zza(p3, com.google.android.gms.common.api.Status.CREATOR));
            if (p3.readInt() != 0) {
                p4 = 1;
            }
            com.google.android.gms.internal.auth-api-phone.zzc.zzb(p3);
            this.zzb(v2_3, p4);
            return 1;
        }
    }
}
