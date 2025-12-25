package com.google.android.gms.internal.fido;
public final class zzdt {
    private final byte zza;
    private final byte zzb;

    public zzdt(int p2)
    {
        this.zza = ((byte) (p2 & 224));
        this.zzb = ((byte) (p2 & 31));
        return;
    }

    public final byte zza()
    {
        return this.zzb;
    }

    public final byte zzb()
    {
        return this.zza;
    }

    public final int zzc()
    {
        return ((this.zza >> 5) & 7);
    }
}
