package com.google.android.gms.internal.firebase-auth-api;
final class zzpq implements java.util.Iterator {
    private final java.util.Iterator zza;
    private final java.util.Iterator zzb;

    private zzpq(java.util.Iterator p1, java.util.Iterator p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public synthetic zzpq(java.util.Iterator p1, java.util.Iterator p2, com.google.android.gms.internal.firebase-auth-api.zzpp p3)
    {
        this(p1, p2);
        return;
    }

    public final boolean hasNext()
    {
        if ((!this.zza.hasNext()) && (!this.zzb.hasNext())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object next()
    {
        if (!this.zza.hasNext()) {
            return this.zzb.next();
        } else {
            return this.zza.next();
        }
    }
}
