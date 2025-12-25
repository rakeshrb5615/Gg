package com.google.android.recaptcha.internal;
final class zzkc extends com.google.android.recaptcha.internal.zzjs implements java.io.Serializable {
    private final java.security.MessageDigest zza;
    private final int zzb;
    private final boolean zzc;
    private final String zzd;

    public zzkc(String p1, String p2)
    {
        boolean v1_2 = com.google.android.recaptcha.internal.zzkc.zzc("SHA-256");
        this.zza = v1_2;
        this.zzb = v1_2.getDigestLength();
        this.zzd = "Hashing.sha256()";
        this.zzc = com.google.android.recaptcha.internal.zzkc.zzd(v1_2);
        return;
    }

    private static java.security.MessageDigest zzc(String p1)
    {
        try {
            return java.security.MessageDigest.getInstance(p1);
        } catch (java.security.NoSuchAlgorithmException v1_2) {
            throw new AssertionError(v1_2);
        }
    }

    private static boolean zzd(java.security.MessageDigest p0)
    {
        try {
            p0.clone();
            return 1;
        } catch (CloneNotSupportedException) {
            return 0;
        }
    }

    public final String toString()
    {
        return this.zzd;
    }

    public final com.google.android.recaptcha.internal.zzjx zzb()
    {
        try {
            if (!this.zzc) {
                return new com.google.android.recaptcha.internal.zzka(com.google.android.recaptcha.internal.zzkc.zzc(this.zza.getAlgorithm()), this.zzb, 0);
            } else {
                return new com.google.android.recaptcha.internal.zzka(((java.security.MessageDigest) this.zza.clone()), this.zzb, 0);
            }
        } catch (CloneNotSupportedException) {
            return new com.google.android.recaptcha.internal.zzka(com.google.android.recaptcha.internal.zzkc.zzc(this.zza.getAlgorithm()), this.zzb, 0);
        }
    }
}
