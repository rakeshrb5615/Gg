package com.google.android.gms.internal.fido;
final class zzbt extends com.google.android.gms.internal.fido.zzbc {
    static final com.google.android.gms.internal.fido.zzbt zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static zzbt()
    {
        Object[] v2 = new Object[0];
        com.google.android.gms.internal.fido.zzbt.zzd = v2;
        com.google.android.gms.internal.fido.zzbt.zza = new com.google.android.gms.internal.fido.zzbt(v2, 0, v2, 0, 0);
        return;
    }

    public zzbt(Object[] p1, int p2, Object[] p3, int p4, int p5)
    {
        this.zzb = p1;
        this.zze = p2;
        this.zzc = p3;
        this.zzf = p4;
        this.zzg = p5;
        return;
    }

    public final boolean contains(Object p5)
    {
        Object[] v0 = this.zzc;
        if ((p5 != 0) && (v0.length != 0)) {
            int v2_1 = com.google.android.gms.internal.fido.zzau.zza(p5.hashCode());
            while(true) {
                int v2_0 = (v2_1 & this.zzf);
                boolean v3_0 = v0[v2_0];
                if (v3_0) {
                    if (v3_0.equals(p5)) {
                        break;
                    }
                    v2_1 = (v2_0 + 1);
                } else {
                    return 0;
                }
            }
            return 1;
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return this.zze;
    }

    public final synthetic java.util.Iterator iterator()
    {
        return this.zzi().zzk(0);
    }

    public final int size()
    {
        return this.zzg;
    }

    public final int zza(Object[] p3, int p4)
    {
        System.arraycopy(this.zzb, 0, p3, 0, this.zzg);
        return this.zzg;
    }

    public final int zzb()
    {
        return this.zzg;
    }

    public final int zzc()
    {
        return 0;
    }

    public final com.google.android.gms.internal.fido.zzcb zzd()
    {
        return this.zzi().zzk(0);
    }

    public final Object[] zze()
    {
        return this.zzb;
    }

    public final boolean zzg()
    {
        return 1;
    }

    public final com.google.android.gms.internal.fido.zzaz zzj()
    {
        return com.google.android.gms.internal.fido.zzaz.zzh(this.zzb, this.zzg);
    }
}
