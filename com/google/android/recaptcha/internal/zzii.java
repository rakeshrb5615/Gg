package com.google.android.recaptcha.internal;
public final class zzii implements com.google.android.recaptcha.internal.zzih {
    private final android.content.Context zza;
    private final java.util.Map zzb;

    public zzii(android.content.Context p6)
    {
        this.zza = p6;
        this.zzb = i7.r.n0(new h7.f[] {new h7.f(Integer.valueOf(2), android.content.Context.ACTIVITY_SERVICE), new h7.f(Integer.valueOf(3), android.content.Context.TELEPHONY_SERVICE), new h7.f(Integer.valueOf(4), android.content.Context.INPUT_METHOD_SERVICE), new h7.f(Integer.valueOf(5), android.content.Context.AUDIO_SERVICE)}));
        return;
    }

    public final synthetic Object cs(Object[] p1)
    {
        return com.google.android.recaptcha.internal.zzie.zza(this, p1);
    }

    public final varargs Object zza(Object[] p4)
    {
        com.google.android.recaptcha.internal.zzce v4_1 = p4[0];
        if (1 != (v4_1 instanceof Integer)) {
            v4_1 = 0;
        }
        com.google.android.recaptcha.internal.zzce v4_11 = ((Integer) v4_1);
        if (v4_11 == null) {
            throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
        } else {
            com.google.android.recaptcha.internal.zzce v4_6 = this.zzb.get(Integer.valueOf(v4_11.intValue()));
            if (v4_6 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 4, 0);
            } else {
                return this.zza.getSystemService(((String) v4_6));
            }
        }
    }
}
