package com.google.android.gms.internal.location;
public abstract class zzy extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.internal.location.zzz {

    public zzy()
    {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_4 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.location.zzc.zza(p2, com.google.android.gms.common.api.Status.CREATOR));
            android.location.Location v4_1 = ((android.location.Location) com.google.android.gms.internal.location.zzc.zza(p2, android.location.Location.CREATOR));
            com.google.android.gms.internal.location.zzc.zzd(p2);
            this.zzb(v1_4, v4_1);
            return 1;
        }
    }
}
