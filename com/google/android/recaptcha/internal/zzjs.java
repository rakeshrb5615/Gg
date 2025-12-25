package com.google.android.recaptcha.internal;
abstract class zzjs implements com.google.android.recaptcha.internal.zzjw {

    public zzjs()
    {
        return;
    }

    public final com.google.android.recaptcha.internal.zzjv zza(CharSequence p4, java.nio.charset.Charset p5)
    {
        com.google.android.recaptcha.internal.zzjx v0 = this.zzb();
        com.google.android.recaptcha.internal.zzjv v4_3 = p4.toString().getBytes(p5);
        v4_3.getClass();
        ((com.google.android.recaptcha.internal.zzjr) v0).zza(v4_3, 0, v4_3.length);
        return v0.zzb();
    }
}
