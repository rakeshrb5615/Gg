package com.google.android.gms.internal.firebase-auth-api;
final class zzals implements java.util.Iterator {
    private java.util.Iterator zza;

    public zzals(java.util.Iterator p1)
    {
        this.zza = p1;
        return;
    }

    public final boolean hasNext()
    {
        return this.zza.hasNext();
    }

    public final synthetic Object next()
    {
        java.util.Map$Entry v0_2 = ((java.util.Map$Entry) this.zza.next());
        if (!(v0_2.getValue() instanceof com.google.android.gms.internal.firebase-auth-api.zzalq)) {
            return v0_2;
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzalp(v0_2, 0);
        }
    }

    public final void remove()
    {
        this.zza.remove();
        return;
    }
}
