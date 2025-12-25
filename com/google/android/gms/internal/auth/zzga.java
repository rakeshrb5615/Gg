package com.google.android.gms.internal.auth;
final class zzga implements com.google.android.gms.internal.auth.zzgh {
    private final com.google.android.gms.internal.auth.zzfw zza;
    private final com.google.android.gms.internal.auth.zzgy zzb;
    private final com.google.android.gms.internal.auth.zzel zzc;

    private zzga(com.google.android.gms.internal.auth.zzgy p1, com.google.android.gms.internal.auth.zzel p2, com.google.android.gms.internal.auth.zzfw p3)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zza = p3;
        return;
    }

    public static com.google.android.gms.internal.auth.zzga zzb(com.google.android.gms.internal.auth.zzgy p1, com.google.android.gms.internal.auth.zzel p2, com.google.android.gms.internal.auth.zzfw p3)
    {
        return new com.google.android.gms.internal.auth.zzga(p1, p2, p3);
    }

    public final int zza(Object p2)
    {
        return this.zzb.zza(p2).hashCode();
    }

    public final Object zzd()
    {
        return ((com.google.android.gms.internal.auth.zzes) ((com.google.android.gms.internal.auth.zzeu) this.zza).zzi(5, 0, 0)).zzg();
    }

    public final void zze(Object p2)
    {
        this.zzb.zze(p2);
        this.zzc.zzb(p2);
        return;
    }

    public final void zzf(Object p2, Object p3)
    {
        com.google.android.gms.internal.auth.zzgj.zzf(this.zzb, p2, p3);
        return;
    }

    public final void zzg(Object p1, byte[] p2, int p3, int p4, com.google.android.gms.internal.auth.zzds p5)
    {
        if (((com.google.android.gms.internal.auth.zzeu) p1).zzc == com.google.android.gms.internal.auth.zzgz.zza()) {
            ((com.google.android.gms.internal.auth.zzeu) p1).zzc = com.google.android.gms.internal.auth.zzgz.zzc();
        }
        throw 0;
    }

    public final boolean zzh(Object p2, Object p3)
    {
        if (this.zzb.zza(p2).equals(this.zzb.zza(p3))) {
            return 1;
        } else {
            return 0;
        }
    }

    public final boolean zzi(Object p2)
    {
        this.zzc.zza(p2);
        throw 0;
    }
}
