package com.google.android.gms.measurement.internal;
final class zzit implements java.util.concurrent.Callable {
    final synthetic com.google.android.gms.measurement.internal.zzbg zza;
    final synthetic String zzb;
    final synthetic com.google.android.gms.measurement.internal.zzjd zzc;

    public zzit(com.google.android.gms.measurement.internal.zzjd p1, com.google.android.gms.measurement.internal.zzbg p2, String p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final bridge synthetic Object call()
    {
        Object v2_0 = this.zzc;
        v2_0.zzL().zzZ();
        Object v2_11 = v2_0.zzL().zzn();
        v2_11.zzg();
        String v3_1 = v2_11.zzu;
        com.google.android.gms.measurement.internal.zzic.zzL();
        com.google.android.gms.measurement.internal.zzh v4_0 = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_0);
        String v6_0 = this.zzb;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v6_0);
        boolean v5_8 = v4_0.zza;
        if (("_iap".equals(v5_8)) || ("_iapx".equals(v5_8))) {
            boolean v5_18 = v2_11.zzg;
            long v7_4 = com.google.android.gms.internal.measurement.zzib.zzh();
            v5_18.zzj().zzb();
            try {
                java.io.IOException v0_31;
                long v9_2 = v5_18.zzj().zzu(v6_0);
            } catch (java.io.IOException v0_6) {
                com.google.android.gms.measurement.internal.zzgs v1_1 = v2_11;
                v1_1.zzg.zzj().zzd();
                throw v0_6;
            }
            if (v9_2 != 0) {
                if (v9_2.zzD()) {
                    com.google.android.gms.internal.measurement.zzhv v11_1 = com.google.android.gms.internal.measurement.zzid.zzaE();
                    v11_1.zza(1);
                    v11_1.zzC("android");
                    if (!android.text.TextUtils.isEmpty(v9_2.zzc())) {
                        v11_1.zzL(v9_2.zzc());
                    }
                    if (!android.text.TextUtils.isEmpty(v9_2.zzv())) {
                        v11_1.zzJ(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v9_2.zzv())));
                    }
                    if (!android.text.TextUtils.isEmpty(v9_2.zzr())) {
                        v11_1.zzM(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v9_2.zzr())));
                    }
                    if (v9_2.zzt() != -2147483648) {
                        v11_1.zzaj(((int) v9_2.zzt()));
                    }
                    v11_1.zzN(v9_2.zzx());
                    v11_1.zzar(v9_2.zzB());
                    String v13_36 = v9_2.zzf();
                    if (!android.text.TextUtils.isEmpty(v13_36)) {
                        v11_1.zzad(v13_36);
                    }
                    v11_1.zzay(v9_2.zzak());
                    String v13_2 = v2_11.zzg.zzB(v6_0);
                    v11_1.zzY(v9_2.zzz());
                    if ((v3_1.zzB()) && ((v2_11.zzu.zzc().zzC(v11_1.zzK())) && ((v13_2.zzo(com.google.android.gms.measurement.internal.zzjk.zza)) && (!android.text.TextUtils.isEmpty(0))))) {
                        v11_1.zzam(0);
                    }
                    v11_1.zzat(v13_2.zzk());
                    if ((!v13_2.zzo(com.google.android.gms.measurement.internal.zzjk.zza)) || (!v9_2.zzac())) {
                        String v3_20 = v2_11.zzu;
                        v3_20.zzu().zzw();
                        v11_1.zzF(android.os.Build.MODEL);
                        v3_20.zzu().zzw();
                        v11_1.zzE(android.os.Build$VERSION.RELEASE);
                        v11_1.zzI(((int) v3_20.zzu().zzb()));
                        v11_1.zzH(v3_20.zzu().zzc());
                        try {
                            if ((v13_2.zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) && (v9_2.zzd() != null)) {
                                v11_1.zzW(com.google.android.gms.measurement.internal.zzlp.zzc(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v9_2.zzd())), Long.toString(v4_0.zzd)));
                            }
                        } catch (java.io.IOException v0_4) {
                            v1_1 = v2_11;
                            try {
                                v1_1.zzu.zzaV().zzj().zzb("app instance id encryption failed", v0_4.getMessage());
                                int v8_0 = new byte[0];
                                java.io.IOException v0_3 = v1_1.zzg;
                            } catch (java.io.IOException v0_6) {
                            }
                            v0_3.zzj().zzd();
                        }
                        if (!android.text.TextUtils.isEmpty(v9_2.zzl())) {
                            v11_1.zzah(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(v9_2.zzl())));
                        }
                        long v14_5 = v9_2.zzc();
                        String v3_36 = v2_11.zzg;
                        boolean v5_17 = v3_36.zzj().zzn(v14_5);
                        String v13_4 = v5_17.iterator();
                        while (v13_4.hasNext()) {
                            long v15_1 = ((com.google.android.gms.measurement.internal.zzpn) v13_4.next());
                            if (!"_lte".equals(v15_1.zzc)) {
                                long v10 = 0;
                            } else {
                            }
                            if ((v15_1 == 0) || (v15_1.zze == null)) {
                                String v13_6 = new com.google.android.gms.measurement.internal.zzpn(v14_5, "auto", "_lte", v2_11.zzu.zzaZ().currentTimeMillis(), Long.valueOf(0));
                                v5_17.add(v13_6);
                                v3_36.zzj().zzl(v13_6);
                            }
                            int v8_9 = new com.google.android.gms.internal.measurement.zziu[v5_17.size()];
                            long v10_1 = 0;
                            while (v10_1 < v5_17.size()) {
                                String v13_18 = com.google.android.gms.internal.measurement.zziu.zzm();
                                v13_18.zzb(((com.google.android.gms.measurement.internal.zzpn) v5_17.get(v10_1)).zzc);
                                v13_18.zza(((com.google.android.gms.measurement.internal.zzpn) v5_17.get(v10_1)).zzd);
                                v3_36.zzp().zzc(v13_18, ((com.google.android.gms.measurement.internal.zzpn) v5_17.get(v10_1)).zze);
                                v8_9[v10_1] = ((com.google.android.gms.internal.measurement.zziu) v13_18.zzbc());
                                v10_1++;
                            }
                            v11_1.zzq(java.util.Arrays.asList(v8_9));
                            boolean v5_20 = v2_11.zzg;
                            v5_20.zzI(v9_2, v11_1);
                            v5_20.zzJ(v9_2, v11_1);
                            int v8_10 = com.google.android.gms.measurement.internal.zzgv.zza(v4_0);
                            long v10_2 = v2_11.zzu;
                            long v14_6 = v8_10.zzd;
                            v10_2.zzk().zzI(v14_6, v3_36.zzj().zzU(v6_0));
                            v10_2.zzk().zzG(v8_10, v10_2.zzc().zzd(v6_0));
                            v14_6.putLong("_c", 1);
                            v10_2.zzaV().zzj().zza("Marking in-app purchase as real-time");
                            v14_6.putLong("_r", 1);
                            long v15_9 = v4_0.zzc;
                            v14_6.putString("_o", v15_9);
                            if (v10_2.zzk().zzaa(v11_1.zzK(), v9_2.zzay())) {
                                int v8_17 = v10_2.zzk();
                                String v13_11 = Long.valueOf(1);
                                v8_17.zzM(v14_6, "_dbg", v13_11);
                                v10_2.zzk().zzM(v14_6, "_r", v13_11);
                            }
                            long v28_0;
                            com.google.android.gms.internal.measurement.zzhz v29_0;
                            int v30;
                            com.google.android.gms.measurement.internal.zzpk v12_3;
                            long v15_10;
                            com.google.android.gms.measurement.internal.zzh v24;
                            com.google.android.gms.internal.measurement.zzic v25;
                            boolean v5_21;
                            boolean v16_1;
                            long v26;
                            com.google.android.gms.measurement.internal.zzbc v27;
                            int v8_19 = v7_4;
                            long v7_5 = v4_0.zza;
                            java.io.IOException v0_9 = v3_36.zzj().zzf(v6_0, v7_5);
                            if (v0_9 != null) {
                                v27 = v5_20;
                                v24 = v9_2;
                                v26 = v10_2;
                                v25 = v11_1;
                                v28_0 = v14_6;
                                v29_0 = v15_9;
                                v16_1 = 1;
                                v30 = 0;
                                v15_10 = v8_19;
                                int v8_20 = v0_9.zzf;
                                v5_21 = v0_9.zza(v4_0.zzd);
                                v12_3 = v8_20;
                            } else {
                                v24 = v9_2;
                                v26 = v10_2;
                                v25 = v11_1;
                                v27 = v5_20;
                                v30 = 0;
                                String v32_0 = v8_19;
                                v28_0 = v14_6;
                                v29_0 = v15_9;
                                v5_21 = new com.google.android.gms.measurement.internal.zzbc(v6_0, v7_5, 0, 0, 0, v4_0.zzd, 0, 0, 0, 0, 0);
                                v16_1 = 1;
                                v12_3 = 0;
                                v15_10 = v32_0;
                            }
                            java.io.IOException v0_12 = v5_21;
                            v3_36.zzj().zzh(v0_12);
                            int v8_22 = v6_0;
                            int v17_3 = v2_11;
                            long v9_3 = v7_5;
                            Object v2_5 = v16_1;
                            com.google.android.gms.measurement.internal.zzh v4_2 = v24;
                            com.google.android.gms.measurement.internal.zzgs v1_3 = v25;
                            boolean v16_3 = v3_36;
                            String v3_38 = v27;
                            boolean v5_25 = new com.google.android.gms.measurement.internal.zzbb(v2_11.zzu, v29_0, v8_22, v9_3, v4_0.zzd, v12_3, v28_0);
                            String v6_2 = v8_22;
                            long v7_7 = v9_3;
                            int v8_23 = com.google.android.gms.internal.measurement.zzhs.zzk();
                            v8_23.zzo(v5_25.zzd);
                            v8_23.zzl(v5_25.zzb);
                            v8_23.zzq(v5_25.zze);
                            boolean v5_26 = v5_25.zzf;
                            long v9_8 = new com.google.android.gms.measurement.internal.zzbd(v5_26);
                            while (v9_8.hasNext()) {
                                long v10_9 = v9_8.zza();
                                com.google.android.gms.internal.measurement.zzhv v11_2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                v11_2.zzb(v10_9);
                                long v10_10 = v5_26.zza(v10_9);
                                if (v10_10 != 0) {
                                    v16_3.zzp().zzd(v11_2, v10_10);
                                    v8_23.zzg(v11_2);
                                }
                                v5_18.zzj().zzd();
                                return v0_31;
                            }
                            v1_3.zzg(v8_23);
                            boolean v5_27 = com.google.android.gms.internal.measurement.zzig.zza();
                            long v9_9 = com.google.android.gms.internal.measurement.zzhu.zza();
                            v9_9.zzb(v0_12.zzc);
                            v9_9.zza(v7_7);
                            v5_27.zza(v9_9);
                            v1_3.zzap(v5_27);
                            v1_3.zzaf(v16_3.zzm().zzb(v4_2.zzc(), java.util.Collections.EMPTY_LIST, v1_3.zzk(), Long.valueOf(v8_23.zzn()), Long.valueOf(v8_23.zzn()), 0));
                            if (v8_23.zzm()) {
                                v1_3.zzv(v8_23.zzn());
                                v1_3.zzx(v8_23.zzn());
                            }
                            long v7_9 = v4_2.zzp();
                            java.io.IOException v0_15 = v7_9 cmp 0;
                            if (v0_15 != null) {
                                v1_3.zzA(v7_9);
                            }
                            long v9_13 = v4_2.zzn();
                            if (v9_13 == 0) {
                                if (v0_15 != null) {
                                    v1_3.zzy(v7_9);
                                }
                            } else {
                                v1_3.zzy(v9_13);
                            }
                            java.io.IOException v0_16 = v4_2.zzh();
                            com.google.android.gms.internal.measurement.zzrb.zza();
                            if ((v26.zzc().zzp(v6_2, com.google.android.gms.measurement.internal.zzfy.zzaM)) && (v0_16 != null)) {
                                v1_3.zzau(v0_16);
                            }
                            v4_2.zzL();
                            v1_3.zzZ(((int) v4_2.zzG()));
                            v26.zzc().zzi();
                            v1_3.zzO(133005);
                            v1_3.zzs(v26.zzaZ().currentTimeMillis());
                            v1_3.zzae(v2_5);
                            v3_38.zzS(v1_3.zzK(), v1_3);
                            v15_10.zze(v1_3);
                            v4_2.zzo(v1_3.zzu());
                            v4_2.zzq(v1_3.zzw());
                            v16_3.zzj().zzv(v4_2, 0, 0);
                            v16_3.zzj().zzc();
                            v16_3.zzj().zzd();
                            try {
                                return v16_3.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) v15_10.zzbc()).zzcc());
                            } catch (java.io.IOException v0_27) {
                                v17_3.zzu.zzaV().zzb().zzc("Data loss. Failed to bundle and serialize. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v6_2), v0_27);
                                v8_0 = v30;
                            }
                        }
                        v15_1 = 0;
                    } else {
                        String v3_13 = v5_18.zzq().zzc(v9_2.zzc(), v13_2);
                        if ((!v9_2.zzac()) || (android.text.TextUtils.isEmpty(((CharSequence) v3_13.first)))) {
                        } else {
                            try {
                                v11_1.zzQ(com.google.android.gms.measurement.internal.zzlp.zzc(((String) v3_13.first), Long.toString(v4_0.zzd)));
                            } catch (java.io.IOException v0_1) {
                                v2_11.zzu.zzaV().zzj().zzb("Resettable device id encryption failed", v0_1.getMessage());
                                v8_0 = new byte[0];
                                v0_3 = v2_11.zzg;
                            }
                            String v3_17 = v3_13.second;
                            if (v3_17 == null) {
                            } else {
                                v11_1.zzT(((Boolean) v3_17).booleanValue());
                            }
                        }
                    }
                    return v8_0;
                } else {
                    v2_11.zzu.zzaV().zzj().zzb("Log and bundle disabled. package_name", v6_0);
                    v0_31 = new byte[0];
                }
            } else {
                v2_11.zzu.zzaV().zzj().zzb("Log and bundle not available. package_name", v6_0);
                v0_31 = new byte[0];
            }
            v5_18.zzj().zzd();
            return v0_31;
        } else {
            v2_11.zzu.zzaV().zzj().zzc("Generating a payload for this event is not available. package_name, event_name", v6_0, v5_8);
            return 0;
        }
    }
}
