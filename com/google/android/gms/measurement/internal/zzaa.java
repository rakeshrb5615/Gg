package com.google.android.gms.measurement.internal;
final class zzaa extends com.google.android.gms.measurement.internal.zzab {
    final synthetic com.google.android.gms.measurement.internal.zzad zza;
    private final com.google.android.gms.internal.measurement.zzff zzh;

    public zzaa(com.google.android.gms.measurement.internal.zzad p1, String p2, int p3, com.google.android.gms.internal.measurement.zzff p4)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        super(p2, p3);
        super.zzh = p4;
        return;
    }

    public final int zza()
    {
        return this.zzh.zzb();
    }

    public final boolean zzb()
    {
        return 0;
    }

    public final boolean zzc()
    {
        return this.zzh.zzg();
    }

    public final boolean zzd(Long p17, Long p18, com.google.android.gms.internal.measurement.zzhs p19, long p20, com.google.android.gms.measurement.internal.zzbc p22, boolean p23)
    {
        com.google.android.gms.measurement.internal.zzgs v6_3;
        com.google.android.gms.internal.measurement.zzpu.zza();
        Long v1_0 = this.zza;
        boolean v2_0 = v1_0.zzu;
        String v4_12 = this.zzb;
        String v3_7 = v2_0.zzc().zzp(v4_12, com.google.android.gms.measurement.internal.zzfy.zzaF);
        com.google.android.gms.internal.measurement.zzff v5_0 = this.zzh;
        if (!v5_0.zzm()) {
            v6_3 = p20;
        } else {
            v6_3 = p22.zze;
        }
        Boolean v9_0 = 0;
        if (android.util.Log.isLoggable(v2_0.zzaV().zzn(), 2)) {
            int v11_1;
            com.google.android.gms.measurement.internal.zzgs v8_4 = v2_0.zzaV().zzk();
            String v10_22 = Integer.valueOf(this.zzc);
            if (!v5_0.zza()) {
                v11_1 = 0;
            } else {
                v11_1 = Integer.valueOf(v5_0.zzb());
            }
            v8_4.zzd("Evaluating filter. audience, filter, event", v10_22, v11_1, v2_0.zzl().zza(v5_0.zzc()));
            v2_0.zzaV().zzk().zzb("Filter definition", v1_0.zzg.zzp().zzj(v5_0));
        }
        if ((v5_0.zza()) && (v5_0.zzb() <= 256)) {
            Long v1_14;
            Long v1_13 = v5_0.zzi();
            String v4_13 = v5_0.zzj();
            String v10_30 = v5_0.zzm();
            if ((v1_13 == null) && ((v4_13 == null) && (v10_30 == null))) {
                v1_14 = 0;
            } else {
                v1_14 = 1;
            }
            if ((!p23) || (v1_14 != null)) {
                String v4_14 = p19.zzd();
                if (!v5_0.zzg()) {
                    com.google.android.gms.measurement.internal.zzgs v6_27 = new java.util.HashSet();
                    String v7_0 = v5_0.zzd().iterator();
                    while (v7_0.hasNext()) {
                        String v10_26 = ((com.google.android.gms.internal.measurement.zzfh) v7_0.next());
                        if (!v10_26.zzh().isEmpty()) {
                            v6_27.add(v10_26.zzh());
                        } else {
                            v2_0.zzaV().zze().zzb("null or empty param name in filter. event", v2_0.zzl().zza(v4_14));
                        }
                    }
                    String v7_2 = new r.e(0);
                    String v10_2 = p19.zza().iterator();
                    while (v10_2.hasNext()) {
                        int v12_5 = ((com.google.android.gms.internal.measurement.zzhw) v10_2.next());
                        if (v6_27.contains(v12_5.zzb())) {
                            if (!v12_5.zze()) {
                                if (!v12_5.zzi()) {
                                    if (!v12_5.zzc()) {
                                        v2_0.zzaV().zze().zzc("Unknown value for param. event, param", v2_0.zzl().zza(v4_14), v2_0.zzl().zzb(v12_5.zzb()));
                                    } else {
                                        v7_2.put(v12_5.zzb(), v12_5.zzd());
                                    }
                                } else {
                                    int v12_7;
                                    com.google.android.gms.measurement.internal.zzgu v13_10 = v12_5.zzb();
                                    if (!v12_5.zzi()) {
                                        v12_7 = 0;
                                    } else {
                                        v12_7 = Double.valueOf(v12_5.zzj());
                                    }
                                    v7_2.put(v13_10, v12_7);
                                }
                            } else {
                                int v12_8;
                                com.google.android.gms.measurement.internal.zzgu v13_11 = v12_5.zzb();
                                if (!v12_5.zze()) {
                                    v12_8 = 0;
                                } else {
                                    v12_8 = Long.valueOf(v12_5.zzf());
                                }
                                v7_2.put(v13_11, v12_8);
                            }
                        }
                    }
                    com.google.android.gms.measurement.internal.zzgs v6_1 = v5_0.zzd().iterator();
                    while (v6_1.hasNext()) {
                        int v12_3;
                        String v10_5 = ((com.google.android.gms.internal.measurement.zzfh) v6_1.next());
                        if ((!v10_5.zze()) || (!v10_5.zzf())) {
                            v12_3 = 0;
                        } else {
                            v12_3 = 1;
                        }
                        com.google.android.gms.measurement.internal.zzgu v13_0 = v10_5.zzh();
                        if (!v13_0.isEmpty()) {
                            String v14_1 = v7_2.get(v13_0);
                            if (!(v14_1 instanceof Long)) {
                                if (!(v14_1 instanceof Double)) {
                                    if (!(v14_1 instanceof String)) {
                                        if (v14_1 != null) {
                                            v2_0.zzaV().zze().zzc("Unknown param type. event, param", v2_0.zzl().zza(v4_14), v2_0.zzl().zzb(v13_0));
                                        } else {
                                            v2_0.zzaV().zzk().zzc("Missing param for filter. event, param", v2_0.zzl().zza(v4_14), v2_0.zzl().zzb(v13_0));
                                            v9_0 = Boolean.FALSE;
                                        }
                                    } else {
                                        String v10_10;
                                        if (!v10_5.zza()) {
                                            if (!v10_5.zzc()) {
                                                v2_0.zzaV().zze().zzc("No filter for String param. event, param", v2_0.zzl().zza(v4_14), v2_0.zzl().zzb(v13_0));
                                                String v4_9;
                                                boolean v2_2 = v2_0.zzaV().zzk();
                                                if (v9_0 != null) {
                                                    v4_9 = v9_0;
                                                } else {
                                                    v4_9 = "null";
                                                }
                                                v2_2.zzb("Event filter result", v4_9);
                                                if (v9_0 != null) {
                                                    boolean v2_3 = Boolean.TRUE;
                                                    this.zzd = v2_3;
                                                    if (v9_0.booleanValue()) {
                                                        this.zze = v2_3;
                                                        if ((v1_14 != null) && (p19.zze())) {
                                                            Long v1_3 = Long.valueOf(p19.zzf());
                                                            if (!v5_0.zzj()) {
                                                                if ((v3_7 != null) && (v5_0.zzg())) {
                                                                    v1_3 = p18;
                                                                }
                                                                this.zzf = v1_3;
                                                            } else {
                                                                if ((v3_7 != null) && (v5_0.zzg())) {
                                                                    v1_3 = p17;
                                                                }
                                                                this.zzg = v1_3;
                                                                return 1;
                                                            }
                                                        }
                                                    }
                                                    return 1;
                                                } else {
                                                    return 0;
                                                }
                                            } else {
                                                String v14_2 = ((String) v14_1);
                                                if (!com.google.android.gms.measurement.internal.zzpk.zzm(v14_2)) {
                                                    v2_0.zzaV().zze().zzc("Invalid param value for number filter. event, param", v2_0.zzl().zza(v4_14), v2_0.zzl().zzb(v13_0));
                                                } else {
                                                    v10_10 = com.google.android.gms.measurement.internal.zzab.zzi(v14_2, v10_5.zzd());
                                                }
                                            }
                                        } else {
                                            v10_10 = com.google.android.gms.measurement.internal.zzab.zzf(((String) v14_1), v10_5.zzb(), v2_0.zzaV());
                                        }
                                        if (v10_10 != null) {
                                            if (v10_10.booleanValue() == v12_3) {
                                                v9_0 = Boolean.FALSE;
                                            }
                                        }
                                    }
                                } else {
                                    if (v10_5.zzc()) {
                                        String v10_14 = com.google.android.gms.measurement.internal.zzab.zzh(((Double) v14_1).doubleValue(), v10_5.zzd());
                                        if (v10_14 != null) {
                                            if (v10_14.booleanValue() == v12_3) {
                                                v9_0 = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        v2_0.zzaV().zze().zzc("No number filter for double param. event, param", v2_0.zzl().zza(v4_14), v2_0.zzl().zzb(v13_0));
                                    }
                                }
                            } else {
                                if (v10_5.zzc()) {
                                    String v10_18 = com.google.android.gms.measurement.internal.zzab.zzg(((Long) v14_1).longValue(), v10_5.zzd());
                                    if (v10_18 != null) {
                                        if (v10_18.booleanValue() == v12_3) {
                                            v9_0 = Boolean.FALSE;
                                        }
                                    }
                                } else {
                                    v2_0.zzaV().zze().zzc("No number filter for long param. event, param", v2_0.zzl().zza(v4_14), v2_0.zzl().zzb(v13_0));
                                }
                            }
                        } else {
                            v2_0.zzaV().zze().zzb("Event has empty param name. event", v2_0.zzl().zza(v4_14));
                        }
                    }
                    v9_0 = Boolean.TRUE;
                } else {
                    com.google.android.gms.measurement.internal.zzgs v6_24 = com.google.android.gms.measurement.internal.zzab.zzg(v6_3, v5_0.zzh());
                    if (v6_24 != null) {
                        if (v6_24.booleanValue()) {
                        } else {
                            v9_0 = Boolean.FALSE;
                        }
                    }
                }
            } else {
                Long v1_5 = v2_0.zzaV().zzk();
                boolean v2_8 = Integer.valueOf(this.zzc);
                if (v5_0.zza()) {
                    v9_0 = Integer.valueOf(v5_0.zzb());
                }
                v1_5.zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", v2_8, v9_0);
                return 1;
            }
        } else {
            Long v1_7 = v2_0.zzaV().zze();
            boolean v2_9 = com.google.android.gms.measurement.internal.zzgu.zzl(v4_12);
            if (v5_0.zza()) {
                v9_0 = Integer.valueOf(v5_0.zzb());
            }
            v1_7.zzc("Invalid event filter ID. appId, id", v2_9, String.valueOf(v9_0));
            return 0;
        }
    }
}
