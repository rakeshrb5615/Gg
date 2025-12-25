package com.google.android.gms.internal.play_billing;
final class zzft implements java.util.Iterator {
    private final java.util.Iterator zza;

    public zzft(java.util.Iterator p1)
    {
        this.zza = p1;
        return;
    }

    public final boolean hasNext()
    {
        return this.zza.hasNext();
    }

    public final bridge synthetic Object next()
    {
        java.util.Map$Entry v0_2 = ((java.util.Map$Entry) this.zza.next());
        if (!(v0_2.getValue() instanceof com.google.android.gms.internal.play_billing.zzfv)) {
            return v0_2;
        } else {
            return new com.google.android.gms.internal.play_billing.zzfs(v0_2, 0);
        }
    }

    public final void remove()
    {
        this.zza.remove();
        return;
    }
}
