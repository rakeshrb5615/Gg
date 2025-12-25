package com.google.android.gms.internal.measurement;
public final class zzas implements java.lang.Iterable, com.google.android.gms.internal.measurement.zzao {
    private final String zza;

    public zzas(String p2)
    {
        if (p2 == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        } else {
            this.zza = p2;
            return;
        }
    }

    public final boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof com.google.android.gms.internal.measurement.zzas)) {
                return this.zza.equals(((com.google.android.gms.internal.measurement.zzas) p2).zza);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.zza.hashCode();
    }

    public final java.util.Iterator iterator()
    {
        return new com.google.android.gms.internal.measurement.zzar(this);
    }

    public final String toString()
    {
        String v1 = this.zza;
        return v1.a.o(new StringBuilder((v1.length() + 2)), "\"", v1, "\"");
    }

    public final synthetic String zzb()
    {
        return this.zza;
    }

    public final String zzc()
    {
        return this.zza;
    }

    public final com.google.android.gms.internal.measurement.zzao zzcA(String p26, com.google.android.gms.internal.measurement.zzg p27, java.util.List p28)
    {
        if (("charAt".equals(p26)) || (("concat".equals(p26)) || (("hasOwnProperty".equals(p26)) || (("indexOf".equals(p26)) || (("lastIndexOf".equals(p26)) || (("match".equals(p26)) || (("replace".equals(p26)) || (("search".equals(p26)) || (("slice".equals(p26)) || (("split".equals(p26)) || (("substring".equals(p26)) || (("toLowerCase".equals(p26)) || (("toLocaleLowerCase".equals(p26)) || (("toString".equals(p26)) || (("toUpperCase".equals(p26)) || ("toLocaleUpperCase".equals(p26))))))))))))))))) {
            com.google.android.gms.internal.measurement.zzas v16_16 = "hasOwnProperty";
            int v3_45 = "trim";
        } else {
            v16_16 = "hasOwnProperty";
            v3_45 = "trim";
            if (!"trim".equals(p26)) {
                throw new IllegalArgumentException(g2.g.d(p26, " is not a String function"));
            }
        }
        IllegalArgumentException v0_0;
        String v19 = "undefined";
        int v10_0 = 0;
        switch (p26.hashCode()) {
            case -1789698943:
                int v4_51 = v16_16;
                if (!p26.equals(v4_51)) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza(v4_51, 1, p28);
                    String v1_87 = this.zza;
                    String v2_91 = p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(0)));
                    if (!"length".equals(v2_91.zzc())) {
                        String v2_93 = v2_91.zzd().doubleValue();
                        if (v2_93 == Math.floor(v2_93)) {
                            String v2_94 = ((int) v2_93);
                            if ((v2_94 >= null) && (v2_94 < v1_87.length())) {
                                return com.google.android.gms.internal.measurement.zzao.zzk;
                            }
                        }
                        return com.google.android.gms.internal.measurement.zzao.zzl;
                    } else {
                        return com.google.android.gms.internal.measurement.zzao.zzk;
                    }
                }
            case -1776922004:
                if (!p26.equals("toString")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("toString", 0, p28);
                    return this;
                }
            case -1464939364:
                if (!p26.equals("toLocaleLowerCase")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("toLocaleLowerCase", 0, p28);
                    return new com.google.android.gms.internal.measurement.zzas(this.zza.toLowerCase());
                }
            case -1361633751:
                if (!p26.equals("charAt")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zzc("charAt", 1, p28);
                    if (!p28.isEmpty()) {
                        v10_0 = ((int) com.google.android.gms.internal.measurement.zzh.zzi(p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(0))).zzd().doubleValue()));
                    }
                    String v1_78 = this.zza;
                    if ((v10_0 >= 0) && (v10_0 < v1_78.length())) {
                        return new com.google.android.gms.internal.measurement.zzas(String.valueOf(v1_78.charAt(v10_0)));
                    } else {
                        return com.google.android.gms.internal.measurement.zzao.zzm;
                    }
                }
            case -1354795244:
                v0_0 = this;
                if (!p26.equals("concat")) {
                } else {
                    if (p28.isEmpty()) {
                        return v0_0;
                    } else {
                        int v4_49 = new StringBuilder(this.zza);
                        while (v10_0 < p28.size()) {
                            v4_49.append(p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(v10_0))).zzc());
                            v10_0++;
                        }
                        return new com.google.android.gms.internal.measurement.zzas(v4_49.toString());
                    }
                }
            case -1137582698:
                if (!p26.equals("toLowerCase")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("toLowerCase", 0, p28);
                    return new com.google.android.gms.internal.measurement.zzas(this.zza.toLowerCase(java.util.Locale.ENGLISH));
                }
            case -906336856:
                if (!p26.equals("search")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zzc("search", 1, p28);
                    if (!p28.isEmpty()) {
                        v19 = p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(0))).zzc();
                    }
                    String v1_53 = java.util.regex.Pattern.compile(v19).matcher(this.zza);
                    if (!v1_53.find()) {
                        return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(-4616189618054758400));
                    } else {
                        return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) v1_53.start())));
                    }
                }
            case -726908483:
                if (!p26.equals("toLocaleUpperCase")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("toLocaleUpperCase", 0, p28);
                    return new com.google.android.gms.internal.measurement.zzas(this.zza.toUpperCase());
                }
            case -467511597:
                if (!p26.equals("lastIndexOf")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zzc("lastIndexOf", 2, p28);
                    String v1_40 = this.zza;
                    if (p28.size() > 0) {
                        v19 = p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(0))).zzc();
                    }
                    String v2_66 = v19;
                    int v3_36;
                    if (p28.size() >= 2) {
                        v3_36 = p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(1))).zzd().doubleValue();
                    } else {
                        v3_36 = 9221120237041090560;
                    }
                    int v3_37;
                    if (!Double.isNaN(v3_36)) {
                        v3_37 = com.google.android.gms.internal.measurement.zzh.zzi(v3_36);
                    } else {
                        v3_37 = 9218868437227405312;
                    }
                    return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) v1_40.lastIndexOf(v2_66, ((int) v3_37)))));
                }
            case -399551817:
                if (!p26.equals("toUpperCase")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("toUpperCase", 0, p28);
                    return new com.google.android.gms.internal.measurement.zzas(this.zza.toUpperCase(java.util.Locale.ENGLISH));
                }
            case 3568674:
                if (!p26.equals(v3_45)) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zza("toUpperCase", 0, p28);
                    return new com.google.android.gms.internal.measurement.zzas(this.zza.trim());
                }
            case 103668165:
                if (!p26.equals("match")) {
                } else {
                    String v2_53;
                    com.google.android.gms.internal.measurement.zzh.zzc("match", 1, p28);
                    String v1_27 = this.zza;
                    if (p28.size() > 0) {
                        v2_53 = p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(0))).zzc();
                    } else {
                        v2_53 = "";
                    }
                    String v1_28 = java.util.regex.Pattern.compile(v2_53).matcher(v1_27);
                    if (!v1_28.find()) {
                        return com.google.android.gms.internal.measurement.zzao.zzg;
                    } else {
                        String v1_31 = new com.google.android.gms.internal.measurement.zzao[1];
                        v1_31[0] = new com.google.android.gms.internal.measurement.zzas(v1_28.group());
                        return new com.google.android.gms.internal.measurement.zzae(java.util.Arrays.asList(v1_31));
                    }
                }
            case 109526418:
                if (!p26.equals("slice")) {
                } else {
                    int v4_32;
                    com.google.android.gms.internal.measurement.zzh.zzc("slice", 2, p28);
                    String v1_24 = this.zza;
                    if (p28.isEmpty()) {
                        v4_32 = 0;
                    } else {
                        v4_32 = p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(0))).zzd().doubleValue();
                    }
                    StringBuilder v8_3;
                    int v4_33 = com.google.android.gms.internal.measurement.zzh.zzi(v4_32);
                    if (v4_33 >= 0) {
                        v8_3 = Math.min(v4_33, ((double) v1_24.length()));
                    } else {
                        v8_3 = Math.max((((double) v1_24.length()) + v4_33), 0);
                    }
                    String v2_38;
                    if (p28.size() <= 1) {
                        v2_38 = ((double) v1_24.length());
                    } else {
                        v2_38 = p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(1))).zzd().doubleValue();
                    }
                    String v2_44;
                    String v2_43 = com.google.android.gms.internal.measurement.zzh.zzi(v2_38);
                    if (v2_43 >= 0) {
                        v2_44 = Math.min(v2_43, ((double) v1_24.length()));
                    } else {
                        v2_44 = Math.max((((double) v1_24.length()) + v2_43), 0);
                    }
                    int v4_39 = ((int) v8_3);
                    return new com.google.android.gms.internal.measurement.zzas(v1_24.substring(v4_39, (Math.max(0, (((int) v2_44) - v4_39)) + v4_39)));
                }
            case 109648666:
                if (!p26.equals("split")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zzc("split", 2, p28);
                    String v1_15 = this.zza;
                    if (v1_15.length() != 0) {
                        String v2_25 = new java.util.ArrayList();
                        if (!p28.isEmpty()) {
                            String v5_8;
                            int v4_27 = p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(0))).zzc();
                            if (p28.size() <= 1) {
                                v5_8 = 2147483647;
                            } else {
                                v5_8 = com.google.android.gms.internal.measurement.zzh.zzh(p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(1))).zzd().doubleValue());
                            }
                            if (v5_8 != 0) {
                                int v4_30;
                                String v1_16 = v1_15.split(java.util.regex.Pattern.quote(v4_27), (((int) v5_8) + 1));
                                int v3_22 = v1_16.length;
                                if ((!v4_27.isEmpty()) || (v3_22 <= 0)) {
                                    v4_30 = v3_22;
                                } else {
                                    v10_0 = v1_16[0].isEmpty();
                                    v4_30 = (v3_22 - 1);
                                    if (!v1_16[v4_30].isEmpty()) {
                                    }
                                }
                                if (((long) v3_22) > v5_8) {
                                    v4_30--;
                                }
                                while (v10_0 < v4_30) {
                                    v2_25.add(new com.google.android.gms.internal.measurement.zzas(v1_16[v10_0]));
                                    v10_0++;
                                }
                            } else {
                                return new com.google.android.gms.internal.measurement.zzae();
                            }
                        } else {
                            v2_25.add(this);
                        }
                        return new com.google.android.gms.internal.measurement.zzae(v2_25);
                    } else {
                        String v2_26 = new com.google.android.gms.internal.measurement.zzao[1];
                        v2_26[0] = this;
                        return new com.google.android.gms.internal.measurement.zzae(java.util.Arrays.asList(v2_26));
                    }
                }
            case 530542161:
                if (!p26.equals("substring")) {
                } else {
                    String v2_15;
                    com.google.android.gms.internal.measurement.zzh.zzc("substring", 2, p28);
                    String v1_12 = this.zza;
                    if (p28.isEmpty()) {
                        v2_15 = 0;
                    } else {
                        v2_15 = ((int) com.google.android.gms.internal.measurement.zzh.zzi(p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(0))).zzd().doubleValue()));
                    }
                    int v3_10;
                    if (p28.size() <= 1) {
                        v3_10 = v1_12.length();
                    } else {
                        v3_10 = ((int) com.google.android.gms.internal.measurement.zzh.zzi(p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(1))).zzd().doubleValue()));
                    }
                    String v2_21 = Math.min(Math.max(v2_15, 0), v1_12.length());
                    int v3_16 = Math.min(Math.max(v3_10, 0), v1_12.length());
                    return new com.google.android.gms.internal.measurement.zzas(v1_12.substring(Math.min(v2_21, v3_16), Math.max(v2_21, v3_16)));
                }
            case 1094496948:
                v0_0 = this;
                if (!p26.equals("replace")) {
                } else {
                    com.google.android.gms.internal.measurement.zzh.zzc("replace", 2, p28);
                    String v1_5 = com.google.android.gms.internal.measurement.zzao.zzf;
                    if (!p28.isEmpty()) {
                        v19 = p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(0))).zzc();
                        if (p28.size() > 1) {
                            v1_5 = p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(1)));
                        }
                    }
                    String v2_9 = v19;
                    int v4_8 = this.zza;
                    String v5_1 = v4_8.indexOf(v2_9);
                    if (v5_1 < null) {
                        return v0_0;
                    } else {
                        if ((v1_5 instanceof com.google.android.gms.internal.measurement.zzai)) {
                            String v1_8 = ((com.google.android.gms.internal.measurement.zzai) v1_5);
                            double v6_2 = new com.google.android.gms.internal.measurement.zzas(v2_9);
                            com.google.android.gms.internal.measurement.zzah v11_1 = new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) v5_1)));
                            long v7_4 = new com.google.android.gms.internal.measurement.zzao[3];
                            v7_4[0] = v6_2;
                            v7_4[1] = v11_1;
                            v7_4[2] = this;
                            v1_5 = v1_8.zza(p27, java.util.Arrays.asList(v7_4));
                        }
                        double v6_4 = v4_8.substring(0, v5_1);
                        String v1_9 = v1_5.zzc();
                        String v2_13 = v4_8.substring((v2_9.length() + v5_1));
                        return new com.google.android.gms.internal.measurement.zzas(v1.a.o(new StringBuilder(((String.valueOf(v6_4).length() + String.valueOf(v1_9).length()) + String.valueOf(v2_13).length())), v6_4, v1_9, v2_13));
                    }
                }
            case 1943291465:
                if (!p26.equals("indexOf")) {
                } else {
                    int v3_0;
                    com.google.android.gms.internal.measurement.zzh.zzc("indexOf", 2, p28);
                    String v1_96 = this.zza;
                    if (p28.size() > 0) {
                        v3_0 = p27;
                        v19 = p27.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(0))).zzc();
                    } else {
                        v3_0 = p27;
                    }
                    String v2_3 = v19;
                    double v9_0;
                    if (p28.size() >= 2) {
                        v9_0 = v3_0.zza(((com.google.android.gms.internal.measurement.zzao) p28.get(1))).zzd().doubleValue();
                    } else {
                        v9_0 = 0;
                    }
                    return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) v1_96.indexOf(v2_3, ((int) com.google.android.gms.internal.measurement.zzh.zzi(v9_0))))));
                }
            default:
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public final Double zzd()
    {
        Double v0_0 = this.zza;
        if (v0_0.isEmpty()) {
            return Double.valueOf(0);
        } else {
            try {
                return Double.valueOf(v0_0);
            } catch (NumberFormatException) {
                return Double.valueOf(9221120237041090560);
            }
        }
    }

    public final Boolean zze()
    {
        return Boolean.valueOf((this.zza.isEmpty() ^ 1));
    }

    public final java.util.Iterator zzf()
    {
        return new com.google.android.gms.internal.measurement.zzaq(this);
    }

    public final com.google.android.gms.internal.measurement.zzao zzt()
    {
        return new com.google.android.gms.internal.measurement.zzas(this.zza);
    }
}
