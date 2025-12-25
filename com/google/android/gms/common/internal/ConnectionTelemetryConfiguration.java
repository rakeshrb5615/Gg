package com.google.android.gms.common.internal;
public class ConnectionTelemetryConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final com.google.android.gms.common.internal.RootTelemetryConfiguration zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final int zze;
    private final int[] zzf;

    static ConnectionTelemetryConfiguration()
    {
        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration.CREATOR = new com.google.android.gms.common.internal.zzl();
        return;
    }

    public ConnectionTelemetryConfiguration(com.google.android.gms.common.internal.RootTelemetryConfiguration p1, boolean p2, boolean p3, int[] p4, int p5, int[] p6)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        this.zzf = p6;
        return;
    }

    public int getMaxMethodInvocationsLogged()
    {
        return this.zze;
    }

    public int[] getMethodInvocationMethodKeyAllowlist()
    {
        return this.zzd;
    }

    public int[] getMethodInvocationMethodKeyDisallowlist()
    {
        return this.zzf;
    }

    public boolean getMethodInvocationTelemetryEnabled()
    {
        return this.zzb;
    }

    public boolean getMethodTimingTelemetryEnabled()
    {
        return this.zzc;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.zza, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 2, this.getMethodInvocationTelemetryEnabled());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 3, this.getMethodTimingTelemetryEnabled());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(p5, 4, this.getMethodInvocationMethodKeyAllowlist(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 5, this.getMaxMethodInvocationsLogged());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(p5, 6, this.getMethodInvocationMethodKeyDisallowlist(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final com.google.android.gms.common.internal.RootTelemetryConfiguration zza()
    {
        return this.zza;
    }
}
