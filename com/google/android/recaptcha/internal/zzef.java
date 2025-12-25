package com.google.android.recaptcha.internal;
public final class zzef implements com.google.android.recaptcha.internal.zzcn {
    private final com.google.android.recaptcha.internal.zzdt zza;
    private com.google.android.recaptcha.internal.zzcm zzb;
    private com.google.android.recaptcha.internal.zzsc zzc;

    public zzef(com.google.android.recaptcha.internal.zzdt p1)
    {
        this.zza = p1;
        this.zzb = com.google.android.recaptcha.internal.zzcm.zzd();
        return;
    }

    public final Object zza(String p17, com.google.android.recaptcha.RecaptchaAction p18, long p19, l7.c p21)
    {
        com.google.android.recaptcha.internal.zzef v3_2;
        if (!(p21 instanceof com.google.android.recaptcha.internal.zzed)) {
            v3_2 = new com.google.android.recaptcha.internal.zzed(this, p21);
        } else {
            v3_2 = ((com.google.android.recaptcha.internal.zzed) p21);
            com.google.android.recaptcha.internal.zzdt v4_7 = ((com.google.android.recaptcha.internal.zzed) p21).zzd;
            if ((v4_7 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzed) p21).zzd = (v4_7 - -2147483648);
            }
        }
        com.google.android.recaptcha.internal.zzef v10_3;
        String v0_8;
        String v0_6;
        long v11_0;
        String v6_1;
        com.google.android.recaptcha.internal.zzef v3_7;
        com.google.android.recaptcha.internal.zzed v9 = v3_2;
        Object v2_2 = v9.zzb;
        com.google.android.recaptcha.internal.zzef v3_3 = m7.a.a;
        com.google.android.recaptcha.internal.zzdt v4_2 = v9.zzd;
        try {
            if (v4_2 == null) {
                c4.b.e0(v2_2);
                if (!kotlin.jvm.internal.j.a(this.zzb, com.google.android.recaptcha.internal.zzcm.zzb())) {
                    throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzar, 0);
                } else {
                    Object v2_7 = this.zza;
                    long v12_1 = (4601778099247172813 * ((double) p19));
                    v9.zze = this;
                    v9.zzf = p17;
                    v9.zzg = p18;
                    com.google.android.recaptcha.internal.zzef v10_2 = (((double) p19) * 4603129179135383962);
                    v9.zza = v10_2;
                    v9.zzd = 1;
                    v2_2 = v2_7.zzl(p17, ((long) v12_1), v9);
                    if (v2_2 == v3_3) {
                        return v3_3;
                    } else {
                        v6_1 = p17;
                        v0_6 = p18;
                        v11_0 = v10_2;
                        v10_3 = this;
                        int v8 = v10_3.zzc;
                        if (v8 == 0) {
                            v8 = 0;
                        }
                        String v0_7 = v10_3.zza.zzi(v0_6, ((com.google.android.recaptcha.internal.zzsi) v2_2), v8);
                        com.google.android.recaptcha.internal.zzdt v4_8 = v10_3.zza;
                        long v11_1 = ((long) v11_0);
                        v9.zze = v10_3;
                        v9.zzf = v6_1;
                        v9.zzg = 0;
                        v9.zzd = 2;
                        v2_2 = v4_8.zzm(v0_7, v6_1, v11_1, v9);
                        if (v2_2 == v3_3) {
                            return v3_3;
                        } else {
                            v0_8 = v6_1;
                            v3_7 = v10_3;
                        }
                    }
                }
            } else {
                if (v4_2 == 1) {
                    com.google.android.recaptcha.internal.zzef v10_4 = v9.zza;
                    v0_6 = v9.zzg;
                    com.google.android.recaptcha.internal.zzdt v4_5 = v9.zzf;
                    String v6_2 = v9.zze;
                    c4.b.e0(v2_2);
                    v11_0 = v10_4;
                    v10_3 = v6_2;
                    v6_1 = v4_5;
                } else {
                    if (v4_2 != 2) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v0_8 = v9.zzf;
                        v3_7 = v9.zze;
                        c4.b.e0(v2_2);
                    }
                }
            }
        } catch (String v0_3) {
            throw v0_3;
        } catch (String v0_1) {
            throw new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzaz, v0_1.getMessage());
        }
        Object v2_10 = ((com.google.android.recaptcha.internal.zzsr) v2_2);
        v3_7.zza.zzq(v0_8, v2_10);
        return v2_10.zzj();
    }

    public final Object zzb(long p12, l7.c p14)
    {
        com.google.android.recaptcha.internal.zzee v0_2;
        if (!(p14 instanceof com.google.android.recaptcha.internal.zzee)) {
            v0_2 = new com.google.android.recaptcha.internal.zzee(this, p14);
        } else {
            v0_2 = ((com.google.android.recaptcha.internal.zzee) p14);
            m7.a v1_2 = ((com.google.android.recaptcha.internal.zzee) p14).zzd;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.google.android.recaptcha.internal.zzee) p14).zzd = (v1_2 - -2147483648);
            }
        }
        com.google.android.recaptcha.internal.zzef v13_1;
        com.google.android.recaptcha.internal.zzci v2_4;
        com.google.android.recaptcha.internal.zzef v12_4;
        com.google.android.recaptcha.internal.zzci v14_1 = v0_2.zzb;
        m7.a v1_1 = m7.a.a;
        com.google.android.recaptcha.internal.zzci v2_0 = v0_2.zzd;
        h7.l v3_0 = h7.l.a;
        try {
            if (v2_0 == null) {
                c4.b.e0(v14_1);
                if ((!kotlin.jvm.internal.j.a(this.zzb, com.google.android.recaptcha.internal.zzcm.zzb())) && (!kotlin.jvm.internal.j.a(this.zzb, com.google.android.recaptcha.internal.zzcm.zza()))) {
                    this.zzb = com.google.android.recaptcha.internal.zzcm.zzc();
                    try {
                        com.google.android.recaptcha.internal.zzci v14_7 = this.zza;
                        double v6_1 = (4603579539098121011 * ((double) p12));
                        v0_2.zze = this;
                        com.google.android.recaptcha.internal.zzef v12_2 = (((double) p12) * 4600877379321698714);
                        v0_2.zza = v12_2;
                        v0_2.zzd = 1;
                        com.google.android.recaptcha.internal.zzci v14_8 = v14_7.zzo(((long) v6_1), v0_2);
                    } catch (com.google.android.recaptcha.internal.zzef v12_3) {
                        com.google.android.recaptcha.internal.zzef v13_0 = v12_3;
                        v12_4 = this;
                        v12_4.zzb = com.google.android.recaptcha.internal.zzcm.zza();
                        throw v13_0;
                    }
                    if (v14_8 == v1_1) {
                        return v1_1;
                    } else {
                        v2_4 = v14_8;
                        v13_1 = v12_2;
                        v12_4 = this;
                        com.google.android.recaptcha.internal.zzci v2_6 = ((com.google.android.recaptcha.internal.zzsc) v2_4);
                        v12_4.zzc = v2_6;
                        long v5_2 = v12_4.zza;
                        com.google.android.recaptcha.internal.zzef v13_2 = ((long) v13_1);
                        v0_2.zze = v12_4;
                        v0_2.zzd = 2;
                        if (v5_2.zzn(v2_6, v13_2, v0_2) == v1_1) {
                            return v1_1;
                        }
                    }
                } else {
                    return v3_0;
                }
            } else {
                if (v2_0 == 1) {
                    com.google.android.recaptcha.internal.zzef v12_5 = v0_2.zza;
                    com.google.android.recaptcha.internal.zzci v2_5 = v0_2.zze;
                    try {
                        c4.b.e0(v14_1);
                        v2_4 = v14_1;
                        v13_1 = v12_5;
                        v12_4 = v2_5;
                    } catch (com.google.android.recaptcha.internal.zzef v13_0) {
                        v12_4 = v2_4;
                    }
                } else {
                    if (v2_0 != 2) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v12_4 = v0_2.zze;
                        c4.b.e0(v14_1);
                    }
                }
            }
        } catch (com.google.android.recaptcha.internal.zzef v13_0) {
        }
        v12_4.zzb = com.google.android.recaptcha.internal.zzcm.zzb();
        return v3_0;
    }
}
