package com.google.android.recaptcha.internal;
final class zzkx extends com.google.android.recaptcha.internal.zzky {
    final synthetic com.google.android.recaptcha.internal.zzle zza;
    private int zzb;
    private final int zzc;

    public zzkx(com.google.android.recaptcha.internal.zzle p2)
    {
        this.zza = p2;
        this.zzb = 0;
        this.zzc = p2.zzd();
        return;
    }

    public final boolean hasNext()
    {
        if (this.zzb >= this.zzc) {
            return 0;
        } else {
            return 1;
        }
    }

    public final byte zza()
    {
        java.util.NoSuchElementException v0_0 = this.zzb;
        if (v0_0 >= this.zzc) {
            throw new java.util.NoSuchElementException();
        } else {
            this.zzb = (v0_0 + 1);
            return this.zza.zzb(v0_0);
        }
    }
}
