package com.google.android.gms.internal.firebase-auth-api;
final class zzalp implements java.util.Map$Entry {
    private java.util.Map$Entry zza;

    private zzalp(java.util.Map$Entry p1)
    {
        this.zza = p1;
        return;
    }

    public synthetic zzalp(java.util.Map$Entry p1, com.google.android.gms.internal.firebase-auth-api.zzalr p2)
    {
        this(p1);
        return;
    }

    public final Object getKey()
    {
        return this.zza.getKey();
    }

    public final Object getValue()
    {
        if (((com.google.android.gms.internal.firebase-auth-api.zzalq) this.zza.getValue()) != null) {
            throw new NoSuchMethodError();
        } else {
            return 0;
        }
    }

    public final Object setValue(Object p2)
    {
        if (!(p2 instanceof com.google.android.gms.internal.firebase-auth-api.zzamm)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzalq) this.zza.getValue()).zza(((com.google.android.gms.internal.firebase-auth-api.zzamm) p2));
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzalq zza()
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzalq) this.zza.getValue());
    }
}
