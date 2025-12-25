package com.google.android.gms.internal.fido;
final class zzax extends com.google.android.gms.internal.fido.zzaz {
    private final transient com.google.android.gms.internal.fido.zzaz zza;

    public zzax(com.google.android.gms.internal.fido.zzaz p1)
    {
        this.zza = p1;
        return;
    }

    private final int zzl(int p2)
    {
        return ((this.zza.size() - 1) - p2);
    }

    public final boolean contains(Object p2)
    {
        return this.zza.contains(p2);
    }

    public final Object get(int p3)
    {
        com.google.android.gms.internal.fido.zzap.zza(p3, this.zza.size(), "index");
        return this.zza.get(this.zzl(p3));
    }

    public final int indexOf(Object p2)
    {
        int v2_1 = this.zza.lastIndexOf(p2);
        if (v2_1 < 0) {
            return -1;
        } else {
            return this.zzl(v2_1);
        }
    }

    public final int lastIndexOf(Object p2)
    {
        int v2_1 = this.zza.indexOf(p2);
        if (v2_1 < 0) {
            return -1;
        } else {
            return this.zzl(v2_1);
        }
    }

    public final int size()
    {
        return this.zza.size();
    }

    public final bridge synthetic java.util.List subList(int p1, int p2)
    {
        return this.zzg(p1, p2);
    }

    public final com.google.android.gms.internal.fido.zzaz zzf()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.fido.zzaz zzg(int p3, int p4)
    {
        com.google.android.gms.internal.fido.zzap.zze(p3, p4, this.zza.size());
        com.google.android.gms.internal.fido.zzaz v0_2 = this.zza;
        return v0_2.zzg((v0_2.size() - p4), (this.zza.size() - p3)).zzf();
    }
}
