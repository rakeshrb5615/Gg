package com.google.android.gms.measurement.internal;
public final class zzhd {
    final synthetic com.google.android.gms.measurement.internal.zzhh zza;
    private final String zzb;
    private final android.os.Bundle zzc;
    private android.os.Bundle zzd;

    public zzhd(com.google.android.gms.measurement.internal.zzhh p1, String p2, android.os.Bundle p3)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzb = p2;
        this.zzc = new android.os.Bundle();
        return;
    }

    public final android.os.Bundle zza()
    {
        if (this.zzd == null) {
            android.os.Bundle v0_7 = this.zza;
            String v1_6 = v0_7.zzd().getString(this.zzb, 0);
            if (v1_6 != null) {
                try {
                    android.os.Bundle v2_1 = new android.os.Bundle();
                    org.json.JSONArray v4_1 = new org.json.JSONArray(v1_6);
                    int v5 = 0;
                } catch (org.json.JSONException) {
                    v1.a.s(this.zza.zzu, "Error loading bundle from SharedPreferences. Values will be lost");
                }
                while (v5 < v4_1.length()) {
                    int v6_10 = v4_1.getJSONObject(v5);
                    String v7_3 = v6_10.getString("n");
                    org.json.JSONArray v8_4 = v6_10.getString("t");
                    long[] v9_2 = v8_4.hashCode();
                    if (v9_2 == 100) {
                        if (v8_4.equals("d")) {
                            v2_1.putDouble(v7_3, Double.parseDouble(v6_10.getString("v")));
                            v5++;
                        }
                    } else {
                        if (v9_2 == 108) {
                            if (v8_4.equals("l")) {
                                v2_1.putLong(v7_3, Long.parseLong(v6_10.getString("v")));
                            }
                        } else {
                            if (v9_2 == 115) {
                                if (v8_4.equals("s")) {
                                    v2_1.putString(v7_3, v6_10.getString("v"));
                                }
                            } else {
                                if (v9_2 == 3352) {
                                    if (v8_4.equals("ia")) {
                                        com.google.android.gms.internal.measurement.zzqp.zza();
                                        if (!v0_7.zzu.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaQ)) {
                                        } else {
                                            org.json.JSONArray v8_11 = new org.json.JSONArray(v6_10.getString("v"));
                                            int v6_15 = v8_11.length();
                                            long[] v9_12 = new int[v6_15];
                                            int v10_5 = 0;
                                            while (v10_5 < v6_15) {
                                                v9_12[v10_5] = v8_11.optInt(v10_5);
                                                v10_5++;
                                            }
                                            v2_1.putIntArray(v7_3, v9_12);
                                        }
                                    }
                                } else {
                                    if ((v9_2 == 3445) && (v8_4.equals("la"))) {
                                        com.google.android.gms.internal.measurement.zzqp.zza();
                                        if (!v0_7.zzu.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaQ)) {
                                        } else {
                                            org.json.JSONArray v8_2 = new org.json.JSONArray(v6_10.getString("v"));
                                            int v6_1 = v8_2.length();
                                            long[] v9_1 = new long[v6_1];
                                            int v10_0 = 0;
                                            while (v10_0 < v6_1) {
                                                v9_1[v10_0] = v8_2.optLong(v10_0);
                                                v10_0++;
                                            }
                                            v2_1.putLongArray(v7_3, v9_1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    v0_7.zzu.zzaV().zzb().zzb("Unrecognized persisted bundle type. Type", v8_4);
                }
                this.zzd = v2_1;
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return new android.os.Bundle(((android.os.Bundle) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd)));
    }

    public final void zzb(android.os.Bundle p17)
    {
        android.os.Bundle v2_1;
        if (p17 != null) {
            v2_1 = new android.os.Bundle(p17);
        } else {
            v2_1 = new android.os.Bundle();
        }
        com.google.android.gms.measurement.internal.zzhh v3 = this.zza;
        android.content.SharedPreferences$Editor v4 = v3.zzd().edit();
        if (v2_1.size() != 0) {
            String v5 = this.zzb;
            org.json.JSONArray v6_1 = new org.json.JSONArray();
            java.util.Iterator v7 = v2_1.keySet().iterator();
            while (v7.hasNext()) {
                com.google.android.gms.measurement.internal.zzgs v0_9 = ((String) v7.next());
                Class v8_9 = v2_1.get(v0_9);
                if (v8_9 != null) {
                    String v9_2 = new org.json.JSONObject();
                    v9_2.put("n", v0_9);
                    com.google.android.gms.internal.measurement.zzqp.zza();
                    com.google.android.gms.measurement.internal.zzgs v0_10 = v3.zzu;
                    com.google.android.gms.measurement.internal.zzic v17_1 = v0_10;
                    if (!v0_10.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaQ)) {
                        v9_2.put("v", v8_9.toString());
                        if (!(v8_9 instanceof String)) {
                            if (!(v8_9 instanceof Long)) {
                                if (!(v8_9 instanceof Double)) {
                                    v17_1.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", v8_9.getClass());
                                } else {
                                    v9_2.put("t", "d");
                                }
                            } else {
                                v9_2.put("t", "l");
                            }
                        } else {
                            v9_2.put("t", "s");
                        }
                    } else {
                        if (!(v8_9 instanceof String)) {
                            if (!(v8_9 instanceof Long)) {
                                if (!(v8_9 instanceof int[])) {
                                    if (!(v8_9 instanceof long[])) {
                                        if (!(v8_9 instanceof Double)) {
                                            v17_1.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", v8_9.getClass());
                                        } else {
                                            v9_2.put("v", v8_9.toString());
                                            v9_2.put("t", "d");
                                        }
                                    } else {
                                        v9_2.put("v", java.util.Arrays.toString(((long[]) v8_9)));
                                        v9_2.put("t", "la");
                                    }
                                } else {
                                    v9_2.put("v", java.util.Arrays.toString(((int[]) v8_9)));
                                    v9_2.put("t", "ia");
                                }
                            } else {
                                v9_2.put("v", v8_9.toString());
                                v9_2.put("t", "l");
                            }
                        } else {
                            v9_2.put("v", v8_9.toString());
                            v9_2.put("t", "s");
                        }
                    }
                    v6_1.put(v9_2);
                }
            }
            v4.putString(v5, v6_1.toString());
        } else {
            v4.remove(this.zzb);
        }
        v4.apply();
        this.zzd = v2_1;
        return;
    }
}
