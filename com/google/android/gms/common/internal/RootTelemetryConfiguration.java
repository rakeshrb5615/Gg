package com.google.android.gms.common.internal;
public class RootTelemetryConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int zzd;
    private final int zze;

    static RootTelemetryConfiguration()
    {
        com.google.android.gms.common.internal.RootTelemetryConfiguration.CREATOR = new com.google.android.gms.common.internal.zzag();
        return;
    }

    public RootTelemetryConfiguration(int p1, boolean p2, boolean p3, int p4, int p5)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        return;
    }

    public int getBatchPeriodMillis()
    {
        return this.zzd;
    }

    public int getMaxMethodInvocationsInBatch()
    {
        return this.zze;
    }

    public boolean getMethodInvocationTelemetryEnabled()
    {
        return this.zzb;
    }

    public boolean getMethodTimingTelemetryEnabled()
    {
        return this.zzc;
    }

    public int getVersion()
    {
        return this.zza;
    }

    public final void writeToParcel(android.os.Parcel p3, int p4)
    {
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 1, this.getVersion());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 2, this.getMethodInvocationTelemetryEnabled());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 3, this.getMethodTimingTelemetryEnabled());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 4, this.getBatchPeriodMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 5, this.getMaxMethodInvocationsInBatch());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }
}
