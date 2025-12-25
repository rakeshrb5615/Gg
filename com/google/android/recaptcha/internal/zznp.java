package com.google.android.recaptcha.internal;
final class zznp implements java.util.Map$Entry {
    private final java.util.Map$Entry zza;

    public synthetic zznp(java.util.Map$Entry p1, com.google.android.recaptcha.internal.zznr p2)
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
        if (((com.google.android.recaptcha.internal.zzns) this.zza.getValue()) != null) {
            throw 0;
        } else {
            return 0;
        }
    }

    public final Object setValue(Object p2)
    {
        if (!(p2 instanceof com.google.android.recaptcha.internal.zzoi)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        } else {
            return ((com.google.android.recaptcha.internal.zzns) this.zza.getValue()).zzc(((com.google.android.recaptcha.internal.zzoi) p2));
        }
    }

    public final com.google.android.recaptcha.internal.zzns zza()
    {
        return ((com.google.android.recaptcha.internal.zzns) this.zza.getValue());
    }
}
