package com.google.android.gms.internal.common;
abstract class zzk implements java.util.Iterator {
    private Object zza;
    private int zzb;

    public zzk()
    {
        this.zzb = 2;
        return;
    }

    public final boolean hasNext()
    {
        int v0_5;
        if (this.zzb == 4) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        com.google.android.gms.internal.common.zzr.zza(v0_5);
        int v0_6 = this.zzb;
        int v4 = (v0_6 - 1);
        if (v0_6 == 0) {
            throw 0;
        } else {
            if (v4 == 0) {
                return 1;
            } else {
                if (v4 != 2) {
                    this.zzb = 4;
                    this.zza = this.zza();
                    if (this.zzb != 3) {
                        this.zzb = 1;
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
            this.zzb = 2;
            java.util.NoSuchElementException v0_4 = this.zza;
            this.zza = 0;
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
        this.zzb = 3;
        return 0;
    }
}
