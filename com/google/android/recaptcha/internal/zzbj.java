package com.google.android.recaptcha.internal;
public final class zzbj implements java.lang.Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public zzbj()
    {
        return;
    }

    public final bridge synthetic int compareTo(Object p1)
    {
        return this.zza(((com.google.android.recaptcha.internal.zzbj) p1));
    }

    public final String toString()
    {
        return v1.a.o(v1.a.r("avgExecutionTime: ", b8.i.B0(10, String.valueOf((this.zzb / ((long) this.zza)))), " us| maxExecutionTime: ", b8.i.B0(10, String.valueOf(this.zzc)), " us| totalTime: "), b8.i.B0(10, String.valueOf(this.zzb)), " us| #Usages: ", b8.i.B0(5, String.valueOf(this.zza)));
    }

    public final int zza(com.google.android.recaptcha.internal.zzbj p4)
    {
        Long v0_1 = Long.valueOf(this.zzb);
        int v4_2 = Long.valueOf(p4.zzb);
        if (v0_1 != v4_2) {
            return v0_1.compareTo(v4_2);
        } else {
            return 0;
        }
    }

    public final int zzb()
    {
        return this.zza;
    }

    public final long zzc()
    {
        return this.zzc;
    }

    public final long zzd()
    {
        return this.zzb;
    }

    public final void zze(long p1)
    {
        this.zzc = p1;
        return;
    }

    public final void zzf(long p1)
    {
        this.zzb = p1;
        return;
    }

    public final void zzg(int p1)
    {
        this.zza = p1;
        return;
    }
}
