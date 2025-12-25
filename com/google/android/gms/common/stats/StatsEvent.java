package com.google.android.gms.common.stats;
public abstract class StatsEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    public StatsEvent()
    {
        return;
    }

    public final String toString()
    {
        String v0_0 = this.zza();
        int v2 = this.zzb();
        String v3 = this.zzc();
        StringBuilder v5_3 = new StringBuilder(((((String.valueOf(v0_0).length() + 1) + String.valueOf(v2).length()) + 3) + v3.length()));
        v5_3.append(v0_0);
        v5_3.append("\t");
        v5_3.append(v2);
        return v1.a.n(v5_3, "\t-1", v3);
    }

    public abstract long zza();

    public abstract int zzb();

    public abstract String zzc();
}
