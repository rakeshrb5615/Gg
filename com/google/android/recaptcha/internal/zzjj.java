package com.google.android.recaptcha.internal;
public final class zzjj extends com.google.android.recaptcha.internal.zzjn implements java.io.Serializable {
    final int zza;
    private final java.util.Queue zzb;

    private zzjj(int p3)
    {
        if (p3 < null) {
            throw new IllegalArgumentException(com.google.android.recaptcha.internal.zzji.zza("maxSize (%s) must >= 0", new Object[] {Integer.valueOf(p3)})));
        } else {
            this.zzb = new java.util.ArrayDeque(p3);
            this.zza = p3;
            return;
        }
    }

    public static com.google.android.recaptcha.internal.zzjj zza(int p1)
    {
        return new com.google.android.recaptcha.internal.zzjj(p1);
    }

    public final boolean add(Object p4)
    {
        p4.getClass();
        if (this.zza != 0) {
            if (this.size() == this.zza) {
                this.zzb.remove();
            }
            this.zzb.add(p4);
            return 1;
        } else {
            return 1;
        }
    }

    public final boolean addAll(java.util.Collection p4)
    {
        int v0_0 = p4.size();
        if (v0_0 < this.zza) {
            return com.google.android.recaptcha.internal.zzjq.zza(this, p4.iterator());
        } else {
            com.google.android.recaptcha.internal.zzjp v1_1;
            this.clear();
            int v0_1 = (v0_0 - this.zza);
            if (v0_1 < 0) {
                v1_1 = 0;
            } else {
                v1_1 = 1;
            }
            com.google.android.recaptcha.internal.zzjf.zzb(v1_1, "number to skip cannot be negative");
            return com.google.android.recaptcha.internal.zzjq.zza(this, new com.google.android.recaptcha.internal.zzjp(p4, v0_1).iterator());
        }
    }

    public final boolean offer(Object p1)
    {
        this.add(p1);
        return 1;
    }

    public final synthetic Object zzb()
    {
        return this.zzb;
    }

    public final synthetic java.util.Collection zzc()
    {
        return this.zzb;
    }

    public final java.util.Queue zzd()
    {
        return this.zzb;
    }
}
