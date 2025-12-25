package com.google.android.gms.measurement.internal;
public final class zzod {
    private final java.util.Map zza;

    public zzod(java.util.Map p2)
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        this.zza = v0_1;
        v0_1.putAll(p2);
        return;
    }

    private final android.os.Bundle zzf()
    {
        char v0_0 = this.zza;
        if ("1".equals(v0_0.get("GoogleConsent"))) {
            String v1_4 = this.zzg();
            if (v1_4 >= null) {
                char v0_2 = ((String) v0_0.get("PurposeConsents"));
                if (!android.text.TextUtils.isEmpty(v0_2)) {
                    android.os.Bundle v2_3 = new android.os.Bundle();
                    String v5 = "denied";
                    if (v0_2.length() > 0) {
                        String v8_1;
                        if (v0_2.charAt(0) != 49) {
                            v8_1 = "denied";
                        } else {
                            v8_1 = "granted";
                        }
                        v2_3.putString(com.google.android.gms.measurement.internal.zzjk.zza.zze, v8_1);
                    }
                    if (v0_2.length() > 3) {
                        if ((v0_2.charAt(2) != 49) || (v0_2.charAt(3) != 49)) {
                            String v8_4 = "denied";
                        } else {
                            v8_4 = "granted";
                        }
                        v2_3.putString(com.google.android.gms.measurement.internal.zzjk.zzd.zze, v8_4);
                    }
                    if ((v0_2.length() > 6) && (v1_4 >= 4)) {
                        if ((v0_2.charAt(0) == 49) && (v0_2.charAt(6) == 49)) {
                            v5 = "granted";
                        }
                        v2_3.putString(com.google.android.gms.measurement.internal.zzjk.zzc.zze, v5);
                    }
                    return v2_3;
                }
            }
        }
        return android.os.Bundle.EMPTY;
    }

    private final int zzg()
    {
        int v0 = -1;
        try {
            String v1_2 = ((String) this.zza.get("PolicyVersion"));
        } catch (NumberFormatException) {
            return v0;
        }
        if (android.text.TextUtils.isEmpty(v1_2)) {
            return v0;
        } else {
            v0 = Integer.parseInt(v1_2);
            return v0;
        }
    }

    public final boolean equals(Object p2)
    {
        if ((p2 instanceof com.google.android.gms.measurement.internal.zzod)) {
            return this.zza().equalsIgnoreCase(((com.google.android.gms.measurement.internal.zzod) p2).zza());
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return this.zza().hashCode();
    }

    public final String toString()
    {
        return this.zza();
    }

    public final String zza()
    {
        String v0_1 = new StringBuilder();
        m4.d v1 = com.google.android.gms.measurement.internal.zzof.zza;
        int v2 = v1.size();
        int v3 = 0;
        while (v3 < v2) {
            String v4_1 = ((String) v1.get(v3));
            java.util.Map v5 = this.zza;
            if (v5.containsKey(v4_1)) {
                if (v0_1.length() > 0) {
                    v0_1.append(";");
                }
                v0_1.append(v4_1);
                v0_1.append("=");
                v0_1.append(((String) v5.get(v4_1)));
            }
            v3++;
        }
        return v0_1.toString();
    }

    public final android.os.Bundle zzb()
    {
        boolean v0_0 = com.google.android.gms.measurement.internal.zzfy.zzaZ;
        if (!((Boolean) v0_0.zzb(0)).booleanValue()) {
            String v2_0 = this.zza;
            if (("1".equals(v2_0.get("GoogleConsent"))) && (("1".equals(v2_0.get("gdprApplies"))) && ("1".equals(v2_0.get("EnableAdvertiserConsentMode"))))) {
                if (!((Boolean) v0_0.zzb(0)).booleanValue()) {
                    return this.zzf();
                } else {
                    boolean v0_9 = this.zza;
                    if (v0_9.get("Version") != null) {
                        if (this.zzg() >= 0) {
                            int v4_6;
                            android.os.Bundle v1_5 = new android.os.Bundle();
                            String v6_0 = "granted";
                            if (1 == java.util.Objects.equals(v0_9.get("AuthorizePurpose1"), "1")) {
                                v4_6 = "granted";
                            } else {
                                v4_6 = "denied";
                            }
                            int v4_14;
                            v1_5.putString(com.google.android.gms.measurement.internal.zzjk.zza.zze, v4_6);
                            if ((!java.util.Objects.equals(v0_9.get("AuthorizePurpose3"), "1")) || (!java.util.Objects.equals(v0_9.get("AuthorizePurpose4"), "1"))) {
                                v4_14 = "denied";
                            } else {
                                v4_14 = "granted";
                            }
                            v1_5.putString(com.google.android.gms.measurement.internal.zzjk.zzd.zze, v4_14);
                            if (this.zzg() >= 4) {
                                if ((!java.util.Objects.equals(v0_9.get("AuthorizePurpose1"), "1")) || (!java.util.Objects.equals(v0_9.get("AuthorizePurpose7"), "1"))) {
                                    v6_0 = "denied";
                                }
                                v1_5.putString(com.google.android.gms.measurement.internal.zzjk.zzc.zze, v6_0);
                            }
                            return v1_5;
                        }
                    } else {
                        return this.zzf();
                    }
                }
            }
        } else {
            String v2_3 = this.zza;
            if (("1".equals(v2_3.get("gdprApplies"))) && ("1".equals(v2_3.get("EnableAdvertiserConsentMode")))) {
            }
        }
        return android.os.Bundle.EMPTY;
    }

    public final String zzc()
    {
        String v0_2 = ((String) this.zza.get("PurposeDiagnostics"));
        if (android.text.TextUtils.isEmpty(v0_2)) {
            v0_2 = "200000";
        }
        return v0_2;
    }

    public final String zzd(com.google.android.gms.measurement.internal.zzod p7)
    {
        String v0_1;
        String v0_0 = p7.zza;
        String v2 = "0";
        if ((v0_0.isEmpty()) || (((String) v0_0.get("Version")) != null)) {
            v0_1 = "0";
        } else {
            v0_1 = "1";
        }
        String v1_0 = this.zzb();
        boolean v7_1 = p7.zzb();
        if ((v1_0.size() != v7_1.size()) || ((!java.util.Objects.equals(v1_0.getString("ad_storage"), v7_1.getString("ad_storage"))) || ((!java.util.Objects.equals(v1_0.getString("ad_personalization"), v7_1.getString("ad_personalization"))) || (!java.util.Objects.equals(v1_0.getString("ad_user_data"), v7_1.getString("ad_user_data")))))) {
            v2 = "1";
        }
        return v0_1.concat(v2);
    }

    public final String zze()
    {
        String v0_1 = new StringBuilder("1");
        int v2_0 = -1;
        try {
            int v3_6 = ((String) this.zza.get("CmpSdkID"));
        } catch (NumberFormatException) {
            if (v2_0 < 0) {
                v0_1.append("00");
            } else {
                if (v2_0 > 4095) {
                } else {
                    v0_1.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((v2_0 >> 6)));
                    v0_1.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((v2_0 & 63)));
                }
            }
            int v2_4 = this.zzg();
            if (v2_4 < 0) {
                v0_1.append("0");
            } else {
                if (v2_4 > 63) {
                } else {
                    v0_1.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v2_4));
                }
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(1);
            int v3_2 = this.zza;
            if (1 == "1".equals(v3_2.get("gdprApplies"))) {
                int v2_8 = 2;
            } else {
                v2_8 = 0;
            }
            int v3_4 = (v2_8 | 4);
            if ("1".equals(v3_2.get("EnableAdvertiserConsentMode"))) {
                v3_4 = (v2_8 | 12);
            }
            v0_1.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v3_4));
            return v0_1.toString();
        }
        if (android.text.TextUtils.isEmpty(v3_6)) {
        } else {
            v2_0 = Integer.parseInt(v3_6);
        }
    }
}
