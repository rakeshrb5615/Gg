package com.google.android.gms.internal.location;
public abstract class zzs extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.internal.location.zzt {

    public zzs()
    {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 == 1) {
            int v1_4 = p2.readInt();
            android.app.PendingIntent v4_5 = p2.createStringArray();
            com.google.android.gms.internal.location.zzc.zzd(p2);
            this.zzb(v1_4, v4_5);
        } else {
            if (p1 == 2) {
                int v1_1 = p2.readInt();
                android.app.PendingIntent v4_0 = p2.createStringArray();
                com.google.android.gms.internal.location.zzc.zzd(p2);
                this.zzc(v1_1, v4_0);
            } else {
                if (p1 == 3) {
                    int v1_2 = p2.readInt();
                    android.app.PendingIntent v4_4 = ((android.app.PendingIntent) com.google.android.gms.internal.location.zzc.zza(p2, android.app.PendingIntent.CREATOR));
                    com.google.android.gms.internal.location.zzc.zzd(p2);
                    this.zzd(v1_2, v4_4);
                } else {
                    return 0;
                }
            }
        }
        return 1;
    }
}
