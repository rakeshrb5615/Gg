package com.google.android.recaptcha.internal;
public final class zzen {
    private static com.google.android.recaptcha.internal.zzqk zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final com.google.android.recaptcha.internal.zzeo zzf;
    private final android.content.Context zzg;
    private final Integer zzh;
    private final String zzi;
    private final long zzj;
    private final int zzk;
    private final int zzl;

    public zzen(int p1, String p2, int p3, String p4, String p5, String p6, String p7, com.google.android.recaptcha.internal.zzeo p8, com.google.android.recaptcha.internal.zzcc p9, android.content.Context p10, Integer p11)
    {
        this.zzk = p1;
        this.zzb = p2;
        this.zzl = p3;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p6;
        this.zzf = p8;
        this.zzg = p10;
        this.zzh = p11;
        this.zzi = com.google.android.recaptcha.internal.zzqb.zzc(com.google.android.recaptcha.internal.zzqb.zzb(System.currentTimeMillis()));
        this.zzj = System.currentTimeMillis();
        return;
    }

    private final void zzc(int p13, com.google.android.recaptcha.internal.zzqq p14)
    {
        com.google.android.recaptcha.internal.zzra v1 = com.google.android.recaptcha.internal.zzrc.zzi();
        v1.zzy(this.zzk);
        v1.zzq(this.zzc);
        v1.zzt(this.zzd);
        v1.zzz(this.zzl);
        android.content.pm.PackageManager v2_0 = this.zze;
        if (v2_0 != null) {
            v1.zzx(v2_0);
        }
        android.content.pm.PackageManager v2_1 = this.zzh;
        if (v2_1 != null) {
            v1.zzv(v2_1.intValue());
        }
        if (p14 != null) {
            v1.zzs(p14);
        }
        v1.zzA(p13);
        v1.zzw(this.zzi);
        v1.zzr((System.currentTimeMillis() - this.zzj));
        int v13_25 = ((com.google.android.recaptcha.internal.zzaz) a.a.F(com.google.android.recaptcha.internal.zzel.zza).getValue()).zza().iterator();
        while (v13_25.hasNext()) {
            v13_25.next();
            com.google.android.recaptcha.internal.zzra vtmp20 = v1.zzf(0);
        }
        int v13_28;
        int v13_26 = this.zzk;
        com.google.android.recaptcha.internal.zzqk v3_4 = (v1.zze() * 1000);
        int v13_27 = (v13_26 - 2);
        if (v13_27 == 4) {
            v13_28 = com.google.android.recaptcha.internal.zzbl.zzb;
        } else {
            if (v13_27 == 5) {
                v13_28 = com.google.android.recaptcha.internal.zzbl.zzc;
            } else {
                if (v13_27 == 6) {
                    v13_28 = com.google.android.recaptcha.internal.zzbl.zzd;
                } else {
                    if (v13_27 == 7) {
                        v13_28 = com.google.android.recaptcha.internal.zzbl.zze;
                    } else {
                        if (v13_27 == 14) {
                            v13_28 = com.google.android.recaptcha.internal.zzbl.zzf;
                        } else {
                            v13_28 = com.google.android.recaptcha.internal.zzbl.zza;
                        }
                    }
                }
            }
        }
        com.google.android.recaptcha.internal.zzbk.zza(v13_28.zza(), v3_4);
        a.a.F(com.google.android.recaptcha.internal.zzem.zza).getValue();
        int v13_33 = this.zzg;
        com.google.android.recaptcha.internal.zzeo v14_11 = com.google.android.recaptcha.internal.zzbe.zza(v13_33);
        com.google.android.recaptcha.internal.zzqk v3_1 = com.google.android.recaptcha.internal.zzen.zza;
        if (v3_1 == null) {
            android.content.pm.PackageManager v4_0;
            com.google.android.recaptcha.internal.zzqk v3_5 = com.google.android.recaptcha.internal.zzqk.zzf();
            android.content.pm.PackageManager v4_15 = android.os.Build$VERSION.SDK_INT;
            v3_5.zzf(v4_15);
            String v7 = "unknown";
            if (v4_15 < 33) {
                android.content.pm.PackageManager v4_19 = v13_33.getPackageManager().getApplicationInfo(v13_33.getPackageName(), 128).metaData.getInt("com.google.android.gms.version", -1);
                if (v4_19 != -1) {
                    v4_0 = String.valueOf(v4_19);
                } else {
                    while(true) {
                        v4_0 = "unknown";
                    }
                }
            } else {
                android.content.pm.PackageManager v4_4 = v13_33.getPackageManager().getApplicationInfo(v13_33.getPackageName(), android.content.pm.PackageManager$ApplicationInfoFlags.of(128)).metaData.getInt("com.google.android.gms.version", -1);
                if (v4_4 != -1) {
                    v4_0 = String.valueOf(v4_4);
                }
            }
            v3_5.zzs(v4_0);
            v3_5.zzu("18.6.1");
            v3_5.zzr(android.os.Build.MODEL);
            v3_5.zzt(android.os.Build.MANUFACTURER);
            try {
                android.content.pm.PackageManager v4_8 = android.os.Build$VERSION.SDK_INT;
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                v3_5.zzq(v7);
                v3_1 = ((com.google.android.recaptcha.internal.zzqk) v3_5.zzi());
            }
            if (v4_8 < 33) {
                if (v4_8 < 28) {
                    v7 = String.valueOf(v13_33.getPackageManager().getPackageInfo(v13_33.getPackageName(), 0).versionCode);
                } else {
                    v7 = String.valueOf(v13_33.getPackageManager().getPackageInfo(v13_33.getPackageName(), 0).getLongVersionCode());
                }
            } else {
                v7 = String.valueOf(v13_33.getPackageManager().getPackageInfo(v13_33.getPackageName(), android.content.pm.PackageManager$PackageInfoFlags.of(0)).getLongVersionCode());
            }
        }
        com.google.android.recaptcha.internal.zzen.zza = v3_1;
        int v13_10 = ((com.google.android.recaptcha.internal.zzqh) v3_1.zzr());
        v13_10.zze(v14_11);
        int v13_12 = ((com.google.android.recaptcha.internal.zzqk) v13_10.zzi());
        try {
            com.google.android.recaptcha.internal.zzeo v14_2 = java.util.Locale.getDefault().getISO3Language();
            try {
                String v0_1 = java.util.Locale.getDefault().getISO3Country();
            } catch (java.util.MissingResourceException) {
            }
            android.content.pm.PackageManager v2_5 = this.zzb;
            com.google.android.recaptcha.internal.zzqk v3_2 = com.google.android.recaptcha.internal.zzro.zzf();
            v3_2.zzr(v2_5);
            v3_2.zze(v13_12);
            v3_2.zzq(v14_2);
            v3_2.zzf(v0_1);
            v1.zzu(((com.google.android.recaptcha.internal.zzro) v3_2.zzi()));
            int v13_15 = com.google.android.recaptcha.internal.zztx.zzi();
            v13_15.zze(v1);
            this.zzf.zza(((com.google.android.recaptcha.internal.zztx) v13_15.zzi()));
            return;
        } catch (java.util.MissingResourceException) {
            v14_2 = "";
        }
    }

    public final void zza()
    {
        this.zzc(3, 0);
        return;
    }

    public final void zzb(com.google.android.recaptcha.internal.zzbd p3)
    {
        int v0_0 = com.google.android.recaptcha.internal.zzqq.zzg();
        v0_0.zzr(String.valueOf(p3.zzb().zza()));
        v0_0.zze(p3.zza().zza());
        v0_0.zzq(p3.zzc().getErrorCode().getErrorCode());
        com.google.android.recaptcha.internal.zzqq v3_1 = p3.zzd();
        if (v3_1 != null) {
            v0_0.zzf(v3_1);
        }
        this.zzc(4, ((com.google.android.recaptcha.internal.zzqq) v0_0.zzi()));
        return;
    }
}
