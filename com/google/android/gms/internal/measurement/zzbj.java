package com.google.android.gms.internal.measurement;
public final class zzbj extends com.google.android.gms.internal.measurement.zzav {

    public zzbj()
    {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzd);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzo);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzr);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzs);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzy);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzH);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzJ);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzK);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzX);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzag);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzak);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzal);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzam);
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(String p7, com.google.android.gms.internal.measurement.zzg p8, java.util.List p9)
    {
        String v0_24 = com.google.android.gms.internal.measurement.zzh.zze(p7).ordinal();
        int v2_0 = 0;
        if (v0_24 == 3) {
            String v7_20 = p8.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzd, 2, p9, 0)));
            if (!(v7_20 instanceof com.google.android.gms.internal.measurement.zzas)) {
                throw new IllegalArgumentException(g2.g.l("Expected string for assign var. got ", v7_20.getClass().getCanonicalName()));
            } else {
                if (!p8.zzd(v7_20.zzc())) {
                    throw new IllegalArgumentException(g2.g.l("Attempting to assign undefined value ", v7_20.zzc()));
                } else {
                    String v9_42 = p8.zza(((com.google.android.gms.internal.measurement.zzao) p9.get(1)));
                    p8.zze(v7_20.zzc(), v9_42);
                    return v9_42;
                }
            }
        } else {
            if (v0_24 == 14) {
                com.google.android.gms.internal.measurement.zzh.zzb(com.google.android.gms.internal.measurement.zzbk.zzo.name(), 2, p9);
                if ((p9.size() % 2) != 0) {
                    throw new IllegalArgumentException(g2.g.c(p9.size(), "CONST requires an even number of arguments, found "));
                }
                while (v2_0 < (p9.size() - 1)) {
                    String v7_99 = p8.zza(((com.google.android.gms.internal.measurement.zzao) p9.get(v2_0)));
                    if (!(v7_99 instanceof com.google.android.gms.internal.measurement.zzas)) {
                        throw new IllegalArgumentException(g2.g.l("Expected string for const name. got ", v7_99.getClass().getCanonicalName()));
                    } else {
                        p8.zzg(v7_99.zzc(), p8.zza(((com.google.android.gms.internal.measurement.zzao) p9.get((v2_0 + 1)))));
                        v2_0 += 2;
                    }
                }
                return com.google.android.gms.internal.measurement.zzao.zzf;
            } else {
                if (v0_24 == 24) {
                    com.google.android.gms.internal.measurement.zzh.zzb(com.google.android.gms.internal.measurement.zzbk.zzy.name(), 1, p9);
                    String v7_4 = com.google.android.gms.internal.measurement.zzao.zzf;
                    while (v2_0 < p9.size()) {
                        v7_4 = p8.zza(((com.google.android.gms.internal.measurement.zzao) p9.get(v2_0)));
                        if ((v7_4 instanceof com.google.android.gms.internal.measurement.zzag)) {
                            throw new IllegalStateException("ControlValue cannot be in an expression list");
                        } else {
                            v2_0++;
                        }
                    }
                    return v7_4;
                } else {
                    if (v0_24 == 33) {
                        String v7_14 = p8.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzH, 1, p9, 0)));
                        if (!(v7_14 instanceof com.google.android.gms.internal.measurement.zzas)) {
                            throw new IllegalArgumentException(g2.g.l("Expected string for get var. got ", v7_14.getClass().getCanonicalName()));
                        } else {
                            return p8.zzh(v7_14.zzc());
                        }
                    } else {
                        if (v0_24 == 49) {
                            com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.zzX.name(), 0, p9);
                            return com.google.android.gms.internal.measurement.zzao.zzg;
                        } else {
                            if (v0_24 == 58) {
                                String v7_27 = p8.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzag, 3, p9, 0)));
                                String v0_5 = p8.zza(((com.google.android.gms.internal.measurement.zzao) p9.get(1)));
                                IllegalArgumentException v8_4 = p8.zza(((com.google.android.gms.internal.measurement.zzao) p9.get(2)));
                                if ((v7_27 == com.google.android.gms.internal.measurement.zzao.zzf) || (v7_27 == com.google.android.gms.internal.measurement.zzao.zzg)) {
                                    throw new IllegalStateException(g2.g.f("Can\'t set property ", v0_5.zzc(), " of ", v7_27.zzc()));
                                } else {
                                    if ((!(v7_27 instanceof com.google.android.gms.internal.measurement.zzae)) || (!(v0_5 instanceof com.google.android.gms.internal.measurement.zzah))) {
                                        if ((v7_27 instanceof com.google.android.gms.internal.measurement.zzak)) {
                                            ((com.google.android.gms.internal.measurement.zzak) v7_27).zzm(v0_5.zzc(), v8_4);
                                            return v8_4;
                                        } else {
                                            return v8_4;
                                        }
                                    } else {
                                        ((com.google.android.gms.internal.measurement.zzae) v7_27).zzn(v0_5.zzd().intValue(), v8_4);
                                        return v8_4;
                                    }
                                }
                            } else {
                                if (v0_24 == 17) {
                                    if (!p9.isEmpty()) {
                                        String v7_35 = new com.google.android.gms.internal.measurement.zzae();
                                        String v9_14 = p9.iterator();
                                        while (v9_14.hasNext()) {
                                            String v0_11 = p8.zza(((com.google.android.gms.internal.measurement.zzao) v9_14.next()));
                                            if ((v0_11 instanceof com.google.android.gms.internal.measurement.zzag)) {
                                                throw new IllegalStateException("Failed to evaluate array element");
                                            } else {
                                                com.google.android.gms.internal.measurement.zzao v1_2 = (v2_0 + 1);
                                                v7_35.zzn(v2_0, v0_11);
                                                v2_0 = v1_2;
                                            }
                                        }
                                        return v7_35;
                                    } else {
                                        return new com.google.android.gms.internal.measurement.zzae();
                                    }
                                } else {
                                    if (v0_24 == 18) {
                                        if (!p9.isEmpty()) {
                                            if ((p9.size() % 2) != 0) {
                                                throw new IllegalArgumentException(g2.g.c(p9.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                                            } else {
                                                String v7_48 = new com.google.android.gms.internal.measurement.zzal();
                                                while (v2_0 < (p9.size() - 1)) {
                                                    String v0_16 = p8.zza(((com.google.android.gms.internal.measurement.zzao) p9.get(v2_0)));
                                                    com.google.android.gms.internal.measurement.zzao v1_6 = p8.zza(((com.google.android.gms.internal.measurement.zzao) p9.get((v2_0 + 1))));
                                                    if (((v0_16 instanceof com.google.android.gms.internal.measurement.zzag)) || ((v1_6 instanceof com.google.android.gms.internal.measurement.zzag))) {
                                                        throw new IllegalStateException("Failed to evaluate map entry");
                                                    } else {
                                                        v7_48.zzm(v0_16.zzc(), v1_6);
                                                        v2_0 += 2;
                                                    }
                                                }
                                                return v7_48;
                                            }
                                        } else {
                                            return new com.google.android.gms.internal.measurement.zzal();
                                        }
                                    } else {
                                        if ((v0_24 == 35) || (v0_24 == 36)) {
                                            String v7_56 = p8.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzK, 2, p9, 0)));
                                            IllegalArgumentException v8_13 = p8.zza(((com.google.android.gms.internal.measurement.zzao) p9.get(1)));
                                            if ((!(v7_56 instanceof com.google.android.gms.internal.measurement.zzae)) || (!com.google.android.gms.internal.measurement.zzh.zzd(v8_13))) {
                                                if (!(v7_56 instanceof com.google.android.gms.internal.measurement.zzak)) {
                                                    if ((v7_56 instanceof com.google.android.gms.internal.measurement.zzas)) {
                                                        if (!"length".equals(v8_13.zzc())) {
                                                            if ((com.google.android.gms.internal.measurement.zzh.zzd(v8_13)) && (v8_13.zzd().doubleValue() < ((double) v7_56.zzc().length()))) {
                                                                return new com.google.android.gms.internal.measurement.zzas(String.valueOf(v7_56.zzc().charAt(v8_13.zzd().intValue())));
                                                            }
                                                        } else {
                                                            return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) v7_56.zzc().length())));
                                                        }
                                                    }
                                                    return com.google.android.gms.internal.measurement.zzao.zzf;
                                                } else {
                                                    return ((com.google.android.gms.internal.measurement.zzak) v7_56).zzk(v8_13.zzc());
                                                }
                                            } else {
                                                return ((com.google.android.gms.internal.measurement.zzae) v7_56).zzl(v8_13.zzd().intValue());
                                            }
                                        } else {
                                            switch (v0_24) {
                                                case 62:
                                                    String v7_85;
                                                    String v7_82 = p8.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzak, 1, p9, 0)));
                                                    if (!(v7_82 instanceof com.google.android.gms.internal.measurement.zzat)) {
                                                        if (!(v7_82 instanceof com.google.android.gms.internal.measurement.zzaf)) {
                                                            if (!(v7_82 instanceof com.google.android.gms.internal.measurement.zzah)) {
                                                                if (!(v7_82 instanceof com.google.android.gms.internal.measurement.zzas)) {
                                                                    if (!(v7_82 instanceof com.google.android.gms.internal.measurement.zzan)) {
                                                                        if (((v7_82 instanceof com.google.android.gms.internal.measurement.zzap)) || ((v7_82 instanceof com.google.android.gms.internal.measurement.zzag))) {
                                                                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[] {v7_82})));
                                                                        } else {
                                                                            v7_85 = "object";
                                                                        }
                                                                    } else {
                                                                        v7_85 = "function";
                                                                    }
                                                                } else {
                                                                    v7_85 = "string";
                                                                }
                                                            } else {
                                                                v7_85 = "number";
                                                            }
                                                        } else {
                                                            v7_85 = "boolean";
                                                        }
                                                    } else {
                                                        v7_85 = "undefined";
                                                    }
                                                    return new com.google.android.gms.internal.measurement.zzas(v7_85);
                                                case 63:
                                                    com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.zzal.name(), 0, p9);
                                                    return com.google.android.gms.internal.measurement.zzao.zzf;
                                                case 64:
                                                    com.google.android.gms.internal.measurement.zzh.zzb(com.google.android.gms.internal.measurement.zzbk.zzam.name(), 1, p9);
                                                    String v7_71 = p9.iterator();
                                                    while (v7_71.hasNext()) {
                                                        String v9_36 = p8.zza(((com.google.android.gms.internal.measurement.zzao) v7_71.next()));
                                                        if (!(v9_36 instanceof com.google.android.gms.internal.measurement.zzas)) {
                                                            throw new IllegalArgumentException(g2.g.l("Expected string for var name. got ", v9_36.getClass().getCanonicalName()));
                                                        } else {
                                                            p8.zzf(v9_36.zzc(), com.google.android.gms.internal.measurement.zzao.zzf);
                                                        }
                                                    }
                                                    return com.google.android.gms.internal.measurement.zzao.zzf;
                                                default:
                                                    return this.zzb(p7);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
