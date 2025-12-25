package com.google.android.gms.cloudmessaging;
public final class zzd implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    android.os.Messenger zza;
    com.google.android.gms.cloudmessaging.IMessengerCompat zzb;

    static zzd()
    {
        com.google.android.gms.cloudmessaging.zzd.CREATOR = new com.google.android.gms.cloudmessaging.zzb();
        return;
    }

    public zzd(android.os.IBinder p2)
    {
        this.zza = new android.os.Messenger(p2);
        return;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object p3)
    {
        if (p3) {
            try {
                return this.zza().equals(((com.google.android.gms.cloudmessaging.zzd) p3).zza());
            } catch (ClassCastException) {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return this.zza().hashCode();
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        android.os.IBinder v2_0 = this.zza;
        if (v2_0 == null) {
            p1.writeStrongBinder(this.zzb.asBinder());
            return;
        } else {
            p1.writeStrongBinder(v2_0.getBinder());
            return;
        }
    }

    public final android.os.IBinder zza()
    {
        android.os.IBinder v0_0 = this.zza;
        if (v0_0 == null) {
            return this.zzb.asBinder();
        } else {
            return v0_0.getBinder();
        }
    }

    public final void zzb(android.os.Message p2)
    {
        com.google.android.gms.cloudmessaging.IMessengerCompat v0_0 = this.zza;
        if (v0_0 == null) {
            this.zzb.send(p2);
            return;
        } else {
            v0_0.send(p2);
            return;
        }
    }
}
