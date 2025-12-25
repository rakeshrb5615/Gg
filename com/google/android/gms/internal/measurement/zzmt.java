package com.google.android.gms.internal.measurement;
final class zzmt implements java.util.Map$Entry {
    private final java.util.Map$Entry zza;

    public synthetic zzmt(java.util.Map$Entry p1, byte[] p2)
    {
        this.zza = p1;
        return;
    }

    public final Object getKey()
    {
        return this.zza.getKey();
    }

    public final Object getValue()
    {
        if (((com.google.android.gms.internal.measurement.zzmv) this.zza.getValue()) != null) {
            throw 0;
        } else {
            return 0;
        }
    }

    public final Object setValue(Object p2)
    {
        if (!(p2 instanceof com.google.android.gms.internal.measurement.zznm)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        } else {
            return ((com.google.android.gms.internal.measurement.zzmv) this.zza.getValue()).zza(((com.google.android.gms.internal.measurement.zznm) p2));
        }
    }

    public final com.google.android.gms.internal.measurement.zzmv zza()
    {
        return ((com.google.android.gms.internal.measurement.zzmv) this.zza.getValue());
    }
}
