package com.google.android.recaptcha.internal;
final class zzac extends n7.i implements u7.p {
    Object zza;
    int zzb;
    final synthetic com.google.android.recaptcha.internal.zzae zzc;
    final synthetic String zzd;

    public zzac(com.google.android.recaptcha.internal.zzae p1, String p2, l7.c p3)
    {
        this.zzc = p1;
        this.zzd = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        return new com.google.android.recaptcha.internal.zzac(this.zzc, this.zzd, p4);
    }

    public final bridge synthetic Object invoke(Object p1, Object p2)
    {
        return ((com.google.android.recaptcha.internal.zzac) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p7)
    {
        com.google.android.recaptcha.internal.zzae v1_4;
        com.google.android.recaptcha.internal.zzae v0_0 = m7.a.a;
        com.google.android.recaptcha.internal.zzae v1_0 = this.zzb;
        try {
            if (v1_0 == null) {
                c4.b.e0(p7);
                v1_4 = com.google.android.recaptcha.internal.zzz.zzb(this.zzc, this.zzd);
                com.google.android.recaptcha.internal.zznd v7_15 = this.zzc;
                int v3_0 = com.google.android.recaptcha.internal.zzae.zzg(v7_15);
                com.google.android.recaptcha.internal.zznd v7_6 = com.google.android.recaptcha.internal.zzae.zzh(v7_15);
                this.zza = v1_4;
                this.zzb = 1;
                p7 = v3_0.zzc(v7_6, this);
                if (p7 == v0_0) {
                    return v0_0;
                } else {
                    v1_4.zza();
                    int v2_6 = this.zzc;
                    int v3_8 = com.google.android.recaptcha.internal.zzti.zzf();
                    com.google.android.recaptcha.internal.zzba v4_1 = com.google.android.recaptcha.internal.zzth.zzf();
                    v4_1.zzw(((String) p7));
                    v3_8.zzf(((com.google.android.recaptcha.internal.zzth) v4_1.zzi()));
                    return com.google.android.recaptcha.internal.zzz.zza(v2_6, ((com.google.android.recaptcha.internal.zzti) v3_8.zzi()));
                }
            } else {
                if (v1_0 == 1) {
                    v1_4 = ((com.google.android.recaptcha.internal.zzen) this.zza);
                    c4.b.e0(p7);
                    v1_4.zza();
                    v2_6 = this.zzc;
                    v3_8 = com.google.android.recaptcha.internal.zzti.zzf();
                    v4_1 = com.google.android.recaptcha.internal.zzth.zzf();
                    v4_1.zzw(((String) p7));
                    v3_8.zzf(((com.google.android.recaptcha.internal.zzth) v4_1.zzi()));
                    return com.google.android.recaptcha.internal.zzz.zza(v2_6, ((com.google.android.recaptcha.internal.zzti) v3_8.zzi()));
                } else {
                    com.google.android.recaptcha.internal.zzae v0_2 = ((com.google.android.recaptcha.internal.zzy) this.zza);
                    c4.b.e0(p7);
                }
            }
        } catch (com.google.android.recaptcha.internal.zznd v7_7) {
            v1_4.zzb(new com.google.android.recaptcha.internal.zzbd(com.google.android.recaptcha.internal.zzbb.zzb, com.google.android.recaptcha.internal.zzba.zzaa, v7_7.getMessage()));
            com.google.android.recaptcha.internal.zzae v1_5 = this.zzc;
            this.zza = v1_5;
            int v2_4 = 2;
            this.zzb = 2;
            if (!(v7_7 instanceof com.google.android.play.core.integrity.StandardIntegrityException)) {
                v2_4 = 45;
            } else {
                com.google.android.recaptcha.internal.zznd v7_9 = ((com.google.android.play.core.integrity.StandardIntegrityException) v7_7).getErrorCode();
                if (v7_9 == -100) {
                    v2_4 = 44;
                } else {
                    if (v7_9 == -12) {
                        v2_4 = 39;
                    } else {
                        if (v7_9 == -3) {
                            v2_4 = 30;
                        } else {
                            if (v7_9 == -2) {
                                v2_4 = 29;
                            } else {
                                if (v7_9 == -1) {
                                    v2_4 = 28;
                                } else {
                                    switch (v7_9) {
                                        case -19:
                                            v2_4 = 54;
                                        case -18:
                                            v2_4 = 53;
                                            break;
                                        case -17:
                                            v2_4 = 52;
                                            break;
                                        case -16:
                                            v2_4 = 43;
                                            break;
                                        case -15:
                                            v2_4 = 42;
                                            break;
                                        case -14:
                                            v2_4 = 41;
                                            break;
                                        default:
                                            switch (v7_9) {
                                                case -9:
                                                    v2_4 = 36;
                                                    break;
                                                case -8:
                                                    v2_4 = 35;
                                                    break;
                                                case -7:
                                                    v2_4 = 34;
                                                    break;
                                                case -6:
                                                    v2_4 = 33;
                                                    break;
                                                case -5:
                                                    v2_4 = 32;
                                                    break;
                                                default:
                                            }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            com.google.android.recaptcha.internal.zznd v7_11 = com.google.android.recaptcha.internal.zzte.zzf();
            v7_11.zzq(v2_4);
            v7_11.zzr(15);
            p7 = v7_11.zzi();
            if (p7 == v0_0) {
                return v0_0;
            } else {
                v0_2 = v1_5;
            }
        }
        int v2_0 = v0_2.zza();
        com.google.android.recaptcha.internal.zznd v7_3 = ((com.google.android.recaptcha.internal.zztd) ((com.google.android.recaptcha.internal.zzte) p7).zzr());
        v7_3.zzf(v0_2.zza());
        return new com.google.android.recaptcha.internal.zzw(v2_0, ((com.google.android.recaptcha.internal.zzte) v7_3.zzi()));
    }
}
