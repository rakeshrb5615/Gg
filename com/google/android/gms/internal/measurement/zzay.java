package com.google.android.gms.internal.measurement;
public final class zzay extends com.google.android.gms.internal.measurement.zzav {

    public zzay()
    {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzc);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzl);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzm);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzn);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzt);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzp);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzu);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzz);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzP);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzac);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzaf);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzai);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzaj);
        return;
    }

    private static com.google.android.gms.internal.measurement.zzao zzc(com.google.android.gms.internal.measurement.zzg p5, java.util.List p6)
    {
        com.google.android.gms.internal.measurement.zzh.zzb(com.google.android.gms.internal.measurement.zzbk.zzz.name(), 2, p6);
        String v0_1 = p5.zza(((com.google.android.gms.internal.measurement.zzao) p6.get(0)));
        java.util.List v2_3 = p5.zza(((com.google.android.gms.internal.measurement.zzao) p6.get(1)));
        if (!(v2_3 instanceof com.google.android.gms.internal.measurement.zzae)) {
            throw new IllegalArgumentException(g2.g.l("FN requires an ArrayValue of parameter names found ", v2_3.getClass().getCanonicalName()));
        } else {
            java.util.List v2_5 = ((com.google.android.gms.internal.measurement.zzae) v2_3).zzb();
            java.util.List v3_2 = new java.util.ArrayList();
            if (p6.size() > 2) {
                v3_2 = p6.subList(2, p6.size());
            }
            return new com.google.android.gms.internal.measurement.zzan(v0_1.zzc(), v2_5, v3_2, p5);
        }
    }

    public final com.google.android.gms.internal.measurement.zzao zza(String p8, com.google.android.gms.internal.measurement.zzg p9, java.util.List p10)
    {
        com.google.android.gms.internal.measurement.zzae v0_10 = com.google.android.gms.internal.measurement.zzh.zze(p8).ordinal();
        if (v0_10 == 2) {
            com.google.android.gms.internal.measurement.zzao v8_17 = p9.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzc, 3, p10, 0)));
            com.google.android.gms.internal.measurement.zzae v0_9 = p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(1))).zzc();
            String v10_12 = p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(2)));
            if (!(v10_12 instanceof com.google.android.gms.internal.measurement.zzae)) {
                throw new IllegalArgumentException(g2.g.l("Function arguments for Apply are not a list found ", v10_12.getClass().getCanonicalName()));
            } else {
                if (v0_9.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                } else {
                    return v8_17.zzcA(v0_9, p9, ((com.google.android.gms.internal.measurement.zzae) v10_12).zzb());
                }
            }
        } else {
            if (v0_10 == 15) {
                com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.zzm.name(), 0, p10);
                return com.google.android.gms.internal.measurement.zzao.zzh;
            } else {
                if (v0_10 == 25) {
                    return com.google.android.gms.internal.measurement.zzay.zzc(p9, p10);
                } else {
                    if (v0_10 == 41) {
                        String v10_17;
                        com.google.android.gms.internal.measurement.zzh.zzb(com.google.android.gms.internal.measurement.zzbk.zzP.name(), 2, p10);
                        com.google.android.gms.internal.measurement.zzao v8_76 = p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(0)));
                        com.google.android.gms.internal.measurement.zzae v0_13 = p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(1)));
                        if (p10.size() <= 2) {
                            v10_17 = 0;
                        } else {
                            v10_17 = p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(2)));
                        }
                        com.google.android.gms.internal.measurement.zzao v8_2;
                        int v1_8 = com.google.android.gms.internal.measurement.zzao.zzf;
                        if (!v8_76.zze().booleanValue()) {
                            if (v10_17 == null) {
                                v8_2 = v1_8;
                            } else {
                                v8_2 = p9.zzb(((com.google.android.gms.internal.measurement.zzae) v10_17));
                            }
                        } else {
                            v8_2 = p9.zzb(((com.google.android.gms.internal.measurement.zzae) v0_13));
                        }
                        if (1 == (v8_2 instanceof com.google.android.gms.internal.measurement.zzag)) {
                            return v8_2;
                        } else {
                            return v1_8;
                        }
                    } else {
                        if (v0_10 == 54) {
                            return new com.google.android.gms.internal.measurement.zzae(p10);
                        } else {
                            if (v0_10 == 57) {
                                if (!p10.isEmpty()) {
                                    return new com.google.android.gms.internal.measurement.zzag("return", p9.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzaf, 1, p10, 0))));
                                } else {
                                    return com.google.android.gms.internal.measurement.zzao.zzj;
                                }
                            } else {
                                if (v0_10 != 19) {
                                    if (v0_10 == 20) {
                                        com.google.android.gms.internal.measurement.zzh.zzb(com.google.android.gms.internal.measurement.zzbk.zzu.name(), 2, p10);
                                        com.google.android.gms.internal.measurement.zzao v8_16 = ((com.google.android.gms.internal.measurement.zzan) com.google.android.gms.internal.measurement.zzay.zzc(p9, p10));
                                        if (v8_16.zzg() != null) {
                                            p9.zze(v8_16.zzg(), v8_16);
                                            return v8_16;
                                        } else {
                                            p9.zze("", v8_16);
                                            return v8_16;
                                        }
                                    } else {
                                        if (v0_10 == 60) {
                                            com.google.android.gms.internal.measurement.zzao v8_21 = p9.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzai, 3, p10, 0)));
                                            com.google.android.gms.internal.measurement.zzae v0_3 = p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(1)));
                                            String v10_6 = p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(2)));
                                            if (!(v0_3 instanceof com.google.android.gms.internal.measurement.zzae)) {
                                                throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                                            } else {
                                                if (!(v10_6 instanceof com.google.android.gms.internal.measurement.zzae)) {
                                                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                                                } else {
                                                    com.google.android.gms.internal.measurement.zzae v0_6 = ((com.google.android.gms.internal.measurement.zzae) v0_3);
                                                    String v10_7 = ((com.google.android.gms.internal.measurement.zzae) v10_6);
                                                    int v1_2 = 0;
                                                    int v4_0 = 0;
                                                    while (v1_2 < v0_6.zzh()) {
                                                        if ((v4_0 == 0) && (!v8_21.equals(p9.zza(v0_6.zzl(v1_2))))) {
                                                            v4_0 = 0;
                                                        } else {
                                                            int v4_5 = p9.zza(v10_7.zzl(v1_2));
                                                            if (!(v4_5 instanceof com.google.android.gms.internal.measurement.zzag)) {
                                                                v4_0 = 1;
                                                            } else {
                                                                if (!((com.google.android.gms.internal.measurement.zzag) v4_5).zzg().equals("break")) {
                                                                    return v4_5;
                                                                } else {
                                                                    return com.google.android.gms.internal.measurement.zzao.zzf;
                                                                }
                                                            }
                                                        }
                                                        v1_2++;
                                                    }
                                                    if ((v0_6.zzh() + 1) == v10_7.zzh()) {
                                                        com.google.android.gms.internal.measurement.zzao v8_30 = p9.zza(v10_7.zzl(v0_6.zzh()));
                                                        if ((v8_30 instanceof com.google.android.gms.internal.measurement.zzag)) {
                                                            boolean v9_9 = ((com.google.android.gms.internal.measurement.zzag) v8_30).zzg();
                                                            if ((v9_9.equals("return")) || (v9_9.equals("continue"))) {
                                                                return v8_30;
                                                            }
                                                        }
                                                    }
                                                    return com.google.android.gms.internal.measurement.zzao.zzf;
                                                }
                                            }
                                        } else {
                                            if (v0_10 == 61) {
                                                if (!p9.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzaj, 3, p10, 0))).zze().booleanValue()) {
                                                    return p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(2)));
                                                } else {
                                                    return p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(1)));
                                                }
                                            } else {
                                                switch (v0_10) {
                                                    case 11:
                                                        return p9.zzc().zzb(new com.google.android.gms.internal.measurement.zzae(p10));
                                                    case 12:
                                                        com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.zzm.name(), 0, p10);
                                                        return com.google.android.gms.internal.measurement.zzao.zzi;
                                                    case 13:
                                                        break;
                                                    default:
                                                        return this.zzb(p8);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!p10.isEmpty()) {
                                    com.google.android.gms.internal.measurement.zzao v8_52 = p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(0)));
                                    if (!(v8_52 instanceof com.google.android.gms.internal.measurement.zzae)) {
                                        return com.google.android.gms.internal.measurement.zzao.zzf;
                                    } else {
                                        return p9.zzb(((com.google.android.gms.internal.measurement.zzae) v8_52));
                                    }
                                } else {
                                    return com.google.android.gms.internal.measurement.zzao.zzf;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
