package com.google.android.gms.internal.location;
public final class zzem extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final java.util.List zza;
    private final android.app.PendingIntent zzb;
    private final String zzc;

    static zzem()
    {
        com.google.android.gms.internal.location.zzem.CREATOR = new com.google.android.gms.internal.location.zzen();
        return;
    }

    public zzem(java.util.List p1, android.app.PendingIntent p2, String p3)
    {
        com.google.android.gms.internal.location.zzex v1_1;
        if (p1 != null) {
            v1_1 = com.google.android.gms.internal.location.zzex.zzj(p1);
        } else {
            v1_1 = com.google.android.gms.internal.location.zzex.zzi();
        }
        this.zza = v1_1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public static com.google.android.gms.internal.location.zzem zza(java.util.List p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "geofence can\'t be null.");
        com.google.android.gms.common.internal.Preconditions.checkArgument((p3.isEmpty() ^ 1), "Geofences must contains at least one id.");
        return new com.google.android.gms.internal.location.zzem(p3, 0, "");
    }

    public static com.google.android.gms.internal.location.zzem zzb(android.app.PendingIntent p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "PendingIntent can not be null.");
        return new com.google.android.gms.internal.location.zzem(0, p3, "");
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        String v0_0 = this.zza;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p5, 1, v0_0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.zzb, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 3, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }
}
