package com.google.android.gms.measurement.internal;
final class zzz {
    final synthetic com.google.android.gms.measurement.internal.zzad zza;
    private com.google.android.gms.internal.measurement.zzhs zzb;
    private Long zzc;
    private long zzd;

    public synthetic zzz(com.google.android.gms.measurement.internal.zzad p1, byte[] p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final com.google.android.gms.internal.measurement.zzhs zza(String p18, com.google.android.gms.internal.measurement.zzhs p19)
    {
        long v0_34 = p19.zzd();
        android.util.Pair v9 = p19.zza();
        com.google.android.gms.internal.measurement.zzhs v2_23 = this.zza;
        com.google.android.gms.internal.measurement.zzhw v4_12 = v2_23.zzg;
        v4_12.zzp();
        Long v6_1 = ((Long) com.google.android.gms.measurement.internal.zzpk.zzI(p19, "_eid"));
        if (v6_1 != null) {
            if (!v0_34.equals("_ep")) {
                this.zzc = v6_1;
                this.zzb = p19;
                v4_12.zzp();
                long v12_0 = ((Long) com.google.android.gms.measurement.internal.zzpk.zzJ(p19, "_epc", Long.valueOf(0))).longValue();
                this.zzd = v12_0;
                if (v12_0 > 0) {
                    v4_12.zzj().zzT(p18, ((Long) this), this.zzd, p19);
                } else {
                    v2_23.zzu.zzaV().zzc().zzb("Complex event with zero extra param count. eventName", v0_34);
                }
            } else {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v6_1);
                v4_12.zzp();
                long v12_2 = ((String) com.google.android.gms.measurement.internal.zzpk.zzI(p19, "_en"));
                String v7_0 = 0;
                if (!android.text.TextUtils.isEmpty(v12_2)) {
                    if ((this.zzb == null) || ((this.zzc == null) || (v6_1.longValue() != this.zzc.longValue()))) {
                        com.google.android.gms.internal.measurement.zzhs v2_24 = v4_12.zzj();
                        v2_24.zzg();
                        v2_24.zzaw();
                        try {
                            long v0_5;
                            com.google.android.gms.internal.measurement.zzhw v4_13 = v2_24.zze().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[] {p18, v6_1.toString()}));
                            try {
                                if (v4_13.moveToFirst()) {
                                    try {
                                    } catch (long v0_4) {
                                        v2_24.zzu.zzaV().zzb().zzd("Failed to merge main event. appId, eventId", com.google.android.gms.measurement.internal.zzgu.zzl(p18), v6_1, v0_4);
                                        v4_13.close();
                                        v0_5 = 0;
                                        if (v0_5 != 0) {
                                            com.google.android.gms.internal.measurement.zzhs v2_3 = v0_5.first;
                                            if (v2_3 != null) {
                                                this.zzb = ((com.google.android.gms.internal.measurement.zzhs) v2_3);
                                                this.zzd = ((Long) v0_5.second).longValue();
                                                this.zza.zzg.zzp();
                                                this.zzc = ((Long) com.google.android.gms.measurement.internal.zzpk.zzI(this.zzb, "_eid"));
                                                com.google.android.gms.internal.measurement.zzhw v4_1 = (this.zzd + -1);
                                                this.zzd = v4_1;
                                                if (v4_1 > 0) {
                                                    this.zza.zzg.zzj().zzT(p18, v6_1, this.zzd, this.zzb);
                                                } else {
                                                    com.google.android.gms.internal.measurement.zzhs v2_6 = this.zza.zzg.zzj();
                                                    v2_6.zzg();
                                                    v2_6.zzu.zzaV().zzk().zzb("Clearing complex main event info. appId", p18);
                                                    try {
                                                        v2_6.zze().execSQL("delete from main_event_params where app_id=?", new String[] {p18}));
                                                    } catch (long v0_27) {
                                                        v2_6.zzu.zzaV().zzb().zzb("Error clearing complex main event", v0_27);
                                                    }
                                                }
                                                long v0_29 = new java.util.ArrayList();
                                                com.google.android.gms.internal.measurement.zzhs v2_12 = this.zzb.zza().iterator();
                                                while (v2_12.hasNext()) {
                                                    com.google.android.gms.internal.measurement.zzhw v3_5 = ((com.google.android.gms.internal.measurement.zzhw) v2_12.next());
                                                    this.zza.zzg.zzp();
                                                    if (com.google.android.gms.measurement.internal.zzpk.zzF(p19, v3_5.zzb()) == null) {
                                                        v0_29.add(v3_5);
                                                    }
                                                }
                                                if (v0_29.isEmpty()) {
                                                    this.zza.zzu.zzaV().zzc().zzb("No unique parameters in main event. eventName", v12_2);
                                                } else {
                                                    v0_29.addAll(v9);
                                                    v9 = v0_29;
                                                }
                                                v0_34 = v12_2;
                                                com.google.android.gms.internal.measurement.zzhs v2_16 = ((com.google.android.gms.internal.measurement.zzhr) p19.zzcl());
                                                v2_16.zzl(v0_34);
                                                v2_16.zzi();
                                                v2_16.zzh(v9);
                                                return ((com.google.android.gms.internal.measurement.zzhs) v2_16.zzbc());
                                            }
                                        }
                                        this.zza.zzu.zzaV().zzc().zzc("Extra parameter without existing main event. eventName, eventId", v12_2, v6_1);
                                        return 0;
                                    }
                                    v0_5 = android.util.Pair.create(((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), v4_13.getBlob(0))).zzbc()), Long.valueOf(v4_13.getLong(1)));
                                    v4_13.close();
                                } else {
                                    v2_24.zzu.zzaV().zzk().zza("Main event not found");
                                }
                            } catch (long v0_9) {
                                v2_24.zzu.zzaV().zzb().zzb("Error selecting main event", v0_9);
                                if (v4_13 == null) {
                                }
                            }
                        } catch (long v0_9) {
                            v4_13 = 0;
                        } catch (long v0_10) {
                            if (v7_0 != null) {
                                v7_0.close();
                            }
                            throw v0_10;
                        } catch (long v0_10) {
                            v7_0 = v4_13;
                        }
                    }
                } else {
                    v2_23.zzu.zzaV().zzc().zzb("Extra parameter without an event name. eventId", v6_1);
                    return 0;
                }
            }
        }
        v2_16 = ((com.google.android.gms.internal.measurement.zzhr) p19.zzcl());
        v2_16.zzl(v0_34);
        v2_16.zzi();
        v2_16.zzh(v9);
        return ((com.google.android.gms.internal.measurement.zzhs) v2_16.zzbc());
    }
}
