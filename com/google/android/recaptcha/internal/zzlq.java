package com.google.android.recaptcha.internal;
public final enum class zzlq extends java.lang.Enum implements com.google.android.recaptcha.internal.zznf {
    public static final enum com.google.android.recaptcha.internal.zzlq zza;
    public static final enum com.google.android.recaptcha.internal.zzlq zzb;
    public static final enum com.google.android.recaptcha.internal.zzlq zzc;
    public static final enum com.google.android.recaptcha.internal.zzlq zzd;
    public static final enum com.google.android.recaptcha.internal.zzlq zze;
    public static final enum com.google.android.recaptcha.internal.zzlq zzf;
    public static final enum com.google.android.recaptcha.internal.zzlq zzg;
    public static final enum com.google.android.recaptcha.internal.zzlq zzh;
    public static final enum com.google.android.recaptcha.internal.zzlq zzi;
    public static final enum com.google.android.recaptcha.internal.zzlq zzj;
    public static final enum com.google.android.recaptcha.internal.zzlq zzk;
    public static final enum com.google.android.recaptcha.internal.zzlq zzl;
    private static final synthetic com.google.android.recaptcha.internal.zzlq[] zzm;
    private final int zzn;

    static zzlq()
    {
        com.google.android.recaptcha.internal.zzlq[] v0_1 = new com.google.android.recaptcha.internal.zzlq("EDITION_UNKNOWN", 0, 0);
        com.google.android.recaptcha.internal.zzlq.zza = v0_1;
        com.google.android.recaptcha.internal.zzlq.zzb = new com.google.android.recaptcha.internal.zzlq("EDITION_LEGACY", 1, 900);
        com.google.android.recaptcha.internal.zzlq.zzc = new com.google.android.recaptcha.internal.zzlq("EDITION_PROTO2", 2, 998);
        com.google.android.recaptcha.internal.zzlq.zzd = new com.google.android.recaptcha.internal.zzlq("EDITION_PROTO3", 3, 999);
        com.google.android.recaptcha.internal.zzlq.zze = new com.google.android.recaptcha.internal.zzlq("EDITION_2023", 4, 1000);
        com.google.android.recaptcha.internal.zzlq.zzf = new com.google.android.recaptcha.internal.zzlq("EDITION_2024", 5, 1001);
        com.google.android.recaptcha.internal.zzlq.zzg = new com.google.android.recaptcha.internal.zzlq("EDITION_1_TEST_ONLY", 6, 1);
        com.google.android.recaptcha.internal.zzlq.zzh = new com.google.android.recaptcha.internal.zzlq("EDITION_2_TEST_ONLY", 7, 2);
        com.google.android.recaptcha.internal.zzlq.zzi = new com.google.android.recaptcha.internal.zzlq("EDITION_99997_TEST_ONLY", 8, 99997);
        com.google.android.recaptcha.internal.zzlq.zzj = new com.google.android.recaptcha.internal.zzlq("EDITION_99998_TEST_ONLY", 9, 99998);
        com.google.android.recaptcha.internal.zzlq.zzk = new com.google.android.recaptcha.internal.zzlq("EDITION_99999_TEST_ONLY", 10, 99999);
        com.google.android.recaptcha.internal.zzlq v11_4 = new com.google.android.recaptcha.internal.zzlq("EDITION_MAX", 11, 2147483647);
        com.google.android.recaptcha.internal.zzlq.zzl = v11_4;
        com.google.android.recaptcha.internal.zzlq.zzm = new com.google.android.recaptcha.internal.zzlq[] {v0_1, v11_4});
        return;
    }

    private zzlq(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzn = p3;
        return;
    }

    public static com.google.android.recaptcha.internal.zzlq[] values()
    {
        return ((com.google.android.recaptcha.internal.zzlq[]) com.google.android.recaptcha.internal.zzlq.zzm.clone());
    }

    public final String toString()
    {
        return Integer.toString(this.zzn);
    }

    public final int zza()
    {
        return this.zzn;
    }
}
