package com.google.android.recaptcha.internal;
final class zzka extends com.google.android.recaptcha.internal.zzjr {
    private final java.security.MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public synthetic zzka(java.security.MessageDigest p1, int p2, com.google.android.recaptcha.internal.zzkb p3)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    private final void zzc()
    {
        com.google.android.recaptcha.internal.zzjf.zze((this.zzc ^ 1), "Cannot re-use a Hasher after calling hash() on it");
        return;
    }

    public final void zza(byte[] p2, int p3, int p4)
    {
        this.zzc();
        this.zza.update(p2, 0, p4);
        return;
    }

    public final com.google.android.recaptcha.internal.zzjv zzb()
    {
        this.zzc();
        this.zzc = 1;
        byte[] v0_4 = this.zzb;
        if (v0_4 != this.zza.getDigestLength()) {
            return new com.google.android.recaptcha.internal.zzju(java.util.Arrays.copyOf(this.zza.digest(), v0_4));
        } else {
            return new com.google.android.recaptcha.internal.zzju(this.zza.digest());
        }
    }
}
