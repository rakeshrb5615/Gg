package com.google.android.recaptcha.internal;
public final class zzes implements com.google.android.recaptcha.internal.zzeo {
    private static java.util.Timer zza;
    private final android.content.Context zzb;
    private final com.google.android.recaptcha.internal.zzet zzc;
    private final d8.c0 zzd;
    private final com.google.android.recaptcha.internal.zzei zze;

    public zzes(android.content.Context p1, com.google.android.recaptcha.internal.zzet p2, d8.c0 p3)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        com.google.android.recaptcha.internal.zzei v2_1 = 0;
        try {
            com.google.android.recaptcha.internal.zzei v3_1 = com.google.android.recaptcha.internal.zzei.zzc();
        } catch (Exception) {
            this.zze = v2_1;
            this.zzh();
            return;
        }
        if (v3_1 == null) {
            v3_1 = new com.google.android.recaptcha.internal.zzei(p1, 0);
        }
        com.google.android.recaptcha.internal.zzei.zze(v3_1);
        v2_1 = v3_1;
        this.zze = v2_1;
        this.zzh();
        return;
    }

    public static final synthetic com.google.android.recaptcha.internal.zzei zzb(com.google.android.recaptcha.internal.zzes p0)
    {
        return p0.zze;
    }

    public static final synthetic java.util.Timer zzc()
    {
        return com.google.android.recaptcha.internal.zzes.zza;
    }

    public static final synthetic d8.c0 zzd(com.google.android.recaptcha.internal.zzes p0)
    {
        return p0.zzd;
    }

    public static final synthetic void zze(com.google.android.recaptcha.internal.zzes p0)
    {
        p0.zzg();
        return;
    }

    public static final synthetic void zzf(java.util.Timer p0)
    {
        com.google.android.recaptcha.internal.zzes.zza = 0;
        return;
    }

    private final void zzg()
    {
        a5.o v0_0 = this.zze;
        if (v0_0 != null) {
            java.util.ArrayList v6_1;
            a5.o v0_6 = v0_0.zzd();
            kotlin.jvm.internal.j.e(v0_6, "<this>");
            int v3 = 0;
            if (!(v0_6 instanceof java.util.RandomAccess)) {
                a5.o v0_5;
                v6_1 = new java.util.ArrayList();
                a5.o v0_3 = v0_6.iterator();
                kotlin.jvm.internal.j.e(v0_3, "iterator");
                if (v0_3.hasNext()) {
                    com.google.android.recaptcha.internal.zzei v1_3 = new i7.t(v0_3, 0);
                    v0_5 = new a8.g();
                    v0_5.d = q4.b.k(v0_5, v0_5, v1_3);
                } else {
                    v0_5 = i7.m.a;
                }
                while (v0_5.hasNext()) {
                    v6_1.add(((java.util.List) v0_5.next()));
                }
            } else {
                java.util.ArrayList v6_3;
                com.google.android.recaptcha.internal.zzei v1_8 = v0_6.size();
                if ((v1_8 % 20) != 0) {
                    v6_3 = 1;
                } else {
                    v6_3 = 0;
                }
                v6_1 = new java.util.ArrayList(((v1_8 / 20) + v6_3));
                int v5_0 = 0;
                while ((v5_0 >= 0) && (v5_0 < v1_8)) {
                    int v7_0 = (v1_8 - v5_0);
                    if (20 <= v7_0) {
                        v7_0 = 20;
                    }
                    int v8_2 = new java.util.ArrayList(v7_0);
                    com.google.android.recaptcha.internal.zzrr v9_3 = 0;
                    while (v9_3 < v7_0) {
                        v8_2.add(v0_6.get((v9_3 + v5_0)));
                        v9_3++;
                    }
                    v6_1.add(v8_2);
                    v5_0 += 20;
                }
            }
            a5.o v0_7 = v6_1.size();
            while (v3 < v0_7) {
                com.google.android.recaptcha.internal.zzei v1_10 = v6_1.get(v3);
                v3++;
                com.google.android.recaptcha.internal.zzei v1_11 = ((java.util.List) v1_10);
                int v5_3 = com.google.android.recaptcha.internal.zzrf.zzi();
                int v7_2 = new java.util.ArrayList();
                com.google.android.recaptcha.internal.zzei v1_13 = v1_11.iterator();
                while (v1_13.hasNext()) {
                    int v8_7 = ((com.google.android.recaptcha.internal.zzej) v1_13.next());
                    try {
                        com.google.android.recaptcha.internal.zzrr v9_6 = com.google.android.recaptcha.internal.zztx.zzk(com.google.android.recaptcha.internal.zzkh.zzg().zzj(v8_7.zzc()));
                        Object v10_3 = v9_6.zzN();
                        int v11 = (v10_3 - 1);
                    } catch (Exception) {
                        com.google.android.recaptcha.internal.zzrr v9_7 = this.zze;
                        if (v9_7 != null) {
                            v9_7.zzf(v8_7);
                        }
                    }
                    if (v10_3 == null) {
                        throw 0;
                    } else {
                        if (v11 == 0) {
                            v5_3.zzq(v9_6.zzf());
                        } else {
                            if (v11 == 1) {
                                v5_3.zzr(v9_6.zzg());
                            } else {
                                if (v11 != 2) {
                                    throw new a5.o();
                                }
                            }
                        }
                        v7_2.add(v8_7);
                    }
                }
                if (((v5_3.zzf() + v5_3.zze()) != 0) && (this.zzc.zza(((com.google.android.recaptcha.internal.zzrf) v5_3.zzi()).zzd()))) {
                    com.google.android.recaptcha.internal.zzei v1_19 = this.zze;
                    if (v1_19 != null) {
                        v1_19.zza(v7_2);
                    }
                }
            }
        }
        return;
    }

    private final void zzh()
    {
        if (com.google.android.recaptcha.internal.zzes.zza == null) {
            java.util.Timer v1_1 = new java.util.Timer();
            com.google.android.recaptcha.internal.zzes.zza = v1_1;
            v1_1.schedule(new com.google.android.recaptcha.internal.zzep(this), 120000, 120000);
        }
        return;
    }

    public final void zza(com.google.android.recaptcha.internal.zztx p3)
    {
        d8.f0.p(this.zzd, new com.google.android.recaptcha.internal.zzer(this, p3, 0));
        this.zzh();
        return;
    }
}
