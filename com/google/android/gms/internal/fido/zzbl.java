package com.google.android.gms.internal.fido;
final class zzbl extends com.google.android.gms.internal.fido.zzcb {
    boolean zza;
    final synthetic Object zzb;

    public zzbl(Object p1)
    {
        this.zzb = p1;
        return;
    }

    public final boolean hasNext()
    {
        if (this.zza) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object next()
    {
        if (this.zza) {
            throw new java.util.NoSuchElementException();
        } else {
            this.zza = 1;
            return this.zzb;
        }
    }
}
