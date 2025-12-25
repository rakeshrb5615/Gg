package com.google.android.recaptcha.internal;
final class zzmn {
    private final Object zza;
    private final int zzb;

    public zzmn(Object p1, int p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.recaptcha.internal.zzmn)) {
            if ((this.zza != ((com.google.android.recaptcha.internal.zzmn) p4).zza) || (this.zzb != ((com.google.android.recaptcha.internal.zzmn) p4).zzb)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return ((System.identityHashCode(this.zza) * 65535) + this.zzb);
    }
}
