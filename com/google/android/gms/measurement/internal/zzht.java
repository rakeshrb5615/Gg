package com.google.android.gms.measurement.internal;
public final class zzht extends com.google.android.gms.measurement.internal.zzos implements com.google.android.gms.measurement.internal.zzak {
    final java.util.Map zza;
    final java.util.Map zzb;
    final java.util.Map zzc;
    final r.i zzd;
    final com.google.android.gms.internal.measurement.zzr zze;
    private final java.util.Map zzf;
    private final java.util.Map zzh;
    private final java.util.Map zzi;
    private final java.util.Map zzj;
    private final java.util.Map zzk;
    private final java.util.Map zzl;

    public zzht(com.google.android.gms.measurement.internal.zzpg p2)
    {
        super(p2);
        super.zzf = new r.e(0);
        super.zza = new r.e(0);
        super.zzb = new r.e(0);
        super.zzc = new r.e(0);
        super.zzh = new r.e(0);
        super.zzj = new r.e(0);
        super.zzk = new r.e(0);
        super.zzl = new r.e(0);
        super.zzi = new r.e(0);
        super.zzd = new com.google.android.gms.measurement.internal.zzhm(super, 20);
        super.zze = new com.google.android.gms.measurement.internal.zzhn(super);
        return;
    }

    private final void zzE(String p6)
    {
        this.zzaw();
        this.zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p6);
        java.util.Map v0_0 = this.zzh;
        if (v0_0.get(p6) == null) {
            String v1_0 = this.zzg.zzj().zzy(p6);
            if (v1_0 != null) {
                String v2_3 = ((com.google.android.gms.internal.measurement.zzgk) this.zzH(p6, v1_0.zza).zzcl());
                this.zzF(p6, v2_3);
                this.zzf.put(p6, com.google.android.gms.measurement.internal.zzht.zzI(((com.google.android.gms.internal.measurement.zzgl) v2_3.zzbc())));
                v0_0.put(p6, ((com.google.android.gms.internal.measurement.zzgl) v2_3.zzbc()));
                this.zzG(p6, ((com.google.android.gms.internal.measurement.zzgl) v2_3.zzbc()));
                this.zzj.put(p6, v2_3.zzh());
                this.zzk.put(p6, v1_0.zzb);
                this.zzl.put(p6, v1_0.zzc);
            } else {
                this.zzf.put(p6, 0);
                this.zzb.put(p6, 0);
                this.zza.put(p6, 0);
                this.zzc.put(p6, 0);
                v0_0.put(p6, 0);
                this.zzj.put(p6, 0);
                this.zzk.put(p6, 0);
                this.zzl.put(p6, 0);
                this.zzi.put(p6, 0);
                return;
            }
        }
        return;
    }

    private final void zzF(String p10, com.google.android.gms.internal.measurement.zzgk p11)
    {
        java.util.HashSet v0_1 = new java.util.HashSet();
        int v2 = 0;
        r.e v1_1 = new r.e(0);
        r.e v3_1 = new r.e(0);
        r.e v4_1 = new r.e(0);
        Integer v5_1 = p11.zzg().iterator();
        while (v5_1.hasNext()) {
            v0_1.add(((com.google.android.gms.internal.measurement.zzgh) v5_1.next()).zza());
        }
        while (v2 < p11.zza()) {
            Integer v5_5 = ((com.google.android.gms.internal.measurement.zzgi) p11.zzb(v2).zzcl());
            if (!v5_5.zza().isEmpty()) {
                String v6_6 = v5_5.zza();
                String v7_1 = com.google.android.gms.measurement.internal.zzjm.zzb(v5_5.zza());
                if (!android.text.TextUtils.isEmpty(v7_1)) {
                    v5_5.zzb(v7_1);
                    p11.zzc(v2, v5_5);
                }
                if ((v5_5.zzc()) && (v5_5.zzd())) {
                    v1_1.put(v6_6, Boolean.TRUE);
                }
                if ((v5_5.zze()) && (v5_5.zzf())) {
                    v3_1.put(v5_5.zza(), Boolean.TRUE);
                }
                if (v5_5.zzg()) {
                    if ((v5_5.zzh() >= 2) && (v5_5.zzh() <= 65535)) {
                        v4_1.put(v5_5.zza(), Integer.valueOf(v5_5.zzh()));
                    } else {
                        this.zzu.zzaV().zze().zzc("Invalid sampling rate. Event name, sample rate", v5_5.zza(), Integer.valueOf(v5_5.zzh()));
                    }
                }
            } else {
                v1.a.v(this.zzu, "EventConfig contained null event name");
            }
            v2++;
        }
        this.zza.put(p10, v0_1);
        this.zzb.put(p10, v1_1);
        this.zzc.put(p10, v3_1);
        this.zzi.put(p10, v4_1);
        return;
    }

    private final void zzG(String p5, com.google.android.gms.internal.measurement.zzgl p6)
    {
        if (p6.zzj() == 0) {
            this.zzd.remove(p5);
            return;
        } else {
            String v0_1 = this.zzu;
            v0_1.zzaV().zzk().zzb("EES programs found", Integer.valueOf(p6.zzj()));
            com.google.android.gms.measurement.internal.zzgs v6_3 = ((com.google.android.gms.internal.measurement.zzja) p6.zzi().get(0));
            try {
                String v1_3 = new com.google.android.gms.internal.measurement.zzc();
                v1_3.zza("internal.remoteConfig", new com.google.android.gms.measurement.internal.zzhs(this, p5));
                v1_3.zza("internal.appMetadata", new com.google.android.gms.measurement.internal.zzhp(this, p5));
                v1_3.zza("internal.logger", new com.google.android.gms.measurement.internal.zzhq(this));
                v1_3.zzf(v6_3);
                this.zzd.put(p5, v1_3);
                v0_1.zzaV().zzk().zzc("EES program loaded for appId, activities", p5, Integer.valueOf(v6_3.zzb().zzb()));
                com.google.android.gms.measurement.internal.zzgs v6_7 = v6_3.zzb().zza().iterator();
            } catch (com.google.android.gms.internal.measurement.zzd) {
                this.zzu.zzaV().zzb().zzb("Failed to load EES program. appId", p5);
                return;
            }
            while (v6_7.hasNext()) {
                v0_1.zzaV().zzk().zzb("EES program activity", ((com.google.android.gms.internal.measurement.zziy) v6_7.next()).zza());
            }
            return;
        }
    }

    private final com.google.android.gms.internal.measurement.zzgl zzH(String p8, byte[] p9)
    {
        if (p9 != null) {
            int v3_1;
            RuntimeException v9_6 = ((com.google.android.gms.internal.measurement.zzgl) ((com.google.android.gms.internal.measurement.zzgk) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzgl.zzr(), p9)).zzbc());
            com.google.android.gms.measurement.internal.zzgs v1_2 = this.zzu.zzaV().zzk();
            String v4 = 0;
            if (!v9_6.zza()) {
                v3_1 = 0;
            } else {
                v3_1 = Long.valueOf(v9_6.zzb());
            }
            if (v9_6.zzc()) {
                v4 = v9_6.zzd();
            }
            v1_2.zzc("Parsed config. version, gmp_app_id", v3_1, v4);
            return v9_6;
        } else {
            return com.google.android.gms.internal.measurement.zzgl.zzs();
        }
    }

    private static final java.util.Map zzI(com.google.android.gms.internal.measurement.zzgl p3)
    {
        r.e v0_1 = new r.e(0);
        if (p3 != null) {
            java.util.Iterator v3_2 = p3.zze().iterator();
            while (v3_2.hasNext()) {
                String v1_2 = ((com.google.android.gms.internal.measurement.zzgt) v3_2.next());
                v0_1.put(v1_2.zza(), v1_2.zzb());
            }
        }
        return v0_1;
    }

    private static final com.google.android.gms.measurement.internal.zzjk zzJ(int p1)
    {
        com.google.android.gms.measurement.internal.zzjk v1_1 = (p1 - 1);
        if (v1_1 == 1) {
            return com.google.android.gms.measurement.internal.zzjk.zza;
        } else {
            if (v1_1 == 2) {
                return com.google.android.gms.measurement.internal.zzjk.zzb;
            } else {
                if (v1_1 == 3) {
                    return com.google.android.gms.measurement.internal.zzjk.zzc;
                } else {
                    if (v1_1 == 4) {
                        return com.google.android.gms.measurement.internal.zzjk.zzd;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }

    public final com.google.android.gms.measurement.internal.zzji zzA(String p3, com.google.android.gms.measurement.internal.zzjk p4)
    {
        this.zzg();
        this.zzE(p3);
        com.google.android.gms.measurement.internal.zzji v3_5 = this.zzx(p3);
        if (v3_5 != null) {
            com.google.android.gms.measurement.internal.zzji v3_10 = v3_5.zzf().iterator();
            while (v3_10.hasNext()) {
                com.google.android.gms.internal.measurement.zzfu v0_2 = ((com.google.android.gms.internal.measurement.zzfu) v3_10.next());
                if (com.google.android.gms.measurement.internal.zzht.zzJ(v0_2.zzb()) == p4) {
                    com.google.android.gms.measurement.internal.zzji v3_3 = (v0_2.zzc() - 1);
                    if (v3_3 == 1) {
                        return com.google.android.gms.measurement.internal.zzji.zzd;
                    } else {
                        if (v3_3 == 2) {
                            return com.google.android.gms.measurement.internal.zzji.zzc;
                        } else {
                            return com.google.android.gms.measurement.internal.zzji.zza;
                        }
                    }
                }
            }
            return com.google.android.gms.measurement.internal.zzji.zza;
        } else {
            return com.google.android.gms.measurement.internal.zzji.zza;
        }
    }

    public final boolean zzB(String p5)
    {
        this.zzg();
        this.zzE(p5);
        int v5_2 = this.zzx(p5);
        if (v5_2 != 0) {
            int v5_4 = v5_2.zza().iterator();
            while (v5_4.hasNext()) {
                int v1_2 = ((com.google.android.gms.internal.measurement.zzfu) v5_4.next());
                if ((v1_2.zzb() == 3) && (v1_2.zzd() == 3)) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public final synthetic com.google.android.gms.internal.measurement.zzc zzC(String p4)
    {
        this.zzaw();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        java.util.Map v0_6 = this.zzg.zzj().zzy(p4);
        if (v0_6 != null) {
            this.zzu.zzaV().zzk().zzb("Populate EES config from database on cache miss. appId", p4);
            this.zzG(p4, this.zzH(p4, v0_6.zza));
            return ((com.google.android.gms.internal.measurement.zzc) this.zzd.snapshot().get(p4));
        } else {
            return 0;
        }
    }

    public final synthetic java.util.Map zzD()
    {
        return this.zzf;
    }

    public final String zza(String p2, String p3)
    {
        this.zzg();
        this.zzE(p2);
        int v2_4 = ((java.util.Map) this.zzf.get(p2));
        if (v2_4 == 0) {
            return 0;
        } else {
            return ((String) v2_4.get(p3));
        }
    }

    public final com.google.android.gms.internal.measurement.zzgl zzb(String p2)
    {
        this.zzaw();
        this.zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzE(p2);
        return ((com.google.android.gms.internal.measurement.zzgl) this.zzh.get(p2));
    }

    public final boolean zzbb()
    {
        return 0;
    }

    public final String zzc(String p2)
    {
        this.zzg();
        this.zzE(p2);
        return ((String) this.zzj.get(p2));
    }

    public final String zzd(String p2)
    {
        this.zzg();
        return ((String) this.zzk.get(p2));
    }

    public final String zze(String p2)
    {
        this.zzg();
        return ((String) this.zzl.get(p2));
    }

    public final void zzf(String p3)
    {
        this.zzg();
        this.zzk.put(p3, 0);
        return;
    }

    public final void zzh(String p2)
    {
        this.zzg();
        this.zzh.remove(p2);
        return;
    }

    public final boolean zzi(String p6, byte[] p7, String p8, String p9)
    {
        this.zzaw();
        this.zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p6);
        com.google.android.gms.internal.measurement.zzgk v0_2 = ((com.google.android.gms.internal.measurement.zzgk) this.zzH(p6, p7).zzcl());
        this.zzF(p6, v0_2);
        this.zzG(p6, ((com.google.android.gms.internal.measurement.zzgl) v0_2.zzbc()));
        this.zzh.put(p6, ((com.google.android.gms.internal.measurement.zzgl) v0_2.zzbc()));
        this.zzj.put(p6, v0_2.zzh());
        this.zzk.put(p6, p8);
        this.zzl.put(p6, p9);
        this.zzf.put(p6, com.google.android.gms.measurement.internal.zzht.zzI(((com.google.android.gms.internal.measurement.zzgl) v0_2.zzbc())));
        this.zzg.zzj().zzae(p6, new java.util.ArrayList(v0_2.zzd()));
        try {
            v0_2.zze();
            java.util.Map v7_2 = ((com.google.android.gms.internal.measurement.zzgl) v0_2.zzbc()).zzcc();
        } catch (String v1_14) {
            this.zzu.zzaV().zze().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p6), v1_14);
        }
        String v1_16 = this.zzg.zzj();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p6);
        v1_16.zzg();
        v1_16.zzaw();
        long v2_9 = new android.content.ContentValues();
        v2_9.put("remote_config", v7_2);
        v2_9.put("config_last_modified_time", p8);
        v2_9.put("e_tag", p9);
        try {
            if (((long) v1_16.zze().update("apps", v2_9, "app_id = ?", new String[] {p6}))) == 0) {
                v1_16.zzu.zzaV().zzb().zzb("Failed to update remote config (got 0). appId", com.google.android.gms.measurement.internal.zzgu.zzl(p6));
            }
        } catch (java.util.Map v7_9) {
            v1_16.zzu.zzaV().zzb().zzc("Error storing remote config. appId", com.google.android.gms.measurement.internal.zzgu.zzl(p6), v7_9);
        }
        v0_2.zzf();
        this.zzh.put(p6, ((com.google.android.gms.internal.measurement.zzgl) v0_2.zzbc()));
        return 1;
    }

    public final boolean zzj(String p3, String p4)
    {
        this.zzg();
        this.zzE(p3);
        if ((this.zzn(p3)) && (com.google.android.gms.measurement.internal.zzpp.zzZ(p4))) {
            return 1;
        } else {
            if ((this.zzo(p3)) && (com.google.android.gms.measurement.internal.zzpp.zzh(p4))) {
                return 1;
            } else {
                boolean v3_2 = ((java.util.Map) this.zzb.get(p3));
                if (!v3_2) {
                    return 0;
                } else {
                    boolean v3_4 = ((Boolean) v3_2.get(p4));
                    if (v3_4) {
                        return v3_4.booleanValue();
                    } else {
                        return 0;
                    }
                }
            }
        }
    }

    public final boolean zzk(String p3, String p4)
    {
        this.zzg();
        this.zzE(p3);
        if (!"ecommerce_purchase".equals(p4)) {
            if ((!"purchase".equals(p4)) && (!"refund".equals(p4))) {
                boolean v3_2 = ((java.util.Map) this.zzc.get(p3));
                if (!v3_2) {
                    return 0;
                } else {
                    boolean v3_4 = ((Boolean) v3_2.get(p4));
                    if (v3_4) {
                        return v3_4.booleanValue();
                    } else {
                        return 0;
                    }
                }
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final java.util.Set zzl(String p2)
    {
        this.zzg();
        this.zzE(p2);
        return ((java.util.Set) this.zza.get(p2));
    }

    public final int zzm(String p2, String p3)
    {
        this.zzg();
        this.zzE(p2);
        int v2_4 = ((java.util.Map) this.zzi.get(p2));
        if (v2_4 != 0) {
            int v2_6 = ((Integer) v2_4.get(p3));
            if (v2_6 != 0) {
                return v2_6.intValue();
            }
        }
        return 1;
    }

    public final boolean zzn(String p3)
    {
        return "1".equals(this.zza(p3, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzo(String p3)
    {
        return "1".equals(this.zza(p3, "measurement.upload.blacklist_public"));
    }

    public final boolean zzp(String p5)
    {
        this.zzg();
        this.zzE(p5);
        String v0_1 = this.zza;
        if (v0_1.get(p5) == null) {
            return 0;
        } else {
            if ((((java.util.Set) v0_1.get(p5)).contains("device_model")) || (((java.util.Set) v0_1.get(p5)).contains("device_info"))) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public final boolean zzq(String p5)
    {
        this.zzg();
        this.zzE(p5);
        String v0_1 = this.zza;
        if (v0_1.get(p5) == null) {
            return 0;
        } else {
            if ((((java.util.Set) v0_1.get(p5)).contains("os_version")) || (((java.util.Set) v0_1.get(p5)).contains("device_info"))) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public final boolean zzr(String p3)
    {
        this.zzg();
        this.zzE(p3);
        String v0_0 = this.zza;
        if ((v0_0.get(p3) == null) || (!((java.util.Set) v0_0.get(p3)).contains("user_id"))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzs(String p3)
    {
        this.zzg();
        this.zzE(p3);
        String v0_0 = this.zza;
        if ((v0_0.get(p3) == null) || (!((java.util.Set) v0_0.get(p3)).contains("google_signals"))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzt(String p3)
    {
        this.zzg();
        this.zzE(p3);
        String v0_0 = this.zza;
        if ((v0_0.get(p3) == null) || (!((java.util.Set) v0_0.get(p3)).contains("app_instance_id"))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzu(String p3)
    {
        this.zzg();
        this.zzE(p3);
        String v0_0 = this.zza;
        if ((v0_0.get(p3) == null) || (!((java.util.Set) v0_0.get(p3)).contains("enhanced_user_id"))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzv(String p4, com.google.android.gms.measurement.internal.zzjk p5)
    {
        this.zzg();
        this.zzE(p4);
        int v4_3 = this.zzx(p4);
        if (v4_3 != 0) {
            int v4_5 = v4_3.zza().iterator();
            while (v4_5.hasNext()) {
                com.google.android.gms.internal.measurement.zzfu v1_2 = ((com.google.android.gms.internal.measurement.zzfu) v4_5.next());
                if (p5 == com.google.android.gms.measurement.internal.zzht.zzJ(v1_2.zzb())) {
                    if (v1_2.zzc() != 2) {
                        break;
                    }
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public final com.google.android.gms.measurement.internal.zzjk zzw(String p3, com.google.android.gms.measurement.internal.zzjk p4)
    {
        this.zzg();
        this.zzE(p3);
        com.google.android.gms.measurement.internal.zzjk v3_4 = this.zzx(p3);
        if (v3_4 != null) {
            com.google.android.gms.measurement.internal.zzjk v3_6 = v3_4.zzb().iterator();
            while (v3_6.hasNext()) {
                com.google.android.gms.internal.measurement.zzfw v0_2 = ((com.google.android.gms.internal.measurement.zzfw) v3_6.next());
                if (p4 == com.google.android.gms.measurement.internal.zzht.zzJ(v0_2.zzb())) {
                    return com.google.android.gms.measurement.internal.zzht.zzJ(v0_2.zzc());
                }
            }
        }
        return 0;
    }

    public final com.google.android.gms.internal.measurement.zzgf zzx(String p2)
    {
        this.zzg();
        this.zzE(p2);
        com.google.android.gms.internal.measurement.zzgf v2_2 = this.zzb(p2);
        if ((v2_2 != null) && (v2_2.zzn())) {
            return v2_2.zzo();
        } else {
            return 0;
        }
    }

    public final boolean zzy(String p3)
    {
        this.zzg();
        this.zzE(p3);
        int v3_3 = this.zzx(p3);
        if (v3_3 != 0) {
            if ((v3_3.zzd()) && (!v3_3.zze())) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final java.util.SortedSet zzz(String p3)
    {
        this.zzg();
        this.zzE(p3);
        java.util.TreeSet v0_1 = new java.util.TreeSet();
        java.util.Iterator v3_2 = this.zzx(p3);
        if (v3_2 != null) {
            java.util.Iterator v3_1 = v3_2.zzc().iterator();
            while (v3_1.hasNext()) {
                v0_1.add(((com.google.android.gms.internal.measurement.zzgc) v3_1.next()).zza());
            }
        }
        return v0_1;
    }
}
