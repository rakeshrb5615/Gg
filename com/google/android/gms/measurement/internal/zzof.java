package com.google.android.gms.measurement.internal;
public final class zzof {
    static final m4.d zza;
    public static final synthetic int zzb;

    static zzof()
    {
        Object[] v2 = "PublisherCC";
        int v4 = "PublisherRestrictions3";
        String v6 = "PublisherRestrictions7";
        String v8 = "AuthorizePurpose3";
        v2 = new Object[24];
        v2[0] = "Version";
        v2[1] = "GoogleConsent";
        v2[2] = "VendorConsent";
        v2[3] = "VendorLegitimateInterest";
        v2[4] = "gdprApplies";
        v2[5] = "EnableAdvertiserConsentMode";
        v2[6] = "PolicyVersion";
        v2[7] = "PurposeConsents";
        v2[8] = "PurposeOneTreatment";
        v2[9] = "Purpose1";
        v2[10] = "Purpose3";
        v2[11] = "Purpose4";
        System.arraycopy(new String[] {"Purpose7", "PurposeDiagnostics"}), 0, v2, 12, 12);
        j5.t1.d(24, v2);
        com.google.android.gms.measurement.internal.zzof.zza = m4.d.e(24, v2);
        return;
    }

    public static String zza(android.content.SharedPreferences p1, String p2)
    {
        try {
            return p1.getString(p2, "");
        } catch (ClassCastException) {
            return "";
        }
    }

    public static int zzb(android.content.SharedPreferences p1, String p2)
    {
        try {
            return p1.getInt(p2, -1);
        } catch (ClassCastException) {
            return -1;
        }
    }

    public static final boolean zzc(com.google.android.gms.internal.measurement.zzkp p18, m4.f p19, m4.f p20, m4.g p21, char[] p22, int p23, int p24, int p25, int p26, int p27, String p28, String p29, String p30, boolean p31, boolean p32, boolean p33)
    {
        m4.f v8_0;
        m4.f v7_0;
        boolean v0_5 = com.google.android.gms.measurement.internal.zzof.zze(p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, 1);
        if (v0_5) {
            v7_0 = p24;
            v8_0 = p25;
        } else {
            v8_0 = p25;
            if (p25 != 1) {
                v7_0 = p24;
            } else {
                v7_0 = p24;
                if (p24 == 1) {
                    v7_0 = 1;
                    v8_0 = 1;
                    boolean v0_3;
                    p33 = v0_5;
                    if (com.google.android.gms.measurement.internal.zzof.zzi(p18, p19, p20, p21, p22, p23, v7_0, v8_0, p26, p27, p28, p29, p30, p31, p32, 1) != com.google.android.gms.internal.measurement.zzkq.zza) {
                        m4.g v4_9;
                        String v11_10;
                        int v10_2 = p27;
                        if (p18 != com.google.android.gms.internal.measurement.zzkp.zzb) {
                            v4_9 = p21;
                            v11_10 = p28;
                        } else {
                            v4_9 = p21;
                            v11_10 = p28;
                            if (p27 == 1) {
                                if (!p21.contains(p28)) {
                                    v10_2 = 1;
                                } else {
                                    if ((p33 > 0) && (p22[p33] != 50)) {
                                        p22[p33] = 49;
                                    }
                                    return 1;
                                }
                            }
                        }
                        if (p19.containsKey(p18)) {
                            boolean v0_17 = ((com.google.android.gms.measurement.internal.zzoe) p19.get(p18));
                            if (v0_17) {
                                boolean v0_18 = v0_17.ordinal();
                                if (!v0_18) {
                                    if (com.google.android.gms.measurement.internal.zzof.zzi(p18, p19, p20, p21, p22, p23, v7_0, v8_0, p26, v10_2, p28, p29, p30, p31, p32, 1) != com.google.android.gms.internal.measurement.zzkq.zzc) {
                                        return com.google.android.gms.measurement.internal.zzof.zzg(p18, p19, p20, p21, p22, p23, v7_0, v8_0, p26, v10_2, p28, p29, p30, p31, p32, 1);
                                    }
                                } else {
                                    if (v0_18 == 1) {
                                        if (com.google.android.gms.measurement.internal.zzof.zzi(p18, p19, p20, p21, p22, p23, v7_0, v8_0, p26, v10_2, p28, p29, p30, p31, p32, 1) != com.google.android.gms.internal.measurement.zzkq.zzb) {
                                            return com.google.android.gms.measurement.internal.zzof.zzh(p18, p19, p20, p21, p22, p23, v7_0, v8_0, p26, v10_2, p28, p29, p30, p31, p32, 1);
                                        }
                                    } else {
                                        if (v0_18 == 2) {
                                            if (com.google.android.gms.measurement.internal.zzof.zzi(p18, p19, p20, p21, p22, p23, v7_0, v8_0, p26, v10_2, p28, p29, p30, p31, p32, 1) != com.google.android.gms.internal.measurement.zzkq.zzc) {
                                                return com.google.android.gms.measurement.internal.zzof.zzg(p18, p19, p20, p21, p22, p23, v7_0, v8_0, p26, v10_2, p28, p29, p30, p31, p32, 1);
                                            } else {
                                                return com.google.android.gms.measurement.internal.zzof.zzh(p18, p19, p20, p21, p22, p23, v7_0, v8_0, p26, v10_2, p28, p29, p30, p31, p32, 1);
                                            }
                                        } else {
                                            if (v0_18 == 3) {
                                                if (com.google.android.gms.measurement.internal.zzof.zzi(p18, p19, p20, v4_9, p22, p23, v7_0, v8_0, p26, v10_2, v11_10, p29, p30, p31, p32, 1) != com.google.android.gms.internal.measurement.zzkq.zzb) {
                                                    return com.google.android.gms.measurement.internal.zzof.zzh(p18, p19, p20, p21, p22, p23, v7_0, v8_0, p26, v10_2, p28, p29, p30, p31, p32, 1);
                                                } else {
                                                    return com.google.android.gms.measurement.internal.zzof.zzg(p18, p19, p20, p21, p22, p23, v7_0, v8_0, p26, v10_2, p28, p29, p30, p31, p32, 1);
                                                }
                                            }
                                        }
                                        v0_3 = 48;
                                        if ((p33 > 0) && (p22[p33] != 50)) {
                                            p22[p33] = v0_3;
                                        }
                                        return 0;
                                    }
                                }
                                v0_3 = 56;
                            }
                        }
                    } else {
                        v0_3 = 51;
                    }
                } else {
                    v8_0 = 1;
                }
            }
            p22[v0_5] = 50;
        }
    }

    public static final java.util.Map zzd(m4.f p28, m4.f p29, m4.g p30, char[] p31, int p32, int p33, int p34, int p35, int p36, String p37, String p38, String p39, boolean p40, boolean p41, boolean p42)
    {
        if (p42 != null) {
            String v12_5;
            int v1_8 = com.google.android.gms.internal.measurement.zzkp.zzb;
            m4.n v0_20 = ((com.google.android.gms.internal.measurement.zzkq) p29.get(v1_8));
            g0.d v2_12 = com.google.android.gms.internal.measurement.zzkp.zzd;
            String v4_8 = ((com.google.android.gms.internal.measurement.zzkq) p29.get(v2_12));
            String v5_0 = com.google.android.gms.internal.measurement.zzkp.zze;
            String v6_2 = ((com.google.android.gms.internal.measurement.zzkq) p29.get(v5_0));
            int v7_2 = com.google.android.gms.internal.measurement.zzkp.zzh;
            int v8_4 = ((com.google.android.gms.internal.measurement.zzkq) p29.get(v7_2));
            int v9_4 = new g0.d(4);
            v9_4.g("Version", "2");
            String v17 = "1";
            if (1 == p40) {
                v12_5 = "1";
            } else {
                v12_5 = "0";
            }
            String v12_6;
            v9_4.g("VendorConsent", v12_5);
            if (1 == p41) {
                v12_6 = "1";
            } else {
                v12_6 = "0";
            }
            String v13_6;
            v9_4.g("VendorLegitimateInterest", v12_6);
            if (p34 == 1) {
                v13_6 = "1";
            } else {
                v13_6 = "0";
            }
            String v13_7;
            v9_4.g("gdprApplies", v13_6);
            if (p33 == 1) {
                v13_7 = "1";
            } else {
                v13_7 = "0";
            }
            String v13_11;
            v9_4.g("EnableAdvertiserConsentMode", v13_7);
            v9_4.g("PolicyVersion", String.valueOf(p35));
            v9_4.g("CmpSdkID", String.valueOf(p32));
            if (p36 == 1) {
                v13_11 = "1";
            } else {
                v13_11 = "0";
            }
            m4.n v0_24;
            String v19_3 = v0_20;
            v9_4.g("PurposeOneTreatment", v13_11);
            v9_4.g("PublisherCC", p37);
            if (v19_3 == null) {
                v0_24 = com.google.android.gms.internal.measurement.zzkq.zzd.zza();
            } else {
                v0_24 = v19_3.zza();
            }
            m4.n v0_27;
            String v20_2 = v1_8;
            v9_4.g("PublisherRestrictions1", String.valueOf(v0_24));
            if (v4_8 == null) {
                v0_27 = com.google.android.gms.internal.measurement.zzkq.zzd.zza();
            } else {
                v0_27 = v4_8.zza();
            }
            m4.n v0_30;
            v9_4.g("PublisherRestrictions3", String.valueOf(v0_27));
            if (v6_2 == null) {
                v0_30 = com.google.android.gms.internal.measurement.zzkq.zzd.zza();
            } else {
                v0_30 = v6_2.zza();
            }
            m4.n v0_2;
            v9_4.g("PublisherRestrictions4", String.valueOf(v0_30));
            if (v8_4 == 0) {
                v0_2 = com.google.android.gms.internal.measurement.zzkq.zzd.zza();
            } else {
                v0_2 = v8_4.zza();
            }
            String v19_2;
            v9_4.g("PublisherRestrictions7", String.valueOf(v0_2));
            g0.d v21 = v9_4;
            int v1_1 = v20_2;
            com.google.android.gms.internal.measurement.zzkp v24 = v1_1;
            int v1_2 = v2_12;
            String v42_2 = com.google.android.gms.measurement.internal.zzof.zzf(v1_1, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, 1);
            com.google.android.gms.internal.measurement.zzkp v25 = v1_2;
            int v1_3 = v5_0;
            String v19_1 = com.google.android.gms.measurement.internal.zzof.zzf(v1_2, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, 1);
            com.google.android.gms.internal.measurement.zzkp v26 = v1_3;
            int v1_4 = v7_2;
            String v20_1 = com.google.android.gms.measurement.internal.zzof.zzf(v1_3, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, 1);
            m4.n v0_7 = com.google.android.gms.measurement.internal.zzof.zzf(v1_4, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, 1);
            com.google.android.gms.internal.measurement.zzkp v27 = v1_4;
            q4.b.e("Purpose1", v42_2);
            q4.b.e("Purpose3", v19_1);
            q4.b.e("Purpose4", v20_1);
            q4.b.e("Purpose7", v0_7);
            v21.h(m4.n.b(4, new Object[] {"Purpose1", v0_7}), 0).entrySet());
            if (1 == com.google.android.gms.measurement.internal.zzof.zzc(v24, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, 1)) {
                v19_2 = "1";
            } else {
                v19_2 = "0";
            }
            // Both branches of the condition point to the same code.
            // if (1 == com.google.android.gms.measurement.internal.zzof.zzc(v25, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, 1)) {
                String v23;
                if (1 == com.google.android.gms.measurement.internal.zzof.zzc(v26, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, 1)) {
                    v23 = "1";
                } else {
                    v23 = "0";
                }
                if (1 != com.google.android.gms.measurement.internal.zzof.zzc(v27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, 1)) {
                    v17 = "0";
                }
                p32 = "AuthorizePurpose4";
                p34 = "AuthorizePurpose7";
                p35 = v17;
                p29 = v19_2;
                p33 = v23;
                g0.d v2_11 = v21;
                v2_11.h(m4.n.b(5, new Object[] {"AuthorizePurpose1", new String(p31)}), 0).entrySet());
                return v2_11.b();
            // }
        } else {
            return m4.n.m;
        }
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzkp p0, m4.f p1, m4.f p2, m4.g p3, char[] p4, int p5, int p6, int p7, int p8, int p9, String p10, String p11, String p12, boolean p13, boolean p14, boolean p15)
    {
        if (p0 != com.google.android.gms.internal.measurement.zzkp.zzb) {
            if (p0 != com.google.android.gms.internal.measurement.zzkp.zzd) {
                if (p0 != com.google.android.gms.internal.measurement.zzkp.zze) {
                    if (p0 != com.google.android.gms.internal.measurement.zzkp.zzh) {
                        return -1;
                    } else {
                        return 4;
                    }
                } else {
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    private static final String zzf(com.google.android.gms.internal.measurement.zzkp p0, m4.f p1, m4.f p2, m4.g p3, char[] p4, int p5, int p6, int p7, int p8, int p9, String p10, String p11, String p12, boolean p13, boolean p14, boolean p15)
    {
        String v1_4;
        p2 = "0";
        if ((android.text.TextUtils.isEmpty(p11)) || (p11.length() < p0.zza())) {
            v1_4 = "0";
        } else {
            v1_4 = String.valueOf(p11.charAt((p0.zza() - 1)));
        }
        if ((!android.text.TextUtils.isEmpty(p12)) && (p12.length() >= p0.zza())) {
            p2 = String.valueOf(p12.charAt((p0.zza() - 1)));
        }
        return String.valueOf(v1_4).concat(String.valueOf(p2));
    }

    private static final boolean zzg(com.google.android.gms.internal.measurement.zzkp p17, m4.f p18, m4.f p19, m4.g p20, char[] p21, int p22, int p23, int p24, int p25, int p26, String p27, String p28, String p29, boolean p30, boolean p31, boolean p32)
    {
        char v3_5;
        int v0 = com.google.android.gms.measurement.internal.zzof.zze(p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, 1);
        int v1_1 = 0;
        if (p30) {
            if (p28.length() >= p17.zza()) {
                char v3_4 = p28.charAt((p17.zza() - 1));
                int v4_1 = 49;
                if (v3_4 == 49) {
                    v1_1 = 1;
                }
                if ((v0 > 0) && (p21[v0] != 50)) {
                    if (v3_4 != 49) {
                        v4_1 = 54;
                    }
                    p21[v0] = v4_1;
                }
                return v1_1;
            } else {
                v3_5 = 48;
            }
        } else {
            v3_5 = 52;
        }
        if ((v0 > 0) && (p21[v0] != 50)) {
            p21[v0] = v3_5;
        }
        return 0;
    }

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzkp p17, m4.f p18, m4.f p19, m4.g p20, char[] p21, int p22, int p23, int p24, int p25, int p26, String p27, String p28, String p29, boolean p30, boolean p31, boolean p32)
    {
        char v3_5;
        int v0 = com.google.android.gms.measurement.internal.zzof.zze(p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, 1);
        int v1_1 = 0;
        if (p31) {
            if (p29.length() >= p17.zza()) {
                char v3_4 = p29.charAt((p17.zza() - 1));
                int v4_1 = 49;
                if (v3_4 == 49) {
                    v1_1 = 1;
                }
                if ((v0 > 0) && (p21[v0] != 50)) {
                    if (v3_4 != 49) {
                        v4_1 = 55;
                    }
                    p21[v0] = v4_1;
                }
                return v1_1;
            } else {
                v3_5 = 48;
            }
        } else {
            v3_5 = 53;
        }
        if ((v0 > 0) && (p21[v0] != 50)) {
            p21[v0] = v3_5;
        }
        return 0;
    }

    private static final com.google.android.gms.internal.measurement.zzkq zzi(com.google.android.gms.internal.measurement.zzkp p0, m4.f p1, m4.f p2, m4.g p3, char[] p4, int p5, int p6, int p7, int p8, int p9, String p10, String p11, String p12, boolean p13, boolean p14, boolean p15)
    {
        com.google.android.gms.internal.measurement.zzkq v1_0 = com.google.android.gms.internal.measurement.zzkq.zzd;
        Object v0_1 = p2.get(p0);
        if (v0_1 != null) {
            v1_0 = v0_1;
        }
        return ((com.google.android.gms.internal.measurement.zzkq) v1_0);
    }
}
