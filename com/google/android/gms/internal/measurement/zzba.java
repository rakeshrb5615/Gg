package com.google.android.gms.internal.measurement;
public final class zzba {

    public static com.google.android.gms.internal.measurement.zzao zza(String p10, com.google.android.gms.internal.measurement.zzae p11, com.google.android.gms.internal.measurement.zzg p12, java.util.List p13)
    {
        int v0_8 = Double.valueOf(-4616189618054758400);
        int v2_10 = ",";
        com.google.android.gms.internal.measurement.zzao v4_0 = 0;
        com.google.android.gms.internal.measurement.zzai v6_1 = 0;
        int v7 = 2;
        int v9 = 0;
        switch (p10.hashCode()) {
            case -1776922004:
                if (!p10.equals("toString")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("toString", 0, p13);
                    return new com.google.android.gms.internal.measurement.zzas(p11.zzs(","));
                }
            case -1354795244:
                if (!p10.equals("concat")) {
                } else {
                    Double v10_140 = ((com.google.android.gms.internal.measurement.zzae) p11.zzt());
                    if (!p13.isEmpty()) {
                        String v11_16 = p13.iterator();
                        while (v11_16.hasNext()) {
                            com.google.android.gms.internal.measurement.zzao v13_53 = p12.zza(((com.google.android.gms.internal.measurement.zzao) v11_16.next()));
                            if ((v13_53 instanceof com.google.android.gms.internal.measurement.zzag)) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            } else {
                                int v0_58 = v10_140.zzh();
                                if (!(v13_53 instanceof com.google.android.gms.internal.measurement.zzae)) {
                                    v10_140.zzn(v0_58, v13_53);
                                } else {
                                    com.google.android.gms.internal.measurement.zzao v13_54 = ((com.google.android.gms.internal.measurement.zzae) v13_53);
                                    com.google.android.gms.internal.measurement.zzao v1_31 = v13_54.zzg();
                                    while (v1_31.hasNext()) {
                                        int v2_26 = ((Integer) v1_31.next());
                                        v10_140.zzn((v2_26.intValue() + v0_58), v13_54.zzl(v2_26.intValue()));
                                    }
                                }
                            }
                        }
                    }
                    return v10_140;
                }
            case -1274492040:
                if (!p10.equals("filter")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("filter", 1, p13);
                    Double v10_129 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(0)));
                    if (!(v10_129 instanceof com.google.android.gms.internal.measurement.zzan)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    } else {
                        if (p11.zzi() != 0) {
                            com.google.android.gms.internal.measurement.zzao v13_49 = ((com.google.android.gms.internal.measurement.zzae) p11.zzt());
                            Double v10_133 = com.google.android.gms.internal.measurement.zzba.zzc(p11, p12, ((com.google.android.gms.internal.measurement.zzan) v10_129), 0, Boolean.TRUE);
                            String v11_13 = new com.google.android.gms.internal.measurement.zzae();
                            Double v10_134 = v10_133.zzg();
                            while (v10_134.hasNext()) {
                                v11_13.zzn(v11_13.zzh(), v13_49.zzl(((Integer) v10_134.next()).intValue()));
                            }
                            return v11_13;
                        } else {
                            return new com.google.android.gms.internal.measurement.zzae();
                        }
                    }
                }
            case -934873754:
                if (!p10.equals("reduce")) {
                } else {
                    return com.google.android.gms.internal.measurement.zzba.zzb(p11, p12, p13, 1);
                }
            case -895859076:
                if (!p10.equals("splice")) {
                } else {
                    if (!p13.isEmpty()) {
                        Double v10_119 = ((int) com.google.android.gms.internal.measurement.zzh.zzi(p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(0))).zzd().doubleValue()));
                        if (v10_119 >= null) {
                            if (v10_119 > p11.zzh()) {
                                v10_119 = p11.zzh();
                            }
                        } else {
                            v10_119 = Math.max(0, (p11.zzh() + v10_119));
                        }
                        int v0_46 = p11.zzh();
                        com.google.android.gms.internal.measurement.zzao v1_28 = new com.google.android.gms.internal.measurement.zzae();
                        if (p13.size() <= 1) {
                            while (v10_119 < v0_46) {
                                v1_28.zzn(v1_28.zzh(), p11.zzl(v10_119));
                                p11.zzn(v10_119, 0);
                                v10_119++;
                            }
                        } else {
                            int v2_20 = Math.max(0, ((int) com.google.android.gms.internal.measurement.zzh.zzi(p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(1))).zzd().doubleValue())));
                            if (v2_20 > 0) {
                                int v3_1 = v10_119;
                                while (v3_1 < Math.min(v0_46, (v10_119 + v2_20))) {
                                    v1_28.zzn(v1_28.zzh(), p11.zzl(v10_119));
                                    p11.zzr(v10_119);
                                    v3_1++;
                                }
                            }
                            if (p13.size() <= 2) {
                                return v1_28;
                            }
                            while (v7 < p13.size()) {
                                int v0_51 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(v7)));
                                if ((v0_51 instanceof com.google.android.gms.internal.measurement.zzag)) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                } else {
                                    p11.zzq(((v10_119 + v7) - 2), v0_51);
                                    v7++;
                                }
                            }
                        }
                        return v1_28;
                    } else {
                        return new com.google.android.gms.internal.measurement.zzae();
                    }
                }
            case -678635926:
                if (!p10.equals("forEach")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("forEach", 1, p13);
                    Double v10_106 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(0)));
                    if (!(v10_106 instanceof com.google.android.gms.internal.measurement.zzan)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    } else {
                        if (p11.zzi() != 0) {
                            com.google.android.gms.internal.measurement.zzba.zzc(p11, p12, ((com.google.android.gms.internal.measurement.zzan) v10_106), 0, 0);
                            return com.google.android.gms.internal.measurement.zzao.zzf;
                        } else {
                            return com.google.android.gms.internal.measurement.zzao.zzf;
                        }
                    }
                }
            case -467511597:
                if (!p10.equals("lastIndexOf")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zzc("lastIndexOf", 2, p13);
                    Double v10_93 = com.google.android.gms.internal.measurement.zzao.zzf;
                    if (!p13.isEmpty()) {
                        v10_93 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(0)));
                    }
                    com.google.android.gms.internal.measurement.zzah v12_18;
                    com.google.android.gms.internal.measurement.zzao v1_19 = (p11.zzh() - 1);
                    if (p13.size() <= 1) {
                        v12_18 = ((double) v1_19);
                    } else {
                        com.google.android.gms.internal.measurement.zzah v12_19 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(1)));
                        if (!Double.isNaN(v12_19.zzd().doubleValue())) {
                            v12_18 = com.google.android.gms.internal.measurement.zzh.zzi(v12_19.zzd().doubleValue());
                        } else {
                            v12_18 = ((double) (p11.zzh() - 1));
                        }
                        if (v12_18 < 0) {
                            v12_18 += ((double) p11.zzh());
                        }
                    }
                    if (v12_18 >= 0) {
                        com.google.android.gms.internal.measurement.zzah v12_26 = ((int) Math.min(((double) p11.zzh()), v12_18));
                        while (v12_26 >= null) {
                            if ((!p11.zzo(v12_26)) || (!com.google.android.gms.internal.measurement.zzh.zzf(p11.zzl(v12_26), v10_93))) {
                                v12_26--;
                            } else {
                                return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) v12_26)));
                            }
                        }
                        return new com.google.android.gms.internal.measurement.zzah(v0_8);
                    } else {
                        return new com.google.android.gms.internal.measurement.zzah(v0_8);
                    }
                }
            case -277637751:
                if (!p10.equals("unshift")) {
                } else {
                    if (!p13.isEmpty()) {
                        Double v10_87 = new com.google.android.gms.internal.measurement.zzae();
                        com.google.android.gms.internal.measurement.zzao v13_23 = p13.iterator();
                        while (v13_23.hasNext()) {
                            int v0_38 = p12.zza(((com.google.android.gms.internal.measurement.zzao) v13_23.next()));
                            if ((v0_38 instanceof com.google.android.gms.internal.measurement.zzag)) {
                                throw new IllegalStateException("Argument evaluation failed");
                            } else {
                                v10_87.zzn(v10_87.zzh(), v0_38);
                            }
                        }
                        com.google.android.gms.internal.measurement.zzah v12_16 = v10_87.zzh();
                        com.google.android.gms.internal.measurement.zzao v13_24 = p11.zzg();
                        while (v13_24.hasNext()) {
                            int v0_33 = ((Integer) v13_24.next());
                            v10_87.zzn((v0_33.intValue() + v12_16), p11.zzl(v0_33.intValue()));
                        }
                        p11.zzp();
                        com.google.android.gms.internal.measurement.zzah v12_17 = v10_87.zzg();
                        while (v12_17.hasNext()) {
                            com.google.android.gms.internal.measurement.zzao v13_27 = ((Integer) v12_17.next());
                            p11.zzn(v13_27.intValue(), v10_87.zzl(v13_27.intValue()));
                        }
                    }
                    return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) p11.zzh())));
                }
            case 107868:
                if (!p10.equals("map")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("map", 1, p13);
                    Double v10_77 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(0)));
                    if (!(v10_77 instanceof com.google.android.gms.internal.measurement.zzan)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    } else {
                        if (p11.zzh() != 0) {
                            return com.google.android.gms.internal.measurement.zzba.zzc(p11, p12, ((com.google.android.gms.internal.measurement.zzan) v10_77), 0, 0);
                        } else {
                            return new com.google.android.gms.internal.measurement.zzae();
                        }
                    }
                }
            case 111185:
                if (!p10.equals("pop")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("pop", 0, p13);
                    Double v10_71 = p11.zzh();
                    if (v10_71 != null) {
                        Double v10_72 = (v10_71 - 1);
                        com.google.android.gms.internal.measurement.zzah v12_14 = p11.zzl(v10_72);
                        p11.zzr(v10_72);
                        return v12_14;
                    } else {
                        return com.google.android.gms.internal.measurement.zzao.zzf;
                    }
                }
            case 3267882:
                if (!p10.equals("join")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zzc("join", 1, p13);
                    if (p11.zzh() != 0) {
                        if (!p13.isEmpty()) {
                            Double v10_66 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(0)));
                            if ((!(v10_66 instanceof com.google.android.gms.internal.measurement.zzam)) && (!(v10_66 instanceof com.google.android.gms.internal.measurement.zzat))) {
                                v2_10 = v10_66.zzc();
                            } else {
                                v2_10 = "";
                            }
                        }
                        return new com.google.android.gms.internal.measurement.zzas(p11.zzs(v2_10));
                    } else {
                        return com.google.android.gms.internal.measurement.zzao.zzm;
                    }
                }
            case 3452698:
                if (!p10.equals("push")) {
                } else {
                    if (!p13.isEmpty()) {
                        Double v10_58 = p13.iterator();
                        while (v10_58.hasNext()) {
                            p11.zzn(p11.zzh(), p12.zza(((com.google.android.gms.internal.measurement.zzao) v10_58.next())));
                        }
                    }
                    return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) p11.zzh())));
                }
            case 3536116:
                if (!p10.equals("some")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("some", 1, p13);
                    Double v10_49 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(0)));
                    if (!(v10_49 instanceof com.google.android.gms.internal.measurement.zzai)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    } else {
                        if (p11.zzh() != 0) {
                            Double v10_52 = ((com.google.android.gms.internal.measurement.zzai) v10_49);
                            com.google.android.gms.internal.measurement.zzao v13_14 = p11.zzg();
                            while (v13_14.hasNext()) {
                                int v0_17 = ((Integer) v13_14.next()).intValue();
                                if (p11.zzo(v0_17)) {
                                    com.google.android.gms.internal.measurement.zzao v1_4 = p11.zzl(v0_17);
                                    int v0_19 = new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) v0_17)));
                                    int v2_9 = new com.google.android.gms.internal.measurement.zzao[3];
                                    v2_9[0] = v1_4;
                                    v2_9[1] = v0_19;
                                    v2_9[2] = p11;
                                    if (v10_52.zza(p12, java.util.Arrays.asList(v2_9)).zze().booleanValue()) {
                                        return com.google.android.gms.internal.measurement.zzao.zzk;
                                    }
                                }
                            }
                            return com.google.android.gms.internal.measurement.zzao.zzl;
                        } else {
                            return com.google.android.gms.internal.measurement.zzao.zzl;
                        }
                    }
                }
            case 3536286:
                if (!p10.equals("sort")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zzc("sort", 1, p13);
                    if (p11.zzh() < 2) {
                        return p11;
                    } else {
                        Double v10_41 = p11.zzb();
                        if (!p13.isEmpty()) {
                            com.google.android.gms.internal.measurement.zzao v13_8 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(0)));
                            if (!(v13_8 instanceof com.google.android.gms.internal.measurement.zzai)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            } else {
                                v6_1 = ((com.google.android.gms.internal.measurement.zzai) v13_8);
                            }
                        }
                        java.util.Collections.sort(v10_41, new com.google.android.gms.internal.measurement.zzaz(v6_1, p12));
                        p11.zzp();
                        Double v10_45 = v10_41.iterator();
                        while (v10_45.hasNext()) {
                            com.google.android.gms.internal.measurement.zzao v13_11 = (v9 + 1);
                            p11.zzn(v9, ((com.google.android.gms.internal.measurement.zzao) v10_45.next()));
                            v9 = v13_11;
                        }
                        return p11;
                    }
                }
            case 96891675:
                if (!p10.equals("every")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("every", 1, p13);
                    Double v10_29 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(0)));
                    if (!(v10_29 instanceof com.google.android.gms.internal.measurement.zzan)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    } else {
                        if (p11.zzh() != 0) {
                            if (com.google.android.gms.internal.measurement.zzba.zzc(p11, p12, ((com.google.android.gms.internal.measurement.zzan) v10_29), Boolean.FALSE, Boolean.TRUE).zzh() == p11.zzh()) {
                                return com.google.android.gms.internal.measurement.zzao.zzk;
                            } else {
                                return com.google.android.gms.internal.measurement.zzao.zzl;
                            }
                        } else {
                            return com.google.android.gms.internal.measurement.zzao.zzk;
                        }
                    }
                }
            case 109407362:
                if (!p10.equals("shift")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("shift", 0, p13);
                    if (p11.zzh() != 0) {
                        Double v10_24 = p11.zzl(0);
                        p11.zzr(0);
                        return v10_24;
                    } else {
                        return com.google.android.gms.internal.measurement.zzao.zzf;
                    }
                }
            case 109526418:
                if (!p10.equals("slice")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zzc("slice", 2, p13);
                    if (!p13.isEmpty()) {
                        int v2_2;
                        int v0_5 = ((double) p11.zzh());
                        int v2_1 = com.google.android.gms.internal.measurement.zzh.zzi(p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(0))).zzd().doubleValue());
                        if (v2_1 >= 0) {
                            v2_2 = Math.min(v2_1, v0_5);
                        } else {
                            v2_2 = Math.max((v2_1 + v0_5), 0);
                        }
                        if (p13.size() == 2) {
                            com.google.android.gms.internal.measurement.zzah v12_2 = com.google.android.gms.internal.measurement.zzh.zzi(p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(1))).zzd().doubleValue());
                            if (v12_2 >= 0) {
                                v0_5 = Math.min(v0_5, v12_2);
                            } else {
                                v0_5 = Math.max((v0_5 + v12_2), 0);
                            }
                        }
                        Double v10_19 = new com.google.android.gms.internal.measurement.zzae();
                        com.google.android.gms.internal.measurement.zzah v12_3 = ((int) v2_2);
                        while (((double) v12_3) < v0_5) {
                            v10_19.zzn(v10_19.zzh(), p11.zzl(v12_3));
                            v12_3++;
                        }
                        return v10_19;
                    } else {
                        return p11.zzt();
                    }
                }
            case 965561430:
                if (!p10.equals("reduceRight")) {
                } else {
                    return com.google.android.gms.internal.measurement.zzba.zzb(p11, p12, p13, 0);
                }
            case 1099846370:
                if (!p10.equals("reverse")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("reverse", 0, p13);
                    Double v10_152 = p11.zzh();
                    if (v10_152 == null) {
                        return p11;
                    }
                    while (v9 < (v10_152 / 2)) {
                        if (p11.zzo(v9)) {
                            com.google.android.gms.internal.measurement.zzah v12_39 = p11.zzl(v9);
                            p11.zzn(v9, 0);
                            com.google.android.gms.internal.measurement.zzao v13_56 = ((v10_152 - 1) - v9);
                            if (p11.zzo(v13_56)) {
                                p11.zzn(v9, p11.zzl(v13_56));
                            }
                            p11.zzn(v13_56, v12_39);
                        }
                        v9++;
                    }
                    return p11;
                }
            case 1943291465:
                if (!p10.equals("indexOf")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zzc("indexOf", 2, p13);
                    Double v10_21 = com.google.android.gms.internal.measurement.zzao.zzf;
                    if (!p13.isEmpty()) {
                        v10_21 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(0)));
                    }
                    if (p13.size() > 1) {
                        com.google.android.gms.internal.measurement.zzah v12_15 = com.google.android.gms.internal.measurement.zzh.zzi(p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(1))).zzd().doubleValue());
                        if (v12_15 < ((double) p11.zzh())) {
                            if (v12_15 >= 0) {
                                v4_0 = v12_15;
                            } else {
                                v4_0 = (((double) p11.zzh()) + v12_15);
                            }
                        } else {
                            return new com.google.android.gms.internal.measurement.zzah(v0_8);
                        }
                    }
                    com.google.android.gms.internal.measurement.zzah v12_24 = p11.zzg();
                    while (v12_24.hasNext()) {
                        com.google.android.gms.internal.measurement.zzao v13_43 = ((Integer) v12_24.next()).intValue();
                        com.google.android.gms.internal.measurement.zzao v1_29 = ((double) v13_43);
                        if ((v1_29 >= v4_0) && (com.google.android.gms.internal.measurement.zzh.zzf(p11.zzl(v13_43), v10_21))) {
                            return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(v1_29));
                        }
                    }
                    return new com.google.android.gms.internal.measurement.zzah(v0_8);
                }
            default:
        }
        throw new IllegalArgumentException("Command not supported");
    }

    private static com.google.android.gms.internal.measurement.zzao zzb(com.google.android.gms.internal.measurement.zzae p10, com.google.android.gms.internal.measurement.zzg p11, java.util.List p12, boolean p13)
    {
        com.google.android.gms.internal.measurement.zzh.zzb("reduce", 1, p12);
        com.google.android.gms.internal.measurement.zzh.zzc("reduce", 2, p12);
        com.google.android.gms.internal.measurement.zzai v3_0 = p11.zza(((com.google.android.gms.internal.measurement.zzao) p12.get(0)));
        if (!(v3_0 instanceof com.google.android.gms.internal.measurement.zzai)) {
            throw new IllegalArgumentException("Callback should be a method");
        } else {
            com.google.android.gms.internal.measurement.zzao v12_2;
            if (p12.size() != 2) {
                if (p10.zzh() == 0) {
                    throw new IllegalStateException("Empty array with no initial value error");
                } else {
                    v12_2 = 0;
                }
            } else {
                v12_2 = p11.zza(((com.google.android.gms.internal.measurement.zzao) p12.get(1)));
                if ((v12_2 instanceof com.google.android.gms.internal.measurement.zzag)) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            }
            int v5;
            com.google.android.gms.internal.measurement.zzai v3_1 = ((com.google.android.gms.internal.measurement.zzai) v3_0);
            int v4_3 = p10.zzh();
            if (!p13) {
                v5 = (v4_3 - 1);
            } else {
                v5 = 0;
            }
            int v4_4;
            int v6 = -1;
            if (!p13) {
                v4_4 = 0;
            } else {
                v4_4 = (v4_3 + -1);
            }
            if (1 == p13) {
                v6 = 1;
            }
            if (v12_2 == null) {
                v12_2 = p10.zzl(v5);
                v5 += v6;
            }
            if (((v4_4 - v5) * v6) < 0) {
                return v12_2;
            } else {
                if (!p10.zzo(v5)) {
                } else {
                    boolean v13_4 = p10.zzl(v5);
                    com.google.android.gms.internal.measurement.zzah v9_1 = new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) v5)));
                    com.google.android.gms.internal.measurement.zzao[] v7_3 = new com.google.android.gms.internal.measurement.zzao[4];
                    v7_3[0] = v12_2;
                    v7_3[1] = v13_4;
                    v7_3[2] = v9_1;
                    v7_3[3] = p10;
                    v12_2 = v3_1.zza(p11, java.util.Arrays.asList(v7_3));
                    if ((v12_2 instanceof com.google.android.gms.internal.measurement.zzag)) {
                        throw new IllegalStateException("Reduce operation failed");
                    } else {
                    }
                }
            }
        }
    }

    private static com.google.android.gms.internal.measurement.zzae zzc(com.google.android.gms.internal.measurement.zzae p7, com.google.android.gms.internal.measurement.zzg p8, com.google.android.gms.internal.measurement.zzai p9, Boolean p10, Boolean p11)
    {
        com.google.android.gms.internal.measurement.zzae v0_1 = new com.google.android.gms.internal.measurement.zzae();
        java.util.Iterator v1 = p7.zzg();
        while (v1.hasNext()) {
            int v2_0 = ((Integer) v1.next()).intValue();
            if (p7.zzo(v2_0)) {
                com.google.android.gms.internal.measurement.zzao v3_1 = p7.zzl(v2_0);
                com.google.android.gms.internal.measurement.zzah v6_1 = new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) v2_0)));
                boolean v4_3 = new com.google.android.gms.internal.measurement.zzao[3];
                v4_3[0] = v3_1;
                v4_3[1] = v6_1;
                v4_3[2] = p7;
                com.google.android.gms.internal.measurement.zzao v3_5 = p9.zza(p8, java.util.Arrays.asList(v4_3));
                if (v3_5.zze().equals(p10)) {
                    break;
                }
                if ((p11 == null) || (v3_5.zze().equals(p11))) {
                    v0_1.zzn(v2_0, v3_5);
                }
            }
        }
        return v0_1;
    }
}
