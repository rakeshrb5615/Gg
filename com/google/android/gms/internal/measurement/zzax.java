package com.google.android.gms.internal.measurement;
public final class zzax extends com.google.android.gms.internal.measurement.zzav {

    public zzax()
    {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzx);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzL);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzM);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzN);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzO);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzQ);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzR);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzW);
        return;
    }

    private static boolean zzc(com.google.android.gms.internal.measurement.zzao p8, com.google.android.gms.internal.measurement.zzao p9)
    {
        if ((p8 instanceof com.google.android.gms.internal.measurement.zzak)) {
            p8 = new com.google.android.gms.internal.measurement.zzas(p8.zzc());
        }
        if ((p9 instanceof com.google.android.gms.internal.measurement.zzak)) {
            p9 = new com.google.android.gms.internal.measurement.zzas(p9.zzc());
        }
        if (((p8 instanceof com.google.android.gms.internal.measurement.zzas)) && ((p9 instanceof com.google.android.gms.internal.measurement.zzas))) {
            if (p8.zzc().compareTo(p9.zzc()) >= 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            double v3 = p8.zzd().doubleValue();
            int v8_5 = p9.zzd().doubleValue();
            if ((!Double.isNaN(v3)) && (!Double.isNaN(v8_5))) {
                double v0_7 = v3 cmp 0;
                if (((v0_7 == 0) && (v8_5 == 0)) || ((v0_7 == 0) && (v8_5 == 0))) {
                    return 0;
                } else {
                    if (Double.compare(v3, v8_5) < 0) {
                        return 1;
                    }
                }
            }
            return 0;
        }
    }

    private static boolean zzd(com.google.android.gms.internal.measurement.zzao p5, com.google.android.gms.internal.measurement.zzao p6)
    {
        if (!p5.getClass().equals(p6.getClass())) {
            if ((((p5 instanceof com.google.android.gms.internal.measurement.zzat)) || ((p5 instanceof com.google.android.gms.internal.measurement.zzam))) && (((p6 instanceof com.google.android.gms.internal.measurement.zzat)) || ((p6 instanceof com.google.android.gms.internal.measurement.zzam)))) {
                return 1;
            } else {
                com.google.android.gms.internal.measurement.zzas v0_8 = (p5 instanceof com.google.android.gms.internal.measurement.zzah);
                if ((v0_8 != null) && ((p6 instanceof com.google.android.gms.internal.measurement.zzas))) {
                    return com.google.android.gms.internal.measurement.zzax.zzd(p5, new com.google.android.gms.internal.measurement.zzah(p6.zzd()));
                } else {
                    boolean v2_1 = (p5 instanceof com.google.android.gms.internal.measurement.zzas);
                    if ((v2_1) && ((p6 instanceof com.google.android.gms.internal.measurement.zzah))) {
                        return com.google.android.gms.internal.measurement.zzax.zzd(new com.google.android.gms.internal.measurement.zzah(p5.zzd()), p6);
                    } else {
                        if (!(p5 instanceof com.google.android.gms.internal.measurement.zzaf)) {
                            if (!(p6 instanceof com.google.android.gms.internal.measurement.zzaf)) {
                                if (((v2_1) || (v0_8 != null)) && ((p6 instanceof com.google.android.gms.internal.measurement.zzak))) {
                                    return com.google.android.gms.internal.measurement.zzax.zzd(p5, new com.google.android.gms.internal.measurement.zzas(p6.zzc()));
                                } else {
                                    if ((!(p5 instanceof com.google.android.gms.internal.measurement.zzak)) || ((!(p6 instanceof com.google.android.gms.internal.measurement.zzas)) && (!(p6 instanceof com.google.android.gms.internal.measurement.zzah)))) {
                                        return 0;
                                    } else {
                                        return com.google.android.gms.internal.measurement.zzax.zzd(new com.google.android.gms.internal.measurement.zzas(p5.zzc()), p6);
                                    }
                                }
                            } else {
                                return com.google.android.gms.internal.measurement.zzax.zzd(p5, new com.google.android.gms.internal.measurement.zzah(p6.zzd()));
                            }
                        } else {
                            return com.google.android.gms.internal.measurement.zzax.zzd(new com.google.android.gms.internal.measurement.zzah(p5.zzd()), p6);
                        }
                    }
                }
            }
        } else {
            if ((!(p5 instanceof com.google.android.gms.internal.measurement.zzat)) && (!(p5 instanceof com.google.android.gms.internal.measurement.zzam))) {
                if (!(p5 instanceof com.google.android.gms.internal.measurement.zzah)) {
                    if (!(p5 instanceof com.google.android.gms.internal.measurement.zzas)) {
                        if (!(p5 instanceof com.google.android.gms.internal.measurement.zzaf)) {
                            if (p5 != p6) {
                                return 0;
                            } else {
                                return 1;
                            }
                        } else {
                            return p5.zze().equals(p6.zze());
                        }
                    } else {
                        return p5.zzc().equals(p6.zzc());
                    }
                } else {
                    if ((Double.isNaN(p5.zzd().doubleValue())) || ((Double.isNaN(p6.zzd().doubleValue())) || (p5.zzd().doubleValue() != p6.zzd().doubleValue()))) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            } else {
                return 1;
            }
        }
    }

    private static boolean zze(com.google.android.gms.internal.measurement.zzao p4, com.google.android.gms.internal.measurement.zzao p5)
    {
        if ((p4 instanceof com.google.android.gms.internal.measurement.zzak)) {
            p4 = new com.google.android.gms.internal.measurement.zzas(p4.zzc());
        }
        if ((p5 instanceof com.google.android.gms.internal.measurement.zzak)) {
            p5 = new com.google.android.gms.internal.measurement.zzas(p5.zzc());
        }
        if ((((!(p4 instanceof com.google.android.gms.internal.measurement.zzas)) || (!(p5 instanceof com.google.android.gms.internal.measurement.zzas))) && ((Double.isNaN(p4.zzd().doubleValue())) || (Double.isNaN(p5.zzd().doubleValue())))) || (com.google.android.gms.internal.measurement.zzax.zzc(p5, p4))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.measurement.zzao zza(String p4, com.google.android.gms.internal.measurement.zzg p5, java.util.List p6)
    {
        boolean v4_1;
        com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzh.zze(p4).name(), 2, p6);
        com.google.android.gms.internal.measurement.zzao v0_1 = p5.zza(((com.google.android.gms.internal.measurement.zzao) p6.get(0)));
        com.google.android.gms.internal.measurement.zzao v5_1 = p5.zza(((com.google.android.gms.internal.measurement.zzao) p6.get(1)));
        int v6_4 = com.google.android.gms.internal.measurement.zzh.zze(p4).ordinal();
        if (v6_4 == 23) {
            v4_1 = com.google.android.gms.internal.measurement.zzax.zzd(v0_1, v5_1);
        } else {
            boolean v4_2;
            if (v6_4 == 48) {
                v4_2 = com.google.android.gms.internal.measurement.zzax.zzd(v0_1, v5_1);
            } else {
                if (v6_4 == 42) {
                    v4_1 = com.google.android.gms.internal.measurement.zzax.zzc(v0_1, v5_1);
                    if (!v4_1) {
                        return com.google.android.gms.internal.measurement.zzao.zzl;
                    } else {
                        return com.google.android.gms.internal.measurement.zzao.zzk;
                    }
                } else {
                    if (v6_4 == 43) {
                        v4_1 = com.google.android.gms.internal.measurement.zzax.zze(v0_1, v5_1);
                    } else {
                        switch (v6_4) {
                            case 37:
                                v4_1 = com.google.android.gms.internal.measurement.zzax.zzc(v5_1, v0_1);
                            case 38:
                                v4_1 = com.google.android.gms.internal.measurement.zzax.zze(v5_1, v0_1);
                                break;
                            case 39:
                                v4_1 = com.google.android.gms.internal.measurement.zzh.zzf(v0_1, v5_1);
                                break;
                            case 40:
                                v4_2 = com.google.android.gms.internal.measurement.zzh.zzf(v0_1, v5_1);
                                break;
                            default:
                                return this.zzb(p4);
                        }
                    }
                }
            }
            v4_1 = (v4_2 ^ 1);
        }
    }
}
