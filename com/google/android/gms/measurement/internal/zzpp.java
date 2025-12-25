package com.google.android.gms.measurement.internal;
public final class zzpp extends com.google.android.gms.measurement.internal.zzjf {
    public static final synthetic int zza;
    private static final String[] zzb;
    private static final String[] zzc;
    private java.security.SecureRandom zzd;
    private final java.util.concurrent.atomic.AtomicLong zze;
    private int zzf;
    private w1.b zzg;
    private Boolean zzh;
    private Integer zzi;

    static zzpp()
    {
        com.google.android.gms.measurement.internal.zzpp.zzb = new String[] {"firebase_", "google_", "ga_"});
        com.google.android.gms.measurement.internal.zzpp.zzc = new String[] {"_err"});
        return;
    }

    public zzpp(com.google.android.gms.measurement.internal.zzic p3)
    {
        super(p3);
        super.zzi = 0;
        super.zze = new java.util.concurrent.atomic.AtomicLong(0);
        return;
    }

    public static java.security.MessageDigest zzO()
    {
        int v0_0 = 0;
        while (v0_0 < 2) {
            try {
                java.security.MessageDigest v1_2 = java.security.MessageDigest.getInstance("MD5");
            } catch (java.security.NoSuchAlgorithmException) {
                v0_0++;
            }
            if (v1_2 != null) {
                return v1_2;
            }
        }
        return 0;
    }

    public static long zzP(byte[] p8)
    {
        long v2_1;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8);
        int v0_0 = p8.length;
        int v1 = 0;
        if (v0_0 <= 0) {
            v2_1 = 0;
        } else {
            v2_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(v2_1);
        int v0_1 = (v0_0 - 1);
        long v2_0 = 0;
        while ((v0_1 >= 0) && (v0_1 >= (p8.length - 8))) {
            v2_0 += ((((long) p8[v0_1]) & 255) << v1);
            v1 += 8;
            v0_1--;
        }
        return v2_0;
    }

    public static boolean zzQ(android.content.Context p0, boolean p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p0);
        return com.google.android.gms.measurement.internal.zzpp.zzR(p0, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean zzR(android.content.Context p3, String p4)
    {
        try {
            android.content.pm.PackageManager v1 = p3.getPackageManager();
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            return 0;
        }
        if (v1 != null) {
            int v3_2 = v1.getServiceInfo(new android.content.ComponentName(p3, p4), 0);
            if ((v3_2 == 0) || (!v3_2.enabled)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public static boolean zzZ(String p1)
    {
        if ((android.text.TextUtils.isEmpty(p1)) || (!p1.startsWith("_"))) {
            return 0;
        } else {
            return 1;
        }
    }

    private static boolean zzaA(String p3, String[] p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        int v1 = 0;
        while (v1 < p4.length) {
            if (!java.util.Objects.equals(p3, p4[v1])) {
                v1++;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public static boolean zzaf(String p2)
    {
        if (!com.google.android.gms.measurement.internal.zzpp.zzc[0].equals(p2)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static java.util.ArrayList zzas(java.util.List p6)
    {
        if (p6 != null) {
            java.util.ArrayList v0_1 = new java.util.ArrayList(p6.size());
            java.util.Iterator v6_1 = p6.iterator();
            while (v6_1.hasNext()) {
                android.os.Bundle v1_1 = ((com.google.android.gms.measurement.internal.zzah) v6_1.next());
                android.os.Bundle v2_1 = new android.os.Bundle();
                v2_1.putString("app_id", v1_1.zza);
                v2_1.putString("origin", v1_1.zzb);
                v2_1.putLong("creation_timestamp", v1_1.zzd);
                v2_1.putString("name", v1_1.zzc.zzb);
                com.google.android.gms.measurement.internal.zzjh.zza(v2_1, com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_1.zzc.zza()));
                v2_1.putBoolean("active", v1_1.zze);
                String v3_9 = v1_1.zzf;
                if (v3_9 != null) {
                    v2_1.putString("trigger_event_name", v3_9);
                }
                String v3_10 = v1_1.zzg;
                if (v3_10 != null) {
                    v2_1.putString("timed_out_event_name", v3_10.zza);
                    String v3_11 = v3_10.zzb;
                    if (v3_11 != null) {
                        v2_1.putBundle("timed_out_event_params", v3_11.zzf());
                    }
                }
                v2_1.putLong("trigger_timeout", v1_1.zzh);
                String v3_14 = v1_1.zzi;
                if (v3_14 != null) {
                    v2_1.putString("triggered_event_name", v3_14.zza);
                    String v3_15 = v3_14.zzb;
                    if (v3_15 != null) {
                        v2_1.putBundle("triggered_event_params", v3_15.zzf());
                    }
                }
                v2_1.putLong("triggered_timestamp", v1_1.zzc.zzc);
                v2_1.putLong("time_to_live", v1_1.zzj);
                android.os.Bundle v1_3 = v1_1.zzk;
                if (v1_3 != null) {
                    v2_1.putString("expired_event_name", v1_3.zza);
                    android.os.Bundle v1_4 = v1_3.zzb;
                    if (v1_4 != null) {
                        v2_1.putBundle("expired_event_params", v1_4.zzf());
                    }
                }
                v0_1.add(v2_1);
            }
            return v0_1;
        } else {
            return new java.util.ArrayList(0);
        }
    }

    public static boolean zzau(android.content.Context p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        try {
            android.content.pm.PackageManager v1 = p4.getPackageManager();
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            return 0;
        }
        if (v1 != null) {
            int v4_3 = v1.getReceiverInfo(new android.content.ComponentName(p4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if ((v4_3 == 0) || (!v4_3.enabled)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public static void zzav(com.google.android.gms.measurement.internal.zzlu p4, android.os.Bundle p5, boolean p6)
    {
        if ((p5 != null) && (p4 != null)) {
            if ((p5.containsKey("_sc")) && (p6 == null)) {
                p6 = 0;
            } else {
                String v6_1 = p4.zza;
                if (v6_1 == null) {
                    p5.remove("_sn");
                } else {
                    p5.putString("_sn", v6_1);
                }
                String v6_2 = p4.zzb;
                if (v6_2 == null) {
                    p5.remove("_sc");
                } else {
                    p5.putString("_sc", v6_2);
                }
                p5.putLong("_si", p4.zzc);
                return;
            }
        }
        if ((p5 != null) && ((p4 == null) && (p6 != null))) {
            p5.remove("_sn");
            p5.remove("_sc");
            p5.remove("_si");
        }
        return;
    }

    public static final boolean zzax(android.os.Bundle p5, int p6)
    {
        if ((p5 == 0) || (p5.getLong("_err") != 0)) {
            return 0;
        } else {
            p5.putLong("_err", ((long) p6));
            return 1;
        }
    }

    private final Object zzay(int p3, Object p4, boolean p5, boolean p6, String p7)
    {
        if (p4 != null) {
            if ((p4 instanceof Long)) {
                return p4;
            } else {
                if (!(p4 instanceof Double)) {
                    if (!(p4 instanceof Integer)) {
                        if (!(p4 instanceof Byte)) {
                            if (!(p4 instanceof Short)) {
                                if (!(p4 instanceof Boolean)) {
                                    if (!(p4 instanceof Float)) {
                                        if ((!(p4 instanceof String)) && ((!(p4 instanceof Character)) && (!(p4 instanceof CharSequence)))) {
                                            if ((p6 == 0) || ((!(p4 instanceof android.os.Bundle[])) && (!(p4 instanceof android.os.Parcelable[])))) {
                                                return 0;
                                            } else {
                                                Object[] v3_4 = new java.util.ArrayList();
                                                int v5_1 = ((android.os.Parcelable[]) p4).length;
                                                int v6_1 = 0;
                                                while (v6_1 < v5_1) {
                                                    android.os.Bundle v0_7 = ((android.os.Parcelable[]) p4)[v6_1];
                                                    if ((v0_7 instanceof android.os.Bundle)) {
                                                        android.os.Bundle v0_9 = this.zzab(((android.os.Bundle) v0_7), 0);
                                                        if (!v0_9.isEmpty()) {
                                                            v3_4.add(v0_9);
                                                        }
                                                    }
                                                    v6_1++;
                                                }
                                                android.os.Bundle[] v4_3 = new android.os.Bundle[v3_4.size()];
                                                return v3_4.toArray(v4_3);
                                            }
                                        } else {
                                            return this.zzC(p4.toString(), p3, p5);
                                        }
                                    } else {
                                        return Double.valueOf(((Float) p4).doubleValue());
                                    }
                                } else {
                                    Object[] v3_10;
                                    if (1 == ((Boolean) p4).booleanValue()) {
                                        v3_10 = 1;
                                    } else {
                                        v3_10 = 0;
                                    }
                                    return Long.valueOf(v3_10);
                                }
                            } else {
                                return Long.valueOf(((long) ((Short) p4).shortValue()));
                            }
                        } else {
                            return Long.valueOf(((long) ((Byte) p4).byteValue()));
                        }
                    } else {
                        return Long.valueOf(((long) ((Integer) p4).intValue()));
                    }
                } else {
                    return p4;
                }
            }
        } else {
            return 0;
        }
    }

    private final int zzaz(String p2)
    {
        if (!"_ldl".equals(p2)) {
            if (!"_id".equals(p2)) {
                if (!"_lgclid".equals(p2)) {
                    this.zzu.zzc();
                    return 36;
                } else {
                    this.zzu.zzc();
                    return 100;
                }
            } else {
                this.zzu.zzc();
                return 256;
            }
        } else {
            this.zzu.zzc();
            return 2048;
        }
    }

    public static boolean zzh(String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        if ((p3.charAt(0) == 95) && (!p3.equals("_ep"))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzA(String p4)
    {
        if (android.text.TextUtils.isEmpty(p4)) {
            this.zzu.zzaV().zzd().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return 0;
        } else {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
            if (p4.matches("^1:\\d+:android:[a-f0-9]+$")) {
                return 1;
            } else {
                this.zzu.zzaV().zzd().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", com.google.android.gms.measurement.internal.zzgu.zzl(p4));
                return 0;
            }
        }
    }

    public final boolean zzB(String p4, String p5)
    {
        boolean v0 = android.text.TextUtils.isEmpty(p4);
        boolean v1 = android.text.TextUtils.isEmpty(p5);
        if ((!v0) && (!v1)) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
            if (!p4.equals(p5)) {
                return 1;
            }
        }
        return 0;
    }

    public final String zzC(String p4, int p5, boolean p6)
    {
        if (p4 != null) {
            if (p4.codePointCount(0, p4.length()) <= p5) {
                return p4;
            } else {
                if (!p6) {
                    return 0;
                } else {
                    return String.valueOf(p4.substring(0, p4.offsetByCodePoints(0, p5))).concat("...");
                }
            }
        } else {
            return 0;
        }
    }

    public final int zzD(String p13, String p14, String p15, Object p16, android.os.Bundle p17, java.util.List p18, boolean p19, boolean p20)
    {
        java.util.List v7_3;
        this.zzg();
        if (!this.zzt(p16)) {
            v7_3 = 0;
        } else {
            if (!p20) {
                return 21;
            } else {
                if (com.google.android.gms.measurement.internal.zzpp.zzaA(p15, com.google.android.gms.measurement.internal.zzjn.zzc)) {
                    String v4_11 = this.zzu.zzt();
                    v4_11.zzg();
                    v4_11.zzb();
                    if ((!v4_11.zzK()) || (v4_11.zzu.zzk().zzah() >= 200900)) {
                        java.util.ArrayList v8_7;
                        String v4_15 = this.zzu;
                        v4_15.zzc();
                        java.util.List v7_2 = (p16 instanceof android.os.Parcelable[]);
                        if (v7_2 == null) {
                            if (!(p16 instanceof java.util.ArrayList)) {
                            } else {
                                v8_7 = ((java.util.ArrayList) p16).size();
                            }
                        } else {
                            v8_7 = ((android.os.Parcelable[]) p16).length;
                        }
                        if (v8_7 <= 200) {
                        } else {
                            v4_15.zzaV().zzh().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", p15, Integer.valueOf(v8_7));
                            v4_15.zzc();
                            if (v7_2 == null) {
                                if (((p16 instanceof java.util.ArrayList)) && (((java.util.ArrayList) p16).size() > 200)) {
                                    p17.putParcelableArrayList(p15, new java.util.ArrayList(((java.util.ArrayList) p16).subList(0, 200)));
                                }
                            } else {
                                if (((android.os.Parcelable[]) p16).length > 200) {
                                    p17.putParcelableArray(p15, ((android.os.Parcelable[]) java.util.Arrays.copyOf(((android.os.Parcelable[]) p16), 200)));
                                }
                            }
                            v7_3 = 17;
                        }
                    } else {
                        return 25;
                    }
                } else {
                    return 20;
                }
            }
        }
        if ((!com.google.android.gms.measurement.internal.zzpp.zzZ(p14)) && (!com.google.android.gms.measurement.internal.zzpp.zzZ(p15))) {
            String v2_19 = this.zzu.zzc().zze(0, 0);
        } else {
            v2_19 = this.zzu.zzc().zzf(0, 0);
        }
        if (!this.zzu("param", p15, v2_19, p16)) {
            if (p20) {
                if (!(p16 instanceof android.os.Bundle)) {
                    if (!(p16 instanceof android.os.Parcelable[])) {
                        if ((p16 instanceof java.util.ArrayList)) {
                            int v9_0 = ((java.util.ArrayList) p16).size();
                            int v10_0 = 0;
                            while (v10_0 < v9_0) {
                                String v1_1 = ((java.util.ArrayList) p16).get(v10_0);
                                if ((v1_1 instanceof android.os.Bundle)) {
                                    this.zzz(p13, p14, p15, ((android.os.Bundle) v1_1), p18, p19);
                                    v10_0++;
                                } else {
                                    String v1_3;
                                    String v2_8 = this.zzu.zzaV().zzh();
                                    if (v1_1 == null) {
                                        v1_3 = "null";
                                    } else {
                                        v1_3 = v1_1.getClass();
                                    }
                                    v2_8.zzc("All ArrayList elements must be of type Bundle. Value type, name", v1_3, p15);
                                }
                            }
                            return v7_3;
                        }
                    } else {
                        int v9_1 = ((android.os.Parcelable[]) p16).length;
                        int v10_1 = 0;
                        while (v10_1 < v9_1) {
                            String v1_4 = ((android.os.Parcelable[]) p16)[v10_1];
                            if ((v1_4 instanceof android.os.Bundle)) {
                                this.zzz(p13, p14, p15, ((android.os.Bundle) v1_4), p18, p19);
                                v10_1++;
                            } else {
                                this.zzu.zzaV().zzh().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", v1_4.getClass(), p15);
                            }
                        }
                        return v7_3;
                    }
                } else {
                    this.zzz(p13, p14, p15, ((android.os.Bundle) p16), p18, p19);
                    return v7_3;
                }
            }
            return 4;
        }
        return v7_3;
    }

    public final Object zzE(String p10, Object p11)
    {
        if (!"_ev".equals(p10)) {
            Object v10_3;
            if (!com.google.android.gms.measurement.internal.zzpp.zzZ(p10)) {
                v10_3 = this.zzu.zzc().zze(0, 0);
            } else {
                v10_3 = this.zzu.zzc().zzf(0, 0);
            }
            return this.zzay(v10_3, p11, 0, 1, 0);
        } else {
            return this.zzay(this.zzu.zzc().zzf(0, 0), p11, 1, 1, 0);
        }
    }

    public final android.os.Bundle zzF(String p18, String p19, android.os.Bundle p20, java.util.List p21, boolean p22)
    {
        Object v6_2 = p21;
        boolean v8 = com.google.android.gms.measurement.internal.zzpp.zzaA(p19, com.google.android.gms.measurement.internal.zzjm.zzd);
        if (p20 == null) {
            return 0;
        } else {
            android.os.Bundle v5_1 = new android.os.Bundle(p20);
            com.google.android.gms.measurement.internal.zzic v11 = this.zzu;
            int v12 = v11.zzc().zzc();
            java.util.Iterator v13 = new java.util.TreeSet(p20.keySet()).iterator();
            int v15 = 0;
            int v16 = 0;
            while (v13.hasNext()) {
                int v1_7;
                String v3_2 = ((String) v13.next());
                if ((v6_2 != null) && (v6_2.contains(v3_2))) {
                    v1_7 = 0;
                } else {
                    if (p22) {
                        v1_7 = 0;
                    } else {
                        v1_7 = this.zzq(v3_2);
                    }
                    if (v1_7 == 0) {
                        v1_7 = this.zzs(v3_2);
                    }
                }
                if (v1_7 == 0) {
                    com.google.android.gms.measurement.internal.zzgs v4_3 = this.zzD(p18, p19, v3_2, p20.get(v3_2), v5_1, v6_2, p22, v8);
                    if (v4_3 != 17) {
                        if ((v4_3 != null) && (!"_ev".equals(v3_2))) {
                            int v1_14;
                            if (v4_3 != 21) {
                                v1_14 = v3_2;
                            } else {
                                v1_14 = p19;
                            }
                            this.zzJ(v5_1, v4_3, v1_14, p20.get(v3_2));
                            v5_1.remove(v3_2);
                            v6_2 = p21;
                        }
                    } else {
                        this.zzJ(v5_1, 17, v3_2, Boolean.FALSE);
                    }
                    if (com.google.android.gms.measurement.internal.zzpp.zzh(v3_2)) {
                        v15++;
                        if (v15 > v12) {
                            if ((!v11.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbe)) || (v16 == 0)) {
                                com.google.android.gms.measurement.internal.zzgs v4_7 = new StringBuilder((String.valueOf(v12).length() + 37));
                                v4_7.append("Event can\'t contain more than ");
                                v4_7.append(v12);
                                v4_7.append(" params");
                                v11.zzaV().zzd().zzc(v4_7.toString(), v11.zzl().zza(p19), v11.zzl().zze(p20));
                            }
                            com.google.android.gms.measurement.internal.zzpp.zzax(v5_1, 5);
                            v5_1.remove(v3_2);
                            v16 = 1;
                        }
                    }
                } else {
                    com.google.android.gms.measurement.internal.zzgs v4_1;
                    if (v1_7 != 3) {
                        v4_1 = 0;
                    } else {
                        v4_1 = v3_2;
                    }
                    this.zzJ(v5_1, v1_7, v3_2, v4_1);
                    v5_1.remove(v3_2);
                }
            }
            return v5_1;
        }
    }

    public final void zzG(com.google.android.gms.measurement.internal.zzgv p10, int p11)
    {
        android.os.Bundle v1 = p10.zzd;
        java.util.Iterator v0_2 = new java.util.TreeSet(v1.keySet()).iterator();
        int v2_0 = 0;
        int v3_7 = 0;
        while (v0_2.hasNext()) {
            String v4_2 = ((String) v0_2.next());
            if (com.google.android.gms.measurement.internal.zzpp.zzh(v4_2)) {
                v2_0++;
                if (v2_0 > p11) {
                    String v5_1 = this.zzu;
                    if ((!v5_1.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbe)) || (v3_7 == 0)) {
                        com.google.android.gms.measurement.internal.zzgs v6_3 = new StringBuilder((String.valueOf(p11).length() + 37));
                        v6_3.append("Event can\'t contain more than ");
                        v6_3.append(p11);
                        v6_3.append(" params");
                        v5_1.zzaV().zzd().zzc(v6_3.toString(), v5_1.zzl().zza(p10.zza), v5_1.zzl().zze(v1));
                        com.google.android.gms.measurement.internal.zzpp.zzax(v1, 5);
                    }
                    v1.remove(v4_2);
                    v3_7 = 1;
                }
            }
        }
        return;
    }

    public final void zzH(android.os.Parcelable[] p13, int p14)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p13);
        int v0 = p13.length;
        int v2 = 0;
        while (v2 < v0) {
            android.os.Bundle v3_1 = ((android.os.Bundle) p13[v2]);
            java.util.Iterator v4_1 = new java.util.TreeSet(v3_1.keySet()).iterator();
            int v5_1 = 0;
            int v6_0 = 0;
            while (v4_1.hasNext()) {
                String v7_2 = ((String) v4_1.next());
                if ((com.google.android.gms.measurement.internal.zzpp.zzh(v7_2)) && (!com.google.android.gms.measurement.internal.zzpp.zzaA(v7_2, com.google.android.gms.measurement.internal.zzjn.zzd))) {
                    v5_1++;
                    if (v5_1 > p14) {
                        String v8_3 = this.zzu;
                        if ((!v8_3.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbe)) || (v6_0 == 0)) {
                            int v6_2 = v8_3.zzaV().zzd();
                            String v10_2 = new StringBuilder((String.valueOf(p14).length() + 60));
                            v10_2.append("Param can\'t contain more than ");
                            v10_2.append(p14);
                            v10_2.append(" item-scoped custom parameters");
                            v6_2.zzc(v10_2.toString(), v8_3.zzl().zzb(v7_2), v8_3.zzl().zze(v3_1));
                        }
                        com.google.android.gms.measurement.internal.zzpp.zzax(v3_1, 28);
                        v3_1.remove(v7_2);
                        v6_0 = 1;
                    }
                }
            }
            v2++;
        }
        return;
    }

    public final void zzI(android.os.Bundle p5, android.os.Bundle p6)
    {
        if (p6 != null) {
            java.util.Iterator v0_1 = p6.keySet().iterator();
            while (v0_1.hasNext()) {
                String v1_0 = ((String) v0_1.next());
                if (!p5.containsKey(v1_0)) {
                    this.zzu.zzk().zzM(p5, v1_0, p6.get(v1_0));
                }
            }
        }
        return;
    }

    public final void zzJ(android.os.Bundle p3, int p4, String p5, Object p6)
    {
        if (com.google.android.gms.measurement.internal.zzpp.zzax(p3, p4)) {
            this.zzu.zzc();
            p3.putString("_ev", this.zzC(p5, 40, 1));
            if (p6 != null) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
                if (((p6 instanceof String)) || ((p6 instanceof CharSequence))) {
                    p3.putLong("_el", ((long) p6.toString().length()));
                }
            }
        }
        return;
    }

    public final int zzK(String p3, Object p4)
    {
        int v3_1;
        if (!"_ldl".equals(p3)) {
            v3_1 = this.zzu("user property", p3, this.zzaz(p3), p4);
        } else {
            v3_1 = this.zzu("user property referrer", p3, this.zzaz(p3), p4);
        }
        if (v3_1 == 0) {
            return 7;
        } else {
            return 0;
        }
    }

    public final Object zzL(String p8, Object p9)
    {
        if (!"_ldl".equals(p8)) {
            return this.zzay(this.zzaz(p8), p9, 0, 0, 0);
        } else {
            return this.zzay(this.zzaz(p8), p9, 1, 0, 0);
        }
    }

    public final void zzM(android.os.Bundle p3, String p4, Object p5)
    {
        if (p3 != 0) {
            if (!(p5 instanceof Long)) {
                if (!(p5 instanceof String)) {
                    if (!(p5 instanceof Double)) {
                        if (!(p5 instanceof android.os.Bundle[])) {
                            if (p4 != null) {
                                int v3_1;
                                if (p5 == null) {
                                    v3_1 = 0;
                                } else {
                                    v3_1 = p5.getClass().getSimpleName();
                                }
                                String v5_1 = this.zzu;
                                v5_1.zzaV().zzh().zzc("Not putting event parameter. Invalid value type. name, type", v5_1.zzl().zzb(p4), v3_1);
                            }
                        } else {
                            p3.putParcelableArray(p4, ((android.os.Bundle[]) p5));
                            return;
                        }
                    } else {
                        p3.putDouble(p4, ((Double) p5).doubleValue());
                        return;
                    }
                } else {
                    p3.putString(p4, String.valueOf(p5));
                    return;
                }
            } else {
                p3.putLong(p4, ((Long) p5).longValue());
                return;
            }
        }
        return;
    }

    public final void zzN(com.google.android.gms.measurement.internal.zzpo p3, String p4, int p5, String p6, String p7, int p8)
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        com.google.android.gms.measurement.internal.zzpp.zzax(v0_1, p5);
        if ((!android.text.TextUtils.isEmpty(p6)) && (!android.text.TextUtils.isEmpty(p7))) {
            v0_1.putString(p6, p7);
        }
        if ((p5 == 6) || ((p5 == 7) || (p5 == 2))) {
            v0_1.putLong("_el", ((long) p8));
        }
        p3.zza(p4, "_err", v0_1);
        return;
    }

    public final boolean zzS()
    {
        this.zzg();
        if (this.zzV() != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public final w1.b zzT()
    {
        if (this.zzg == null) {
            String v6_0;
            w1.a v0_2 = this.zzu.zzaY();
            kotlin.jvm.internal.j.e(v0_2, "context");
            x1.b v1_8 = new StringBuilder("AdServicesInfo.version=");
            int v2_0 = android.os.Build$VERSION.SDK_INT;
            int v3_0 = u1.b.a;
            int v4 = 0;
            if (v2_0 < 33) {
                v6_0 = 0;
            } else {
                v6_0 = v3_0.a();
            }
            x1.b v1_1;
            v1_8.append(v6_0);
            android.util.Log.d("MeasurementManager", v1_8.toString());
            if (v2_0 < 33) {
                v1_1 = 0;
            } else {
                v1_1 = v3_0.a();
            }
            x1.b v1_3;
            w1.a v5_1 = 0;
            if (v1_1 < 5) {
                int v2_1;
                x1.b v1_2 = u1.a.a;
                if ((v2_0 != 31) && (v2_0 != 32)) {
                    v2_1 = 0;
                } else {
                    v2_1 = v1_2.a();
                }
                if (v2_1 < 9) {
                    v1_3 = 0;
                } else {
                    try {
                        w1.a v0_3 = new a1.d0(v0_2, 3).invoke(v0_2);
                    } catch (NoClassDefFoundError) {
                        w1.a v0_5 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int v2_5 = android.os.Build$VERSION.SDK_INT;
                        if (v2_5 == 31) {
                            v4 = v1_2.a();
                        } else {
                            if (v2_5 == 32) {
                            }
                        }
                        v0_5.append(v4);
                        android.util.Log.d("MeasurementManager", v0_5.toString());
                        v0_3 = 0;
                    }
                    v1_3 = ((x1.b) v0_3);
                }
            } else {
                v1_3 = new x1.c(v0_2, 1);
            }
            if (v1_3 != null) {
                v5_1 = new w1.a(v1_3);
            }
            this.zzg = v5_1;
        }
        return this.zzg;
    }

    public final int zzU()
    {
        if ((android.os.Build$VERSION.SDK_INT < 30) || (android.os.ext.SdkExtensions.getExtensionVersion(30) <= 3)) {
            return 0;
        } else {
            return android.os.ext.SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public final long zzV()
    {
        this.zzg();
        if (this.zzX(this.zzu.zzv().zzj())) {
            long v3_3;
            if (android.os.Build$VERSION.SDK_INT >= 30) {
                if (android.os.ext.SdkExtensions.getExtensionVersion(30) >= 4) {
                    long v0_3 = this.zzu;
                    long v3_2 = this.zzU();
                    v0_3.zzc();
                    if (v3_2 >= ((Integer) com.google.android.gms.measurement.internal.zzfy.zzal.zzb(0)).intValue()) {
                        v3_3 = 0;
                    } else {
                        v3_3 = 16;
                    }
                } else {
                    v3_3 = 8;
                }
            } else {
                v3_3 = 4;
            }
            if (!this.zzY("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
                v3_3 |= 2;
            }
            if ((v3_3 == 0) && (!this.zzW())) {
                v3_3 = 64;
            }
            if (v3_3 != 0) {
                return v3_3;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final boolean zzW()
    {
        if (this.zzh == null) {
            int v0_4 = this.zzT();
            Boolean v1_1 = 0;
            if (v0_4 != 0) {
                try {
                    int v0_2 = ((Integer) v0_4.a().get(10000, java.util.concurrent.TimeUnit.MILLISECONDS));
                } catch (int v0_3) {
                    Boolean v1_0 = v0_3;
                    v0_2 = 0;
                    this.zzu.zzaV().zze().zzb("Measurement manager api exception", v1_0);
                    this.zzh = Boolean.FALSE;
                    this.zzu.zzaV().zzk().zzb("Measurement manager api status result", v0_2);
                } catch (int v0_3) {
                } catch (int v0_3) {
                } catch (int v0_3) {
                }
                if ((v0_2 != 0) && (v0_2.intValue() == 1)) {
                    v1_1 = 1;
                }
                this.zzh = Boolean.valueOf(v1_1);
            } else {
                return 0;
            }
        }
        return this.zzh.booleanValue();
    }

    public final boolean zzX(String p3)
    {
        java.util.List v0_4 = ((String) com.google.android.gms.measurement.internal.zzfy.zzar.zzb(0));
        if ((!v0_4.equals("*")) && (!java.util.Arrays.asList(v0_4.split(",")).contains(p3))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzY(String p3)
    {
        this.zzg();
        com.google.android.gms.measurement.internal.zzgs v0_0 = this.zzu;
        if (com.google.android.gms.common.wrappers.Wrappers.packageManager(v0_0.zzaY()).checkCallingOrSelfPermission(p3) != 0) {
            v0_0.zzaV().zzj().zzb("Permission not granted", p3);
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zza()
    {
        return 1;
    }

    public final boolean zzaa(String p2, String p3)
    {
        if (android.text.TextUtils.isEmpty(p3)) {
            if (!android.text.TextUtils.isEmpty(p2)) {
                com.google.android.gms.measurement.internal.zzic v3_3 = this.zzu;
                String v0_0 = v3_3.zzc().zzA();
                v3_3.zzaU();
                return v0_0.equals(p2);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final android.os.Bundle zzab(android.os.Bundle p5, String p6)
    {
        android.os.Bundle v6_1 = new android.os.Bundle();
        if (p5 != null) {
            java.util.Iterator v0_1 = p5.keySet().iterator();
            while (v0_1.hasNext()) {
                String v1_1 = ((String) v0_1.next());
                String v2_1 = this.zzE(v1_1, p5.get(v1_1));
                if (v2_1 != null) {
                    this.zzM(v6_1, v1_1, v2_1);
                } else {
                    String v2_2 = this.zzu;
                    v2_2.zzaV().zzh().zzb("Param value can\'t be null", v2_2.zzl().zzb(v1_1));
                }
            }
        }
        return v6_1;
    }

    public final com.google.android.gms.measurement.internal.zzbg zzac(String p7, String p8, android.os.Bundle p9, String p10, long p11, boolean p13, boolean p14)
    {
        if (!android.text.TextUtils.isEmpty(p8)) {
            if (this.zzn(p8) != 0) {
                android.os.Bundle v7_7 = this.zzu;
                v7_7.zzaV().zzb().zzb("Invalid conditional property event name", v7_7.zzl().zzc(p8));
                throw new IllegalArgumentException();
            } else {
                android.os.Bundle v14_2;
                if (p9 == null) {
                    v14_2 = new android.os.Bundle();
                } else {
                    v14_2 = new android.os.Bundle(p9);
                }
                android.os.Bundle v3 = v14_2;
                v3.putString("_o", p10);
                android.os.Bundle v7_5 = this.zzF(p7, p8, v3, com.google.android.gms.common.util.CollectionUtils.listOf("_o"), 1);
                if (p13) {
                    v7_5 = this.zzab(v7_5, p7);
                }
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v7_5);
                return new com.google.android.gms.measurement.internal.zzbg(p8, new com.google.android.gms.measurement.internal.zzbe(v7_5), p10, p11);
            }
        } else {
            return 0;
        }
    }

    public final boolean zzad(android.content.Context p3, String p4)
    {
        String v0_2 = new javax.security.auth.x500.X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            boolean v3_11 = com.google.android.gms.common.wrappers.Wrappers.packageManager(p3).getPackageInfo(p4, 64);
        } catch (boolean v3_2) {
            this.zzu.zzaV().zzb().zzb("Error obtaining certificate", v3_2);
            return 1;
        } catch (boolean v3_1) {
            this.zzu.zzaV().zzb().zzb("Package name not found", v3_1);
            return 1;
        }
        if (!v3_11) {
            return 1;
        } else {
            boolean v3_12 = v3_11.signatures;
            if ((!v3_12) || (v3_12.length <= 0)) {
                return 1;
            } else {
                return ((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(v3_12[0].toByteArray()))).getSubjectX500Principal().equals(v0_2);
            }
        }
    }

    public final byte[] zzae(android.os.Parcelable p3)
    {
        if (p3 != null) {
            android.os.Parcel v0 = android.os.Parcel.obtain();
            try {
                p3.writeToParcel(v0, 0);
                Throwable v3_2 = v0.marshall();
                v0.recycle();
                return v3_2;
            } catch (Throwable v3_3) {
                v0.recycle();
                throw v3_3;
            }
        } else {
            return 0;
        }
    }

    public final boolean zzag(int p3, boolean p4)
    {
        boolean v4_3 = this.zzu.zzt().zzJ();
        if (this.zzah() >= (p3 / 1000)) {
            return 1;
        } else {
            if ((!v4_3) || (v4_3.booleanValue())) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final int zzah()
    {
        if (this.zzi == null) {
            this.zzi = Integer.valueOf((com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzu.zzaY()) / 1000));
        }
        return this.zzi.intValue();
    }

    public final int zzai(int p3)
    {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzu.zzaY(), 12451000);
    }

    public final long zzaj(long p3, long p5)
    {
        return (((p5 * 60000) + p3) / 86400000);
    }

    public final void zzak(android.os.Bundle p7, long p8)
    {
        com.google.android.gms.measurement.internal.zzgs v1 = p7.getLong("_et");
        if (v1 == 0) {
            v1 = 0;
        } else {
            this.zzu.zzaV().zze().zzb("Params already contained engagement", Long.valueOf(v1));
        }
        p7.putLong("_et", (p8 + v1));
        return;
    }

    public final void zzal(com.google.android.gms.internal.measurement.zzcu p3, String p4)
    {
        String v0_1 = new android.os.Bundle();
        v0_1.putString("r", p4);
        try {
            p3.zzb(v0_1);
            return;
        } catch (android.os.RemoteException v3_1) {
            this.zzu.zzaV().zze().zzb("Error returning string value to wrapper", v3_1);
            return;
        }
    }

    public final void zzam(com.google.android.gms.internal.measurement.zzcu p3, long p4)
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        v0_1.putLong("r", p4);
        try {
            p3.zzb(v0_1);
            return;
        } catch (android.os.RemoteException v3_1) {
            this.zzu.zzaV().zze().zzb("Error returning long value to wrapper", v3_1);
            return;
        }
    }

    public final void zzan(com.google.android.gms.internal.measurement.zzcu p3, int p4)
    {
        String v0_1 = new android.os.Bundle();
        v0_1.putInt("r", p4);
        try {
            p3.zzb(v0_1);
            return;
        } catch (android.os.RemoteException v3_1) {
            this.zzu.zzaV().zze().zzb("Error returning int value to wrapper", v3_1);
            return;
        }
    }

    public final void zzao(com.google.android.gms.internal.measurement.zzcu p3, byte[] p4)
    {
        String v0_1 = new android.os.Bundle();
        v0_1.putByteArray("r", p4);
        try {
            p3.zzb(v0_1);
            return;
        } catch (android.os.RemoteException v3_1) {
            this.zzu.zzaV().zze().zzb("Error returning byte array to wrapper", v3_1);
            return;
        }
    }

    public final void zzap(com.google.android.gms.internal.measurement.zzcu p3, boolean p4)
    {
        String v0_1 = new android.os.Bundle();
        v0_1.putBoolean("r", p4);
        try {
            p3.zzb(v0_1);
            return;
        } catch (android.os.RemoteException v3_1) {
            this.zzu.zzaV().zze().zzb("Error returning boolean value to wrapper", v3_1);
            return;
        }
    }

    public final void zzaq(com.google.android.gms.internal.measurement.zzcu p2, android.os.Bundle p3)
    {
        try {
            p2.zzb(p3);
            return;
        } catch (android.os.RemoteException v2_1) {
            this.zzu.zzaV().zze().zzb("Error returning bundle value to wrapper", v2_1);
            return;
        }
    }

    public final void zzar(com.google.android.gms.internal.measurement.zzcu p3, java.util.ArrayList p4)
    {
        String v0_1 = new android.os.Bundle();
        v0_1.putParcelableArrayList("r", p4);
        try {
            p3.zzb(v0_1);
            return;
        } catch (android.os.RemoteException v3_1) {
            this.zzu.zzaV().zze().zzb("Error returning bundle list to wrapper", v3_1);
            return;
        }
    }

    public final java.net.URL zzat(long p3, String p5, String p6, long p7, String p9)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p6);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        StringBuilder v0_2 = this.zzah();
        StringBuilder v1_1 = new StringBuilder("v133005.");
        v1_1.append(v0_2);
        String v4_1 = v1_1.toString();
        StringBuilder v0_1 = new StringBuilder("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=");
        v0_1.append(v4_1);
        v0_1.append("&rdid=");
        v0_1.append(p6);
        v0_1.append("&bundleid=");
        v0_1.append(p5);
        v0_1.append("&retry=");
        v0_1.append(p7);
        String v3_4 = v0_1.toString();
        if (p5.equals(this.zzu.zzc().zzB())) {
            v3_4 = v3_4.concat("&ddl_test=1");
        }
        if (!p9.isEmpty()) {
            if (p9.charAt(0) != 38) {
                v3_4 = v3_4.concat("&");
            }
            v3_4 = v3_4.concat(p9);
        }
        return new java.net.URL(v3_4);
    }

    public final String zzaw()
    {
        String v0_1 = new byte[16];
        this.zzf().nextBytes(v0_1);
        return String.format(java.util.Locale.US, "%032x", new Object[] {new java.math.BigInteger(1, v0_1)}));
    }

    public final void zzba()
    {
        this.zzg();
        com.google.android.gms.measurement.internal.zzic v0_4 = new java.security.SecureRandom();
        long v1 = v0_4.nextLong();
        if (v1 == 0) {
            v1 = v0_4.nextLong();
            if (v1 == 0) {
                v1.a.v(this.zzu, "Utils falling back to Random for random id");
            }
        }
        this.zze.set(v1);
        return;
    }

    public final long zzd()
    {
        if (this.zze.get() != 0) {
            java.util.concurrent.atomic.AtomicLong v0_1 = this.zze;
            try {
                v0_1.compareAndSet(-1, 1);
                return v0_1.getAndIncrement();
            } catch (Throwable v1_1) {
                throw v1_1;
            }
        } else {
            try {
                Throwable v1_5 = new java.util.Random((System.nanoTime() ^ this.zzu.zzaZ().currentTimeMillis())).nextLong();
                long v3_1 = (this.zzf + 1);
                this.zzf = v3_1;
                return (v1_5 + ((long) v3_1));
            } catch (Throwable v1_7) {
                throw v1_7;
            }
        }
    }

    public final java.security.SecureRandom zzf()
    {
        this.zzg();
        if (this.zzd == null) {
            this.zzd = new java.security.SecureRandom();
        }
        return this.zzd;
    }

    public final android.os.Bundle zzi(android.net.Uri p18)
    {
        if (p18 == null) {
            return 0;
        } else {
            try {
                int v15;
                java.util.Iterator v2_7;
                int v8_0;
                int v14;
                int v11;
                int v13;
                int v10;
                int v12_0;
                int v9_0;
                if (!p18.isHierarchical()) {
                    v2_7 = 0;
                    v8_0 = 0;
                    v9_0 = 0;
                    v10 = 0;
                    v11 = 0;
                    v12_0 = 0;
                    v13 = 0;
                    v14 = 0;
                    v15 = 0;
                } else {
                    v2_7 = p18.getQueryParameter("utm_campaign");
                    v8_0 = p18.getQueryParameter("utm_source");
                    v9_0 = p18.getQueryParameter("utm_medium");
                    v10 = p18.getQueryParameter("gclid");
                    v11 = p18.getQueryParameter("gbraid");
                    v12_0 = p18.getQueryParameter("utm_id");
                    v13 = p18.getQueryParameter("dclid");
                    v14 = p18.getQueryParameter("srsltid");
                    v15 = p18.getQueryParameter("sfmc_id");
                }
            } catch (UnsupportedOperationException v0_1) {
                this.zzu.zzaV().zze().zzb("Install referrer url isn\'t a hierarchical URI", v0_1);
                return 0;
            }
            if ((android.text.TextUtils.isEmpty(v2_7)) && ((android.text.TextUtils.isEmpty(v8_0)) && ((android.text.TextUtils.isEmpty(v9_0)) && ((android.text.TextUtils.isEmpty(v10)) && ((android.text.TextUtils.isEmpty(v11)) && ((android.text.TextUtils.isEmpty(v12_0)) && ((android.text.TextUtils.isEmpty(v13)) && ((android.text.TextUtils.isEmpty(v14)) && (android.text.TextUtils.isEmpty(v15)))))))))) {
                return 0;
            } else {
                boolean v16_10;
                android.os.Bundle v1_2 = new android.os.Bundle();
                if (android.text.TextUtils.isEmpty(v2_7)) {
                    v16_10 = "sfmc_id";
                } else {
                    v16_10 = "sfmc_id";
                    v1_2.putString("campaign", v2_7);
                }
                if (!android.text.TextUtils.isEmpty(v8_0)) {
                    v1_2.putString("source", v8_0);
                }
                if (!android.text.TextUtils.isEmpty(v9_0)) {
                    v1_2.putString("medium", v9_0);
                }
                if (!android.text.TextUtils.isEmpty(v10)) {
                    v1_2.putString("gclid", v10);
                }
                if (!android.text.TextUtils.isEmpty(v11)) {
                    v1_2.putString("gbraid", v11);
                }
                String v3_0 = p18.getQueryParameter("gad_source");
                if (!android.text.TextUtils.isEmpty(v3_0)) {
                    v1_2.putString("gad_source", v3_0);
                }
                java.util.Iterator v2_4 = p18.getQueryParameter("utm_term");
                if (!android.text.TextUtils.isEmpty(v2_4)) {
                    v1_2.putString("term", v2_4);
                }
                java.util.Iterator v2_6 = p18.getQueryParameter("utm_content");
                if (!android.text.TextUtils.isEmpty(v2_6)) {
                    v1_2.putString("content", v2_6);
                }
                String v3_5 = p18.getQueryParameter("aclid");
                if (!android.text.TextUtils.isEmpty(v3_5)) {
                    v1_2.putString("aclid", v3_5);
                }
                String v3_6 = p18.getQueryParameter("cp1");
                if (!android.text.TextUtils.isEmpty(v3_6)) {
                    v1_2.putString("cp1", v3_6);
                }
                String v3_7 = p18.getQueryParameter("anid");
                if (!android.text.TextUtils.isEmpty(v3_7)) {
                    v1_2.putString("anid", v3_7);
                }
                if (!android.text.TextUtils.isEmpty(v12_0)) {
                    v1_2.putString("campaign_id", v12_0);
                }
                if (!android.text.TextUtils.isEmpty(v13)) {
                    v1_2.putString("dclid", v13);
                }
                java.util.Iterator v2_15 = p18.getQueryParameter("utm_source_platform");
                if (!android.text.TextUtils.isEmpty(v2_15)) {
                    v1_2.putString("source_platform", v2_15);
                }
                java.util.Iterator v2_17 = p18.getQueryParameter("utm_creative_format");
                if (!android.text.TextUtils.isEmpty(v2_17)) {
                    v1_2.putString("creative_format", v2_17);
                }
                java.util.Iterator v2_19 = p18.getQueryParameter("utm_marketing_tactic");
                if (!android.text.TextUtils.isEmpty(v2_19)) {
                    v1_2.putString("marketing_tactic", v2_19);
                }
                if (!android.text.TextUtils.isEmpty(v14)) {
                    v1_2.putString("srsltid", v14);
                }
                if (!android.text.TextUtils.isEmpty(v15)) {
                    v1_2.putString(v16_10, v15);
                }
                java.util.Iterator v2_24 = p18.getQueryParameterNames().iterator();
                while (v2_24.hasNext()) {
                    String v3_16 = ((String) v2_24.next());
                    if (v3_16.startsWith("gad_")) {
                        String v4_2 = p18.getQueryParameter(v3_16);
                        if (!android.text.TextUtils.isEmpty(v4_2)) {
                            v1_2.putString(v3_16, v4_2);
                        }
                    }
                }
                return v1_2;
            }
        }
    }

    public final boolean zzj(String p6, String p7)
    {
        if (p7 != null) {
            if (p7.length() != 0) {
                com.google.android.gms.measurement.internal.zzgs v1_10 = p7.codePointAt(0);
                if (Character.isLetter(v1_10)) {
                    String v2_0 = p7.length();
                    com.google.android.gms.measurement.internal.zzgs v1_0 = Character.charCount(v1_10);
                    while (v1_0 < v2_0) {
                        int v3_0 = p7.codePointAt(v1_0);
                        if ((v3_0 != 95) && (!Character.isLetterOrDigit(v3_0))) {
                            this.zzu.zzaV().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", p6, p7);
                            return 0;
                        } else {
                            v1_0 += Character.charCount(v3_0);
                        }
                    }
                    return 1;
                } else {
                    this.zzu.zzaV().zzd().zzc("Name must start with a letter. Type, name", p6, p7);
                    return 0;
                }
            } else {
                this.zzu.zzaV().zzd().zzb("Name is required and can\'t be empty. Type", p6);
                return 0;
            }
        } else {
            this.zzu.zzaV().zzd().zzb("Name is required and can\'t be null. Type", p6);
            return 0;
        }
    }

    public final boolean zzk(String p7, String p8)
    {
        if (p8 != null) {
            if (p8.length() != 0) {
                com.google.android.gms.measurement.internal.zzgs v1_3 = p8.codePointAt(0);
                if (!Character.isLetter(v1_3)) {
                    if (v1_3 != 95) {
                        this.zzu.zzaV().zzd().zzc("Name must start with a letter or _ (underscore). Type, name", p7, p8);
                        return 0;
                    } else {
                        v1_3 = 95;
                    }
                }
                String v2_1 = p8.length();
                com.google.android.gms.measurement.internal.zzgs v1_4 = Character.charCount(v1_3);
                while (v1_4 < v2_1) {
                    int v4_0 = p8.codePointAt(v1_4);
                    if ((v4_0 != 95) && (!Character.isLetterOrDigit(v4_0))) {
                        this.zzu.zzaV().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", p7, p8);
                        return 0;
                    } else {
                        v1_4 += Character.charCount(v4_0);
                    }
                }
                return 1;
            } else {
                this.zzu.zzaV().zzd().zzb("Name is required and can\'t be empty. Type", p7);
                return 0;
            }
        } else {
            this.zzu.zzaV().zzd().zzb("Name is required and can\'t be null. Type", p7);
            return 0;
        }
    }

    public final boolean zzl(String p5, String[] p6, String[] p7, String p8)
    {
        if (p8 != null) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p8);
            int v2 = 0;
            while (v2 < 3) {
                if (!p8.startsWith(com.google.android.gms.measurement.internal.zzpp.zzb[v2])) {
                    v2++;
                } else {
                    this.zzu.zzaV().zzd().zzc("Name starts with reserved prefix. Type, name", p5, p8);
                    return 0;
                }
            }
            if ((p6 == null) || ((!com.google.android.gms.measurement.internal.zzpp.zzaA(p8, p6)) || ((p7 != null) && (com.google.android.gms.measurement.internal.zzpp.zzaA(p8, p7))))) {
                return 1;
            } else {
                this.zzu.zzaV().zzd().zzc("Name is reserved. Type, name", p5, p8);
                return 0;
            }
        } else {
            this.zzu.zzaV().zzd().zzb("Name is required and can\'t be null. Type", p5);
            return 0;
        }
    }

    public final boolean zzm(String p4, int p5, String p6)
    {
        if (p6 != null) {
            if (p6.codePointCount(0, p6.length()) <= p5) {
                return 1;
            } else {
                this.zzu.zzaV().zzd().zzd("Name is too long. Type, maximum supported length, name", p4, Integer.valueOf(p5), p6);
                return 0;
            }
        } else {
            this.zzu.zzaV().zzd().zzb("Name is required and can\'t be null. Type", p4);
            return 0;
        }
    }

    public final int zzn(String p5)
    {
        if (this.zzk("event", p5)) {
            if (this.zzl("event", com.google.android.gms.measurement.internal.zzjm.zza, com.google.android.gms.measurement.internal.zzjm.zzb, p5)) {
                this.zzu.zzc();
                if (this.zzm("event", 40, p5)) {
                    return 0;
                } else {
                    return 2;
                }
            } else {
                return 13;
            }
        } else {
            return 2;
        }
    }

    public final int zzp(String p5)
    {
        if (this.zzk("user property", p5)) {
            if (this.zzl("user property", com.google.android.gms.measurement.internal.zzjo.zza, 0, p5)) {
                this.zzu.zzc();
                if (this.zzm("user property", 24, p5)) {
                    return 0;
                } else {
                    return 6;
                }
            } else {
                return 15;
            }
        } else {
            return 6;
        }
    }

    public final int zzq(String p4)
    {
        if (this.zzj("event param", p4)) {
            if (this.zzl("event param", 0, 0, p4)) {
                this.zzu.zzc();
                if (this.zzm("event param", 40, p4)) {
                    return 0;
                } else {
                    return 3;
                }
            } else {
                return 14;
            }
        } else {
            return 3;
        }
    }

    public final int zzs(String p4)
    {
        if (this.zzk("event param", p4)) {
            if (this.zzl("event param", 0, 0, p4)) {
                this.zzu.zzc();
                if (this.zzm("event param", 40, p4)) {
                    return 0;
                } else {
                    return 3;
                }
            } else {
                return 14;
            }
        } else {
            return 3;
        }
    }

    public final boolean zzt(Object p2)
    {
        if ((!(p2 instanceof android.os.Parcelable[])) && ((!(p2 instanceof java.util.ArrayList)) && (!(p2 instanceof android.os.Bundle)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzu(String p4, String p5, int p6, Object p7)
    {
        if (p7 != null) {
            if ((!(p7 instanceof Long)) && ((!(p7 instanceof Float)) && ((!(p7 instanceof Integer)) && ((!(p7 instanceof Byte)) && ((!(p7 instanceof Short)) && ((!(p7 instanceof Boolean)) && (!(p7 instanceof Double)))))))) {
                if ((!(p7 instanceof String)) && ((!(p7 instanceof Character)) && (!(p7 instanceof CharSequence)))) {
                    return 0;
                } else {
                    Integer v7_1 = p7.toString();
                    if (v7_1.codePointCount(0, v7_1.length()) > p6) {
                        this.zzu.zzaV().zzh().zzd("Value is too long; discarded. Value kind, name, value length", p4, p5, Integer.valueOf(v7_1.length()));
                        return 0;
                    }
                }
            }
            return 1;
        } else {
            return 1;
        }
    }

    public final void zzz(String p18, String p19, String p20, android.os.Bundle p21, java.util.List p22, boolean p23)
    {
        java.util.List v6_4 = p22;
        if (p21 != null) {
            int v13;
            com.google.android.gms.measurement.internal.zzic v9 = this.zzu;
            if (1 == v9.zzc().zzu.zzk().zzag(231100000, 1)) {
                v13 = 35;
            } else {
                v13 = 0;
            }
            java.util.Iterator v14 = new java.util.TreeSet(p21.keySet()).iterator();
            int v15 = 0;
            int v16 = 0;
            while (v14.hasNext()) {
                int v1_13;
                String v3_2 = ((String) v14.next());
                if ((v6_4 != null) && (v6_4.contains(v3_2))) {
                    v1_13 = 0;
                } else {
                    if (p23) {
                        v1_13 = 0;
                    } else {
                        v1_13 = this.zzq(v3_2);
                    }
                    if (v1_13 == 0) {
                        v1_13 = this.zzs(v3_2);
                    }
                }
                String v4_9 = 0;
                if (v1_13 == 0) {
                    int v1_18;
                    String v12;
                    if (!this.zzt(p21.get(v3_2))) {
                        v12 = 0;
                        v1_18 = this.zzD(p18, p19, v3_2, p21.get(v3_2), p21, v6_4, p23, 0);
                    } else {
                        v9.zzaV().zzh().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", p19, p20, v3_2);
                        v1_18 = 22;
                        v12 = 0;
                    }
                    if ((v1_18 == 0) || ("_ev".equals(v3_2))) {
                        if ((com.google.android.gms.measurement.internal.zzpp.zzh(v3_2)) && (!com.google.android.gms.measurement.internal.zzpp.zzaA(v3_2, com.google.android.gms.measurement.internal.zzjn.zzd))) {
                            v15++;
                            if (this.zzag(231100000, 1)) {
                                if (v15 > v13) {
                                    if ((!v9.zzc().zzp(v12, com.google.android.gms.measurement.internal.zzfy.zzbe)) || (v16 == 0)) {
                                        int v1_1 = v9.zzaV().zzd();
                                        java.util.List v6_1 = new StringBuilder((String.valueOf(v13).length() + 55));
                                        v6_1.append("Item can\'t contain more than ");
                                        v6_1.append(v13);
                                        v6_1.append(" item-scoped custom params");
                                        v1_1.zzc(v6_1.toString(), v9.zzl().zza(p19), v9.zzl().zze(p21));
                                    }
                                    com.google.android.gms.measurement.internal.zzpp.zzax(p21, 28);
                                    p21.remove(v3_2);
                                    v6_4 = p22;
                                    v16 = 1;
                                }
                            } else {
                                v9.zzaV().zzd().zzc("Item array not supported on client\'s version of Google Play Services (Android Only)", v9.zzl().zza(p19), v9.zzl().zze(p21));
                                com.google.android.gms.measurement.internal.zzpp.zzax(p21, 23);
                                p21.remove(v3_2);
                            }
                        }
                    } else {
                        this.zzJ(p21, v1_18, v3_2, p21.get(v3_2));
                        p21.remove(v3_2);
                    }
                } else {
                    if (v1_13 == 3) {
                        v4_9 = v3_2;
                    }
                    this.zzJ(p21, v1_13, v3_2, v4_9);
                    p21.remove(v3_2);
                }
                v6_4 = p22;
            }
        }
        return;
    }
}
