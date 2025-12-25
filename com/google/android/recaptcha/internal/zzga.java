package com.google.android.recaptcha.internal;
public final class zzga extends com.google.android.recaptcha.internal.zzfx {
    private final com.google.android.recaptcha.internal.zzfz zza;
    private final String zzb;

    public zzga(com.google.android.recaptcha.internal.zzfz p1, String p2, Object p3)
    {
        super(p3);
        super.zza = p1;
        super.zzb = p2;
        return;
    }

    public final boolean zza(Object p1, reflect.Method p2, Object[] p3)
    {
        if (!kotlin.jvm.internal.j.a(p2.getName(), this.zzb)) {
            return 0;
        } else {
            i7.n v2_1;
            int v1_4 = this.zza;
            if (p3 == null) {
                v2_1 = i7.n.a;
            } else {
                v2_1 = i7.h.V(p3);
            }
            v1_4.zzb(v2_1);
            return 1;
        }
    }
}
