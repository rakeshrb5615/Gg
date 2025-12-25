package com.google.android.gms.internal.auth-api-phone;
public abstract class zzi extends com.google.android.gms.internal.auth-api-phone.zzb implements com.google.android.gms.internal.auth-api-phone.zzj {

    public zzi()
    {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_4 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth-api-phone.zzc.zza(p2, com.google.android.gms.common.api.Status.CREATOR));
            com.google.android.gms.internal.auth-api-phone.zzc.zzb(p2);
            this.zzb(v1_4);
            return 1;
        }
    }
}
