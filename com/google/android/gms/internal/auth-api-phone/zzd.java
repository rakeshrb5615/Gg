package com.google.android.gms.internal.auth-api-phone;
public abstract class zzd extends com.google.android.gms.internal.auth-api-phone.zzb implements com.google.android.gms.internal.auth-api-phone.zze {

    public zzd()
    {
        super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_4 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth-api-phone.zzc.zza(p2, com.google.android.gms.common.api.Status.CREATOR));
            p4 = p2.readInt();
            com.google.android.gms.internal.auth-api-phone.zzc.zzb(p2);
            this.zzb(v1_4, p4);
            return 1;
        }
    }
}
