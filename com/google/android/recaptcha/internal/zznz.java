package com.google.android.recaptcha.internal;
final class zznz implements com.google.android.recaptcha.internal.zzog {
    private final com.google.android.recaptcha.internal.zzog[] zza;

    public varargs zznz(com.google.android.recaptcha.internal.zzog[] p1)
    {
        this.zza = p1;
        return;
    }

    public final com.google.android.recaptcha.internal.zzof zzb(Class p4)
    {
        int v0_0 = 0;
        while (v0_0 < 2) {
            String v1_2 = this.zza[v0_0];
            if (!v1_2.zzc(p4)) {
                v0_0++;
            } else {
                return v1_2.zzb(p4);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(p4.getName()));
    }

    public final boolean zzc(Class p4)
    {
        int v1 = 0;
        while (v1 < 2) {
            if (!this.zza[v1].zzc(p4)) {
                v1++;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
