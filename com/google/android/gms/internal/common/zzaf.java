package com.google.android.gms.internal.common;
final class zzaf extends com.google.android.gms.internal.common.zzah {
    private final transient com.google.android.gms.internal.common.zzah zza;

    public zzaf(com.google.android.gms.internal.common.zzah p1)
    {
        this.zza = p1;
        return;
    }

    private final int zzs(int p2)
    {
        return ((this.zza.size() - 1) - p2);
    }

    public final boolean contains(Object p2)
    {
        return this.zza.contains(p2);
    }

    public final Object get(int p4)
    {
        com.google.android.gms.internal.common.zzah v0 = this.zza;
        com.google.android.gms.internal.common.zzr.zzb(p4, v0.size(), "index");
        return v0.get(this.zzs(p4));
    }

    public final int indexOf(Object p2)
    {
        int v2_1 = this.zza.lastIndexOf(p2);
        if (v2_1 < 0) {
            return -1;
        } else {
            return this.zzs(v2_1);
        }
    }

    public final int lastIndexOf(Object p2)
    {
        int v2_1 = this.zza.indexOf(p2);
        if (v2_1 < 0) {
            return -1;
        } else {
            return this.zzs(v2_1);
        }
    }

    public final int size()
    {
        return this.zza.size();
    }

    public final bridge synthetic java.util.List subList(int p1, int p2)
    {
        return this.zzi(p1, p2);
    }

    public final boolean zzf()
    {
        return this.zza.zzf();
    }

    public final com.google.android.gms.internal.common.zzah zzh()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.common.zzah zzi(int p3, int p4)
    {
        com.google.android.gms.internal.common.zzah v0 = this.zza;
        com.google.android.gms.internal.common.zzr.zzd(p3, p4, v0.size());
        return v0.zzi((v0.size() - p4), (v0.size() - p3)).zzh();
    }
}
