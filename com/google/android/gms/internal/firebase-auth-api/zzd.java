package com.google.android.gms.internal.firebase-auth-api;
abstract class zzd implements java.util.Iterator {
    private int zza;
    private Object zzb;

    public zzd()
    {
        this.zza = 2;
        return;
    }

    public final boolean hasNext()
    {
        int v0_0 = this.zza;
        if (v0_0 == 4) {
            throw new IllegalStateException();
        } else {
            int v0_5 = (v0_0 - 1);
            if (v0_5 == 0) {
                return 1;
            } else {
                if (v0_5 != 2) {
                    this.zza = 4;
                    this.zzb = this.zza();
                    if (this.zza != 3) {
                        this.zza = 1;
                        return 1;
                    }
                }
                return 0;
            }
        }
    }

    public final Object next()
    {
        if (!this.hasNext()) {
            throw new java.util.NoSuchElementException();
        } else {
            this.zza = 2;
            java.util.NoSuchElementException v0_4 = this.zzb;
            this.zzb = 0;
            return v0_4;
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    public abstract Object zza();

    public final Object zzb()
    {
        this.zza = 3;
        return 0;
    }
}
