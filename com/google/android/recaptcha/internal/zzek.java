package com.google.android.recaptcha.internal;
public final class zzek {
    private final String zza;
    private String zzb;
    private String zzc;
    private final android.content.Context zzd;
    private final com.google.android.recaptcha.internal.zzeo zze;
    private String zzf;
    private Integer zzg;
    private final int zzh;

    private zzek(com.google.android.recaptcha.internal.zzek p8)
    {
        com.google.android.recaptcha.internal.zzek v0_1 = this(p8.zza, p8.zzb, p8.zzc, p8.zzh, p8.zzd, p8.zze);
        v0_1.zzf = p8.zzf;
        v0_1.zzg = p8.zzg;
        return;
    }

    private zzek(String p1, String p2, String p3, int p4, android.content.Context p5, com.google.android.recaptcha.internal.zzeo p6)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzh = p4;
        this.zzd = p5;
        this.zze = p6;
        return;
    }

    public synthetic zzek(String p1, String p2, String p3, int p4, android.content.Context p5, com.google.android.recaptcha.internal.zzeo p6, kotlin.jvm.internal.f p7)
    {
        this(p1, p2, p3, p4, p5, p6);
        return;
    }

    public final com.google.android.recaptcha.internal.zzek zza()
    {
        return new com.google.android.recaptcha.internal.zzek(this);
    }

    public final com.google.android.recaptcha.internal.zzek zzb(int p1)
    {
        this.zzg = Integer.valueOf(p1);
        return this;
    }

    public final com.google.android.recaptcha.internal.zzek zzc(String p1)
    {
        this.zzf = p1;
        return this;
    }

    public final String zzd()
    {
        return this.zzc;
    }

    public final void zze(com.google.android.recaptcha.internal.zztx p2)
    {
        this.zze.zza(p2);
        return;
    }

    public final com.google.android.recaptcha.internal.zzen zzf(int p13)
    {
        return new com.google.android.recaptcha.internal.zzen(p13, this.zza, this.zzh, this.zzb, this.zzc, this.zzf, 0, this.zze, new com.google.android.recaptcha.internal.zzcc(), this.zzd, this.zzg);
    }
}
