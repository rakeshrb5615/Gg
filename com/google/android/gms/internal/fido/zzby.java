package com.google.android.gms.internal.fido;
final class zzby extends com.google.android.gms.internal.fido.zzbc {
    final transient Object zza;

    public zzby(Object p1)
    {
        p1.getClass();
        this.zza = p1;
        return;
    }

    public final boolean contains(Object p2)
    {
        return this.zza.equals(p2);
    }

    public final int hashCode()
    {
        return this.zza.hashCode();
    }

    public final synthetic java.util.Iterator iterator()
    {
        return new com.google.android.gms.internal.fido.zzbl(this.zza);
    }

    public final int size()
    {
        return 1;
    }

    public final String toString()
    {
        return v1.a.l("[", this.zza.toString(), "]");
    }

    public final int zza(Object[] p2, int p3)
    {
        p2[0] = this.zza;
        return 1;
    }

    public final com.google.android.gms.internal.fido.zzcb zzd()
    {
        return new com.google.android.gms.internal.fido.zzbl(this.zza);
    }

    public final com.google.android.gms.internal.fido.zzaz zzi()
    {
        return com.google.android.gms.internal.fido.zzaz.zzj(this.zza);
    }
}
