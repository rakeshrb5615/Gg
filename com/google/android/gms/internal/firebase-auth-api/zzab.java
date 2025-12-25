package com.google.android.gms.internal.firebase-auth-api;
abstract class zzab extends com.google.android.gms.internal.firebase-auth-api.zzax {
    private final int zza;
    private int zzb;

    public zzab(int p1, int p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzu.zzb(p2, p1);
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final boolean hasNext()
    {
        if (this.zzb >= this.zza) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean hasPrevious()
    {
        if (this.zzb <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object next()
    {
        if (!this.hasNext()) {
            throw new java.util.NoSuchElementException();
        } else {
            java.util.NoSuchElementException v0_4 = this.zzb;
            this.zzb = (v0_4 + 1);
            return this.zza(v0_4);
        }
    }

    public final int nextIndex()
    {
        return this.zzb;
    }

    public final Object previous()
    {
        if (!this.hasPrevious()) {
            throw new java.util.NoSuchElementException();
        } else {
            java.util.NoSuchElementException v0_5 = (this.zzb - 1);
            this.zzb = v0_5;
            return this.zza(v0_5);
        }
    }

    public final int previousIndex()
    {
        return (this.zzb - 1);
    }

    public abstract Object zza();
}
