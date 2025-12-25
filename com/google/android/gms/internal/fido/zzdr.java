package com.google.android.gms.internal.fido;
public abstract class zzdr implements java.lang.Comparable {

    public zzdr()
    {
        return;
    }

    private final com.google.android.gms.internal.fido.zzdr zzc(Class p5)
    {
        if (!p5.isInstance(this)) {
            throw new com.google.android.gms.internal.fido.zzdq(g2.g.f("Expected a ", p5.getName(), " value, but got ", this.getClass().getName()));
        } else {
            return ((com.google.android.gms.internal.fido.zzdr) p5.cast(this));
        }
    }

    public static int zzd(byte p0)
    {
        return ((p0 >> 5) & 7);
    }

    public static com.google.android.gms.internal.fido.zzdm zzg(long p1)
    {
        return new com.google.android.gms.internal.fido.zzdm(p1);
    }

    public static com.google.android.gms.internal.fido.zzdp zzi(String p1)
    {
        return new com.google.android.gms.internal.fido.zzdp(p1);
    }

    public static varargs com.google.android.gms.internal.fido.zzdr zzj(byte[] p1)
    {
        p1.getClass();
        java.io.ByteArrayInputStream v0_2 = new java.io.ByteArrayInputStream(java.util.Arrays.copyOf(p1, p1.length));
        return com.google.android.gms.internal.fido.zzds.zza(v0_2, new com.google.android.gms.internal.fido.zzdu(v0_2));
    }

    public static com.google.android.gms.internal.fido.zzdr zzk(java.io.InputStream p1)
    {
        return com.google.android.gms.internal.fido.zzds.zza(p1, new com.google.android.gms.internal.fido.zzdu(p1));
    }

    public abstract int zza();

    public int zzb()
    {
        return 0;
    }

    public final com.google.android.gms.internal.fido.zzdk zze()
    {
        return ((com.google.android.gms.internal.fido.zzdk) this.zzc(com.google.android.gms.internal.fido.zzdk));
    }

    public final com.google.android.gms.internal.fido.zzdm zzf()
    {
        return ((com.google.android.gms.internal.fido.zzdm) this.zzc(com.google.android.gms.internal.fido.zzdm));
    }

    public final com.google.android.gms.internal.fido.zzdo zzh()
    {
        return ((com.google.android.gms.internal.fido.zzdo) this.zzc(com.google.android.gms.internal.fido.zzdo));
    }
}
