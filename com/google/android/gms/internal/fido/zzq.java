package com.google.android.gms.internal.fido;
public abstract class zzq extends com.google.android.gms.internal.fido.zzb implements com.google.android.gms.internal.fido.zzr {

    public zzq()
    {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_4 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.fido.zzc.zza(p2, com.google.android.gms.common.api.Status.CREATOR));
            android.app.PendingIntent v4_1 = ((android.app.PendingIntent) com.google.android.gms.internal.fido.zzc.zza(p2, android.app.PendingIntent.CREATOR));
            com.google.android.gms.internal.fido.zzc.zzc(p2);
            this.zzb(v1_4, v4_1);
            return 1;
        }
    }
}
