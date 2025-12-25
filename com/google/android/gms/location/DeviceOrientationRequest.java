package com.google.android.gms.location;
public final class DeviceOrientationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final long OUTPUT_PERIOD_DEFAULT = 20000;
    public static final long OUTPUT_PERIOD_FAST = 5000;
    public static final long OUTPUT_PERIOD_MEDIUM = 10000;
    private final long zza;
    private final boolean zzb;

    static DeviceOrientationRequest()
    {
        com.google.android.gms.location.DeviceOrientationRequest.CREATOR = new com.google.android.gms.location.zzn();
        return;
    }

    public DeviceOrientationRequest(long p1, boolean p3)
    {
        this.zza = p1;
        this.zzb = p3;
        return;
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.google.android.gms.location.DeviceOrientationRequest)) {
                if ((this.zza != ((com.google.android.gms.location.DeviceOrientationRequest) p8).zza) || (this.zzb != ((com.google.android.gms.location.DeviceOrientationRequest) p8).zzb)) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public long getSamplingPeriodMicros()
    {
        return this.zza;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Long.valueOf(this.zza), Boolean.valueOf(this.zzb)}));
    }

    public String toString()
    {
        String v3_1;
        String v0_0 = this.zza;
        StringBuilder v2_4 = String.valueOf(v0_0).length();
        if (1 == this.zzb) {
            v3_1 = ", withVelocity";
        } else {
            v3_1 = "";
        }
        StringBuilder v2_2 = new StringBuilder(((v3_1.length() + (v2_4 + 46)) + 1));
        v2_2.append("DeviceOrientationRequest[samplingPeriodMicros=");
        v2_2.append(v0_0);
        v2_2.append(v3_1);
        v2_2.append("]");
        return v2_2.toString();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 2, this.getSamplingPeriodMicros());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 6, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final synthetic long zza()
    {
        return this.zza;
    }

    public final synthetic boolean zzb()
    {
        return this.zzb;
    }
}
