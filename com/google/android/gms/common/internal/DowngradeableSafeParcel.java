package com.google.android.gms.common.internal;
public abstract class DowngradeableSafeParcel extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    private static final Object zza;
    private boolean zzb;

    static DowngradeableSafeParcel()
    {
        com.google.android.gms.common.internal.DowngradeableSafeParcel.zza = new Object();
        return;
    }

    public DowngradeableSafeParcel()
    {
        this.zzb = 0;
        return;
    }

    public static boolean canUnparcelSafely(String p1)
    {
        try {
            return 1;
        } catch (Throwable v0) {
            throw v0;
        }
    }

    public static Integer getUnparcelClientVersion()
    {
        try {
            return 0;
        } catch (Throwable v1) {
            throw v1;
        }
    }

    public abstract boolean prepareForClientVersion();

    public void setShouldDowngrade(boolean p1)
    {
        this.zzb = p1;
        return;
    }

    public boolean shouldDowngrade()
    {
        return this.zzb;
    }
}
