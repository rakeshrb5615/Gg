package com.google.android.gms.location;
public final class DeviceOrientationRequest$Builder {
    private long zza;
    private final boolean zzb;

    public DeviceOrientationRequest$Builder(long p2)
    {
        this.zzb = 0;
        this.setSamplingPeriodMicros(p2);
        return;
    }

    public DeviceOrientationRequest$Builder(com.google.android.gms.location.DeviceOrientationRequest p3)
    {
        this.zza = p3.zza();
        this.zzb = p3.zzb();
        return;
    }

    public com.google.android.gms.location.DeviceOrientationRequest build()
    {
        return new com.google.android.gms.location.DeviceOrientationRequest(this.zza, this.zzb);
    }

    public com.google.android.gms.location.DeviceOrientationRequest$Builder setSamplingPeriodMicros(long p5)
    {
        int v1 = 0;
        if ((p5 >= 0) && (p5 < 9223372036854775807)) {
            v1 = 1;
        }
        StringBuilder v2_1 = new StringBuilder((String.valueOf(p5).length() + 102));
        v2_1.append("Invalid interval: ");
        v2_1.append(p5);
        v2_1.append(" should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
        com.google.android.gms.internal.location.zzer.zzb(v1, v2_1.toString());
        this.zza = p5;
        return this;
    }
}
