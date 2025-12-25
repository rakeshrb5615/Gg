package com.google.android.gms.measurement.internal;
final class zzad extends com.google.android.gms.measurement.internal.zzos {
    private String zza;
    private java.util.Set zzb;
    private java.util.Map zzc;
    private Long zzd;
    private Long zze;

    public zzad(com.google.android.gms.measurement.internal.zzpg p1)
    {
        super(p1);
        return;
    }

    private final com.google.android.gms.measurement.internal.zzy zzc(Integer p4)
    {
        if (!this.zzc.containsKey(p4)) {
            com.google.android.gms.measurement.internal.zzy v0_4 = new com.google.android.gms.measurement.internal.zzy(this, this.zza, 0);
            this.zzc.put(p4, v0_4);
            return v0_4;
        } else {
            return ((com.google.android.gms.measurement.internal.zzy) this.zzc.get(p4));
        }
    }

    private final boolean zzd(int p2, int p3)
    {
        boolean v2_5 = ((com.google.android.gms.measurement.internal.zzy) this.zzc.get(Integer.valueOf(p2)));
        if (v2_5) {
            return v2_5.zzc().get(p3);
        } else {
            return 0;
        }
    }

    public final java.util.List zzb(String p35, java.util.List p36, java.util.List p37, Long p38, Long p39, boolean p40)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p35);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p36);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p37);
        this.zza = p35;
        this.zzb = new java.util.HashSet();
        this.zzc = new r.e();
        this.zzd = p38;
        this.zze = p39;
        com.google.android.gms.internal.measurement.zzii v0_47 = p36.iterator();
        do {
            int v2_16;
            int v10_7 = 0;
            String[] v11_5 = 1;
            if (!v0_47.hasNext()) {
                v2_16 = 0;
            } else {
            }
            com.google.android.gms.internal.measurement.zzpu.zza();
            com.google.android.gms.internal.measurement.zzii v0_68 = this.zzu;
            boolean v12_6 = v0_68.zzc().zzp(this.zza, com.google.android.gms.measurement.internal.zzfy.zzaF);
            com.google.android.gms.internal.measurement.zzpu.zza();
            com.google.android.gms.measurement.internal.zzic v13_2 = v0_68.zzc().zzp(this.zza, com.google.android.gms.measurement.internal.zzfy.zzaE);
            if (v2_16 != 0) {
                String v3_22 = this.zzg.zzj();
                com.google.android.gms.measurement.internal.zzgs v4_32 = this.zza;
                v3_22.zzaw();
                v3_22.zzg();
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v4_32);
                com.google.android.gms.internal.measurement.zzii v0_93 = new android.content.ContentValues();
                v0_93.put("current_session_count", Integer.valueOf(0));
                try {
                    v3_22.zze().update("events", v0_93, "app_id = ?", new String[] {v4_32}));
                } catch (com.google.android.gms.internal.measurement.zzii v0_108) {
                    v3_22.zzu.zzaV().zzb().zzc("Error resetting session-scoped event counts. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v4_32), v0_108);
                }
            }
            int v10_6;
            com.google.android.gms.internal.measurement.zzii v0_44 = java.util.Collections.EMPTY_MAP;
            String v3_13 = "data";
            com.google.android.gms.measurement.internal.zzgs v4_17 = "audience_id";
            if ((v13_2 == null) || (!v12_6)) {
                v10_6 = v0_44;
            } else {
                com.google.android.gms.internal.measurement.zzik v6_7 = this.zzg.zzj();
                String v7_7 = this.zza;
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v7_7);
                Long v8_52 = new r.e();
                try {
                    int v5_1 = v6_7.zze().query("event_filters", new String[] {"audience_id", "data"}), "app_id=?", new String[] {v7_7}), 0, 0, 0);
                } catch (com.google.android.gms.internal.measurement.zzii v0_13) {
                    v5_1 = 0;
                    v6_7 = v6_7.zzu.zzaV().zzb();
                    v7_7 = com.google.android.gms.measurement.internal.zzgu.zzl(v7_7);
                    v6_7.zzc("Database error querying filters. appId", v7_7, v0_13);
                    v0_44 = java.util.Collections.EMPTY_MAP;
                    if (v5_1 == 0) {
                    } else {
                        v5_1.close();
                    }
                } catch (com.google.android.gms.internal.measurement.zzii v0_9) {
                    v5_1 = 0;
                    if (v5_1 != 0) {
                        v5_1.close();
                    }
                    throw v0_9;
                }
                if (!v5_1.moveToFirst()) {
                }
                while(true) {
                    com.google.android.gms.internal.measurement.zzii v0_40 = ((com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), v5_1.getBlob(v11_5))).zzbc());
                    if (v0_40.zzg()) {
                        int v10_4;
                        String[] v11_4 = Integer.valueOf(v5_1.getInt(v10_7));
                        int v16_4 = ((java.util.List) v8_52.get(v11_4));
                        if (v16_4 != 0) {
                            v10_4 = v16_4;
                        } else {
                            v10_4 = new java.util.ArrayList();
                            v8_52.put(v11_4, v10_4);
                        }
                        v10_4.add(v0_40);
                        if (!v5_1.moveToNext()) {
                            break;
                        }
                        v10_7 = 0;
                        v11_5 = 1;
                    } else {
                    }
                }
                v5_1.close();
                v10_6 = v8_52;
            }
            int v5_8 = this.zzg.zzj();
            com.google.android.gms.internal.measurement.zzik v6_8 = this.zza;
            v5_8.zzaw();
            v5_8.zzg();
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v6_8);
            try {
                Long v18_1;
                String v19_2;
                String[] v11_13;
                long v22_1 = 0;
                String v7_8 = v5_8.zze().query("audience_filter_values", new String[] {"audience_id", "current_results"}), "app_id=?", new String[] {v6_8}), 0, 0, 0);
                try {
                    java.util.List v17_1;
                    if (v7_8.moveToFirst()) {
                        Long v8_9 = new r.e();
                        while(true) {
                            int v16_6 = v7_8.getInt(0);
                            v8_9.put(Integer.valueOf(v16_6), ((com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), v7_8.getBlob(1))).zzbc()));
                            v17_1 = v2_16;
                            v18_1 = v3_13;
                            v19_2 = v4_17;
                            if (!v7_8.moveToNext()) {
                                break;
                            }
                            v2_16 = v17_1;
                            v3_13 = v18_1;
                            v4_17 = v19_2;
                        }
                        v7_8.close();
                        v11_13 = v8_9;
                        if (!v11_13.isEmpty()) {
                            java.util.List v17_2;
                            com.google.android.gms.internal.measurement.zzii v0_62;
                            int v2_23 = new java.util.HashSet(v11_13.keySet());
                            if (v17_1 == null) {
                                v17_2 = v2_23;
                                v0_62 = v11_13;
                            } else {
                                String v3_14 = this.zza;
                                com.google.android.gms.measurement.internal.zzgs v4_18 = this.zzg.zzj();
                                int v5_10 = this.zza;
                                v4_18.zzaw();
                                v4_18.zzg();
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v5_10);
                                com.google.android.gms.internal.measurement.zzii v0_65 = new r.e();
                                try {
                                    com.google.android.gms.internal.measurement.zzik v6_10 = v4_18.zze().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[] {v5_10, v5_10}));
                                } catch (com.google.android.gms.internal.measurement.zzii v0_67) {
                                    v6_10 = 0;
                                    v4_18 = v4_18.zzu.zzaV().zzb();
                                    v5_10 = com.google.android.gms.measurement.internal.zzgu.zzl(v5_10);
                                    v4_18.zzc("Database error querying scoped filters. appId", v5_10, v0_67);
                                    v0_65 = java.util.Collections.EMPTY_MAP;
                                    if (v6_10 == null) {
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v3_14);
                                        com.google.android.gms.common.internal.Preconditions.checkNotNull(v11_13);
                                        String v3_17 = new r.e();
                                        if (!v11_13.isEmpty()) {
                                            com.google.android.gms.measurement.internal.zzgs v4_23 = v11_13.keySet().iterator();
                                            while (v4_23.hasNext()) {
                                                java.util.List v17_3;
                                                int v16_8;
                                                com.google.android.gms.internal.measurement.zzii v21_2;
                                                int v5_14 = ((Integer) v4_23.next());
                                                v5_14.getClass();
                                                com.google.android.gms.internal.measurement.zzik v6_12 = ((com.google.android.gms.internal.measurement.zzii) v11_13.get(v5_14));
                                                String v7_18 = ((java.util.List) v0_65.get(v5_14));
                                                if ((v7_18 != null) && (!v7_18.isEmpty())) {
                                                    Long v8_16 = this.zzg;
                                                    v16_8 = v0_65;
                                                    v17_3 = v2_23;
                                                    com.google.android.gms.internal.measurement.zzii v0_70 = v8_16.zzp().zzq(v6_12.zzc(), v7_18);
                                                    if (v0_70.isEmpty()) {
                                                        v0_65 = v16_8;
                                                        v2_23 = v17_3;
                                                    } else {
                                                        int v2_29 = ((com.google.android.gms.internal.measurement.zzih) v6_12.zzcl());
                                                        v2_29.zzd();
                                                        v2_29.zzc(v0_70);
                                                        com.google.android.gms.internal.measurement.zzii v0_72 = v8_16.zzp().zzq(v6_12.zza(), v7_18);
                                                        v2_29.zzb();
                                                        v2_29.zza(v0_72);
                                                        com.google.android.gms.internal.measurement.zzii v0_74 = new java.util.ArrayList();
                                                        Long v8_19 = v6_12.zze().iterator();
                                                        while (v8_19.hasNext()) {
                                                            com.google.android.gms.internal.measurement.zzii v21_3 = v4_23;
                                                            com.google.android.gms.measurement.internal.zzgs v4_28 = ((com.google.android.gms.internal.measurement.zzhq) v8_19.next());
                                                            v22_1 = v8_19;
                                                            if (!v7_18.contains(Integer.valueOf(v4_28.zzb()))) {
                                                                v0_74.add(v4_28);
                                                            }
                                                            v4_23 = v21_3;
                                                            v8_19 = v22_1;
                                                        }
                                                        v21_2 = v4_23;
                                                        v2_29.zzf();
                                                        v2_29.zze(v0_74);
                                                        com.google.android.gms.internal.measurement.zzii v0_76 = new java.util.ArrayList();
                                                        com.google.android.gms.measurement.internal.zzgs v4_26 = v6_12.zzg().iterator();
                                                        while (v4_26.hasNext()) {
                                                            com.google.android.gms.internal.measurement.zzik v6_15 = ((com.google.android.gms.internal.measurement.zzik) v4_26.next());
                                                            if (!v7_18.contains(Integer.valueOf(v6_15.zzb()))) {
                                                                v0_76.add(v6_15);
                                                            }
                                                        }
                                                        v2_29.zzh();
                                                        v2_29.zzg(v0_76);
                                                        v3_17.put(v5_14, ((com.google.android.gms.internal.measurement.zzii) v2_29.zzbc()));
                                                    }
                                                } else {
                                                    v16_8 = v0_65;
                                                    v17_3 = v2_23;
                                                    v21_2 = v4_23;
                                                    v3_17.put(v5_14, v6_12);
                                                }
                                                v0_65 = v16_8;
                                                v2_23 = v17_3;
                                                v4_23 = v21_2;
                                            }
                                        }
                                        v17_2 = v2_23;
                                        v0_62 = v3_17;
                                    } else {
                                        v6_10.close();
                                    }
                                } catch (com.google.android.gms.internal.measurement.zzii v0_66) {
                                    int v5_11 = 0;
                                    if (v5_11 != 0) {
                                        v5_11.close();
                                    }
                                    throw v0_66;
                                }
                                if (!v6_10.moveToFirst()) {
                                    v0_65 = java.util.Collections.EMPTY_MAP;
                                }
                                do {
                                    String v7_12 = Integer.valueOf(v6_10.getInt(0));
                                    Long v8_13 = ((java.util.List) v0_65.get(v7_12));
                                    if (v8_13 == null) {
                                        v8_13 = new java.util.ArrayList();
                                        v0_65.put(v7_12, v8_13);
                                    }
                                    v8_13.add(Integer.valueOf(v6_10.getInt(1)));
                                } while(v6_10.moveToNext());
                            }
                            int v16_9 = v17_2.iterator();
                            while (v16_9.hasNext()) {
                                int v2_32 = ((Integer) v16_9.next());
                                v2_32.getClass();
                                String v3_21 = ((com.google.android.gms.internal.measurement.zzii) v0_62.get(v2_32));
                                com.google.android.gms.measurement.internal.zzgs v4_31 = new java.util.BitSet();
                                int v5_17 = new java.util.BitSet();
                                com.google.android.gms.internal.measurement.zzik v6_17 = new r.e();
                                if ((v3_21 != null) && (v3_21.zzf() != 0)) {
                                    String v7_21 = v3_21.zze().iterator();
                                    while (v7_21.hasNext()) {
                                        Long v8_27 = ((com.google.android.gms.internal.measurement.zzhq) v7_21.next());
                                        if (v8_27.zza()) {
                                            Long v8_28;
                                            int v20_5 = v0_62;
                                            com.google.android.gms.internal.measurement.zzii v0_82 = Integer.valueOf(v8_27.zzb());
                                            if (!v8_27.zzc()) {
                                                v8_28 = 0;
                                            } else {
                                                v8_28 = Long.valueOf(v8_27.zzd());
                                            }
                                            v6_17.put(v0_82, v8_28);
                                            v0_62 = v20_5;
                                        }
                                    }
                                }
                                int v20_6 = v0_62;
                                String v7_23 = new r.e();
                                if ((v3_21 != null) && (v3_21.zzh() != 0)) {
                                    com.google.android.gms.internal.measurement.zzii v0_85 = v3_21.zzg().iterator();
                                    while (v0_85.hasNext()) {
                                        Long v8_31 = ((com.google.android.gms.internal.measurement.zzik) v0_85.next());
                                        if ((v8_31.zza()) && (v8_31.zzd() > 0)) {
                                            com.google.android.gms.internal.measurement.zzii v21_5 = v0_85;
                                            long v22_2 = v3_21;
                                            v7_23.put(Integer.valueOf(v8_31.zzb()), Long.valueOf(v8_31.zze((v8_31.zzd() - 1))));
                                            v0_85 = v21_5;
                                            v3_21 = v22_2;
                                        }
                                    }
                                }
                                v22_1 = v3_21;
                                if (v22_1 != 0) {
                                    com.google.android.gms.internal.measurement.zzii v0_87 = 0;
                                    while (v0_87 < (v22_1.zzb() * 64)) {
                                        java.util.List v17_12;
                                        if (!com.google.android.gms.measurement.internal.zzpk.zzn(v22_1.zza(), v0_87)) {
                                            v17_12 = v12_6;
                                            v6_17.remove(Integer.valueOf(v0_87));
                                        } else {
                                            v17_12 = v12_6;
                                            this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", v2_32, Integer.valueOf(v0_87));
                                            v5_17.set(v0_87);
                                            if (!com.google.android.gms.measurement.internal.zzpk.zzn(v22_1.zzc(), v0_87)) {
                                            } else {
                                                v4_31.set(v0_87);
                                            }
                                        }
                                        v0_87++;
                                        v12_6 = v17_12;
                                    }
                                }
                                java.util.List v17_11 = v12_6;
                                String v3_28 = ((com.google.android.gms.internal.measurement.zzii) v11_13.get(v2_32));
                                if ((v13_2 != null) && (v17_11 != null)) {
                                    com.google.android.gms.internal.measurement.zzii v0_90 = ((java.util.List) v10_6.get(v2_32));
                                    if ((v0_90 != null) && ((this.zze != null) && (this.zzd != null))) {
                                        com.google.android.gms.internal.measurement.zzii v0_92 = v0_90.iterator();
                                        while (v0_92.hasNext()) {
                                            Long v8_36 = ((com.google.android.gms.internal.measurement.zzff) v0_92.next());
                                            boolean v12_7 = v8_36.zzb();
                                            com.google.android.gms.internal.measurement.zzii v21_6 = v0_92;
                                            v22_1 = (this.zze.longValue() / 1000);
                                            if (v8_36.zzj()) {
                                                v22_1 = (this.zzd.longValue() / 1000);
                                            }
                                            com.google.android.gms.internal.measurement.zzii v0_97 = Integer.valueOf(v12_7);
                                            if (v6_17.containsKey(v0_97)) {
                                                v6_17.put(v0_97, Long.valueOf(v22_1));
                                            }
                                            if (v7_23.containsKey(v0_97)) {
                                                v7_23.put(v0_97, Long.valueOf(v22_1));
                                            }
                                            v0_92 = v21_6;
                                        }
                                    }
                                }
                                Long v18_2 = v10_6;
                                int v10_8 = v18_1;
                                String v19_3 = v11_13;
                                String[] v11_14 = v19_2;
                                this.zzc.put(v2_32, new com.google.android.gms.measurement.internal.zzy(this, this.zza, v3_28, v4_31, v5_17, v6_17, v7_23, 0));
                                v18_1 = v10_8;
                                v10_6 = v18_2;
                                v19_2 = v11_14;
                                v11_13 = v19_3;
                                v12_6 = v17_11;
                                v0_62 = v20_6;
                            }
                        }
                        int v10_9 = v18_1;
                        String[] v11_15 = v19_2;
                        int v2_9 = "Skipping failed audience ID";
                        if (!p36.isEmpty()) {
                            String v3_38 = new com.google.android.gms.measurement.internal.zzz(this, 0);
                            com.google.android.gms.measurement.internal.zzgs v4_35 = new r.e();
                            int v5_20 = p36.iterator();
                            while (v5_20.hasNext()) {
                                com.google.android.gms.internal.measurement.zzii v0_105 = ((com.google.android.gms.internal.measurement.zzhs) v5_20.next());
                                String v19_4 = v3_38.zza(this.zza, v0_105);
                                if (v19_4 != null) {
                                    com.google.android.gms.internal.measurement.zzik v6_21 = this.zzg;
                                    String v7_26 = v6_21.zzj().zzaf(this.zza, v0_105, v19_4.zzd());
                                    v6_21.zzj().zzh(v7_26);
                                    if (p40 == null) {
                                        long v24_1;
                                        boolean v12_11 = v7_26.zzc;
                                        Long v8_46 = v19_4.zzd();
                                        com.google.android.gms.internal.measurement.zzii v0_110 = ((java.util.Map) v4_35.get(v8_46));
                                        if (v0_110 != null) {
                                            v24_1 = v3_38;
                                            p36 = v5_20;
                                            v22_1 = v7_26;
                                        } else {
                                            com.google.android.gms.internal.measurement.zzik v6_22 = v6_21.zzj();
                                            v24_1 = v3_38;
                                            String v3_39 = this.zza;
                                            v6_22.zzaw();
                                            v6_22.zzg();
                                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v3_39);
                                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v8_46);
                                            p36 = v5_20;
                                            int v5_22 = new r.e();
                                            try {
                                                int v16_10 = v3_39;
                                                try {
                                                    String v3_42 = v6_22.zze().query("event_filters", new String[] {v11_15, v10_9}), "app_id=? AND event_name=?", new String[] {v3_39, v8_46}), 0, 0, 0);
                                                    try {
                                                        Long v18_3;
                                                        if (!v3_42.moveToFirst()) {
                                                            v18_3 = v3_42;
                                                            v22_1 = v7_26;
                                                            v0_110 = java.util.Collections.EMPTY_MAP;
                                                            v18_3.close();
                                                            v4_35.put(v8_46, v0_110);
                                                            String v3_53 = v0_110.keySet().iterator();
                                                            while (v3_53.hasNext()) {
                                                                int v5_27 = ((Integer) v3_53.next());
                                                                com.google.android.gms.internal.measurement.zzik v6_24 = v5_27.intValue();
                                                                if (!this.zzb.contains(v5_27)) {
                                                                    String v7_36 = ((java.util.List) v0_110.get(v5_27)).iterator();
                                                                    Long v8_47 = 1;
                                                                    while (v7_36.hasNext()) {
                                                                        Long v8_49 = ((com.google.android.gms.internal.measurement.zzff) v7_36.next());
                                                                        com.google.android.gms.measurement.internal.zzaa v25_1 = v0_110;
                                                                        Long v26_1 = v3_53;
                                                                        int v16_12 = new com.google.android.gms.measurement.internal.zzaa(this, this.zza, v6_24, v8_49);
                                                                        int v20_7 = v12_11;
                                                                        v8_47 = v16_12.zzd(this.zzd, this.zze, v19_4, v20_7, v22_1, this.zzd(v6_24, v8_49.zzb()));
                                                                        if (v8_47 == null) {
                                                                            this.zzb.add(v5_27);
                                                                        } else {
                                                                            this.zzc(v5_27).zza(v16_12);
                                                                            v12_11 = v20_7;
                                                                            v0_110 = v25_1;
                                                                            v3_53 = v26_1;
                                                                        }
                                                                        if (v8_47 == null) {
                                                                            this.zzb.add(v5_27);
                                                                        }
                                                                        v12_11 = v20_7;
                                                                        v0_110 = v25_1;
                                                                        v3_53 = v26_1;
                                                                    }
                                                                    v25_1 = v0_110;
                                                                    v26_1 = v3_53;
                                                                    v20_7 = v12_11;
                                                                } else {
                                                                    this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", v5_27);
                                                                }
                                                            }
                                                            v5_20 = p36;
                                                            v3_38 = v24_1;
                                                        } else {
                                                            v22_1 = v7_26;
                                                            while(true) {
                                                                com.google.android.gms.internal.measurement.zzii v0_118 = ((com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), v3_42.getBlob(1))).zzbc());
                                                                String v3_47;
                                                                String v7_31 = Integer.valueOf(v3_42.getInt(0));
                                                                java.util.List v17_15 = ((java.util.List) v5_22.get(v7_31));
                                                                if (v17_15 != null) {
                                                                    v18_3 = v3_42;
                                                                    v3_47 = v17_15;
                                                                } else {
                                                                    v18_3 = v3_42;
                                                                    v3_47 = new java.util.ArrayList();
                                                                    v5_22.put(v7_31, v3_47);
                                                                }
                                                                v3_47.add(v0_118);
                                                                if (!v18_3.moveToNext()) {
                                                                    break;
                                                                }
                                                                v3_42 = v18_3;
                                                            }
                                                            v18_3.close();
                                                            v0_110 = v5_22;
                                                        }
                                                        int v5_23 = v18_3;
                                                        try {
                                                            v6_22.zzu.zzaV().zzb().zzc("Database error querying filters. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v16_10), com.google.android.gms.internal.measurement.zzii v0_111);
                                                            v0_110 = java.util.Collections.EMPTY_MAP;
                                                        } catch (com.google.android.gms.internal.measurement.zzii v0_112) {
                                                            if (v5_23 != 0) {
                                                                v5_23.close();
                                                            }
                                                            throw v0_112;
                                                        }
                                                        if (v5_23 == 0) {
                                                        } else {
                                                            v5_23.close();
                                                        }
                                                    } catch (com.google.android.gms.internal.measurement.zzii v0_111) {
                                                        v18_3 = v3_42;
                                                        v22_1 = v7_26;
                                                    }
                                                } catch (com.google.android.gms.internal.measurement.zzii v0_111) {
                                                    v22_1 = v7_26;
                                                    v5_23 = 0;
                                                }
                                            } catch (com.google.android.gms.internal.measurement.zzii v0_111) {
                                                v16_10 = v3_39;
                                            } catch (com.google.android.gms.internal.measurement.zzii v0_112) {
                                                v5_23 = 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (p40 != null) {
                            return new java.util.ArrayList();
                        } else {
                            if (!p37.isEmpty()) {
                                String v3_4 = new r.e();
                                com.google.android.gms.measurement.internal.zzgs v4_3 = p37.iterator();
                                while (v4_3.hasNext()) {
                                    int v5_29 = ((com.google.android.gms.internal.measurement.zziu) v4_3.next());
                                    com.google.android.gms.internal.measurement.zzik v6_29 = v5_29.zzc();
                                    com.google.android.gms.internal.measurement.zzii v0_2 = ((java.util.Map) v3_4.get(v6_29));
                                    if (v0_2 != null) {
                                        p36 = v4_3;
                                    } else {
                                        String v7_0 = this.zzg.zzj();
                                        Long v8_0 = this.zza;
                                        v7_0.zzaw();
                                        v7_0.zzg();
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v8_0);
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v6_29);
                                        boolean v12_13 = new r.e();
                                        try {
                                            com.google.android.gms.measurement.internal.zzic v13_3 = v7_0.zze().query("property_filters", new String[] {v11_15, v10_9}), "app_id=? AND property_name=?", new String[] {v8_0, v6_29}), 0, 0, 0);
                                            try {
                                                if (!v13_3.moveToFirst()) {
                                                    p36 = v4_3;
                                                    int v16_0 = v8_0;
                                                    v0_2 = java.util.Collections.EMPTY_MAP;
                                                    v13_3.close();
                                                    v3_4.put(v6_29, v0_2);
                                                    com.google.android.gms.measurement.internal.zzgs v4_5 = v0_2.keySet().iterator();
                                                    while (v4_5.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zzik v6_2 = ((Integer) v4_5.next());
                                                        String v7_1 = v6_2.intValue();
                                                        if (!this.zzb.contains(v6_2)) {
                                                            Long v8_5 = ((java.util.List) v0_2.get(v6_2)).iterator();
                                                            boolean v12_0 = 1;
                                                            while (v8_5.hasNext()) {
                                                                java.util.ArrayList v40_1;
                                                                int v16_1;
                                                                boolean v12_2 = ((com.google.android.gms.internal.measurement.zzfn) v8_5.next());
                                                                com.google.android.gms.measurement.internal.zzic v13_1 = this.zzu;
                                                                boolean v37_1 = v0_2;
                                                                if (!android.util.Log.isLoggable(v13_1.zzaV().zzn(), 2)) {
                                                                    v16_1 = v2_9;
                                                                    v40_1 = v3_4;
                                                                } else {
                                                                    int v14_3;
                                                                    com.google.android.gms.internal.measurement.zzii v0_8 = v13_1.zzaV().zzk();
                                                                    if (!v12_2.zza()) {
                                                                        v14_3 = 0;
                                                                    } else {
                                                                        v14_3 = Integer.valueOf(v12_2.zzb());
                                                                    }
                                                                    v16_1 = v2_9;
                                                                    v40_1 = v3_4;
                                                                    v0_8.zzd("Evaluating filter. audience, filter, property", v6_2, v14_3, v13_1.zzl().zzc(v12_2.zzc()));
                                                                    v13_1.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(v12_2));
                                                                }
                                                                if ((v12_2.zza()) && (v12_2.zzb() <= 256)) {
                                                                    com.google.android.gms.internal.measurement.zzii v0_17 = new com.google.android.gms.measurement.internal.zzac(this, this.zza, v7_1, v12_2);
                                                                    v12_0 = v0_17.zzd(this.zzd, this.zze, v5_29, this.zzd(v7_1, v12_2.zzb()));
                                                                    if (!v12_0) {
                                                                        this.zzb.add(v6_2);
                                                                        if (!v12_0) {
                                                                            this.zzb.add(v6_2);
                                                                        }
                                                                    } else {
                                                                        this.zzc(v6_2).zza(v0_17);
                                                                        v0_2 = v37_1;
                                                                        v3_4 = v40_1;
                                                                        v2_9 = v16_1;
                                                                    }
                                                                } else {
                                                                    String v3_6;
                                                                    com.google.android.gms.internal.measurement.zzii v0_20 = v13_1.zzaV().zze();
                                                                    int v2_11 = com.google.android.gms.measurement.internal.zzgu.zzl(this.zza);
                                                                    if (!v12_2.zza()) {
                                                                        v3_6 = 0;
                                                                    } else {
                                                                        v3_6 = Integer.valueOf(v12_2.zzb());
                                                                    }
                                                                    v0_20.zzc("Invalid property filter ID. appId, id", v2_11, String.valueOf(v3_6));
                                                                }
                                                                v0_2 = v37_1;
                                                                v3_4 = v40_1;
                                                                v2_9 = v16_1;
                                                            }
                                                            v37_1 = v0_2;
                                                            v16_1 = v2_9;
                                                            v40_1 = v3_4;
                                                        } else {
                                                            this.zzu.zzaV().zzk().zzb(v2_9, v6_2);
                                                            break;
                                                        }
                                                    }
                                                    v4_3 = p36;
                                                }
                                                while(true) {
                                                    com.google.android.gms.internal.measurement.zzii v0_140 = ((com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) com.google.android.gms.measurement.internal.zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), v13_3.getBlob(1))).zzbc());
                                                    com.google.android.gms.measurement.internal.zzgs v4_40;
                                                    int v14_10 = Integer.valueOf(v13_3.getInt(0));
                                                    int v16_17 = ((java.util.List) v12_13.get(v14_10));
                                                    if (v16_17 != 0) {
                                                        p36 = v4_3;
                                                        v4_40 = v16_17;
                                                    } else {
                                                        p36 = v4_3;
                                                        v4_40 = new java.util.ArrayList();
                                                        v12_13.put(v14_10, v4_40);
                                                    }
                                                    v4_40.add(v0_140);
                                                    v16_0 = v8_0;
                                                    if (!v13_3.moveToNext()) {
                                                        break;
                                                    }
                                                    v4_3 = p36;
                                                    v8_0 = v16_0;
                                                }
                                                v13_3.close();
                                                v0_2 = v12_13;
                                            } catch (com.google.android.gms.internal.measurement.zzii v0_1) {
                                                com.google.android.gms.measurement.internal.zzgs v4_2 = v7_0.zzu.zzaV().zzb();
                                                v7_0 = com.google.android.gms.measurement.internal.zzgu.zzl(v16_0);
                                                v4_2.zzc("Database error querying filters. appId", v7_0, v0_1);
                                                v0_2 = java.util.Collections.EMPTY_MAP;
                                                if (v13_3 == null) {
                                                }
                                            }
                                        } catch (com.google.android.gms.internal.measurement.zzii v0_1) {
                                            p36 = v4_3;
                                            v16_0 = v8_0;
                                            v13_3 = 0;
                                        } catch (com.google.android.gms.internal.measurement.zzii v0_3) {
                                            int v5_0 = 0;
                                            if (v5_0 != 0) {
                                                v5_0.close();
                                            }
                                            throw v0_3;
                                        }
                                    }
                                }
                            }
                            int v2_13 = new java.util.ArrayList();
                            com.google.android.gms.internal.measurement.zzii v0_27 = this.zzc.keySet();
                            v0_27.removeAll(this.zzb);
                            String v3_10 = v0_27.iterator();
                            while (v3_10.hasNext()) {
                                com.google.android.gms.internal.measurement.zzii v0_30 = ((Integer) v3_10.next());
                                com.google.android.gms.measurement.internal.zzgs v4_6 = v0_30.intValue();
                                int v5_4 = ((com.google.android.gms.measurement.internal.zzy) this.zzc.get(v0_30));
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(v5_4);
                                com.google.android.gms.measurement.internal.zzgs v4_7 = v5_4.zzb(v4_6);
                                v2_13.add(v4_7);
                                int v5_6 = this.zzg.zzj();
                                com.google.android.gms.internal.measurement.zzik v6_3 = this.zza;
                                com.google.android.gms.measurement.internal.zzgs v4_8 = v4_7.zzc();
                                v5_6.zzaw();
                                v5_6.zzg();
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v6_3);
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_8);
                                com.google.android.gms.measurement.internal.zzgs v4_9 = v4_8.zzcc();
                                String v7_4 = new android.content.ContentValues();
                                v7_4.put("app_id", v6_3);
                                v7_4.put(v11_15, v0_30);
                                v7_4.put("current_results", v4_9);
                                try {
                                    try {
                                        if (v5_6.zze().insertWithOnConflict("audience_filter_values", 0, v7_4, 5) == -1) {
                                            v5_6.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", com.google.android.gms.measurement.internal.zzgu.zzl(v6_3));
                                        }
                                    } catch (com.google.android.gms.internal.measurement.zzii v0_34) {
                                        v5_6.zzu.zzaV().zzb().zzc("Error storing filter results. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v6_3), v0_34);
                                    }
                                } catch (com.google.android.gms.internal.measurement.zzii v0_34) {
                                }
                            }
                            return v2_13;
                        }
                    } else {
                        v7_8.close();
                        v11_13 = java.util.Collections.EMPTY_MAP;
                        v17_1 = v2_16;
                        v18_1 = "data";
                        v19_2 = "audience_id";
                    }
                } catch (com.google.android.gms.internal.measurement.zzii v0_49) {
                    v17_1 = v2_16;
                    v18_1 = v3_13;
                }
                v19_2 = v4_17;
                v5_8.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v6_8), v0_49);
                if (v7_8 != null) {
                    v7_8.close();
                }
                v11_13 = java.util.Collections.EMPTY_MAP;
            } catch (com.google.android.gms.internal.measurement.zzii v0_49) {
                v17_1 = v2_16;
                v18_1 = "data";
                v19_2 = "audience_id";
                v7_8 = 0;
            } catch (com.google.android.gms.internal.measurement.zzii v0_48) {
                int v5_9 = 0;
                if (v5_9 != 0) {
                    v5_9.close();
                }
                throw v0_48;
            } catch (com.google.android.gms.internal.measurement.zzii v0_48) {
                v5_9 = v7_8;
            }
        } while(!"_s".equals(((com.google.android.gms.internal.measurement.zzhs) v0_47.next()).zzd()));
        v2_16 = 1;
    }

    public final boolean zzbb()
    {
        return 0;
    }
}
