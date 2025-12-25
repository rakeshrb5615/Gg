package com.google.android.gms.measurement.internal;
public final class zzgu extends com.google.android.gms.measurement.internal.zzjf {
    private char zza;
    private long zzb;
    private String zzc;
    private final com.google.android.gms.measurement.internal.zzgs zzd;
    private final com.google.android.gms.measurement.internal.zzgs zze;
    private final com.google.android.gms.measurement.internal.zzgs zzf;
    private final com.google.android.gms.measurement.internal.zzgs zzg;
    private final com.google.android.gms.measurement.internal.zzgs zzh;
    private final com.google.android.gms.measurement.internal.zzgs zzi;
    private final com.google.android.gms.measurement.internal.zzgs zzj;
    private final com.google.android.gms.measurement.internal.zzgs zzk;
    private final com.google.android.gms.measurement.internal.zzgs zzl;

    public zzgu(com.google.android.gms.measurement.internal.zzic p4)
    {
        super(p4);
        super.zza = 0;
        super.zzb = -1;
        super.zzd = new com.google.android.gms.measurement.internal.zzgs(super, 6, 0, 0);
        super.zze = new com.google.android.gms.measurement.internal.zzgs(super, 6, 1, 0);
        super.zzf = new com.google.android.gms.measurement.internal.zzgs(super, 6, 0, 1);
        super.zzg = new com.google.android.gms.measurement.internal.zzgs(super, 5, 0, 0);
        super.zzh = new com.google.android.gms.measurement.internal.zzgs(super, 5, 1, 0);
        super.zzi = new com.google.android.gms.measurement.internal.zzgs(super, 5, 0, 1);
        super.zzj = new com.google.android.gms.measurement.internal.zzgs(super, 4, 0, 0);
        super.zzk = new com.google.android.gms.measurement.internal.zzgs(super, 3, 0, 0);
        super.zzl = new com.google.android.gms.measurement.internal.zzgs(super, 2, 0, 0);
        return;
    }

    public static Object zzl(String p1)
    {
        if (p1 != 0) {
            return new com.google.android.gms.measurement.internal.zzgt(p1);
        } else {
            return 0;
        }
    }

    public static String zzo(boolean p2, String p3, Object p4, Object p5, Object p6)
    {
        String v4_1 = com.google.android.gms.measurement.internal.zzgu.zzp(p2, p4);
        String v5_1 = com.google.android.gms.measurement.internal.zzgu.zzp(p2, p5);
        String v2_2 = com.google.android.gms.measurement.internal.zzgu.zzp(p2, p6);
        StringBuilder v6_2 = new StringBuilder();
        String v0 = "";
        if (!p3) {
            p3 = "";
        }
        if (!android.text.TextUtils.isEmpty(p3)) {
            v6_2.append(p3);
            v0 = ": ";
        }
        String v1_1 = ", ";
        if (!android.text.TextUtils.isEmpty(v4_1)) {
            v6_2.append(v0);
            v6_2.append(v4_1);
            v0 = ", ";
        }
        if (android.text.TextUtils.isEmpty(v5_1)) {
            v1_1 = v0;
        } else {
            v6_2.append(v0);
            v6_2.append(v5_1);
        }
        if (!android.text.TextUtils.isEmpty(v2_2)) {
            v6_2.append(v1_1);
            v6_2.append(v2_2);
        }
        return v6_2.toString();
    }

    public static String zzp(boolean p9, Object p10)
    {
        String v0_0 = "";
        if (p10 != null) {
            if ((p10 instanceof Integer)) {
                p10 = Long.valueOf(((long) ((Integer) p10).intValue()));
            }
            int v3_0 = 0;
            if (!(p10 instanceof Long)) {
                if (!(p10 instanceof Boolean)) {
                    if (!(p10 instanceof Throwable)) {
                        if (!(p10 instanceof com.google.android.gms.measurement.internal.zzgt)) {
                            if (p9 == null) {
                                return p10.toString();
                            } else {
                                return "-";
                            }
                        } else {
                            return ((com.google.android.gms.measurement.internal.zzgt) p10).zza();
                        }
                    } else {
                        String v9_12;
                        if (p9 == null) {
                            v9_12 = ((Throwable) p10).toString();
                        } else {
                            v9_12 = ((Throwable) p10).getClass().getName();
                        }
                        String v0_5 = new StringBuilder(v9_12);
                        String v9_16 = com.google.android.gms.measurement.internal.zzgu.zzq(com.google.android.gms.measurement.internal.zzic.getCanonicalName());
                        StackTraceElement[] v10_7 = ((Throwable) p10).getStackTrace();
                        int v1_5 = v10_7.length;
                        while (v3_0 < v1_5) {
                            StackTraceElement v2_4 = v10_7[v3_0];
                            if (!v2_4.isNativeMethod()) {
                                boolean v4_1 = v2_4.getClassName();
                                if ((v4_1) && (com.google.android.gms.measurement.internal.zzgu.zzq(v4_1).equals(v9_16))) {
                                    v0_5.append(": ");
                                    v0_5.append(v2_4);
                                    break;
                                }
                            }
                            v3_0++;
                        }
                        return v0_5.toString();
                    }
                } else {
                    return p10.toString();
                }
            } else {
                if (p9 != null) {
                    if (Math.abs(((Long) p10).longValue()) >= 100) {
                        StackTraceElement[] v10_10 = p10.toString().charAt(0);
                        String v9_22 = String.valueOf(Math.abs(((Long) p10).longValue()));
                        int v3_5 = Math.round(Math.pow(4621819117588971520, ((double) (v9_22.length() - 1))));
                        long v5_2 = Math.round((Math.pow(4621819117588971520, ((double) v9_22.length())) + -4616189618054758400));
                        String v9_3 = String.valueOf(v3_5).length();
                        if (v10_10 == 45) {
                            v0_0 = "-";
                        }
                        int v1_3 = new StringBuilder(((v0_0.length() + ((v0_0.length() + v9_3) + 3)) + String.valueOf(v5_2).length()));
                        v1_3.append(v0_0);
                        v1_3.append(v3_5);
                        v1_3.append("...");
                        v1_3.append(v0_0);
                        v1_3.append(v5_2);
                        return v1_3.toString();
                    } else {
                        return p10.toString();
                    }
                } else {
                    return p10.toString();
                }
            }
        } else {
            return "";
        }
    }

    public static String zzq(String p3)
    {
        if (!android.text.TextUtils.isEmpty(p3)) {
            int v0_2 = p3.lastIndexOf(46);
            if (v0_2 != -1) {
                return p3.substring(0, v0_2);
            } else {
                return "";
            }
        } else {
            return "";
        }
    }

    public final boolean zza()
    {
        return 0;
    }

    public final com.google.android.gms.measurement.internal.zzgs zzb()
    {
        return this.zzd;
    }

    public final com.google.android.gms.measurement.internal.zzgs zzc()
    {
        return this.zze;
    }

    public final com.google.android.gms.measurement.internal.zzgs zzd()
    {
        return this.zzf;
    }

    public final com.google.android.gms.measurement.internal.zzgs zze()
    {
        return this.zzg;
    }

    public final com.google.android.gms.measurement.internal.zzgs zzf()
    {
        return this.zzh;
    }

    public final com.google.android.gms.measurement.internal.zzgs zzh()
    {
        return this.zzi;
    }

    public final com.google.android.gms.measurement.internal.zzgs zzi()
    {
        return this.zzj;
    }

    public final com.google.android.gms.measurement.internal.zzgs zzj()
    {
        return this.zzk;
    }

    public final com.google.android.gms.measurement.internal.zzgs zzk()
    {
        return this.zzl;
    }

    public final void zzm(int p8, boolean p9, boolean p10, String p11, Object p12, Object p13, Object p14)
    {
        if ((p9 == null) && (android.util.Log.isLoggable(this.zzn(), p8))) {
            android.util.Log.println(p8, this.zzn(), com.google.android.gms.measurement.internal.zzgu.zzo(0, p11, p12, p13, p14));
        }
        if ((p10 == 0) && (p8 >= 5)) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p11);
            String v9_3 = this.zzu.zzi();
            if (v9_3 != null) {
                if (v9_3.zzv()) {
                    if (p8 >= 9) {
                        p8 = 8;
                    }
                    v9_3.zzj(new com.google.android.gms.measurement.internal.zzgr(this, p8, p11, p12, p13, p14));
                } else {
                    android.util.Log.println(6, this.zzn(), "Scheduler not initialized. Not logging error/warn");
                    return;
                }
            } else {
                android.util.Log.println(6, this.zzn(), "Scheduler not set. Not logging error/warn");
                return;
            }
        }
        return;
    }

    public final String zzn()
    {
        if (this.zzc == null) {
            this.zzc = this.zzu.zzc().zzb();
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc);
        return this.zzc;
    }

    public final synthetic char zzr()
    {
        return this.zza;
    }

    public final synthetic void zzs(char p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic long zzt()
    {
        return this.zzb;
    }

    public final synthetic void zzu(long p1)
    {
        this.zzb = 133005;
        return;
    }
}
