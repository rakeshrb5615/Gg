package com.google.android.recaptcha.internal;
final class zzjo implements java.util.Iterator {
    boolean zza;
    final synthetic java.util.Iterator zzb;

    public zzjo(com.google.android.recaptcha.internal.zzjp p1, java.util.Iterator p2)
    {
        this.zzb = p2;
        this.zza = 1;
        return;
    }

    public final boolean hasNext()
    {
        return this.zzb.hasNext();
    }

    public final Object next()
    {
        Object v0_1 = this.zzb.next();
        this.zza = 0;
        return v0_1;
    }

    public final void remove()
    {
        com.google.android.recaptcha.internal.zzjf.zze((this.zza ^ 1), "no calls to next() since the last call to remove()");
        this.zzb.remove();
        return;
    }
}
