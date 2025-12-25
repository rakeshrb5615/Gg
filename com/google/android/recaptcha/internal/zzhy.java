package com.google.android.recaptcha.internal;
public final class zzhy {
    private java.util.List zza;

    public zzhy()
    {
        this.zza = i7.n.a;
        return;
    }

    public final long zza(long[] p6)
    {
        UnsupportedOperationException v6_5 = i7.i.e0(this.zza, i7.h.h0(p6)).iterator();
        if (!v6_5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
        } else {
            long v0_2 = v6_5.next();
            while (v6_5.hasNext()) {
                v0_2 = Long.valueOf((((Number) v0_2).longValue() ^ ((Number) v6_5.next()).longValue()));
            }
            return ((Number) v0_2).longValue();
        }
    }

    public final void zzb(long[] p1)
    {
        this.zza = i7.h.h0(p1);
        return;
    }
}
