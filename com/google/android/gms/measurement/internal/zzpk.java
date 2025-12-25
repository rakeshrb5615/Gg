package com.google.android.gms.measurement.internal;
public final class zzpk extends com.google.android.gms.measurement.internal.zzos {

    public zzpk(com.google.android.gms.measurement.internal.zzpg p1)
    {
        super(p1);
        return;
    }

    public static final void zzC(com.google.android.gms.internal.measurement.zzhr p3, String p4, Object p5)
    {
        com.google.android.gms.internal.measurement.zzhv v0_0 = p3.zza();
        int v1 = 0;
        while (v1 < v0_0.size()) {
            if (!p4.equals(((com.google.android.gms.internal.measurement.zzhw) v0_0.get(v1)).zzb())) {
                v1++;
            }
            com.google.android.gms.internal.measurement.zzhv v0_1 = com.google.android.gms.internal.measurement.zzhw.zzn();
            v0_1.zzb(p4);
            v0_1.zzf(((Long) p5).longValue());
            if (v1 < 0) {
                p3.zzg(v0_1);
                return;
            } else {
                p3.zze(v1, v0_1);
                return;
            }
        }
        v1 = -1;
    }

    public static final boolean zzD(com.google.android.gms.measurement.internal.zzbg p0, com.google.android.gms.measurement.internal.zzr p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        if (!android.text.TextUtils.isEmpty(p1.zzb)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static final android.os.Bundle zzE(java.util.List p5)
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        java.util.Iterator v5_1 = p5.iterator();
        while (v5_1.hasNext()) {
            String v1_0 = ((com.google.android.gms.internal.measurement.zzhw) v5_1.next());
            String v2 = v1_0.zzb();
            if (!v1_0.zzi()) {
                if (!v1_0.zzg()) {
                    if (!v1_0.zzc()) {
                        if (v1_0.zze()) {
                            v0_1.putLong(v2, v1_0.zzf());
                        }
                    } else {
                        v0_1.putString(v2, v1_0.zzd());
                    }
                } else {
                    v0_1.putFloat(v2, v1_0.zzh());
                }
            } else {
                v0_1.putDouble(v2, v1_0.zzj());
            }
        }
        return v0_1;
    }

    public static final com.google.android.gms.internal.measurement.zzhw zzF(com.google.android.gms.internal.measurement.zzhs p2, String p3)
    {
        int v2_2 = p2.zza().iterator();
        while (v2_2.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw v0_1 = ((com.google.android.gms.internal.measurement.zzhw) v2_2.next());
            if (v0_1.zzb().equals(p3)) {
                return v0_1;
            }
        }
        return 0;
    }

    public static final varargs java.util.Map zzG(com.google.android.gms.internal.measurement.zzhs p4, String[] p5)
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        java.util.Iterator v4_2 = p4.zza().iterator();
        while (v4_2.hasNext()) {
            String v1_1 = ((com.google.android.gms.internal.measurement.zzhw) v4_2.next());
            if (java.util.Arrays.asList(p5).contains(v1_1.zzb())) {
                Object v2_2 = com.google.android.gms.measurement.internal.zzpk.zzP(v1_1);
                if (v2_2 != null) {
                    v0_1.put(v1_1.zzb(), v2_2);
                }
            }
        }
        return v0_1;
    }

    public static final java.util.Map zzH(com.google.android.gms.internal.measurement.zzhs p3, String p4)
    {
        java.util.HashMap v4_1 = new java.util.HashMap();
        java.util.Iterator v3_2 = p3.zza().iterator();
        while (v3_2.hasNext()) {
            String v0_1 = ((com.google.android.gms.internal.measurement.zzhw) v3_2.next());
            if (v0_1.zzb().startsWith("gad_")) {
                Object v1_2 = com.google.android.gms.measurement.internal.zzpk.zzP(v0_1);
                if (v1_2 != null) {
                    v4_1.put(v0_1.zzb(), v1_2);
                }
            }
        }
        return v4_1;
    }

    public static final Object zzI(com.google.android.gms.internal.measurement.zzhs p0, String p1)
    {
        Object v0_1 = com.google.android.gms.measurement.internal.zzpk.zzF(p0, p1);
        if (v0_1 != null) {
            return com.google.android.gms.measurement.internal.zzpk.zzP(v0_1);
        } else {
            return 0;
        }
    }

    public static final Object zzJ(com.google.android.gms.internal.measurement.zzhs p0, String p1, Object p2)
    {
        Object v0_1 = com.google.android.gms.measurement.internal.zzpk.zzI(p0, p1);
        if (v0_1 != null) {
            return v0_1;
        } else {
            return p2;
        }
    }

    private final void zzK(StringBuilder p6, int p7, java.util.List p8)
    {
        if (p8 != null) {
            int v7_1 = (p7 + 1);
            java.util.Iterator v8_1 = p8.iterator();
            while (v8_1.hasNext()) {
                String v0_4 = ((com.google.android.gms.internal.measurement.zzhw) v8_1.next());
                if (v0_4 != null) {
                    int v1_2;
                    com.google.android.gms.measurement.internal.zzpk.zzM(p6, v7_1);
                    p6.append("param {\n");
                    Double v2 = 0;
                    if (!v0_4.zza()) {
                        v1_2 = 0;
                    } else {
                        v1_2 = this.zzu.zzl().zzb(v0_4.zzb());
                    }
                    int v1_6;
                    com.google.android.gms.measurement.internal.zzpk.zzS(p6, v7_1, "name", v1_2);
                    if (!v0_4.zzc()) {
                        v1_6 = 0;
                    } else {
                        v1_6 = v0_4.zzd();
                    }
                    int v1_8;
                    com.google.android.gms.measurement.internal.zzpk.zzS(p6, v7_1, "string_value", v1_6);
                    if (!v0_4.zze()) {
                        v1_8 = 0;
                    } else {
                        v1_8 = Long.valueOf(v0_4.zzf());
                    }
                    com.google.android.gms.measurement.internal.zzpk.zzS(p6, v7_1, "int_value", v1_8);
                    if (v0_4.zzi()) {
                        v2 = Double.valueOf(v0_4.zzj());
                    }
                    com.google.android.gms.measurement.internal.zzpk.zzS(p6, v7_1, "double_value", v2);
                    if (v0_4.zzm() > 0) {
                        this.zzK(p6, v7_1, v0_4.zzk());
                    }
                    com.google.android.gms.measurement.internal.zzpk.zzM(p6, v7_1);
                    p6.append("}\n");
                }
            }
        }
        return;
    }

    private final void zzL(StringBuilder p6, int p7, com.google.android.gms.internal.measurement.zzfh p8)
    {
        if (p8 != null) {
            com.google.android.gms.measurement.internal.zzpk.zzM(p6, p7);
            p6.append("filter {\n");
            if (p8.zze()) {
                com.google.android.gms.measurement.internal.zzpk.zzS(p6, p7, "complement", Boolean.valueOf(p8.zzf()));
            }
            if (p8.zzg()) {
                com.google.android.gms.measurement.internal.zzpk.zzS(p6, p7, "param_name", this.zzu.zzl().zzb(p8.zzh()));
            }
            if (p8.zza()) {
                int v0_7 = (p7 + 1);
                java.util.Iterator v2_0 = p8.zzb();
                if (v2_0 != null) {
                    com.google.android.gms.measurement.internal.zzpk.zzM(p6, v0_7);
                    p6.append("string_filter {\n");
                    if (v2_0.zza()) {
                        String v3_3;
                        switch (v2_0.zzj()) {
                            case 1:
                                v3_3 = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                v3_3 = "REGEXP";
                                break;
                            case 3:
                                v3_3 = "BEGINS_WITH";
                                break;
                            case 4:
                                v3_3 = "ENDS_WITH";
                                break;
                            case 5:
                                v3_3 = "PARTIAL";
                                break;
                            case 6:
                                v3_3 = "EXACT";
                                break;
                            default:
                                v3_3 = "IN_LIST";
                        }
                        com.google.android.gms.measurement.internal.zzpk.zzS(p6, v0_7, "match_type", v3_3);
                    }
                    if (v2_0.zzb()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(p6, v0_7, "expression", v2_0.zzc());
                    }
                    if (v2_0.zzd()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(p6, v0_7, "case_sensitive", Boolean.valueOf(v2_0.zze()));
                    }
                    if (v2_0.zzg() > 0) {
                        com.google.android.gms.measurement.internal.zzpk.zzM(p6, (p7 + 2));
                        p6.append("expression_list {\n");
                        java.util.Iterator v2_2 = v2_0.zzf().iterator();
                        while (v2_2.hasNext()) {
                            String v3_14 = ((String) v2_2.next());
                            com.google.android.gms.measurement.internal.zzpk.zzM(p6, (p7 + 3));
                            p6.append(v3_14);
                            p6.append("\n");
                        }
                        p6.append("}\n");
                    }
                    com.google.android.gms.measurement.internal.zzpk.zzM(p6, v0_7);
                    p6.append("}\n");
                }
            }
            if (p8.zzc()) {
                com.google.android.gms.measurement.internal.zzpk.zzT(p6, (p7 + 1), "number_filter", p8.zzd());
            }
            com.google.android.gms.measurement.internal.zzpk.zzM(p6, p7);
            p6.append("}\n");
            return;
        } else {
            return;
        }
    }

    private static final void zzM(StringBuilder p2, int p3)
    {
        int v0 = 0;
        while (v0 < p3) {
            p2.append("  ");
            v0++;
        }
        return;
    }

    private static final void zzN(android.net.Uri$Builder p0, String p1, String p2, java.util.Set p3)
    {
        if ((!p3.contains(p1)) && (!android.text.TextUtils.isEmpty(p2))) {
            p0.appendQueryParameter(p1, p2);
        }
        return;
    }

    private static final String zzO(boolean p1, boolean p2, boolean p3)
    {
        StringBuilder v0_1 = new StringBuilder();
        if (p1 != null) {
            v0_1.append("Dynamic ");
        }
        if (p2) {
            v0_1.append("Sequence ");
        }
        if (p3) {
            v0_1.append("Session-Scoped ");
        }
        return v0_1.toString();
    }

    private static final Object zzP(com.google.android.gms.internal.measurement.zzhw p2)
    {
        if (!p2.zzc()) {
            if (!p2.zze()) {
                if (!p2.zzi()) {
                    if (p2.zzm() <= 0) {
                        return 0;
                    } else {
                        return com.google.android.gms.measurement.internal.zzpk.zzy(p2.zzk());
                    }
                } else {
                    return Double.valueOf(p2.zzj());
                }
            } else {
                return Long.valueOf(p2.zzf());
            }
        } else {
            return p2.zzd();
        }
    }

    private static final void zzQ(android.net.Uri$Builder p5, String[] p6, android.os.Bundle p7, java.util.Set p8)
    {
        int v1 = 0;
        while (v1 < p6.length) {
            String v2_3 = p6[v1].split(",");
            String v2_0 = v2_3[(v2_3.length - 1)];
            String v3_0 = p7.getString(v2_3[0]);
            if (v3_0 != null) {
                com.google.android.gms.measurement.internal.zzpk.zzN(p5, v2_0, v3_0, p8);
            }
            v1++;
        }
        return;
    }

    private static final void zzR(StringBuilder p9, int p10, String p11, com.google.android.gms.internal.measurement.zzii p12)
    {
        if (p12 != 0) {
            com.google.android.gms.measurement.internal.zzpk.zzM(p9, 3);
            p9.append(p11);
            p9.append(" {\n");
            if (p12.zzd() != 0) {
                com.google.android.gms.measurement.internal.zzpk.zzM(p9, 4);
                p9.append("results: ");
                java.util.Iterator v11_3 = p12.zzc().iterator();
                boolean v4_1 = 0;
                while (v11_3.hasNext()) {
                    int v5_11 = ((Long) v11_3.next());
                    long v6_6 = (v4_1 + 1);
                    if (v4_1) {
                        p9.append(", ");
                    }
                    p9.append(v5_11);
                    v4_1 = v6_6;
                }
                p9.append(10);
            }
            if (p12.zzb() != 0) {
                com.google.android.gms.measurement.internal.zzpk.zzM(p9, 4);
                p9.append("status: ");
                java.util.Iterator v11_7 = p12.zza().iterator();
                boolean v4_0 = 0;
                while (v11_7.hasNext()) {
                    int v5_9 = ((Long) v11_7.next());
                    long v6_5 = (v4_0 + 1);
                    if (v4_0) {
                        p9.append(", ");
                    }
                    p9.append(v5_9);
                    v4_0 = v6_5;
                }
                p9.append(10);
            }
            if (p12.zzf() != 0) {
                com.google.android.gms.measurement.internal.zzpk.zzM(p9, 4);
                p9.append("dynamic_filter_timestamps: {");
                java.util.Iterator v11_12 = p12.zze().iterator();
                int v5_7 = 0;
                while (v11_12.hasNext()) {
                    long v6_4 = ((com.google.android.gms.internal.measurement.zzhq) v11_12.next());
                    int v7 = (v5_7 + 1);
                    if (v5_7 != 0) {
                        p9.append(", ");
                    }
                    int v5_1;
                    if (!v6_4.zza()) {
                        v5_1 = 0;
                    } else {
                        v5_1 = Integer.valueOf(v6_4.zzb());
                    }
                    int v5_5;
                    p9.append(v5_1);
                    p9.append(":");
                    if (!v6_4.zzc()) {
                        v5_5 = 0;
                    } else {
                        v5_5 = Long.valueOf(v6_4.zzd());
                    }
                    p9.append(v5_5);
                    v5_7 = v7;
                }
                p9.append("}\n");
            }
            if (p12.zzh() != 0) {
                com.google.android.gms.measurement.internal.zzpk.zzM(p9, 4);
                p9.append("sequence_filter_timestamps: {");
                java.util.Iterator v11_16 = p12.zzg().iterator();
                int v12_2 = 0;
                while (v11_16.hasNext()) {
                    int v1_3 = ((com.google.android.gms.internal.measurement.zzik) v11_16.next());
                    int v5_14 = (v12_2 + 1);
                    if (v12_2 != 0) {
                        p9.append(", ");
                    }
                    int v12_4;
                    if (!v1_3.zza()) {
                        v12_4 = 0;
                    } else {
                        v12_4 = Integer.valueOf(v1_3.zzb());
                    }
                    p9.append(v12_4);
                    p9.append(": [");
                    int v12_8 = v1_3.zzc().iterator();
                    int v1_0 = 0;
                    while (v12_8.hasNext()) {
                        long v6_2 = ((Long) v12_8.next()).longValue();
                        int v8 = (v1_0 + 1);
                        if (v1_0 != 0) {
                            p9.append(", ");
                        }
                        p9.append(v6_2);
                        v1_0 = v8;
                    }
                    p9.append("]");
                    v12_2 = v5_14;
                }
                p9.append("}\n");
            }
            com.google.android.gms.measurement.internal.zzpk.zzM(p9, 3);
            p9.append("}\n");
            return;
        } else {
            return;
        }
    }

    private static final void zzS(StringBuilder p0, int p1, String p2, Object p3)
    {
        if (p3 != null) {
            com.google.android.gms.measurement.internal.zzpk.zzM(p0, (p1 + 1));
            p0.append(p2);
            p0.append(": ");
            p0.append(p3);
            p0.append(10);
            return;
        } else {
            return;
        }
    }

    private static final void zzT(StringBuilder p1, int p2, String p3, com.google.android.gms.internal.measurement.zzfl p4)
    {
        if (p4 != null) {
            com.google.android.gms.measurement.internal.zzpk.zzM(p1, p2);
            p1.append(p3);
            p1.append(" {\n");
            if (p4.zza()) {
                String v3_1;
                String v3_13 = p4.zzm();
                if (v3_13 == 1) {
                    v3_1 = "UNKNOWN_COMPARISON_TYPE";
                } else {
                    if (v3_13 == 2) {
                        v3_1 = "LESS_THAN";
                    } else {
                        if (v3_13 == 3) {
                            v3_1 = "GREATER_THAN";
                        } else {
                            if (v3_13 == 4) {
                                v3_1 = "EQUAL";
                            } else {
                                v3_1 = "BETWEEN";
                            }
                        }
                    }
                }
                com.google.android.gms.measurement.internal.zzpk.zzS(p1, p2, "comparison_type", v3_1);
            }
            if (p4.zzb()) {
                com.google.android.gms.measurement.internal.zzpk.zzS(p1, p2, "match_as_float", Boolean.valueOf(p4.zzc()));
            }
            if (p4.zzd()) {
                com.google.android.gms.measurement.internal.zzpk.zzS(p1, p2, "comparison_value", p4.zze());
            }
            if (p4.zzf()) {
                com.google.android.gms.measurement.internal.zzpk.zzS(p1, p2, "min_comparison_value", p4.zzg());
            }
            if (p4.zzh()) {
                com.google.android.gms.measurement.internal.zzpk.zzS(p1, p2, "max_comparison_value", p4.zzi());
            }
            com.google.android.gms.measurement.internal.zzpk.zzM(p1, p2);
            p1.append("}\n");
            return;
        } else {
            return;
        }
    }

    public static boolean zzm(String p1)
    {
        if ((p1 == 0) || ((!p1.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)")) || (p1.length() > 310))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean zzn(java.util.List p4, int p5)
    {
        if ((p5 >= (p4.size() * 64)) || (((1 << (p5 % 64)) & ((Long) p4.get((p5 / 64))).longValue()) == 0)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static java.util.List zzp(java.util.BitSet p10)
    {
        int v0_2 = ((p10.length() + 63) / 64);
        java.util.ArrayList v1_1 = new java.util.ArrayList(v0_2);
        int v4 = 0;
        while (v4 < v0_2) {
            long v5_0 = 0;
            int v7 = 0;
            while (v7 < 64) {
                long v8_1 = ((v4 * 64) + v7);
                if (v8_1 >= p10.length()) {
                    break;
                }
                if (p10.get(v8_1)) {
                    v5_0 |= (1 << v7);
                }
                v7++;
            }
            v1_1.add(Long.valueOf(v5_0));
            v4++;
        }
        return v1_1;
    }

    public static com.google.android.gms.internal.measurement.zznl zzw(com.google.android.gms.internal.measurement.zznl p1, byte[] p2)
    {
        com.google.android.gms.internal.measurement.zzlr v0 = com.google.android.gms.internal.measurement.zzlr.zza();
        if (v0 == null) {
            return p1.zzaW(p2);
        } else {
            return p1.zzaV(p2, v0);
        }
    }

    public static int zzx(com.google.android.gms.internal.measurement.zzic p2, String p3)
    {
        int v0 = 0;
        while (v0 < p2.zzl()) {
            if (!p3.equals(p2.zzm(v0).zzc())) {
                v0++;
            } else {
                return v0;
            }
        }
        return -1;
    }

    public static android.os.Bundle[] zzy(java.util.List p7)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        android.os.Bundle[] v7_3 = p7.iterator();
        while (v7_3.hasNext()) {
            boolean v1_1 = ((com.google.android.gms.internal.measurement.zzhw) v7_3.next());
            if (v1_1) {
                android.os.Bundle v2_1 = new android.os.Bundle();
                boolean v1_3 = v1_1.zzk().iterator();
                while (v1_3.hasNext()) {
                    String v3_2 = ((com.google.android.gms.internal.measurement.zzhw) v1_3.next());
                    if (!v3_2.zzc()) {
                        if (!v3_2.zze()) {
                            if (v3_2.zzi()) {
                                v2_1.putDouble(v3_2.zzb(), v3_2.zzj());
                            }
                        } else {
                            v2_1.putLong(v3_2.zzb(), v3_2.zzf());
                        }
                    } else {
                        v2_1.putString(v3_2.zzb(), v3_2.zzd());
                    }
                }
                if (!v2_1.isEmpty()) {
                    v0_1.add(v2_1);
                }
            }
        }
        android.os.Bundle[] v7_5 = new android.os.Bundle[v0_1.size()];
        return ((android.os.Bundle[]) v0_1.toArray(v7_5));
    }

    public final com.google.android.gms.measurement.internal.zzbg zzA(com.google.android.gms.internal.measurement.zzaa p9)
    {
        String v1_1;
        android.os.Bundle v0_1 = this.zzB(p9.zzf(), 1);
        if (!v0_1.containsKey("_o")) {
            v1_1 = "app";
        } else {
            String v1_0 = v0_1.get("_o");
            if (v1_0 == null) {
            } else {
                v1_1 = v1_0.toString();
            }
        }
        String v5 = v1_1;
        String v1_3 = com.google.android.gms.measurement.internal.zzjm.zzb(p9.zzb());
        if (v1_3 == null) {
            v1_3 = p9.zzb();
        }
        return new com.google.android.gms.measurement.internal.zzbg(v1_3, new com.google.android.gms.measurement.internal.zzbe(v0_1), v5, p9.zza());
    }

    public final android.os.Bundle zzB(java.util.Map p10, boolean p11)
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        java.util.Iterator v1_1 = p10.keySet().iterator();
        while (v1_1.hasNext()) {
            String v2_1 = ((String) v1_1.next());
            android.os.Parcelable[] v3_0 = p10.get(v2_1);
            if (v3_0 != null) {
                if (!(v3_0 instanceof Long)) {
                    if (!(v3_0 instanceof Double)) {
                        if (!(v3_0 instanceof java.util.ArrayList)) {
                            v0_1.putString(v2_1, v3_0.toString());
                        } else {
                            if (p11) {
                                android.os.Parcelable[] v3_2 = ((java.util.ArrayList) v3_0);
                                java.util.ArrayList v4_4 = new java.util.ArrayList();
                                int v5 = v3_2.size();
                                int v7 = 0;
                                while (v7 < v5) {
                                    v4_4.add(this.zzB(((java.util.Map) v3_2.get(v7)), 0));
                                    v7++;
                                }
                                android.os.Parcelable[] v3_3 = new android.os.Parcelable[0];
                                v0_1.putParcelableArray(v2_1, ((android.os.Parcelable[]) v4_4.toArray(v3_3)));
                            }
                        }
                    } else {
                        v0_1.putDouble(v2_1, ((Double) v3_0).doubleValue());
                    }
                } else {
                    v0_1.putLong(v2_1, ((Long) v3_0).longValue());
                }
            } else {
                v0_1.putString(v2_1, 0);
            }
        }
        return v0_1;
    }

    public final boolean zzbb()
    {
        return 0;
    }

    public final void zzc(com.google.android.gms.internal.measurement.zzit p3, Object p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        p3.zzd();
        p3.zzf();
        p3.zzh();
        if (!(p4 instanceof String)) {
            if (!(p4 instanceof Long)) {
                if (!(p4 instanceof Double)) {
                    this.zzu.zzaV().zzb().zzb("Ignoring invalid (type) user attribute value", p4);
                    return;
                } else {
                    p3.zzg(((Double) p4).doubleValue());
                    return;
                }
            } else {
                p3.zze(((Long) p4).longValue());
                return;
            }
        } else {
            p3.zzc(((String) p4));
            return;
        }
    }

    public final void zzd(com.google.android.gms.internal.measurement.zzhv p11, Object p12)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p12);
        p11.zze();
        p11.zzg();
        p11.zzi();
        p11.zzm();
        if (!(p12 instanceof String)) {
            if (!(p12 instanceof Long)) {
                if (!(p12 instanceof Double)) {
                    if (!(p12 instanceof android.os.Bundle[])) {
                        this.zzu.zzaV().zzb().zzb("Ignoring invalid (type) event param value", p12);
                        return;
                    } else {
                        String v0_3 = new java.util.ArrayList();
                        int v1 = ((android.os.Bundle[]) p12).length;
                        int v2 = 0;
                        while (v2 < v1) {
                            com.google.android.gms.internal.measurement.zzhw v3_0 = ((android.os.Bundle[]) p12)[v2];
                            if (v3_0 != null) {
                                com.google.android.gms.internal.measurement.zzhv v4 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                java.util.Iterator v5_1 = v3_0.keySet().iterator();
                                while (v5_1.hasNext()) {
                                    Double v6_2 = ((String) v5_1.next());
                                    com.google.android.gms.internal.measurement.zzhv v7 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                    v7.zzb(v6_2);
                                    Double v6_3 = v3_0.get(v6_2);
                                    if (!(v6_3 instanceof Long)) {
                                        if (!(v6_3 instanceof String)) {
                                            if ((v6_3 instanceof Double)) {
                                                v7.zzh(((Double) v6_3).doubleValue());
                                            }
                                        } else {
                                            v7.zzd(((String) v6_3));
                                        }
                                    } else {
                                        v7.zzf(((Long) v6_3).longValue());
                                    }
                                    v4.zzk(v7);
                                }
                                if (v4.zzj() > 0) {
                                    v0_3.add(((com.google.android.gms.internal.measurement.zzhw) v4.zzbc()));
                                }
                            }
                            v2++;
                        }
                        p11.zzl(v0_3);
                        return;
                    }
                } else {
                    p11.zzh(((Double) p12).doubleValue());
                    return;
                }
            } else {
                p11.zzf(((Long) p12).longValue());
                return;
            }
        } else {
            p11.zzd(((String) p12));
            return;
        }
    }

    public final com.google.android.gms.measurement.internal.zzoh zzf(String p17, com.google.android.gms.internal.measurement.zzic p18, com.google.android.gms.internal.measurement.zzhr p19, String p20)
    {
        com.google.android.gms.internal.measurement.zzqp.zza();
        String v2_18 = this.zzu;
        if (!v2_18.zzc().zzp(p17, com.google.android.gms.measurement.internal.zzfy.zzaP)) {
            return 0;
        } else {
            String v3_1 = v2_18.zzaZ().currentTimeMillis();
            java.util.Set v5_2 = v2_18.zzc().zzk(p17, com.google.android.gms.measurement.internal.zzfy.zzau).split(",");
            long v6_26 = new java.util.HashSet(v5_2.length);
            String v7_10 = v5_2.length;
            String v9_4 = 0;
            while (v9_4 < v7_10) {
                android.net.Uri$Builder v10_0 = v5_2[v9_4];
                java.util.Objects.requireNonNull(v10_0);
                if (!v6_26.add(v10_0)) {
                    String v2_28 = new StringBuilder("duplicate element: ");
                    v2_28.append(v10_0);
                    throw new IllegalArgumentException(v2_28.toString());
                } else {
                    v9_4++;
                }
            }
            java.util.Set v5_3 = java.util.Collections.unmodifiableSet(v6_26);
            long v6_36 = this.zzg;
            String v7_11 = v6_36.zzf();
            String v9_11 = v7_11.zzg.zzh().zzc(p17);
            android.net.Uri$Builder v10_2 = new android.net.Uri$Builder();
            String v7_12 = v7_11.zzu;
            v10_2.scheme(v7_12.zzc().zzk(p17, com.google.android.gms.measurement.internal.zzfy.zzan));
            if (android.text.TextUtils.isEmpty(v9_11)) {
                v10_2.authority(v7_12.zzc().zzk(p17, com.google.android.gms.measurement.internal.zzfy.zzao));
            } else {
                String v11_15 = v7_12.zzc().zzk(p17, com.google.android.gms.measurement.internal.zzfy.zzao);
                long v8_25 = new StringBuilder(((String.valueOf(v9_11).length() + 1) + String.valueOf(v11_15).length()));
                v8_25.append(v9_11);
                v8_25.append(".");
                v8_25.append(v11_15);
                v10_2.authority(v8_25.toString());
            }
            v10_2.path(v7_12.zzc().zzk(p17, com.google.android.gms.measurement.internal.zzfy.zzap));
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "gmp_app_id", p18.zzac(), v5_3);
            v2_18.zzc().zzi();
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "gmp_version", String.valueOf(133005), v5_3);
            String v7_0 = p18.zzV();
            String v9_0 = com.google.android.gms.measurement.internal.zzfy.zzaS;
            if ((v2_18.zzc().zzp(p17, v9_0)) && (v6_36.zzh().zzt(p17))) {
                v7_0 = "";
            }
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "app_instance_id", v7_0, v5_3);
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "rdid", p18.zzP(), v5_3);
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "bundle_id", p18.zzK(), v5_3);
            String v7_3 = p19.zzk();
            long v8_7 = com.google.android.gms.measurement.internal.zzjm.zza(v7_3);
            if (1 != android.text.TextUtils.isEmpty(v8_7)) {
                v7_3 = v8_7;
            }
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "app_event_name", v7_3, v5_3);
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "app_version", String.valueOf(p18.zzai()), v5_3);
            String v7_6 = p18.zzD();
            if ((v2_18.zzc().zzp(p17, v9_0)) && ((v6_36.zzh().zzq(p17)) && (!android.text.TextUtils.isEmpty(v7_6)))) {
                long v6_3 = v7_6.indexOf(".");
                if (v6_3 != -1) {
                    v7_6 = v7_6.substring(0, v6_3);
                }
            }
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "os_version", v7_6, v5_3);
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "timestamp", String.valueOf(p19.zzn()), v5_3);
            String v7_8 = "1";
            if (p18.zzS()) {
                com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "lat", "1", v5_3);
            }
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "privacy_sandbox_version", String.valueOf(p18.zzaG()), v5_3);
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "trigger_uri_source", "1", v5_3);
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "trigger_uri_timestamp", String.valueOf(v3_1), v5_3);
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "request_uuid", p20, v5_3);
            long v6_15 = p19.zza();
            long v8_18 = new android.os.Bundle();
            long v6_16 = v6_15.iterator();
            while (v6_16.hasNext()) {
                String v9_7 = ((com.google.android.gms.internal.measurement.zzhw) v6_16.next());
                String v11_9 = v9_7.zzb();
                if (!v9_7.zzi()) {
                    if (!v9_7.zzg()) {
                        if (!v9_7.zzc()) {
                            if (v9_7.zze()) {
                                v8_18.putString(v11_9, String.valueOf(v9_7.zzf()));
                            }
                        } else {
                            v8_18.putString(v11_9, v9_7.zzd());
                        }
                    } else {
                        v8_18.putString(v11_9, String.valueOf(v9_7.zzh()));
                    }
                } else {
                    v8_18.putString(v11_9, String.valueOf(v9_7.zzj()));
                }
            }
            com.google.android.gms.measurement.internal.zzpk.zzQ(v10_2, v2_18.zzc().zzk(p17, com.google.android.gms.measurement.internal.zzfy.zzat).split("\\|"), v8_18, v5_3);
            long v6_21 = p18.zzk();
            long v8_20 = new android.os.Bundle();
            long v6_22 = v6_21.iterator();
            while (v6_22.hasNext()) {
                String v11_3 = ((com.google.android.gms.internal.measurement.zziu) v6_22.next());
                boolean v12_0 = v11_3.zzc();
                if (!v11_3.zzj()) {
                    if (!v11_3.zzh()) {
                        if (!v11_3.zzd()) {
                            if (v11_3.zzf()) {
                                v8_20.putString(v12_0, String.valueOf(v11_3.zzg()));
                            }
                        } else {
                            v8_20.putString(v12_0, v11_3.zze());
                        }
                    } else {
                        v8_20.putString(v12_0, String.valueOf(v11_3.zzi()));
                    }
                } else {
                    v8_20.putString(v12_0, String.valueOf(v11_3.zzk()));
                }
            }
            com.google.android.gms.measurement.internal.zzpk.zzQ(v10_2, v2_18.zzc().zzk(p17, com.google.android.gms.measurement.internal.zzfy.zzas).split("\\|"), v8_20, v5_3);
            if (1 != p18.zzaC()) {
                v7_8 = "0";
            }
            com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "dma", v7_8, v5_3);
            if (!p18.zzaE().isEmpty()) {
                com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "dma_cps", p18.zzaE(), v5_3);
            }
            if (p18.zzaK()) {
                String v1_10 = p18.zzaL();
                if (!v1_10.zzb().isEmpty()) {
                    com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "dl_gclid", v1_10.zzb(), v5_3);
                }
                if (!v1_10.zzd().isEmpty()) {
                    com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "dl_gbraid", v1_10.zzd(), v5_3);
                }
                if (!v1_10.zzf().isEmpty()) {
                    com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "dl_gs", v1_10.zzf(), v5_3);
                }
                if (v1_10.zzh() > 0) {
                    com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "dl_ss_ts", String.valueOf(v1_10.zzh()), v5_3);
                }
                if (!v1_10.zzj().isEmpty()) {
                    com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "mr_gclid", v1_10.zzj(), v5_3);
                }
                if (!v1_10.zzm().isEmpty()) {
                    com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "mr_gbraid", v1_10.zzm(), v5_3);
                }
                if (!v1_10.zzo().isEmpty()) {
                    com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "mr_gs", v1_10.zzo(), v5_3);
                }
                if (v1_10.zzq() > 0) {
                    com.google.android.gms.measurement.internal.zzpk.zzN(v10_2, "mr_click_ts", String.valueOf(v1_10.zzq()), v5_3);
                }
            }
            return new com.google.android.gms.measurement.internal.zzoh(v10_2.build().toString(), v3_1, 1);
        }
    }

    public final com.google.android.gms.internal.measurement.zzhs zzh(com.google.android.gms.measurement.internal.zzbb p6)
    {
        com.google.android.gms.internal.measurement.zzhr v0 = com.google.android.gms.internal.measurement.zzhs.zzk();
        v0.zzq(p6.zze);
        com.google.android.gms.internal.measurement.zzhv v2_2 = p6.zzf;
        String v1_4 = new com.google.android.gms.measurement.internal.zzbd(v2_2);
        while (v1_4.hasNext()) {
            Object v3_0 = v1_4.zza();
            com.google.android.gms.internal.measurement.zzhv v4 = com.google.android.gms.internal.measurement.zzhw.zzn();
            v4.zzb(v3_0);
            Object v3_1 = v2_2.zza(v3_0);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_1);
            this.zzd(v4, v3_1);
            v0.zzg(v4);
        }
        com.google.android.gms.internal.measurement.zzhw v6_1 = p6.zzc;
        if ((!android.text.TextUtils.isEmpty(v6_1)) && (v2_2.zza("_o") == null)) {
            com.google.android.gms.internal.measurement.zzhv v2_1 = com.google.android.gms.internal.measurement.zzhw.zzn();
            v2_1.zzb("_o");
            v2_1.zzd(v6_1);
            v0.zzf(((com.google.android.gms.internal.measurement.zzhw) v2_1.zzbc()));
        }
        return ((com.google.android.gms.internal.measurement.zzhs) v0.zzbc());
    }

    public final String zzi(com.google.android.gms.internal.measurement.zzib p14)
    {
        if (p14 != null) {
            StringBuilder v0_1 = u.e.b("\nbatch {\n");
            if (p14.zzf()) {
                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 0, "upload_subdomain", p14.zzg());
            }
            if (p14.zzd()) {
                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 0, "sgtm_join_id", p14.zze());
            }
            String v14_2 = p14.zza().iterator();
            while (v14_2.hasNext()) {
                java.util.Iterator v1_4 = ((com.google.android.gms.internal.measurement.zzid) v14_2.next());
                if (v1_4 != null) {
                    com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 1);
                    v0_1.append("bundle {\n");
                    if (v1_4.zza()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "protocol_version", Integer.valueOf(v1_4.zzb()));
                    }
                    com.google.android.gms.internal.measurement.zzrb.zza();
                    com.google.android.gms.measurement.internal.zzic v3_6 = this.zzu;
                    if ((v3_6.zzc().zzp(v1_4.zzA(), com.google.android.gms.measurement.internal.zzfy.zzaM)) && (v1_4.zzag())) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "session_stitching_token", v1_4.zzah());
                    }
                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "platform", v1_4.zzt());
                    if (v1_4.zzC()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "gmp_version", Long.valueOf(v1_4.zzD()));
                    }
                    if (v1_4.zzE()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "uploading_gmp_version", Long.valueOf(v1_4.zzF()));
                    }
                    if (v1_4.zzac()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "dynamite_version", Long.valueOf(v1_4.zzad()));
                    }
                    if (v1_4.zzW()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "config_version", Long.valueOf(v1_4.zzX()));
                    }
                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "gmp_app_id", v1_4.zzP());
                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "app_id", v1_4.zzA());
                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "app_version", v1_4.zzB());
                    if (v1_4.zzU()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "app_version_major", Integer.valueOf(v1_4.zzV()));
                    }
                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "firebase_instance_id", v1_4.zzT());
                    if (v1_4.zzK()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "dev_cert_hash", Long.valueOf(v1_4.zzL()));
                    }
                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "app_store", v1_4.zzz());
                    if (v1_4.zzi()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "upload_timestamp_millis", Long.valueOf(v1_4.zzj()));
                    }
                    if (v1_4.zzk()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "start_timestamp_millis", Long.valueOf(v1_4.zzm()));
                    }
                    if (v1_4.zzn()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "end_timestamp_millis", Long.valueOf(v1_4.zzo()));
                    }
                    if (v1_4.zzp()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(v1_4.zzq()));
                    }
                    if (v1_4.zzr()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(v1_4.zzs()));
                    }
                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "app_instance_id", v1_4.zzJ());
                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "resettable_device_id", v1_4.zzG());
                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "ds_id", v1_4.zzZ());
                    if (v1_4.zzH()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "limited_ad_tracking", Boolean.valueOf(v1_4.zzI()));
                    }
                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "os_version", v1_4.zzu());
                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "device_model", v1_4.zzv());
                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "user_default_language", v1_4.zzw());
                    if (v1_4.zzx()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "time_zone_offset_minutes", Integer.valueOf(v1_4.zzy()));
                    }
                    if (v1_4.zzM()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "bundle_sequential_index", Integer.valueOf(v1_4.zzN()));
                    }
                    if (v1_4.zzau()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "delivery_index", Integer.valueOf(v1_4.zzav()));
                    }
                    if (v1_4.zzQ()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "service_upload", Boolean.valueOf(v1_4.zzR()));
                    }
                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "health_monitor", v1_4.zzO());
                    if (v1_4.zzaa()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "retry_counter", Integer.valueOf(v1_4.zzab()));
                    }
                    if (v1_4.zzae()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "consent_signals", v1_4.zzaf());
                    }
                    if (v1_4.zzan()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "is_dma_region", Boolean.valueOf(v1_4.zzao()));
                    }
                    if (v1_4.zzap()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "core_platform_services", v1_4.zzaq());
                    }
                    if (v1_4.zzal()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "consent_diagnostics", v1_4.zzam());
                    }
                    if (v1_4.zzai()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "target_os_version", Long.valueOf(v1_4.zzaj()));
                    }
                    com.google.android.gms.internal.measurement.zzqp.zza();
                    if (v3_6.zzc().zzp(v1_4.zzA(), com.google.android.gms.measurement.internal.zzfy.zzaP)) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "ad_services_version", Integer.valueOf(v1_4.zzar()));
                        if (v1_4.zzas()) {
                            java.util.List v4_70 = v1_4.zzat();
                            if (v4_70 != null) {
                                com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                                v0_1.append("attribution_eligibility_status {\n");
                                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "eligible", Boolean.valueOf(v4_70.zza()));
                                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(v4_70.zzb()));
                                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "pre_r", Boolean.valueOf(v4_70.zzc()));
                                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "r_extensions_too_old", Boolean.valueOf(v4_70.zzd()));
                                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "adservices_extension_too_old", Boolean.valueOf(v4_70.zze()));
                                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "ad_storage_not_allowed", Boolean.valueOf(v4_70.zzf()));
                                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "measurement_manager_disabled", Boolean.valueOf(v4_70.zzg()));
                                com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                                v0_1.append("}\n");
                            }
                        }
                    }
                    if (v1_4.zzaw()) {
                        java.util.List v4_74 = v1_4.zzax();
                        com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                        v0_1.append("ad_campaign_info {\n");
                        if (v4_74.zza()) {
                            com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "deep_link_gclid", v4_74.zzb());
                        }
                        if (v4_74.zzc()) {
                            com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "deep_link_gbraid", v4_74.zzd());
                        }
                        if (v4_74.zze()) {
                            com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "deep_link_gad_source", v4_74.zzf());
                        }
                        if (v4_74.zzg()) {
                            com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "deep_link_session_millis", Long.valueOf(v4_74.zzh()));
                        }
                        if (v4_74.zzi()) {
                            com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "market_referrer_gclid", v4_74.zzj());
                        }
                        if (v4_74.zzk()) {
                            com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "market_referrer_gbraid", v4_74.zzm());
                        }
                        if (v4_74.zzn()) {
                            com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "market_referrer_gad_source", v4_74.zzo());
                        }
                        if (v4_74.zzp()) {
                            com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "market_referrer_click_millis", Long.valueOf(v4_74.zzq()));
                        }
                        com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                        v0_1.append("}\n");
                    }
                    if (v1_4.zzaA()) {
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 1, "batching_timestamp_millis", Long.valueOf(v1_4.zzaB()));
                    }
                    if (v1_4.zzay()) {
                        String v9_2;
                        java.util.List v4_80 = v1_4.zzaz();
                        com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                        v0_1.append("sgtm_diagnostics {\n");
                        String v9_1 = v4_80.zzf();
                        if (v9_1 == 1) {
                            v9_2 = "UPLOAD_TYPE_UNKNOWN";
                        } else {
                            if (v9_1 == 2) {
                                v9_2 = "GA_UPLOAD";
                            } else {
                                if (v9_1 == 3) {
                                    v9_2 = "SDK_CLIENT_UPLOAD";
                                } else {
                                    if (v9_1 == 4) {
                                        v9_2 = "PACKAGE_SERVICE_UPLOAD";
                                    } else {
                                        v9_2 = "SDK_SERVICE_UPLOAD";
                                    }
                                }
                            }
                        }
                        java.util.List v4_82;
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "upload_type", v9_2);
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "client_upload_eligibility", v4_80.zza().name());
                        java.util.List v4_81 = v4_80.zzg();
                        if (v4_81 == 1) {
                            v4_82 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                        } else {
                            if (v4_81 == 2) {
                                v4_82 = "SERVICE_UPLOAD_ELIGIBLE";
                            } else {
                                if (v4_81 == 3) {
                                    v4_82 = "NOT_IN_ROLLOUT";
                                } else {
                                    if (v4_81 == 4) {
                                        v4_82 = "MISSING_SGTM_SETTINGS";
                                    } else {
                                        if (v4_81 == 5) {
                                            v4_82 = "MISSING_SGTM_PROXY_INFO";
                                        } else {
                                            v4_82 = "NON_PLAY_MISSING_SGTM_SERVER_URL";
                                        }
                                    }
                                }
                            }
                        }
                        com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "service_upload_eligibility", v4_82);
                        com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                        v0_1.append("}\n");
                    }
                    if (v1_4.zzaC()) {
                        java.util.List v4_84 = v1_4.zzaD();
                        com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                        v0_1.append("consent_info_extra {\n");
                        java.util.List v4_87 = v4_84.zza().iterator();
                        while (v4_87.hasNext()) {
                            Double v10_8;
                            String v9_33 = ((com.google.android.gms.internal.measurement.zzhl) v4_87.next());
                            com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 3);
                            v0_1.append("limited_data_modes {\n");
                            Double v10_7 = v9_33.zzc();
                            if (v10_7 == 1) {
                                v10_8 = "CONSENT_TYPE_UNSPECIFIED";
                            } else {
                                if (v10_7 == 2) {
                                    v10_8 = "AD_STORAGE";
                                } else {
                                    if (v10_7 == 3) {
                                        v10_8 = "ANALYTICS_STORAGE";
                                    } else {
                                        if (v10_7 == 4) {
                                            v10_8 = "AD_USER_DATA";
                                        } else {
                                            v10_8 = "AD_PERSONALIZATION";
                                        }
                                    }
                                }
                            }
                            String v9_35;
                            com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 3, "type", v10_8);
                            String v9_34 = v9_33.zzd();
                            if (v9_34 == 1) {
                                v9_35 = "NOT_LIMITED";
                            } else {
                                if (v9_34 == 2) {
                                    v9_35 = "LIMITED_MODE";
                                } else {
                                    v9_35 = "NO_DATA_MODE";
                                }
                            }
                            com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 3, "mode", v9_35);
                            com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 3);
                            v0_1.append("}\n");
                        }
                        com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                        v0_1.append("}\n");
                    }
                    java.util.List v4_88 = v1_4.zzf();
                    if (v4_88 != null) {
                        java.util.List v4_89 = v4_88.iterator();
                        while (v4_89.hasNext()) {
                            int v8_16 = ((com.google.android.gms.internal.measurement.zziu) v4_89.next());
                            if (v8_16 != 0) {
                                String v9_11;
                                com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                                v0_1.append("user_property {\n");
                                Double v10_2 = 0;
                                if (!v8_16.zza()) {
                                    v9_11 = 0;
                                } else {
                                    v9_11 = Long.valueOf(v8_16.zzb());
                                }
                                String v9_16;
                                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "set_timestamp_millis", v9_11);
                                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "name", v3_6.zzl().zzc(v8_16.zzc()));
                                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "string_value", v8_16.zze());
                                if (!v8_16.zzf()) {
                                    v9_16 = 0;
                                } else {
                                    v9_16 = Long.valueOf(v8_16.zzg());
                                }
                                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "int_value", v9_16);
                                if (v8_16.zzj()) {
                                    v10_2 = Double.valueOf(v8_16.zzk());
                                }
                                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "double_value", v10_2);
                                com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                                v0_1.append("}\n");
                            }
                        }
                    }
                    java.util.List v4_91 = v1_4.zzS();
                    if (v4_91 != null) {
                        java.util.List v4_92 = v4_91.iterator();
                        while (v4_92.hasNext()) {
                            int v8_21 = ((com.google.android.gms.internal.measurement.zzhg) v4_92.next());
                            if (v8_21 != 0) {
                                com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                                v0_1.append("audience_membership {\n");
                                if (v8_21.zza()) {
                                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "audience_id", Integer.valueOf(v8_21.zzb()));
                                }
                                if (v8_21.zzf()) {
                                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "new_audience", Boolean.valueOf(v8_21.zzg()));
                                }
                                com.google.android.gms.measurement.internal.zzpk.zzR(v0_1, 2, "current_data", v8_21.zzc());
                                if (v8_21.zzd()) {
                                    com.google.android.gms.measurement.internal.zzpk.zzR(v0_1, 2, "previous_data", v8_21.zze());
                                }
                                com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                                v0_1.append("}\n");
                            }
                        }
                    }
                    java.util.Iterator v1_6 = v1_4.zzc();
                    if (v1_6 != null) {
                        java.util.Iterator v1_7 = v1_6.iterator();
                        while (v1_7.hasNext()) {
                            java.util.List v4_97 = ((com.google.android.gms.internal.measurement.zzhs) v1_7.next());
                            if (v4_97 != null) {
                                com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                                v0_1.append("event {\n");
                                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "name", v3_6.zzl().zza(v4_97.zzd()));
                                if (v4_97.zze()) {
                                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "timestamp_millis", Long.valueOf(v4_97.zzf()));
                                }
                                if (v4_97.zzg()) {
                                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "previous_timestamp_millis", Long.valueOf(v4_97.zzh()));
                                }
                                if (v4_97.zzi()) {
                                    com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 2, "count", Integer.valueOf(v4_97.zzj()));
                                }
                                if (v4_97.zzb() != 0) {
                                    this.zzK(v0_1, 2, v4_97.zza());
                                }
                                com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 2);
                                v0_1.append("}\n");
                            }
                        }
                    }
                    com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 1);
                    v0_1.append("}\n");
                }
            }
            v0_1.append("} // End-of-batch\n");
            return v0_1.toString();
        } else {
            return "";
        }
    }

    public final String zzj(com.google.android.gms.internal.measurement.zzff p6)
    {
        if (p6 != null) {
            StringBuilder v0_1 = u.e.b("\nevent_filter {\n");
            if (p6.zza()) {
                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 0, "filter_id", Integer.valueOf(p6.zzb()));
            }
            com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 0, "event_name", this.zzu.zzl().zza(p6.zzc()));
            com.google.android.gms.internal.measurement.zzfh v1_5 = com.google.android.gms.measurement.internal.zzpk.zzO(p6.zzi(), p6.zzj(), p6.zzm());
            if (!v1_5.isEmpty()) {
                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 0, "filter_type", v1_5);
            }
            if (p6.zzg()) {
                com.google.android.gms.measurement.internal.zzpk.zzT(v0_1, 1, "event_count_filter", p6.zzh());
            }
            if (p6.zze() > 0) {
                v0_1.append("  filters {\n");
                String v6_2 = p6.zzd().iterator();
                while (v6_2.hasNext()) {
                    this.zzL(v0_1, 2, ((com.google.android.gms.internal.measurement.zzfh) v6_2.next()));
                }
            }
            com.google.android.gms.measurement.internal.zzpk.zzM(v0_1, 1);
            v0_1.append("}\n}\n");
            return v0_1.toString();
        } else {
            return "null";
        }
    }

    public final String zzk(com.google.android.gms.internal.measurement.zzfn p6)
    {
        if (p6 != null) {
            StringBuilder v0_1 = u.e.b("\nproperty_filter {\n");
            if (p6.zza()) {
                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 0, "filter_id", Integer.valueOf(p6.zzb()));
            }
            com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 0, "property_name", this.zzu.zzl().zzc(p6.zzc()));
            int v1_5 = com.google.android.gms.measurement.internal.zzpk.zzO(p6.zze(), p6.zzf(), p6.zzh());
            if (!v1_5.isEmpty()) {
                com.google.android.gms.measurement.internal.zzpk.zzS(v0_1, 0, "filter_type", v1_5);
            }
            this.zzL(v0_1, 1, p6.zzd());
            v0_1.append("}\n");
            return v0_1.toString();
        } else {
            return "null";
        }
    }

    public final android.os.Parcelable zzl(byte[] p5, android.os.Parcelable$Creator p6)
    {
        if (p5 != null) {
            android.os.Parcel v1 = android.os.Parcel.obtain();
            try {
                v1.unmarshall(p5, 0, p5.length);
                v1.setDataPosition(0);
                android.os.Parcelable v0_1 = ((android.os.Parcelable) p6.createFromParcel(v1));
            } catch (Throwable v5_5) {
                v1.recycle();
                throw v5_5;
            }
            v1.recycle();
            return v0_1;
        } else {
            return 0;
        }
    }

    public final java.util.List zzq(java.util.List p8, java.util.List p9)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList(p8);
        java.util.List v8_4 = p9.iterator();
        while (v8_4.hasNext()) {
            int v9_5 = ((Integer) v8_4.next());
            if (v9_5.intValue() >= 0) {
                long v1_6 = (v9_5.intValue() / 64);
                if (v1_6 < v0_1.size()) {
                    v0_1.set(v1_6, Long.valueOf((((Long) v0_1.get(v1_6)).longValue() & (~ (1 << (v9_5.intValue() % 64))))));
                } else {
                    this.zzu.zzaV().zze().zzc("Ignoring bit index greater than bitSet size", v9_5, Integer.valueOf(v0_1.size()));
                }
            } else {
                this.zzu.zzaV().zze().zzb("Ignoring negative bit index to be cleared", v9_5);
            }
        }
        java.util.List v8_1 = v0_1.size();
        int v9_2 = (v0_1.size() - 1);
        while(true) {
            int v9_3 = v8_1;
            v8_1 = v9_2;
            if ((v8_1 < null) || (((Long) v0_1.get(v8_1)).longValue() != 0)) {
                break;
            }
            v9_2 = (v8_1 - 1);
        }
        return v0_1.subList(0, v9_3);
    }

    public final boolean zzs(long p4, long p6)
    {
        if ((p4 != 0) && ((p6 > 0) && (Math.abs((this.zzu.zzaZ().currentTimeMillis() - p4)) <= p6))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final long zzt(byte[] p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        long v0_0 = this.zzu;
        v0_0.zzk().zzg();
        java.security.MessageDigest v1_1 = com.google.android.gms.measurement.internal.zzpp.zzO();
        if (v1_1 != null) {
            return com.google.android.gms.measurement.internal.zzpp.zzP(v1_1.digest(p3));
        } else {
            v1.a.s(v0_0, "Failed to get MD5");
            return 0;
        }
    }

    public final long zzu(String p3)
    {
        if (!android.text.TextUtils.isEmpty(p3)) {
            return this.zzt(p3.getBytes(java.nio.charset.Charset.forName("UTF-8")));
        } else {
            return 0;
        }
    }

    public final byte[] zzv(byte[] p3)
    {
        try {
            com.google.android.gms.measurement.internal.zzgs v0_1 = new java.io.ByteArrayOutputStream();
            String v1_2 = new java.util.zip.GZIPOutputStream(v0_1);
            v1_2.write(p3);
            v1_2.close();
            v0_1.close();
            return v0_1.toByteArray();
        } catch (java.io.IOException v3_1) {
            this.zzu.zzaV().zzb().zzb("Failed to gzip content", v3_1);
            throw v3_1;
        }
    }

    public final java.util.Map zzz(android.os.Bundle p11, boolean p12)
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        java.util.Iterator v1_1 = p11.keySet().iterator();
        while (v1_1.hasNext()) {
            String v2_1 = ((String) v1_1.next());
            java.util.Map v3_0 = p11.get(v2_1);
            boolean v4_0 = (v3_0 instanceof android.os.Parcelable[]);
            if ((!v4_0) && ((!(v3_0 instanceof java.util.ArrayList)) && (!(v3_0 instanceof android.os.Bundle)))) {
                if (v3_0 == null) {
                } else {
                    v0_1.put(v2_1, v3_0);
                }
            } else {
                if (p12) {
                    java.util.ArrayList v5_3 = new java.util.ArrayList();
                    if (!v4_0) {
                        if (!(v3_0 instanceof java.util.ArrayList)) {
                            if ((v3_0 instanceof android.os.Bundle)) {
                                v5_3.add(this.zzz(((android.os.Bundle) v3_0), 0));
                            }
                        } else {
                            java.util.Map v3_3 = ((java.util.ArrayList) v3_0);
                            boolean v4_3 = v3_3.size();
                            int v7_0 = 0;
                            while (v7_0 < v4_3) {
                                java.util.Map v8_0 = v3_3.get(v7_0);
                                if ((v8_0 instanceof android.os.Bundle)) {
                                    v5_3.add(this.zzz(((android.os.Bundle) v8_0), 0));
                                }
                                v7_0++;
                            }
                        }
                    } else {
                        java.util.Map v3_4 = ((android.os.Parcelable[]) v3_0);
                        boolean v4_4 = v3_4.length;
                        int v7_1 = 0;
                        while (v7_1 < v4_4) {
                            java.util.Map v8_3 = v3_4[v7_1];
                            if ((v8_3 instanceof android.os.Bundle)) {
                                v5_3.add(this.zzz(((android.os.Bundle) v8_3), 0));
                            }
                            v7_1++;
                        }
                    }
                    v0_1.put(v2_1, v5_3);
                }
            }
        }
        return v0_1;
    }
}
