package com.google.android.recaptcha.internal;
final class zzjp extends com.google.android.recaptcha.internal.zzjk {
    final synthetic Iterable zza;
    final synthetic int zzb;

    public zzjp(Iterable p1, int p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final java.util.Iterator iterator()
    {
        java.util.Iterator v0_0 = this.zza;
        if (!(v0_0 instanceof java.util.List)) {
            boolean v3_0;
            com.google.android.recaptcha.internal.zzjo v1_5 = this.zzb;
            java.util.Iterator v0_4 = v0_0.iterator();
            v0_4.getClass();
            int v2_0 = 0;
            if (v1_5 < null) {
                v3_0 = 0;
            } else {
                v3_0 = 1;
            }
            com.google.android.recaptcha.internal.zzjf.zzb(v3_0, "numberToAdvance must be nonnegative");
            while ((v2_0 < v1_5) && (v0_4.hasNext())) {
                v0_4.next();
                v2_0++;
            }
            return new com.google.android.recaptcha.internal.zzjo(this, v0_4);
        } else {
            java.util.Iterator v0_1 = ((java.util.List) v0_0);
            return v0_1.subList(Math.min(v0_1.size(), this.zzb), v0_1.size()).iterator();
        }
    }
}
