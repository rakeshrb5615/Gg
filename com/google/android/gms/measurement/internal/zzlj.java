package com.google.android.gms.measurement.internal;
public final class zzlj extends com.google.android.gms.measurement.internal.zzg {
    protected com.google.android.gms.measurement.internal.zzky zza;
    final com.google.android.gms.measurement.internal.zzx zzb;
    protected boolean zzc;
    private com.google.android.gms.measurement.internal.zzjp zzd;
    private final java.util.Set zze;
    private boolean zzf;
    private final java.util.concurrent.atomic.AtomicReference zzg;
    private final Object zzh;
    private boolean zzi;
    private int zzj;
    private com.google.android.gms.measurement.internal.zzay zzk;
    private com.google.android.gms.measurement.internal.zzay zzl;
    private java.util.PriorityQueue zzm;
    private boolean zzn;
    private com.google.android.gms.measurement.internal.zzjl zzo;
    private final java.util.concurrent.atomic.AtomicLong zzp;
    private long zzq;
    private com.google.android.gms.measurement.internal.zzay zzr;
    private android.content.SharedPreferences$OnSharedPreferenceChangeListener zzs;
    private com.google.android.gms.measurement.internal.zzay zzt;
    private final com.google.android.gms.measurement.internal.zzpo zzv;

    public zzlj(com.google.android.gms.measurement.internal.zzic p4)
    {
        super(p4);
        super.zze = new java.util.concurrent.CopyOnWriteArraySet();
        super.zzh = new Object();
        super.zzi = 0;
        super.zzj = 1;
        super.zzc = 1;
        super.zzv = new com.google.android.gms.measurement.internal.zzkn(super);
        super.zzg = new java.util.concurrent.atomic.AtomicReference();
        super.zzo = com.google.android.gms.measurement.internal.zzjl.zza;
        super.zzq = -1;
        super.zzp = new java.util.concurrent.atomic.AtomicLong(0);
        super.zzb = new com.google.android.gms.measurement.internal.zzx(p4);
        return;
    }

    private final com.google.android.gms.measurement.internal.zzlr zzar(com.google.android.gms.measurement.internal.zzom p11)
    {
        try {
            java.net.URL v5 = new java.net.URI(p11.zzc).toURL();
            com.google.android.gms.measurement.internal.zzgs v1_5 = new java.util.concurrent.atomic.AtomicReference();
            long v4_0 = this.zzu.zzv().zzl();
            com.google.android.gms.common.util.Clock v0_2 = this.zzu;
            long v2_1 = v0_2.zzaV().zzk();
            com.google.android.gms.measurement.internal.zzlo v3_0 = Long.valueOf(p11.zza);
            v2_1.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", v3_0, p11.zzc, Integer.valueOf(p11.zzb.length));
        } catch (com.google.android.gms.common.util.Clock v0_4) {
            this.zzu.zzaV().zzb().zzd("[sgtm] Bad upload url for row_id", p11.zzc, Long.valueOf(p11.zza), v0_4);
            return com.google.android.gms.measurement.internal.zzlr.zzc;
        } catch (com.google.android.gms.common.util.Clock v0_4) {
            this.zzu.zzaV().zzb().zzd("[sgtm] Bad upload url for row_id", p11.zzc, Long.valueOf(p11.zza), v0_4);
            return com.google.android.gms.measurement.internal.zzlr.zzc;
        }
        if (!android.text.TextUtils.isEmpty(p11.zzg)) {
            v0_2.zzaV().zzk().zzc("[sgtm] Uploading data from app. row_id", v3_0, p11.zzg);
        }
        java.util.HashMap v7_5 = new java.util.HashMap();
        long v2_7 = p11.zzd;
        com.google.android.gms.measurement.internal.zzlo v3_4 = v2_7.keySet().iterator();
        while (v3_4.hasNext()) {
            long v6_1 = ((String) v3_4.next());
            com.google.android.gms.measurement.internal.zzkz v8_0 = v2_7.getString(v6_1);
            if (!android.text.TextUtils.isEmpty(v8_0)) {
                v7_5.put(v6_1, v8_0);
            }
        }
        com.google.android.gms.measurement.internal.zzlo v3_5 = v0_2.zzn();
        long v6_6 = p11.zzb;
        com.google.android.gms.measurement.internal.zzkz v8_3 = new com.google.android.gms.measurement.internal.zzkz(this, v1_5, p11);
        v3_5.zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v5);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v6_6);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v8_3);
        v3_5.zzu.zzaW().zzm(new com.google.android.gms.measurement.internal.zzln(v3_5, v4_0, v5, v6_6, v7_5, v8_3));
        try {
            com.google.android.gms.measurement.internal.zzlr v11_11 = v0_2.zzk().zzu;
            long v4_1 = 60000;
            long v2_11 = (v11_11.zzaZ().currentTimeMillis() + 60000);
        } catch (InterruptedException) {
            v1.a.v(this.zzu, "[sgtm] Interrupted waiting for uploading batch");
            com.google.android.gms.measurement.internal.zzlr v11_5;
            if (v1_5.get() != null) {
                v11_5 = ((com.google.android.gms.measurement.internal.zzlr) v1_5.get());
            } else {
                v11_5 = com.google.android.gms.measurement.internal.zzlr.zza;
            }
            return v11_5;
        }
        while ((v1_5.get() == null) && (v4_1 > 0)) {
            v1_5.wait(v4_1);
            v4_1 = (v2_11 - v11_11.zzaZ().currentTimeMillis());
        }
    }

    private final void zzas(Boolean p4, boolean p5)
    {
        this.zzg();
        this.zzb();
        String v0_0 = this.zzu;
        v0_0.zzaV().zzj().zzb("Setting app measurement enabled (FE)", p4);
        v0_0.zzd().zzh(p4);
        if (p5) {
            boolean v5_1 = v0_0.zzd();
            v5_1.zzg();
            boolean v5_3 = v5_1.zzd().edit();
            if (!p4) {
                v5_3.remove("measurement_enabled_from_api");
            } else {
                v5_3.putBoolean("measurement_enabled_from_api", p4.booleanValue());
            }
            v5_3.apply();
        }
        if ((!this.zzu.zzE()) && ((!p4) || (p4.booleanValue()))) {
            return;
        } else {
            this.zzat();
            return;
        }
    }

    private final void zzat()
    {
        com.google.android.gms.measurement.internal.zzlj v2_3;
        this.zzg();
        com.google.android.gms.measurement.internal.zzhz v0_0 = this.zzu;
        com.google.android.gms.measurement.internal.zzjz v1_11 = v0_0.zzd().zzh.zza();
        if (v1_11 == null) {
            v2_3 = this;
        } else {
            if (!"unset".equals(v1_11)) {
                com.google.android.gms.measurement.internal.zzjz v1_1;
                if (1 == "true".equals(v1_11)) {
                    v1_1 = 1;
                } else {
                    v1_1 = 0;
                }
                this.zzN("app", "_npa", Long.valueOf(v1_1), v0_0.zzaZ().currentTimeMillis());
                v2_3 = this;
            } else {
                v2_3 = this;
                this.zzN("app", "_npa", 0, v0_0.zzaZ().currentTimeMillis());
            }
        }
        if ((!v2_3.zzu.zzB()) || (!v2_3.zzc)) {
            v0_0.zzaV().zzj().zza("Updating Scion state (FE)");
            v2_3.zzu.zzt().zzi();
            return;
        } else {
            v0_0.zzaV().zzj().zza("Recording app launch after enabling measurement for the first time (FE)");
            this.zzU();
            v2_3.zzu.zzh().zza.zza();
            v0_0.zzaW().zzj(new com.google.android.gms.measurement.internal.zzjz(this));
            return;
        }
    }

    public final void zzA(com.google.android.gms.measurement.internal.zzjl p6)
    {
        Boolean v6_4;
        this.zzg();
        if (((!p6.zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) || (!p6.zzo(com.google.android.gms.measurement.internal.zzjk.zza))) && (!this.zzu.zzt().zzO())) {
            v6_4 = 0;
        } else {
            v6_4 = 1;
        }
        boolean v0_1 = this.zzu;
        if (v6_4 != v0_1.zzE()) {
            boolean v0_5;
            v0_1.zzD(v6_4);
            boolean v0_3 = this.zzu.zzd();
            v0_3.zzg();
            if (!v0_3.zzd().contains("measurement_enabled_from_api")) {
                v0_5 = 0;
            } else {
                v0_5 = Boolean.valueOf(v0_3.zzd().getBoolean("measurement_enabled_from_api", 1));
            }
            if ((v6_4 == null) || ((!v0_5) || (v0_5.booleanValue()))) {
                this.zzas(Boolean.valueOf(v6_4), 0);
            }
        }
        return;
    }

    public final void zzB(String p10, String p11, android.os.Bundle p12)
    {
        this.zzC(p10, p11, p12, 1, 1, this.zzu.zzaZ().currentTimeMillis());
        return;
    }

    public final void zzC(String p11, String p12, android.os.Bundle p13, boolean p14, boolean p15, long p16)
    {
        if (p13 == 0) {
            p13 = new android.os.Bundle();
        }
        if (!java.util.Objects.equals(p12, "screen_view")) {
            int v13_2 = 1;
            if ((p15) && ((this.zzd != null) && (!com.google.android.gms.measurement.internal.zzpp.zzZ(p12)))) {
                v13_2 = 0;
            }
            if (p11 == null) {
                p11 = "app";
            }
            this.zzJ(p11, p12, p16, p13, p15, v13_2, p14, 0);
            return;
        } else {
            this.zzu.zzs().zzj(p13, p16);
            return;
        }
    }

    public final void zzD()
    {
        java.util.List v19;
        String v2_6;
        this.zzg();
        String v1_10 = this.zzu;
        v1_10.zzaV().zzj().zza("Handle tcf update.");
        String v2_1 = v1_10.zzd().zze();
        String v3_8 = new java.util.HashMap();
        String v4_0 = com.google.android.gms.measurement.internal.zzfy.zzaZ;
        int v16 = 2;
        if (!((Boolean) v4_0.zzb(0)).booleanValue()) {
            v19 = v1_10;
            String v1_28 = com.google.android.gms.measurement.internal.zzof.zza(v2_1, "IABTCF_VendorConsents");
            if ((!"".equals(v1_28)) && (v1_28.length() > 754)) {
                v3_8.put("GoogleConsent", String.valueOf(v1_28.charAt(754)));
            }
            String v1_34 = com.google.android.gms.measurement.internal.zzof.zzb(v2_1, "IABTCF_gdprApplies");
            if (v1_34 != -1) {
                v3_8.put("gdprApplies", String.valueOf(v1_34));
            }
            String v1_36 = com.google.android.gms.measurement.internal.zzof.zzb(v2_1, "IABTCF_EnableAdvertiserConsentMode");
            if (v1_36 != -1) {
                v3_8.put("EnableAdvertiserConsentMode", String.valueOf(v1_36));
            }
            String v1_38 = com.google.android.gms.measurement.internal.zzof.zzb(v2_1, "IABTCF_PolicyVersion");
            if (v1_38 != -1) {
                v3_8.put("PolicyVersion", String.valueOf(v1_38));
            }
            String v1_40 = com.google.android.gms.measurement.internal.zzof.zza(v2_1, "IABTCF_PurposeConsents");
            if (!"".equals(v1_40)) {
                v3_8.put("PurposeConsents", v1_40);
            }
            String v1_41 = com.google.android.gms.measurement.internal.zzof.zzb(v2_1, "IABTCF_CmpSdkID");
            if (v1_41 != -1) {
                v3_8.put("CmpSdkID", String.valueOf(v1_41));
            }
            v2_6 = new com.google.android.gms.measurement.internal.zzod(v3_8);
        } else {
            String v3_9;
            String v3_16 = com.google.android.gms.internal.measurement.zzkp.zzb;
            android.os.Bundle v6_15 = com.google.android.gms.measurement.internal.zzoe.zza;
            int v17_1 = 1;
            java.util.Objects.requireNonNull(v3_16);
            java.util.Objects.requireNonNull(v6_15);
            StringBuilder v15_3 = new java.util.AbstractMap$SimpleImmutableEntry(v3_16, v6_15);
            String v3_17 = com.google.android.gms.internal.measurement.zzkp.zzc;
            int v5_18 = com.google.android.gms.measurement.internal.zzoe.zzd;
            java.util.Objects.requireNonNull(v3_17);
            java.util.Objects.requireNonNull(v5_18);
            long v9_16 = new java.util.AbstractMap$SimpleImmutableEntry(v3_17, v5_18);
            String v3_0 = com.google.android.gms.internal.measurement.zzkp.zzd;
            v19 = v1_10;
            java.util.Objects.requireNonNull(v3_0);
            String v3_1 = com.google.android.gms.internal.measurement.zzkp.zze;
            boolean v20_0 = new java.util.AbstractMap$SimpleImmutableEntry(v3_0, v6_15);
            java.util.Objects.requireNonNull(v3_1);
            String v1_3 = new java.util.AbstractMap$SimpleImmutableEntry(v3_1, v6_15);
            String v3_2 = com.google.android.gms.internal.measurement.zzkp.zzh;
            java.util.Objects.requireNonNull(v3_2);
            android.os.Bundle v6_1 = new java.util.AbstractMap$SimpleImmutableEntry(v3_2, v5_18);
            String v3_3 = com.google.android.gms.internal.measurement.zzkp.zzj;
            m4.n v21_0 = v1_3;
            java.util.Objects.requireNonNull(v3_3);
            String v3_4 = com.google.android.gms.internal.measurement.zzkp.zzk;
            String v22_0 = new java.util.AbstractMap$SimpleImmutableEntry(v3_3, v5_18);
            java.util.Objects.requireNonNull(v3_4);
            String v1_7 = new java.util.AbstractMap$SimpleImmutableEntry(v3_4, v5_18);
            String v3_6 = new java.util.Map$Entry[7];
            v3_6[0] = v15_3;
            v3_6[1] = v9_16;
            v3_6[2] = v20_0;
            v3_6[3] = v21_0;
            v3_6[4] = v6_1;
            v3_6[5] = v22_0;
            v3_6[6] = v1_7;
            String v1_8 = java.util.Arrays.asList(v3_6);
            if (v1_8 == null) {
                v3_9 = 4;
            } else {
                v3_9 = v1_8.size();
            }
            long v9_2 = new g0.d(v3_9);
            v9_2.h(v1_8);
            String v1_9 = v9_2.b();
            String v3_11 = new m4.r("CH");
            android.os.Bundle v6_3 = new char[5];
            boolean v34 = v2_1.contains("IABTCF_TCString");
            int v24 = com.google.android.gms.measurement.internal.zzof.zzb(v2_1, "IABTCF_CmpSdkID");
            int v27 = com.google.android.gms.measurement.internal.zzof.zzb(v2_1, "IABTCF_PolicyVersion");
            int v26 = com.google.android.gms.measurement.internal.zzof.zzb(v2_1, "IABTCF_gdprApplies");
            int v28 = com.google.android.gms.measurement.internal.zzof.zzb(v2_1, "IABTCF_PurposeOneTreatment");
            int v25 = com.google.android.gms.measurement.internal.zzof.zzb(v2_1, "IABTCF_EnableAdvertiserConsentMode");
            String v29 = com.google.android.gms.measurement.internal.zzof.zza(v2_1, "IABTCF_PublisherCC");
            long v9_8 = new g0.d(4);
            int v5_3 = v1_9.b;
            if (v5_3 == 0) {
                String v10_2 = new m4.l(v1_9, new m4.m(v1_9.e, 0, v1_9.f));
                v1_9.b = v10_2;
                v5_3 = v10_2;
            }
            int v5_6 = v5_3.i();
            while (v5_6.hasNext()) {
                String v11_11;
                String v10_9 = ((com.google.android.gms.internal.measurement.zzkp) v5_6.next());
                int v12_3 = v10_9.zza();
                StringBuilder v15_1 = new StringBuilder((String.valueOf(v12_3).length() + 28));
                v15_1.append("IABTCF_PublisherRestrictions");
                v15_1.append(v12_3);
                int v12_5 = com.google.android.gms.measurement.internal.zzof.zza(v2_1, v15_1.toString());
                if ((!android.text.TextUtils.isEmpty(v12_5)) && (v12_5.length() >= 755)) {
                    String v11_10 = Character.digit(v12_5.charAt(754), 10);
                    if ((v11_10 < null) || ((v11_10 > com.google.android.gms.internal.measurement.zzkq.values().length) || (v11_10 == null))) {
                        v11_11 = com.google.android.gms.internal.measurement.zzkq.zza;
                    } else {
                        if (v11_10 == v17_1) {
                            v11_11 = com.google.android.gms.internal.measurement.zzkq.zzb;
                        } else {
                            if (v11_10 == v16) {
                                v11_11 = com.google.android.gms.internal.measurement.zzkq.zzc;
                            } else {
                                v11_11 = com.google.android.gms.internal.measurement.zzkq.zzd;
                            }
                        }
                    }
                } else {
                    v11_11 = com.google.android.gms.internal.measurement.zzkq.zzd;
                }
                v9_8.g(v10_9, v11_11);
                v16 = 2;
                v17_1 = 1;
            }
            int v32;
            m4.n v21_1 = v9_8.b();
            String v30 = com.google.android.gms.measurement.internal.zzof.zza(v2_1, "IABTCF_PurposeConsents");
            int v5_7 = com.google.android.gms.measurement.internal.zzof.zza(v2_1, "IABTCF_VendorConsents");
            if ((android.text.TextUtils.isEmpty(v5_7)) || ((v5_7.length() < 755) || (v5_7.charAt(754) != 49))) {
                v32 = 0;
            } else {
                v32 = 1;
            }
            int v33;
            String v31 = com.google.android.gms.measurement.internal.zzof.zza(v2_1, "IABTCF_PurposeLegitimateInterests");
            String v2_2 = com.google.android.gms.measurement.internal.zzof.zza(v2_1, "IABTCF_VendorLegitimateInterests");
            if ((android.text.TextUtils.isEmpty(v2_2)) || ((v2_2.length() < 755) || (v2_2.charAt(754) != 49))) {
                v33 = 0;
            } else {
                v33 = 1;
            }
            v6_3[0] = 50;
            v2_6 = new com.google.android.gms.measurement.internal.zzod(com.google.android.gms.measurement.internal.zzof.zzd(v1_9, v21_1, v3_11, v6_3, v24, v25, v26, v27, v28, v29, v30, v31, v32, v33, v34));
        }
        v19.zzaV().zzk().zzb("Tcf preferences read", v2_6);
        if (!v19.zzc().zzp(0, v4_0)) {
            if (v19.zzd().zzm(v2_6)) {
                String v1_18 = v2_6.zzb();
                v19.zzaV().zzk().zzb("Consent generated from Tcf", v1_18);
                if (v1_18 != android.os.Bundle.EMPTY) {
                    this.zzp(v1_18, -30, v19.zzaZ().currentTimeMillis());
                }
                String v1_20 = new android.os.Bundle();
                v1_20.putString("_tcfd", v2_6.zze());
                this.zzF("auto", "_tcf", v1_20);
            }
        } else {
            String v1_26;
            String v1_21 = v19.zzd();
            v1_21.zzg();
            String v1_23 = v1_21.zzd().getString("stored_tcf_param", "");
            android.os.Bundle v8_6 = new java.util.HashMap();
            if (!android.text.TextUtils.isEmpty(v1_23)) {
                String v1_24 = v1_23.split(";");
                long v9_11 = v1_24.length;
                int v12_2 = 0;
                while (v12_2 < v9_11) {
                    String v10_6 = v1_24[v12_2].split("=");
                    if (v10_6.length < 2) {
                        int v18 = 0;
                    } else {
                        if (com.google.android.gms.measurement.internal.zzof.zza.contains(v10_6[0])) {
                            v8_6.put(v10_6[0], v10_6[1]);
                        }
                    }
                    v12_2++;
                }
                v1_26 = new com.google.android.gms.measurement.internal.zzod(v8_6);
            } else {
                v1_26 = new com.google.android.gms.measurement.internal.zzod(v8_6);
            }
            if (v19.zzd().zzm(v2_6)) {
                android.os.Bundle v8_9 = v2_6.zzb();
                v19.zzaV().zzk().zzb("Consent generated from Tcf", v8_9);
                if (v8_9 != android.os.Bundle.EMPTY) {
                    this.zzp(v8_9, -30, v19.zzaZ().currentTimeMillis());
                }
                android.os.Bundle v6_9 = new android.os.Bundle();
                v6_9.putString("_tcfm", v2_6.zzd(v1_26));
                v6_9.putString("_tcfd2", v2_6.zzc());
                v6_9.putString("_tcfd", v2_6.zze());
                this.zzF("auto", "_tcf", v6_9);
                return;
            }
        }
        return;
    }

    public final void zzE()
    {
        this.zzg();
        android.content.SharedPreferences v0_0 = this.zzu;
        v0_0.zzaV().zzj().zza("Register tcfPrefChangeListener.");
        if (this.zzs == null) {
            this.zzt = new com.google.android.gms.measurement.internal.zzkb(this, this.zzu);
            this.zzs = new com.google.android.gms.measurement.internal.zzle(this);
        }
        v0_0.zzd().zze().registerOnSharedPreferenceChangeListener(this.zzs);
        return;
    }

    public final void zzF(String p8, String p9, android.os.Bundle p10)
    {
        this.zzg();
        this.zzG(p8, p9, this.zzu.zzaZ().currentTimeMillis(), p10);
        return;
    }

    public final void zzG(String p11, String p12, long p13, android.os.Bundle p15)
    {
        this.zzg();
        String v2_1 = 1;
        if ((this.zzd != null) && (!com.google.android.gms.measurement.internal.zzpp.zzZ(p12))) {
            v2_1 = 0;
        }
        this.zzH(p11, p12, p13, p15, 1, v2_1, 1, 0);
        return;
    }

    public final void zzH(String p20, String p21, long p22, android.os.Bundle p24, boolean p25, boolean p26, boolean p27, String p28)
    {
        com.google.android.gms.measurement.internal.zzpp v7_0 = p20;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p20);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p24);
        this.zzg();
        this.zzb();
        com.google.android.gms.measurement.internal.zzjq v0_45 = this.zzu;
        if (!v0_45.zzB()) {
            this.zzu.zzaV().zzj().zza("Event not sent since app measurement is disabled");
            return;
        } else {
            com.google.android.gms.measurement.internal.zzpo v2_16 = this.zzu.zzv().zzp();
            if ((v2_16 != null) && (!v2_16.contains(p21))) {
                this.zzu.zzaV().zzj().zzc("Dropping non-safelisted event. event name, origin", p21, p20);
                return;
            } else {
                if (!this.zzf) {
                    this.zzf = 1;
                    try {
                        com.google.android.gms.measurement.internal.zzjq v0_33;
                        if (v0_45.zzp()) {
                            v0_33 = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                        } else {
                            v0_33 = Class.forName("com.google.android.gms.tagmanager.TagManagerService", 1, this.zzu.zzaY().getClassLoader());
                        }
                        try {
                            v0_33.getDeclaredMethod("initialize", new Class[] {android.content.Context})).invoke(0, new Object[] {this.zzu.zzaY()}));
                        } catch (com.google.android.gms.measurement.internal.zzjq v0_42) {
                            this.zzu.zzaV().zze().zzb("Failed to invoke Tag Manager\'s initialize() method", v0_42);
                        }
                    } catch (ClassNotFoundException) {
                        this.zzu.zzaV().zzi().zza("Tag Manager is not found and thus will not be used");
                    }
                }
                android.os.Bundle v12_9 = this.zzu;
                if ((!v12_9.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbf)) && (("_cmp".equals(p21)) && (p24.containsKey("gclid")))) {
                    v12_9.zzaU();
                    this.zzN("auto", "_lgclid", p24.getString("gclid"), v12_9.zzaZ().currentTimeMillis());
                }
                com.google.android.gms.measurement.internal.zzlj v6_0 = this;
                v12_9.zzaU();
                if ((p25 != null) && (com.google.android.gms.measurement.internal.zzpp.zzaf(p21))) {
                    v12_9.zzk().zzI(p24, v12_9.zzd().zzt.zza());
                }
                java.util.ArrayList v13_0 = 0;
                if (!p27) {
                    v12_9.zzaU();
                    if (!"_iap".equals(p21)) {
                        com.google.android.gms.measurement.internal.zzpp v1_6 = this.zzu;
                        com.google.android.gms.measurement.internal.zzpo v2_2 = v1_6.zzk();
                        long v5_1 = 2;
                        if (v2_2.zzj("event", p21)) {
                            if (v2_2.zzl("event", com.google.android.gms.measurement.internal.zzjm.zza, com.google.android.gms.measurement.internal.zzjm.zzb, p21)) {
                                v2_2.zzu.zzc();
                                if (v2_2.zzm("event", 40, p21)) {
                                    v5_1 = 0;
                                }
                            } else {
                                v5_1 = 13;
                            }
                        }
                        if (v5_1 != 0) {
                            v12_9.zzaV().zzd().zzb("Invalid public event name. Event will not be logged (FE)", v12_9.zzl().zza(p21));
                            com.google.android.gms.measurement.internal.zzpo v2_66 = v1_6.zzk();
                            v1_6.zzc();
                            com.google.android.gms.measurement.internal.zzjq v0_40 = v2_66.zzC(p21, 40, 1);
                            if (p21 != null) {
                                v13_0 = p21.length();
                            }
                            v1_6.zzk().zzN(this.zzv, 0, v5_1, "_ev", v0_40, v13_0);
                            return;
                        }
                    }
                }
                v12_9.zzaU();
                long v14_1 = this.zzu;
                com.google.android.gms.measurement.internal.zzpp v1_8 = v14_1.zzs().zzh(0);
                if ((v1_8 != null) && (!p24.containsKey("_sc"))) {
                    v1_8.zzd = 1;
                }
                if ((p25 == null) || (p27)) {
                    android.os.Bundle v3_3 = 0;
                } else {
                    v3_3 = 1;
                }
                int v9_0;
                com.google.android.gms.measurement.internal.zzpp.zzav(v1_8, p24, v3_3);
                com.google.android.gms.measurement.internal.zzpp v1_10 = "am".equals(p20);
                android.os.Bundle v3_4 = com.google.android.gms.measurement.internal.zzpp.zzZ(p21);
                if ((p25 == null) || ((this.zzd == null) || (v3_4 != null))) {
                    v9_0 = v1_10;
                } else {
                    if (v1_10 == null) {
                        v12_9.zzaV().zzj().zzc("Passing event to registered event handler (FE)", v12_9.zzl().zza(p21), v12_9.zzl().zze(p24));
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd);
                        this.zzd.interceptEvent(p20, p21, p24, p22);
                        return;
                    } else {
                        v9_0 = 1;
                    }
                }
                java.util.Iterator v15_0 = this.zzu;
                if (v15_0.zzH()) {
                    com.google.android.gms.measurement.internal.zzpp v1_17 = v12_9.zzk().zzn(p21);
                    if (v1_17 == null) {
                        String[] v17;
                        long v24_1;
                        int v18;
                        com.google.android.gms.measurement.internal.zzic v16 = v12_9;
                        com.google.android.gms.measurement.internal.zzjq v0_14 = v12_9.zzk().zzF(p28, p21, p24, com.google.android.gms.common.util.CollectionUtils.listOf(new String[] {"_o", "_sn", "_sc", "_si"})), p27);
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_14);
                        v16.zzaU();
                        if ((v14_1.zzs().zzh(0) == null) || (!"_ae".equals(p21))) {
                            v18 = 0;
                            v17 = v14_1;
                            v24_1 = 0;
                        } else {
                            com.google.android.gms.measurement.internal.zzpo v2_15 = v14_1.zzh().zzb;
                            v24_1 = 0;
                            String v4_11 = v2_15.zzc.zzu.zzaZ().elapsedRealtime();
                            v18 = 0;
                            v17 = v14_1;
                            java.util.ArrayList v13_2 = (v4_11 - v2_15.zzb);
                            v2_15.zzb = v4_11;
                            if (v13_2 > 0) {
                                v16.zzk().zzak(v0_14, v13_2);
                            }
                        }
                        if (("auto".equals(p20)) || (!"_ssr".equals(p21))) {
                            if ("_ae".equals(p21)) {
                                com.google.android.gms.measurement.internal.zzpo v2_29 = v16.zzk().zzu.zzd().zzq.zza();
                                if (!android.text.TextUtils.isEmpty(v2_29)) {
                                    v0_14.putString("_ffr", v2_29);
                                }
                            }
                        } else {
                            com.google.android.gms.measurement.internal.zzpo v2_30 = v16.zzk();
                            String v4_13 = v0_14.getString("_ffr");
                            if (!com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(v4_13)) {
                                if (v4_13 != null) {
                                    v4_13 = v4_13.trim();
                                }
                            } else {
                                v4_13 = 0;
                            }
                            com.google.android.gms.measurement.internal.zzpo v2_31 = v2_30.zzu;
                            if (java.util.Objects.equals(v4_13, v2_31.zzd().zzq.zza())) {
                                v2_31.zzaV().zzj().zza("Not logging duplicate session_start_with_rollout event");
                                return;
                            } else {
                                v2_31.zzd().zzq.zzb(v4_13);
                            }
                        }
                        com.google.android.gms.measurement.internal.zzpo v2_38;
                        java.util.ArrayList v13_4 = new java.util.ArrayList();
                        v13_4.add(v0_14);
                        if (!v16.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaU)) {
                            v2_38 = v16.zzd().zzn.zza();
                        } else {
                            v2_38 = v17.zzh().zzi();
                        }
                        if ((v16.zzd().zzk.zza() <= v24_1) || ((!v16.zzd().zzp(p22)) || (v2_38 == null))) {
                            int v10_0 = v24_1;
                            long v14_2 = "_ae";
                        } else {
                            v16.zzaV().zzk().zza("Current session is expired, remove the session number, ID, and engagement time");
                            v14_2 = "_ae";
                            v10_0 = v24_1;
                            this.zzN("auto", "_sid", 0, v16.zzaZ().currentTimeMillis());
                            this.zzN("auto", "_sno", 0, v16.zzaZ().currentTimeMillis());
                            this.zzN("auto", "_se", 0, v16.zzaZ().currentTimeMillis());
                            v6_0 = this;
                            v16.zzd().zzl.zzb(v10_0);
                        }
                        String v4_24;
                        if (v0_14.getLong("extend_session", v10_0) != 1) {
                            v4_24 = p22;
                        } else {
                            v16.zzaV().zzk().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                            v4_24 = p22;
                            v15_0.zzh().zza.zzb(p22, 1);
                        }
                        com.google.android.gms.measurement.internal.zzpp v1_37 = new java.util.ArrayList(v0_14.keySet());
                        java.util.Collections.sort(v1_37);
                        com.google.android.gms.measurement.internal.zzpo v2_52 = v1_37.size();
                        android.os.Bundle v3_14 = v18;
                        while (v3_14 < v2_52) {
                            int v10_4 = ((String) v1_37.get(v3_14));
                            if (v10_4 != 0) {
                                java.util.Iterator v15_2;
                                v16.zzk();
                                int v11_3 = v0_14.get(v10_4);
                                if (!(v11_3 instanceof android.os.Bundle)) {
                                    if (!(v11_3 instanceof android.os.Parcelable[])) {
                                        if (!(v11_3 instanceof java.util.ArrayList)) {
                                            v15_2 = 0;
                                        } else {
                                            int v11_4 = ((java.util.ArrayList) v11_3);
                                            android.os.Bundle v12_6 = new android.os.Bundle[v11_4.size()];
                                            v15_2 = ((android.os.Bundle[]) v11_4.toArray(v12_6));
                                        }
                                    } else {
                                        int v11_6 = ((android.os.Parcelable[]) v11_3);
                                        v15_2 = ((android.os.Bundle[]) java.util.Arrays.copyOf(v11_6, v11_6.length, android.os.Bundle[]));
                                    }
                                } else {
                                    v15_2 = new android.os.Bundle[1];
                                    v15_2[v18] = ((android.os.Bundle) v11_3);
                                }
                                if (v15_2 != null) {
                                    v0_14.putParcelableArray(v10_4, v15_2);
                                }
                            }
                            v3_14++;
                        }
                        int v10_2 = v18;
                        while (v10_2 < v13_4.size()) {
                            com.google.android.gms.measurement.internal.zzpp v1_41;
                            com.google.android.gms.measurement.internal.zzjq v0_28 = ((android.os.Bundle) v13_4.get(v10_2));
                            if (v10_2 == 0) {
                                v1_41 = p21;
                            } else {
                                v1_41 = "_ep";
                            }
                            v0_28.putString("_o", v7_0);
                            if (p26 != 0) {
                                v0_28 = v16.zzk().zzab(v0_28, 0);
                            }
                            android.os.Bundle v12_1 = v0_28;
                            v17.zzt().zzn(new com.google.android.gms.measurement.internal.zzbg(v1_41, new com.google.android.gms.measurement.internal.zzbe(v12_1), v7_0, v4_24), p28);
                            if (v9_0 == 0) {
                                java.util.Iterator v15_1 = v6_0.zze.iterator();
                                while (v15_1.hasNext()) {
                                    ((com.google.android.gms.measurement.internal.zzjq) v15_1.next()).onEvent(p20, p21, new android.os.Bundle(v12_1), p22);
                                }
                            }
                            v10_2++;
                            v7_0 = p20;
                            v4_24 = p22;
                        }
                        v16.zzaU();
                        if ((v17.zzs().zzh(v18) != null) && (v14_2.equals(p21))) {
                            v17.zzh().zzb.zzd(1, 1, v16.zzaZ().elapsedRealtime());
                        }
                    } else {
                        v12_9.zzaV().zzd().zzb("Invalid event name. Event will not be logged (FE)", v12_9.zzl().zza(p21));
                        com.google.android.gms.measurement.internal.zzpo v2_61 = v12_9.zzk();
                        v12_9.zzc();
                        com.google.android.gms.measurement.internal.zzjq v0_39 = v2_61.zzC(p21, 40, 1);
                        if (p21 != null) {
                            v13_0 = p21.length();
                        }
                        v15_0.zzk().zzN(this.zzv, p28, v1_17, "_ev", v0_39, v13_0);
                        return;
                    }
                }
                return;
            }
        }
    }

    public final void zzI(String p11, String p12, android.os.Bundle p13, String p14)
    {
        com.google.android.gms.measurement.internal.zzic.zzL();
        this.zzJ("auto", p12, this.zzu.zzaZ().currentTimeMillis(), p13, 0, 1, 1, p14);
        return;
    }

    public final void zzJ(String p13, String p14, long p15, android.os.Bundle p17, boolean p18, boolean p19, boolean p20, String p21)
    {
        android.os.Bundle v6_1 = new android.os.Bundle(p17);
        com.google.android.gms.measurement.internal.zzkc v0_5 = v6_1.keySet().iterator();
        while (v0_5.hasNext()) {
            android.os.Bundle v1_2 = ((String) v0_5.next());
            java.util.List v2_1 = v6_1.get(v1_2);
            if (!(v2_1 instanceof android.os.Bundle)) {
                int v3_2 = 0;
                if (!(v2_1 instanceof android.os.Parcelable[])) {
                    if (!(v2_1 instanceof java.util.List)) {
                    } else {
                        java.util.List v2_2 = ((java.util.List) v2_1);
                        while (v3_2 < v2_2.size()) {
                            android.os.Bundle v1_6 = v2_2.get(v3_2);
                            if ((v1_6 instanceof android.os.Bundle)) {
                                v2_2.set(v3_2, new android.os.Bundle(((android.os.Bundle) v1_6)));
                            }
                            v3_2++;
                        }
                    }
                } else {
                    java.util.List v2_3 = ((android.os.Parcelable[]) v2_1);
                    while (v3_2 < v2_3.length) {
                        android.os.Bundle v1_9 = v2_3[v3_2];
                        if ((v1_9 instanceof android.os.Bundle)) {
                            v2_3[v3_2] = new android.os.Bundle(((android.os.Bundle) v1_9));
                        }
                        v3_2++;
                    }
                }
            } else {
                v6_1.putBundle(v1_2, new android.os.Bundle(((android.os.Bundle) v2_1)));
            }
        }
        this.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkc(this, p13, p14, p15, v6_1, p18, p19, p20, p21));
        return;
    }

    public final void zzK(String p8, String p9, Object p10, boolean p11)
    {
        this.zzL("auto", "_ldl", p10, 1, this.zzu.zzaZ().currentTimeMillis());
        return;
    }

    public final void zzL(String p17, String p18, Object p19, boolean p20, long p21)
    {
        Object v5_1;
        int v12_0;
        long v3_0 = 0;
        if (!p20) {
            Object v5_8 = this.zzu.zzk();
            if (v5_8.zzj("user property", p18)) {
                if (v5_8.zzl("user property", com.google.android.gms.measurement.internal.zzjo.zza, 0, p18)) {
                    v5_8.zzu.zzc();
                    if (v5_8.zzm("user property", 24, p18)) {
                        v12_0 = 0;
                        if (v12_0 == 0) {
                            com.google.android.gms.measurement.internal.zzpp v6_0;
                            if (p17 != null) {
                                v6_0 = p17;
                            } else {
                                v6_0 = "app";
                            }
                            if (p19 == null) {
                                this.zzM(v6_0, p18, p21, 0);
                                return;
                            } else {
                                com.google.android.gms.measurement.internal.zzic v7_4 = this.zzu;
                                int v12_1 = v7_4.zzk().zzK(p18, p19);
                                if (v12_1 == 0) {
                                    Object v5_6 = v7_4.zzk().zzL(p18, p19);
                                    if (v5_6 != null) {
                                        this.zzM(v6_0, p18, p21, v5_6);
                                    }
                                    return;
                                } else {
                                    com.google.android.gms.measurement.internal.zzpp v6_1 = v7_4.zzk();
                                    v7_4.zzc();
                                    String v14_0 = v6_1.zzC(p18, 24, 1);
                                    if (((p19 instanceof String)) || ((p19 instanceof CharSequence))) {
                                        v3_0 = p19.toString().length();
                                    }
                                    this.zzu.zzk().zzN(this.zzv, 0, v12_1, "_ev", v14_0, v3_0);
                                    return;
                                }
                            }
                        } else {
                            com.google.android.gms.measurement.internal.zzic v1_5 = this.zzu;
                            com.google.android.gms.measurement.internal.zzpp v6_2 = v1_5.zzk();
                            v1_5.zzc();
                            String v14_1 = v6_2.zzC(p18, 24, 1);
                            if (p18 != null) {
                                v3_0 = p18.length();
                            }
                            this.zzu.zzk().zzN(this.zzv, 0, v12_0, "_ev", v14_1, v3_0);
                            return;
                        }
                    }
                } else {
                    v5_1 = 15;
                    v12_0 = v5_1;
                }
            }
            v12_0 = 6;
        } else {
            v5_1 = this.zzu.zzk().zzp(p18);
        }
    }

    public final void zzM(String p9, String p10, long p11, Object p13)
    {
        this.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkd(this, p9, p10, p13, p11));
        return;
    }

    public final void zzN(String p10, String p11, Object p12, long p13)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p10);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p11);
        this.zzg();
        this.zzb();
        if ("allow_personalized_ads".equals(p11)) {
            if ((!(p12 instanceof String)) || (android.text.TextUtils.isEmpty(((String) p12)))) {
                if (p12 == null) {
                    this.zzu.zzd().zzh.zzb("unset");
                    p11 = "_npa";
                }
            } else {
                com.google.android.gms.measurement.internal.zzhg v11_7;
                String v0_3 = "false";
                if (1 == "false".equals(((String) p12).toLowerCase(java.util.Locale.ENGLISH))) {
                    v11_7 = 1;
                } else {
                    v11_7 = 0;
                }
                long v4_0 = this.zzu;
                p12 = Long.valueOf(v11_7);
                if (p12.longValue() == 1) {
                    v0_3 = "true";
                }
                v4_0.zzd().zzh.zzb(v0_3);
            }
            this.zzu.zzaV().zzk().zzc("Setting user property(FE)", "non_personalized_ads(_npa)", p12);
        }
        com.google.android.gms.measurement.internal.zzhg v11_10 = this.zzu;
        if (v11_10.zzB()) {
            if (v11_10.zzH()) {
                this.zzu.zzt().zzA(new com.google.android.gms.measurement.internal.zzpl(p11, p13, p12, p10));
                return;
            } else {
                return;
            }
        } else {
            this.zzu.zzaV().zzk().zza("User property not set since app measurement is disabled");
            return;
        }
    }

    public final java.util.List zzO(boolean p8)
    {
        this.zzb();
        com.google.android.gms.measurement.internal.zzgs v0_0 = this.zzu;
        v0_0.zzaV().zzk().zza("Getting user properties (FE)");
        if (v0_0.zzaW().zze()) {
            v1.a.s(v0_0, "Cannot get all user properties from analytics worker thread");
            return java.util.Collections.EMPTY_LIST;
        } else {
            v0_0.zzaU();
            if (!com.google.android.gms.measurement.internal.zzae.zza()) {
                java.util.concurrent.atomic.AtomicReference v2_1 = new java.util.concurrent.atomic.AtomicReference();
                this.zzu.zzaW().zzk(v2_1, 5000, "get user properties", new com.google.android.gms.measurement.internal.zzkf(this, v2_1, p8));
                String v1_6 = ((java.util.List) v2_1.get());
                if (v1_6 != null) {
                    return v1_6;
                } else {
                    v0_0.zzaV().zzb().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(p8));
                    return java.util.Collections.EMPTY_LIST;
                }
            } else {
                v1.a.s(v0_0, "Cannot get all user properties from main thread");
                return java.util.Collections.EMPTY_LIST;
            }
        }
    }

    public final java.util.Map zzP(String p10, String p11, boolean p12)
    {
        Object v0_0 = this.zzu;
        if (!v0_0.zzaW().zze()) {
            v0_0.zzaU();
            if (!com.google.android.gms.measurement.internal.zzae.zza()) {
                long v3_0 = new java.util.concurrent.atomic.AtomicReference();
                java.util.concurrent.atomic.AtomicReference v2_3 = v3_0;
                this.zzu.zzaW().zzk(v2_3, 5000, "get user properties", new com.google.android.gms.measurement.internal.zzkl(this, v3_0, 0, p10, p11, p12));
                java.util.Iterator v10_2 = ((java.util.List) v2_3.get());
                if (v10_2 != null) {
                    r.e v11_2 = new r.e(v10_2.size());
                    java.util.Iterator v10_3 = v10_2.iterator();
                    while (v10_3.hasNext()) {
                        String v12_4 = ((com.google.android.gms.measurement.internal.zzpl) v10_3.next());
                        Object v0_1 = v12_4.zza();
                        if (v0_1 != null) {
                            v11_2.put(v12_4.zzb, v0_1);
                        }
                    }
                    return v11_2;
                } else {
                    v0_0.zzaV().zzb().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(p12));
                    return java.util.Collections.EMPTY_MAP;
                }
            } else {
                v1.a.s(v0_0, "Cannot get user properties from main thread");
                return java.util.Collections.EMPTY_MAP;
            }
        } else {
            v1.a.s(v0_0, "Cannot get user properties from analytics worker thread");
            return java.util.Collections.EMPTY_MAP;
        }
    }

    public final String zzQ()
    {
        return ((String) this.zzg.get());
    }

    public final void zzR(String p2)
    {
        this.zzg.set(p2);
        return;
    }

    public final void zzS()
    {
        this.zzg();
        com.google.android.gms.measurement.internal.zzay v0_0 = this.zzu;
        if (v0_0.zzd().zzo.zza()) {
            v0_0.zzaV().zzj().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        } else {
            long v1_3 = v0_0.zzd().zzp.zza();
            v0_0.zzd().zzp.zzb((1 + v1_3));
            v0_0.zzc();
            if (v1_3 < 5) {
                if (this.zzr == null) {
                    this.zzr = new com.google.android.gms.measurement.internal.zzkg(this, this.zzu);
                }
                this.zzr.zzb(0);
                return;
            } else {
                v0_0.zzaV().zze().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                v0_0.zzd().zzo.zzb(1);
                return;
            }
        }
    }

    public final void zzT(long p3)
    {
        this.zzg.set(0);
        this.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkh(this, p3));
        return;
    }

    public final void zzU()
    {
        this.zzg();
        this.zzb();
        if (this.zzu.zzH()) {
            android.os.Bundle v0_2 = this.zzu;
            String v1_14 = v0_2.zzc();
            v1_14.zzu.zzaU();
            String v1_0 = v1_14.zzr("google_analytics_deferred_deep_link_enabled");
            if ((v1_0 != null) && (v1_0.booleanValue())) {
                v0_2.zzaV().zzj().zza("Deferred Deep Link feature enabled.");
                v0_2.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlh(this));
            }
            this.zzu.zzt().zzE();
            this.zzc = 0;
            String v1_8 = v0_2.zzd();
            v1_8.zzg();
            String v2_5 = v1_8.zzd().getString("previous_os_version", 0);
            v1_8.zzu.zzu().zzw();
            String v3_3 = android.os.Build$VERSION.RELEASE;
            if ((!android.text.TextUtils.isEmpty(v3_3)) && (!v3_3.equals(v2_5))) {
                String v1_10 = v1_8.zzd().edit();
                v1_10.putString("previous_os_version", v3_3);
                v1_10.apply();
            }
            if (!android.text.TextUtils.isEmpty(v2_5)) {
                v0_2.zzu().zzw();
                if (!v2_5.equals(v3_3)) {
                    android.os.Bundle v0_6 = new android.os.Bundle();
                    v0_6.putString("_po", v2_5);
                    this.zzF("auto", "_ou", v0_6);
                }
            }
        }
        return;
    }

    public final void zzV(com.google.android.gms.measurement.internal.zzjp p3)
    {
        this.zzg();
        this.zzb();
        if (p3 != null) {
            int v0_0 = this.zzd;
            if (p3 != v0_0) {
                int v0_1;
                if (v0_0 != 0) {
                    v0_1 = 0;
                } else {
                    v0_1 = 1;
                }
                com.google.android.gms.common.internal.Preconditions.checkState(v0_1, "EventInterceptor already set.");
            }
        }
        this.zzd = p3;
        return;
    }

    public final void zzW(com.google.android.gms.measurement.internal.zzjq p2)
    {
        this.zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        if (!this.zze.add(p2)) {
            v1.a.v(this.zzu, "OnEventListener already registered");
        }
        return;
    }

    public final void zzX(com.google.android.gms.measurement.internal.zzjq p2)
    {
        this.zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        if (!this.zze.remove(p2)) {
            v1.a.v(this.zzu, "OnEventListener had not been registered");
        }
        return;
    }

    public final int zzY(String p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zzu.zzc();
        return 25;
    }

    public final void zzZ(android.os.Bundle p3)
    {
        this.zzaa(p3, this.zzu.zzaZ().currentTimeMillis());
        return;
    }

    public final void zzaa(android.os.Bundle p12, long p13)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p12);
        String v0_5 = new android.os.Bundle(p12);
        if (!android.text.TextUtils.isEmpty(v0_5.getString("app_id"))) {
            v1.a.v(this.zzu, "Package name should be null when calling setConditionalUserProperty");
        }
        v0_5.remove("app_id");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_5);
        com.google.android.gms.measurement.internal.zzjh.zzb(v0_5, "app_id", String, 0);
        com.google.android.gms.measurement.internal.zzjh.zzb(v0_5, "origin", String, 0);
        com.google.android.gms.measurement.internal.zzjh.zzb(v0_5, "name", String, 0);
        com.google.android.gms.measurement.internal.zzjh.zzb(v0_5, "value", Object, 0);
        com.google.android.gms.measurement.internal.zzjh.zzb(v0_5, "trigger_event_name", String, 0);
        String v6_1 = Long.valueOf(0);
        com.google.android.gms.measurement.internal.zzjh.zzb(v0_5, "trigger_timeout", Long, v6_1);
        com.google.android.gms.measurement.internal.zzjh.zzb(v0_5, "timed_out_event_name", String, 0);
        com.google.android.gms.measurement.internal.zzjh.zzb(v0_5, "timed_out_event_params", android.os.Bundle, 0);
        com.google.android.gms.measurement.internal.zzjh.zzb(v0_5, "triggered_event_name", String, 0);
        com.google.android.gms.measurement.internal.zzjh.zzb(v0_5, "triggered_event_params", android.os.Bundle, 0);
        com.google.android.gms.measurement.internal.zzjh.zzb(v0_5, "time_to_live", Long, v6_1);
        com.google.android.gms.measurement.internal.zzjh.zzb(v0_5, "expired_event_name", String, 0);
        com.google.android.gms.measurement.internal.zzjh.zzb(v0_5, "expired_event_params", android.os.Bundle, 0);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_5.getString("name"));
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_5.getString("origin"));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_5.get("value"));
        v0_5.putLong("creation_timestamp", p13);
        com.google.android.gms.measurement.internal.zzhz v12_10 = v0_5.getString("name");
        com.google.android.gms.measurement.internal.zzki v13_13 = v0_5.get("value");
        Long v14_6 = this.zzu;
        if (v14_6.zzk().zzp(v12_10) != 0) {
            v14_6.zzaV().zzb().zzb("Invalid conditional user property name", v14_6.zzl().zzc(v12_10));
            return;
        } else {
            if (v14_6.zzk().zzK(v12_10, v13_13) != 0) {
                v14_6.zzaV().zzb().zzc("Invalid conditional user property value", v14_6.zzl().zzc(v12_10), v13_13);
                return;
            } else {
                long v1_13 = v14_6.zzk().zzL(v12_10, v13_13);
                if (v1_13 != 0) {
                    com.google.android.gms.measurement.internal.zzjh.zza(v0_5, v1_13);
                    long v1_0 = v0_5.getLong("trigger_timeout");
                    if (!android.text.TextUtils.isEmpty(v0_5.getString("trigger_event_name"))) {
                        v14_6.zzc();
                        if ((v1_0 > 15552000000) || (v1_0 < 1)) {
                            v14_6.zzaV().zzb().zzc("Invalid conditional user property timeout", v14_6.zzl().zzc(v12_10), Long.valueOf(v1_0));
                            return;
                        }
                    }
                    long v1_1 = v0_5.getLong("time_to_live");
                    v14_6.zzc();
                    if ((v1_1 <= 15552000000) && (v1_1 >= 1)) {
                        v14_6.zzaW().zzj(new com.google.android.gms.measurement.internal.zzki(this, v0_5));
                        return;
                    } else {
                        v14_6.zzaV().zzb().zzc("Invalid conditional user property time to live", v14_6.zzl().zzc(v12_10), Long.valueOf(v1_1));
                        return;
                    }
                } else {
                    v14_6.zzaV().zzb().zzc("Unable to normalize conditional user property value", v14_6.zzl().zzc(v12_10), v13_13);
                    return;
                }
            }
        }
    }

    public final void zzab(String p6, String p7, android.os.Bundle p8)
    {
        com.google.android.gms.measurement.internal.zzic v0 = this.zzu;
        long v1_1 = v0.zzaZ().currentTimeMillis();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p6);
        android.os.Bundle v3_1 = new android.os.Bundle();
        v3_1.putString("name", p6);
        v3_1.putLong("creation_timestamp", v1_1);
        if (p7 != null) {
            v3_1.putString("expired_event_name", p7);
            v3_1.putBundle("expired_event_params", p8);
        }
        v0.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkj(this, v3_1));
        return;
    }

    public final java.util.ArrayList zzac(String p10, String p11)
    {
        int v0_0 = this.zzu;
        if (!v0_0.zzaW().zze()) {
            v0_0.zzaU();
            if (!com.google.android.gms.measurement.internal.zzae.zza()) {
                long v5_0 = new java.util.concurrent.atomic.AtomicReference();
                java.util.concurrent.atomic.AtomicReference v4_3 = v5_0;
                this.zzu.zzaW().zzk(v4_3, 5000, "get conditional user properties", new com.google.android.gms.measurement.internal.zzkk(this, v5_0, 0, p10, p11));
                java.util.ArrayList v10_2 = ((java.util.List) v4_3.get());
                if (v10_2 != null) {
                    return com.google.android.gms.measurement.internal.zzpp.zzas(v10_2);
                } else {
                    v0_0.zzaV().zzb().zzb("Timed out waiting for get conditional user properties", 0);
                    return new java.util.ArrayList();
                }
            } else {
                v0_0.zzaV().zzb().zza("Cannot get conditional user properties from main thread");
                return new java.util.ArrayList(0);
            }
        } else {
            v0_0.zzaV().zzb().zza("Cannot get conditional user properties from analytics worker thread");
            return new java.util.ArrayList(0);
        }
    }

    public final String zzad()
    {
        int v0_2 = this.zzu.zzs().zzl();
        if (v0_2 == 0) {
            return 0;
        } else {
            return v0_2.zza;
        }
    }

    public final String zzae()
    {
        int v0_2 = this.zzu.zzs().zzl();
        if (v0_2 == 0) {
            return 0;
        } else {
            return v0_2.zzb;
        }
    }

    public final String zzaf()
    {
        try {
            return com.google.android.gms.measurement.internal.zzlt.zza(this.zzu.zzaY(), "google_app_id", this.zzu.zzq());
        } catch (int v0_1) {
            this.zzu.zzaV().zzb().zzb("getGoogleAppId failed with exception", v0_1);
            return 0;
        }
    }

    public final synthetic void zzag(android.content.SharedPreferences p6, String p7)
    {
        com.google.android.gms.measurement.internal.zzay v6_0 = this.zzu;
        if (v6_0.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaZ)) {
            if ((java.util.Objects.equals(p7, "IABTCF_TCString")) || ((java.util.Objects.equals(p7, "IABTCF_gdprApplies")) || (java.util.Objects.equals(p7, "IABTCF_EnableAdvertiserConsentMode")))) {
                v6_0.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
                ((com.google.android.gms.measurement.internal.zzay) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzt)).zzb(500);
                return;
            }
        } else {
            if (java.util.Objects.equals(p7, "IABTCF_TCString")) {
                v6_0.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
                ((com.google.android.gms.measurement.internal.zzay) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzt)).zzb(500);
                return;
            }
        }
        return;
    }

    public final synthetic void zzah(android.os.Bundle p15)
    {
        android.os.Bundle v2_0;
        if (!p15.isEmpty()) {
            com.google.android.gms.measurement.internal.zzgs v0_3 = this.zzu;
            v2_0 = new android.os.Bundle(v0_3.zzd().zzt.zza());
            String v3_4 = p15.keySet().iterator();
            while(true) {
                com.google.android.gms.measurement.internal.zzgs v5_2 = 0;
                if (!v3_4.hasNext()) {
                    break;
                }
                java.util.Iterator v4_6 = ((String) v3_4.next());
                String v6_4 = p15.get(v4_6);
                if ((v6_4 == null) || (((v6_4 instanceof String)) || (((v6_4 instanceof Long)) || ((v6_4 instanceof Double))))) {
                    if (!com.google.android.gms.measurement.internal.zzpp.zzZ(v4_6)) {
                        if (v6_4 != null) {
                            if (v0_3.zzk().zzu("param", v4_6, v0_3.zzc().zze(0, 0), v6_4)) {
                                v0_3.zzk().zzM(v2_0, v4_6, v6_4);
                            }
                        } else {
                            v2_0.remove(v4_6);
                        }
                    } else {
                        v0_3.zzaV().zzh().zzb("Invalid default event parameter name. Name", v4_6);
                    }
                } else {
                    if (v0_3.zzk().zzt(v6_4)) {
                        v0_3.zzk().zzN(this.zzv, 0, 27, 0, 0, 0);
                    }
                    v0_3.zzaV().zzh().zzc("Invalid default event parameter type. Name, value", v4_6, v6_4);
                }
            }
            v0_3.zzk();
            String v3_6 = v0_3.zzc().zzc();
            if (v2_0.size() > v3_6) {
                java.util.Iterator v4_4 = new java.util.TreeSet(v2_0.keySet()).iterator();
                while (v4_4.hasNext()) {
                    String v6_2 = v4_4.next();
                    v5_2++;
                    if (v5_2 > v3_6) {
                        v2_0.remove(((String) v6_2));
                    }
                }
                v0_3.zzk().zzN(this.zzv, 0, 26, 0, 0, 0);
                v0_3.zzaV().zzh().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        } else {
            v2_0 = p15;
        }
        com.google.android.gms.measurement.internal.zzgs v0_1 = this.zzu;
        v0_1.zzd().zzt.zzb(v2_0);
        if ((p15.isEmpty()) && (!v0_1.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaW))) {
            return;
        } else {
            this.zzu.zzt().zzH(v2_0);
            return;
        }
    }

    public final synthetic void zzai(int p6)
    {
        if (this.zzk == null) {
            this.zzk = new com.google.android.gms.measurement.internal.zzjx(this, this.zzu);
        }
        this.zzk.zzb((((long) p6) * 1000));
        return;
    }

    public final synthetic void zzaj(Boolean p1, boolean p2)
    {
        this.zzas(p1, 1);
        return;
    }

    public final synthetic void zzak(com.google.android.gms.measurement.internal.zzjl p7, long p8, boolean p10, boolean p11)
    {
        this.zzg();
        this.zzb();
        com.google.android.gms.measurement.internal.zzgs v0_0 = this.zzu;
        String v1_6 = v0_0.zzd().zzl();
        if ((p8 <= this.zzq) && (com.google.android.gms.measurement.internal.zzjl.zzu(v1_6.zzb(), p7.zzb()))) {
            v0_0.zzaV().zzi().zzb("Dropped out-of-date consent setting, proposed settings", p7);
            return;
        } else {
            String v1_2 = v0_0.zzd();
            v1_2.zzg();
            int v2_1 = p7.zzb();
            if (!v1_2.zzk(v2_1)) {
                v0_0.zzaV().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(p7.zzb()));
                return;
            } else {
                com.google.android.gms.measurement.internal.zzic v3_1 = this.zzu;
                String v1_5 = v1_2.zzd().edit();
                v1_5.putString("consent_settings", p7.zzl());
                v1_5.putInt("consent_source", v2_1);
                v1_5.apply();
                v0_0.zzaV().zzk().zzb("Setting storage consent(FE)", p7);
                this.zzq = p8;
                if (!v3_1.zzt().zzP()) {
                    v3_1.zzt().zzj(p10);
                } else {
                    v3_1.zzt().zzk(p10);
                }
                if (p11) {
                    v3_1.zzt().zzC(new java.util.concurrent.atomic.AtomicReference());
                }
                return;
            }
        }
    }

    public final synthetic void zzal()
    {
        this.zzat();
        return;
    }

    public final synthetic void zzam(boolean p1)
    {
        this.zzi = 0;
        return;
    }

    public final synthetic int zzan()
    {
        return this.zzj;
    }

    public final synthetic void zzao(int p1)
    {
        this.zzj = p1;
        return;
    }

    public final synthetic com.google.android.gms.measurement.internal.zzay zzap()
    {
        return this.zzr;
    }

    public final synthetic int zzaq(Throwable p5)
    {
        int v0_0 = p5.getMessage();
        this.zzn = 0;
        if (v0_0 != 0) {
            if ((!(p5 instanceof IllegalStateException)) && ((!v0_0.contains("garbage collected")) && (!p5.getClass().getSimpleName().equals("ServiceUnavailableException")))) {
                if (!(p5 instanceof SecurityException)) {
                    return 2;
                } else {
                    if (!v0_0.endsWith("READ_DEVICE_CONFIG")) {
                        return 3;
                    } else {
                        return 2;
                    }
                }
            } else {
                if (v0_0.contains("Background")) {
                    this.zzn = 1;
                    return 1;
                } else {
                    return 1;
                }
            }
        } else {
            return 2;
        }
    }

    public final boolean zze()
    {
        return 0;
    }

    public final void zzh()
    {
        android.app.Application v0_0 = this.zzu;
        if (((v0_0.zzaY().getApplicationContext() instanceof android.app.Application)) && (this.zza != null)) {
            ((android.app.Application) v0_0.zzaY().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
        return;
    }

    public final Boolean zzi()
    {
        java.util.concurrent.atomic.AtomicReference v1_1 = new java.util.concurrent.atomic.AtomicReference();
        return ((Boolean) this.zzu.zzaW().zzk(v1_1, 15000, "boolean test flag value", new com.google.android.gms.measurement.internal.zzke(this, v1_1)));
    }

    public final String zzj()
    {
        java.util.concurrent.atomic.AtomicReference v1_1 = new java.util.concurrent.atomic.AtomicReference();
        return ((String) this.zzu.zzaW().zzk(v1_1, 15000, "String test flag value", new com.google.android.gms.measurement.internal.zzko(this, v1_1)));
    }

    public final Long zzk()
    {
        java.util.concurrent.atomic.AtomicReference v1_1 = new java.util.concurrent.atomic.AtomicReference();
        return ((Long) this.zzu.zzaW().zzk(v1_1, 15000, "long test flag value", new com.google.android.gms.measurement.internal.zzkp(this, v1_1)));
    }

    public final Integer zzl()
    {
        java.util.concurrent.atomic.AtomicReference v1_1 = new java.util.concurrent.atomic.AtomicReference();
        return ((Integer) this.zzu.zzaW().zzk(v1_1, 15000, "int test flag value", new com.google.android.gms.measurement.internal.zzkq(this, v1_1)));
    }

    public final Double zzm()
    {
        java.util.concurrent.atomic.AtomicReference v1_1 = new java.util.concurrent.atomic.AtomicReference();
        return ((Double) this.zzu.zzaW().zzk(v1_1, 15000, "double test flag value", new com.google.android.gms.measurement.internal.zzkr(this, v1_1)));
    }

    public final void zzn(Boolean p3)
    {
        this.zzb();
        this.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzks(this, p3));
        return;
    }

    public final void zzp(android.os.Bundle p9, int p10, long p11)
    {
        this.zzb();
        boolean v0_3 = com.google.android.gms.measurement.internal.zzjj.zza.zzb();
        com.google.android.gms.measurement.internal.zzlj v1_3 = v0_3.length;
        String v2_0 = 0;
        while(true) {
            String v3_0 = 0;
            if (v2_0 < v1_3) {
                String v4_0 = v0_3[v2_0].zze;
                if (p9.containsKey(v4_0)) {
                    String v4_1 = p9.getString(v4_0);
                    if (v4_1 != null) {
                        if (!v4_1.equals("granted")) {
                            if (v4_1.equals("denied")) {
                                v3_0 = Boolean.FALSE;
                            }
                        } else {
                            v3_0 = Boolean.TRUE;
                        }
                        if (v3_0 == null) {
                            break;
                        }
                    }
                }
                v2_0++;
            }
            if (v3_0 != null) {
                boolean v0_1 = this.zzu;
                v0_1.zzaV().zzh().zzb("Ignoring invalid consent setting", v3_0);
                v0_1.zzaV().zzh().zza("Valid consent values are \'granted\', \'denied\'");
            }
            boolean v0_7 = this.zzu.zzaW().zze();
            com.google.android.gms.measurement.internal.zzlj v1_4 = com.google.android.gms.measurement.internal.zzjl.zze(p9, p10);
            if (v1_4.zzc()) {
                this.zzs(v1_4, v0_7);
            }
            com.google.android.gms.measurement.internal.zzlj v1_5 = com.google.android.gms.measurement.internal.zzaz.zzh(p9, p10);
            if (v1_5.zzd()) {
                this.zzq(v1_5, v0_7);
            }
            Boolean v9_1 = com.google.android.gms.measurement.internal.zzaz.zzi(p9);
            if (v9_1 != null) {
                String v10_1;
                if (p10 != -30) {
                    v10_1 = "app";
                } else {
                    v10_1 = "tcf";
                }
                String v2_4 = v10_1;
                if (!v0_7) {
                    this.zzL(v2_4, "allow_personalized_ads", v9_1.toString(), 0, p11);
                } else {
                    this.zzN(v2_4, "allow_personalized_ads", v9_1.toString(), p11);
                    return;
                }
            }
            return;
        }
        v3_0 = v4_1;
    }

    public final void zzq(com.google.android.gms.measurement.internal.zzaz p2, boolean p3)
    {
        com.google.android.gms.measurement.internal.zzkt v0_1 = new com.google.android.gms.measurement.internal.zzkt(this, p2);
        if (!p3) {
            this.zzu.zzaW().zzj(v0_1);
            return;
        } else {
            this.zzg();
            v0_1.run();
            return;
        }
    }

    public final void zzs(com.google.android.gms.measurement.internal.zzjl p10, boolean p11)
    {
        this.zzb();
        int v0_0 = p10.zzb();
        if (v0_0 != -10) {
            com.google.android.gms.measurement.internal.zzkv v3_7 = com.google.android.gms.measurement.internal.zzji.zza;
            if ((p10.zzp() == v3_7) && (p10.zzq() == v3_7)) {
                this.zzu.zzaV().zzh().zza("Ignoring empty consent settings");
                return;
            }
        }
        try {
            com.google.android.gms.measurement.internal.zzkv v3_3;
            com.google.android.gms.measurement.internal.zzlj v8;
            com.google.android.gms.measurement.internal.zzlj v4_0 = 0;
        } catch (int v0_2) {
        }
        if (!com.google.android.gms.measurement.internal.zzjl.zzu(v0_0, this.zzo.zzb())) {
            v3_3 = 0;
            v8 = 0;
        } else {
            v3_3 = p10.zzr(this.zzo);
            com.google.android.gms.measurement.internal.zzjl v5_0 = com.google.android.gms.measurement.internal.zzjk.zzb;
            if ((p10.zzo(v5_0)) && (!this.zzo.zzo(v5_0))) {
                v4_0 = 1;
            }
            p10 = p10.zzt(this.zzo);
            this.zzo = p10;
            v8 = v4_0;
            v4_0 = 1;
        }
        if (v4_0 != null) {
            long v6_2 = this.zzp.getAndIncrement();
            if (v3_3 == null) {
                com.google.android.gms.measurement.internal.zzkv v3_6 = new com.google.android.gms.measurement.internal.zzkv(this, p10, v6_2, v8);
                if (p11 == null) {
                    if ((v0_0 != 30) && (v0_0 != -10)) {
                        this.zzu.zzaW().zzj(v3_6);
                        return;
                    } else {
                        this.zzu.zzaW().zzl(v3_6);
                        return;
                    }
                } else {
                    this.zzg();
                    v3_6.run();
                    return;
                }
            } else {
                this.zzg.set(0);
                com.google.android.gms.measurement.internal.zzkv v3_9 = new com.google.android.gms.measurement.internal.zzku(this, p10, v6_2, v8);
                if (p11 == null) {
                    this.zzu.zzaW().zzl(v3_9);
                    return;
                } else {
                    this.zzg();
                    v3_9.run();
                    return;
                }
            }
        } else {
            this.zzu.zzaV().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", p10);
            return;
        }
    }

    public final void zzt(Runnable p13)
    {
        this.zzb();
        com.google.android.gms.measurement.internal.zzgs v0_0 = this.zzu;
        if (v0_0.zzaW().zze()) {
            v1.a.s(v0_0, "Cannot retrieve and upload batches from analytics worker thread");
            return;
        } else {
            if (v0_0.zzaW().zzf()) {
                v1.a.s(v0_0, "Cannot retrieve and upload batches from analytics network thread");
                return;
            } else {
                v0_0.zzaU();
                if (com.google.android.gms.measurement.internal.zzae.zza()) {
                    v1.a.s(v0_0, "Cannot retrieve and upload batches from main thread");
                    return;
                } else {
                    v0_0.zzaV().zzk().zza("[sgtm] Started client-side batch upload work.");
                    int v2_1 = 0;
                    int v3_0 = 0;
                    int v4 = 0;
                    while (v2_1 == 0) {
                        v0_0.zzaV().zzk().zza("[sgtm] Getting upload batches from service (FE)");
                        String v7_1 = new java.util.concurrent.atomic.AtomicReference();
                        v0_0.zzaW().zzk(v7_1, 10000, "[sgtm] Getting upload batches", new com.google.android.gms.measurement.internal.zzli(this, v7_1));
                        int v2_5 = ((com.google.android.gms.measurement.internal.zzoq) v7_1.get());
                        if (v2_5 == 0) {
                            break;
                        }
                        int v2_6 = v2_5.zza;
                        if (v2_6.isEmpty()) {
                            break;
                        }
                        v0_0.zzaV().zzk().zzb("[sgtm] Retrieved upload batches. count", Integer.valueOf(v2_6.size()));
                        v3_0 += v2_6.size();
                        int v2_7 = v2_6.iterator();
                        while (v2_7.hasNext()) {
                            com.google.android.gms.measurement.internal.zzlr v5_8 = this.zzar(((com.google.android.gms.measurement.internal.zzom) v2_7.next()));
                            if (v5_8 != com.google.android.gms.measurement.internal.zzlr.zzb) {
                                if (v5_8 == com.google.android.gms.measurement.internal.zzlr.zzd) {
                                    v2_1 = 1;
                                }
                            } else {
                                v4++;
                            }
                            v0_0.zzaV().zzk().zzc("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(v3_0), Integer.valueOf(v4));
                            p13.run();
                            return;
                        }
                        v2_1 = 0;
                    }
                    v0_0.zzaV().zzk().zzc("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(v3_0), Integer.valueOf(v4));
                    p13.run();
                    return;
                }
            }
        }
    }

    public final void zzu(long p3)
    {
        this.zzg();
        if (this.zzl == null) {
            this.zzl = new com.google.android.gms.measurement.internal.zzju(this, this.zzu);
        }
        this.zzl.zzb(p3);
        return;
    }

    public final void zzv()
    {
        this.zzg();
        com.google.android.gms.measurement.internal.zzay v0 = this.zzl;
        if (v0 != null) {
            v0.zzd();
        }
        return;
    }

    public final void zzw()
    {
        com.google.android.gms.internal.measurement.zzqp.zza();
        com.google.android.gms.measurement.internal.zzhz v0_0 = this.zzu;
        if (v0_0.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaQ)) {
            if (v0_0.zzaW().zze()) {
                v1.a.s(v0_0, "Cannot get trigger URIs from analytics worker thread");
            } else {
                v0_0.zzaU();
                if (com.google.android.gms.measurement.internal.zzae.zza()) {
                    v1.a.s(v0_0, "Cannot get trigger URIs from main thread");
                    return;
                } else {
                    this.zzb();
                    v0_0.zzaV().zzk().zza("Getting trigger URIs (FE)");
                    java.util.concurrent.atomic.AtomicReference v4_1 = new java.util.concurrent.atomic.AtomicReference();
                    v0_0.zzaW().zzk(v4_1, 10000, "get trigger URIs", new com.google.android.gms.measurement.internal.zzla(this, v4_1));
                    String v1_9 = ((java.util.List) v4_1.get());
                    if (v1_9 != null) {
                        v0_0.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlb(this, v1_9));
                        return;
                    } else {
                        v0_0.zzaV().zzd().zza("Timed out waiting for get trigger URIs");
                        return;
                    }
                }
            }
        }
        return;
    }

    public final boolean zzx()
    {
        return this.zzn;
    }

    public final java.util.PriorityQueue zzy()
    {
        if (this.zzm == null) {
            this.zzm = new java.util.PriorityQueue(java.util.Comparator.comparing(com.google.android.gms.measurement.internal.zzlc.zza, com.google.android.gms.measurement.internal.zzld.zza));
        }
        return this.zzm;
    }

    public final void zzz()
    {
        this.zzg();
        this.zzn = 0;
        if ((!this.zzy().isEmpty()) && (!this.zzi)) {
            b5.l v1_2 = ((com.google.android.gms.measurement.internal.zzoh) this.zzy().poll());
            if (v1_2 != null) {
                p4.b v2_0 = this.zzu;
                com.google.android.gms.measurement.internal.zzjw v3_1 = v2_0.zzk().zzT();
                if (v3_1 != null) {
                    this.zzi = 1;
                    int v4_1 = v1_2.zza;
                    v2_0.zzaV().zzk().zzb("Registering trigger URI", v4_1);
                    p4.b v2_4 = v3_1.b(android.net.Uri.parse(v4_1));
                    if (v2_4 != null) {
                        v2_4.a(new b5.l(9, v2_4, new com.google.android.gms.measurement.internal.zzjw(this, v1_2)), new com.google.android.gms.measurement.internal.zzjv(this));
                    } else {
                        this.zzi = 0;
                        this.zzy().add(v1_2);
                        return;
                    }
                }
            }
        }
        return;
    }
}
