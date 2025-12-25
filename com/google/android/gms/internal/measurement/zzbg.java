package com.google.android.gms.internal.measurement;
public final class zzbg extends com.google.android.gms.internal.measurement.zzav {

    public zzbg()
    {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzA);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzB);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzC);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzD);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzE);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzF);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzG);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzan);
        return;
    }

    private static com.google.android.gms.internal.measurement.zzao zzc(com.google.android.gms.internal.measurement.zzbe p0, com.google.android.gms.internal.measurement.zzao p1, com.google.android.gms.internal.measurement.zzao p2)
    {
        return com.google.android.gms.internal.measurement.zzbg.zze(p0, p1.zzf(), p2);
    }

    private static com.google.android.gms.internal.measurement.zzao zzd(com.google.android.gms.internal.measurement.zzbe p1, com.google.android.gms.internal.measurement.zzao p2, com.google.android.gms.internal.measurement.zzao p3)
    {
        if (!(p2 instanceof Iterable)) {
            throw new IllegalArgumentException("Non-iterable type in for...of loop.");
        } else {
            return com.google.android.gms.internal.measurement.zzbg.zze(p1, ((Iterable) p2).iterator(), p3);
        }
    }

    private static com.google.android.gms.internal.measurement.zzao zze(com.google.android.gms.internal.measurement.zzbe p3, java.util.Iterator p4, com.google.android.gms.internal.measurement.zzao p5)
    {
        if (p4 != null) {
            while (p4.hasNext()) {
                com.google.android.gms.internal.measurement.zzag v0_1 = p3.zza(((com.google.android.gms.internal.measurement.zzao) p4.next())).zzb(((com.google.android.gms.internal.measurement.zzae) p5));
                if ((v0_1 instanceof com.google.android.gms.internal.measurement.zzag)) {
                    com.google.android.gms.internal.measurement.zzag v0_2 = ((com.google.android.gms.internal.measurement.zzag) v0_1);
                    if (!"break".equals(v0_2.zzg())) {
                        if ("return".equals(v0_2.zzg())) {
                            return v0_2;
                        }
                    } else {
                        return com.google.android.gms.internal.measurement.zzao.zzf;
                    }
                }
            }
        }
        return com.google.android.gms.internal.measurement.zzao.zzf;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(String p11, com.google.android.gms.internal.measurement.zzg p12, java.util.List p13)
    {
        com.google.android.gms.internal.measurement.zzao v0_24 = com.google.android.gms.internal.measurement.zzh.zze(p11).ordinal();
        if (v0_24 == 65) {
            com.google.android.gms.internal.measurement.zzao v11_22 = ((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzan, 4, p13, 0));
            com.google.android.gms.internal.measurement.zzao v0_14 = ((com.google.android.gms.internal.measurement.zzao) p13.get(1));
            com.google.android.gms.internal.measurement.zzag v1_9 = ((com.google.android.gms.internal.measurement.zzao) p13.get(2));
            com.google.android.gms.internal.measurement.zzao v13_17 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(3)));
            if (p12.zza(v1_9).zze().booleanValue()) {
                com.google.android.gms.internal.measurement.zzag v1_21 = p12.zzb(((com.google.android.gms.internal.measurement.zzae) v13_17));
                if ((v1_21 instanceof com.google.android.gms.internal.measurement.zzag)) {
                    com.google.android.gms.internal.measurement.zzag v1_22 = ((com.google.android.gms.internal.measurement.zzag) v1_21);
                    if (!"break".equals(v1_22.zzg())) {
                        if ("return".equals(v1_22.zzg())) {
                            return v1_22;
                        }
                    } else {
                        return com.google.android.gms.internal.measurement.zzao.zzf;
                    }
                }
            }
            while (p12.zza(v11_22).zze().booleanValue()) {
                com.google.android.gms.internal.measurement.zzag v1_29 = p12.zzb(((com.google.android.gms.internal.measurement.zzae) v13_17));
                if ((v1_29 instanceof com.google.android.gms.internal.measurement.zzag)) {
                    com.google.android.gms.internal.measurement.zzag v1_30 = ((com.google.android.gms.internal.measurement.zzag) v1_29);
                    if (!"break".equals(v1_30.zzg())) {
                        if ("return".equals(v1_30.zzg())) {
                            return v1_30;
                        }
                    } else {
                        return com.google.android.gms.internal.measurement.zzao.zzf;
                    }
                }
                p12.zza(v0_14);
            }
            return com.google.android.gms.internal.measurement.zzao.zzf;
        } else {
            switch (v0_24) {
                case 26:
                    if (!(v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzA, 3, p13, 0) instanceof com.google.android.gms.internal.measurement.zzas)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                    } else {
                        return com.google.android.gms.internal.measurement.zzbg.zzc(new com.google.android.gms.internal.measurement.zzbf(p12, ((com.google.android.gms.internal.measurement.zzao) p13.get(0)).zzc()), p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(1))), p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(2))));
                    }
                case 27:
                    if (!(v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzB, 3, p13, 0) instanceof com.google.android.gms.internal.measurement.zzas)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                    } else {
                        return com.google.android.gms.internal.measurement.zzbg.zzc(new com.google.android.gms.internal.measurement.zzbc(p12, ((com.google.android.gms.internal.measurement.zzao) p13.get(0)).zzc()), p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(1))), p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(2))));
                    }
                case 28:
                    if (!(v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzC, 3, p13, 0) instanceof com.google.android.gms.internal.measurement.zzas)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                    } else {
                        return com.google.android.gms.internal.measurement.zzbg.zzc(new com.google.android.gms.internal.measurement.zzbd(p12, ((com.google.android.gms.internal.measurement.zzao) p13.get(0)).zzc()), p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(1))), p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(2))));
                    }
                case 29:
                    com.google.android.gms.internal.measurement.zzao v11_27 = p12.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzD, 4, p13, 0)));
                    if (!(v11_27 instanceof com.google.android.gms.internal.measurement.zzae)) {
                        throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                    } else {
                        com.google.android.gms.internal.measurement.zzao v11_30 = ((com.google.android.gms.internal.measurement.zzae) v11_27);
                        com.google.android.gms.internal.measurement.zzao v0_11 = ((com.google.android.gms.internal.measurement.zzao) p13.get(1));
                        com.google.android.gms.internal.measurement.zzag v1_7 = ((com.google.android.gms.internal.measurement.zzao) p13.get(2));
                        com.google.android.gms.internal.measurement.zzao v13_12 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(3)));
                        com.google.android.gms.internal.measurement.zzg v2_0 = p12.zzc();
                        com.google.android.gms.internal.measurement.zzg v5_0 = 0;
                        while (v5_0 < v11_30.zzh()) {
                            int v6_9 = v11_30.zzl(v5_0).zzc();
                            v2_0.zze(v6_9, p12.zzh(v6_9));
                            v5_0++;
                        }
                        while (p12.zza(v0_11).zze().booleanValue()) {
                            com.google.android.gms.internal.measurement.zzg v5_6 = p12.zzb(((com.google.android.gms.internal.measurement.zzae) v13_12));
                            if ((v5_6 instanceof com.google.android.gms.internal.measurement.zzag)) {
                                com.google.android.gms.internal.measurement.zzg v5_7 = ((com.google.android.gms.internal.measurement.zzag) v5_6);
                                if (!"break".equals(v5_7.zzg())) {
                                    if ("return".equals(v5_7.zzg())) {
                                        return v5_7;
                                    }
                                } else {
                                    return com.google.android.gms.internal.measurement.zzao.zzf;
                                }
                            }
                            com.google.android.gms.internal.measurement.zzg v5_8 = p12.zzc();
                            int v6_7 = 0;
                            while (v6_7 < v11_30.zzh()) {
                                String v7_3 = v11_30.zzl(v6_7).zzc();
                                v5_8.zze(v7_3, v2_0.zzh(v7_3));
                                v6_7++;
                            }
                            v5_8.zza(v1_7);
                            v2_0 = v5_8;
                        }
                        return com.google.android.gms.internal.measurement.zzao.zzf;
                    }
                case 30:
                    if (!(v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzE, 3, p13, 0) instanceof com.google.android.gms.internal.measurement.zzas)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                    } else {
                        return com.google.android.gms.internal.measurement.zzbg.zzd(new com.google.android.gms.internal.measurement.zzbf(p12, ((com.google.android.gms.internal.measurement.zzao) p13.get(0)).zzc()), p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(1))), p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(2))));
                    }
                case 31:
                    if (!(v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzF, 3, p13, 0) instanceof com.google.android.gms.internal.measurement.zzas)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                    } else {
                        return com.google.android.gms.internal.measurement.zzbg.zzd(new com.google.android.gms.internal.measurement.zzbc(p12, ((com.google.android.gms.internal.measurement.zzao) p13.get(0)).zzc()), p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(1))), p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(2))));
                    }
                case 32:
                    if (!(v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzG, 3, p13, 0) instanceof com.google.android.gms.internal.measurement.zzas)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                    } else {
                        return com.google.android.gms.internal.measurement.zzbg.zzd(new com.google.android.gms.internal.measurement.zzbd(p12, ((com.google.android.gms.internal.measurement.zzao) p13.get(0)).zzc()), p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(1))), p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(2))));
                    }
                default:
                    return this.zzb(p11);
            }
        }
    }
}
