package com.google.android.gms.internal.location;
public final class zzh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    static final java.util.List zza;
    static final com.google.android.gms.location.DeviceOrientationRequest zzb;
    final com.google.android.gms.location.DeviceOrientationRequest zzc;
    final java.util.List zzd;
    final String zze;

    static zzh()
    {
        com.google.android.gms.internal.location.zzh.zza = java.util.Collections.EMPTY_LIST;
        com.google.android.gms.internal.location.zzh.zzb = new com.google.android.gms.location.DeviceOrientationRequest$Builder(20000).build();
        com.google.android.gms.internal.location.zzh.CREATOR = new com.google.android.gms.internal.location.zzi();
        return;
    }

    public zzh(com.google.android.gms.location.DeviceOrientationRequest p1, java.util.List p2, String p3)
    {
        this.zzc = p1;
        this.zzd = p2;
        this.zze = p3;
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.location.zzh)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.internal.location.zzh) p4).zzc)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzd, ((com.google.android.gms.internal.location.zzh) p4).zzd)) || (!com.google.android.gms.common.internal.Objects.equal(this.zze, ((com.google.android.gms.internal.location.zzh) p4).zze)))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return this.zzc.hashCode();
    }

    public final String toString()
    {
        String v0_1 = String.valueOf(this.zzc);
        String v1_2 = String.valueOf(this.zzd);
        String v4 = this.zze;
        StringBuilder v3_1 = new StringBuilder((((((v0_1.length() + 68) + v1_2.length()) + 7) + String.valueOf(v4).length()) + 2));
        v3_1.append("DeviceOrientationRequestInternal[deviceOrientationRequest=");
        v3_1.append(v0_1);
        v3_1.append(", clients=");
        v3_1.append(v1_2);
        return v1.a.o(v3_1, ", tag=\'", v4, "\']");
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.zzc, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 2, this.zzd, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 3, this.zze, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
