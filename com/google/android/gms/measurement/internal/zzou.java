package com.google.android.gms.measurement.internal;
public final class zzou extends com.google.android.gms.measurement.internal.zzol {

    public zzou(com.google.android.gms.measurement.internal.zzpg p1)
    {
        super(p1);
        return;
    }

    private final String zzd(String p6)
    {
        String v6_4 = this.zzg.zzh().zzc(p6);
        if (android.text.TextUtils.isEmpty(v6_4)) {
            return ((String) com.google.android.gms.measurement.internal.zzfy.zzq.zzb(0));
        } else {
            String v0_4 = android.net.Uri.parse(((String) com.google.android.gms.measurement.internal.zzfy.zzq.zzb(0)));
            android.net.Uri$Builder v1_0 = v0_4.buildUpon();
            String v0_6 = v0_4.getAuthority();
            StringBuilder v4_1 = new StringBuilder(((String.valueOf(v6_4).length() + 1) + String.valueOf(v0_6).length()));
            v4_1.append(v6_4);
            v4_1.append(".");
            v4_1.append(v0_6);
            v1_0.authority(v4_1.toString());
            return v1_0.build().toString();
        }
    }

    private static final boolean zzf(String p5)
    {
        String[] v0_3 = ((String) com.google.android.gms.measurement.internal.zzfy.zzs.zzb(0));
        if (!android.text.TextUtils.isEmpty(v0_3)) {
            String[] v0_1 = v0_3.split(",");
            int v3 = 0;
            while (v3 < v0_1.length) {
                if (!p5.equalsIgnoreCase(v0_1[v3].trim())) {
                    v3++;
                } else {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public final com.google.android.gms.measurement.internal.zzot zza(String p12)
    {
        com.google.android.gms.measurement.internal.zzgs v0_0 = this.zzg;
        String v1_12 = v0_0.zzj().zzu(p12);
        com.google.android.gms.measurement.internal.zzot v2_1 = 0;
        if ((v1_12 != null) && (v1_12.zzai())) {
            com.google.android.gms.internal.measurement.zzis v3_0 = com.google.android.gms.internal.measurement.zzis.zzb();
            v3_0.zzb(2);
            v3_0.zza(((com.google.android.gms.internal.measurement.zzin) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.internal.measurement.zzin.zzb(v1_12.zzaL()))));
            int v5_4 = v1_12.zzd();
            java.util.HashMap v6_1 = v0_0.zzh().zzb(p12);
            if (v6_1 != null) {
                String v8_1 = v0_0.zzj().zzu(p12);
                if ((v8_1 != null) && (((v6_1.zzp()) && (v6_1.zzq().zzc() == 100)) || ((this.zzu.zzk().zzaa(p12, v8_1.zzay())) || ((!android.text.TextUtils.isEmpty(v5_4)) && (Math.abs((v5_4.hashCode() % 100)) < v6_1.zzq().zzc()))))) {
                    int v5_8 = v1_12.zzc();
                    v3_0.zzb(2);
                    com.google.android.gms.measurement.internal.zzgs v0_25 = v0_0.zzh().zzb(v1_12.zzc());
                    if ((v0_25 != null) && (v0_25.zzp())) {
                        java.util.HashMap v6_7 = new java.util.HashMap();
                        if (!android.text.TextUtils.isEmpty(v1_12.zzay())) {
                            v6_7.put("x-gtm-server-preview", v1_12.zzay());
                        }
                        String v8_9 = v0_25.zzq().zzd();
                        boolean v9_10 = com.google.android.gms.internal.measurement.zzin.zzb(v1_12.zzaL());
                        if ((!v9_10) || (v9_10 == com.google.android.gms.internal.measurement.zzin.zzb)) {
                            if (!com.google.android.gms.measurement.internal.zzou.zzf(v1_12.zzc())) {
                                if (!android.text.TextUtils.isEmpty(v8_9)) {
                                    this.zzu.zzaV().zzk().zzb("[sgtm] Eligible for client side upload. appId", v5_8);
                                    v3_0.zzb(3);
                                    v3_0.zza(com.google.android.gms.internal.measurement.zzin.zzb);
                                    v2_1 = new com.google.android.gms.measurement.internal.zzot(v8_9, v6_7, com.google.android.gms.measurement.internal.zzls.zzd, ((com.google.android.gms.internal.measurement.zzis) v3_0.zzbc()));
                                    if (v2_1 == null) {
                                        return new com.google.android.gms.measurement.internal.zzot(this.zzd(p12), java.util.Collections.EMPTY_MAP, com.google.android.gms.measurement.internal.zzls.zza, ((com.google.android.gms.internal.measurement.zzis) v3_0.zzbc()));
                                    } else {
                                        return v2_1;
                                    }
                                    v3_0.zzc(3);
                                    return new com.google.android.gms.measurement.internal.zzot(this.zzd(p12), java.util.Collections.EMPTY_MAP, com.google.android.gms.measurement.internal.zzls.zza, ((com.google.android.gms.internal.measurement.zzis) v3_0.zzbc()));
                                } else {
                                    v3_0.zza(com.google.android.gms.internal.measurement.zzin.zzl);
                                }
                            } else {
                                v3_0.zza(com.google.android.gms.internal.measurement.zzin.zzk);
                            }
                        } else {
                            v3_0.zza(v9_10);
                        }
                        v0_25.zzq().zza();
                        v0_25.zzq().zzb();
                        com.google.android.gms.measurement.internal.zzgs v0_7 = this.zzu;
                        v0_7.zzaU();
                        if (android.text.TextUtils.isEmpty(v8_9)) {
                            v3_0.zzc(6);
                            v0_7.zzaV().zzk().zzb("[sgtm] Local service, missing sgtm_server_url", v1_12.zzc());
                        } else {
                            v0_7.zzaV().zzk().zzb("[sgtm] Eligible for local service direct upload. appId", v5_8);
                            v3_0.zzb(5);
                            v3_0.zzc(2);
                            v2_1 = new com.google.android.gms.measurement.internal.zzot(v8_9, v6_7, com.google.android.gms.measurement.internal.zzls.zzc, ((com.google.android.gms.internal.measurement.zzis) v3_0.zzbc()));
                        }
                    } else {
                        this.zzu.zzaV().zzk().zzb("[sgtm] Missing sgtm_setting in remote config. appId", v5_8);
                        v3_0.zzc(4);
                    }
                }
            }
            v3_0.zzc(3);
            return new com.google.android.gms.measurement.internal.zzot(this.zzd(p12), java.util.Collections.EMPTY_MAP, com.google.android.gms.measurement.internal.zzls.zza, ((com.google.android.gms.internal.measurement.zzis) v3_0.zzbc()));
        } else {
            return new com.google.android.gms.measurement.internal.zzot(this.zzd(p12), java.util.Collections.EMPTY_MAP, com.google.android.gms.measurement.internal.zzls.zza, 0);
        }
    }

    public final boolean zzc(String p3, com.google.android.gms.internal.measurement.zzin p4)
    {
        this.zzg();
        if ((p4 == com.google.android.gms.internal.measurement.zzin.zzb) && (!com.google.android.gms.measurement.internal.zzou.zzf(p3))) {
            int v3_1 = this.zzg.zzh().zzb(p3);
            if ((v3_1 != 0) && ((v3_1.zzp()) && (!v3_1.zzq().zzd().isEmpty()))) {
                return 1;
            }
        }
        return 0;
    }
}
