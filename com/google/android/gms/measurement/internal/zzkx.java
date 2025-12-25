package com.google.android.gms.measurement.internal;
final class zzkx implements java.lang.Runnable {
    final synthetic boolean zza;
    final synthetic android.net.Uri zzb;
    final synthetic String zzc;
    final synthetic String zzd;
    final synthetic com.google.android.gms.measurement.internal.zzky zze;

    public zzkx(com.google.android.gms.measurement.internal.zzky p1, boolean p2, android.net.Uri p3, String p4, String p5)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        java.util.Objects.requireNonNull(p1);
        this.zze = p1;
        return;
    }

    public final void run()
    {
        String v2_1 = this.zze;
        com.google.android.gms.measurement.internal.zzlj v3 = v2_1.zza;
        v3.zzg();
        String v4 = this.zzd;
        int v5_3 = this.zzb;
        com.google.android.gms.measurement.internal.zzgs v7_0;
        StringBuilder v6_2 = v3.zzu;
        com.google.android.gms.measurement.internal.zzgs v7_4 = v6_2.zzk();
        if (!android.text.TextUtils.isEmpty(v4)) {
            if ((v4.contains("gclid")) || ((v4.contains("gbraid")) || ((v4.contains("utm_campaign")) || ((v4.contains("utm_source")) || ((v4.contains("utm_medium")) || ((v4.contains("utm_id")) || ((v4.contains("dclid")) || ((v4.contains("srsltid")) || (v4.contains("sfmc_id")))))))))) {
                v7_0 = v7_4.zzi(android.net.Uri.parse("https://google.com/search?".concat(v4)));
                if (v7_0 != null) {
                    v7_0.putString("_cis", "referrer");
                }
            } else {
                v7_4.zzu.zzaV().zzj().zza("Activity created with data \'referrer\' without required params");
                v7_0 = 0;
            }
        }
        String v16;
        String v8_4 = this.zzc;
        if (!this.zza) {
            v16 = v6_2;
        } else {
            int v5_4 = v6_2.zzk().zzi(v5_3);
            if (v5_4 == 0) {
            } else {
                v5_4.putString("_cis", "intent");
                if ((v5_4.containsKey("gclid")) || ((v7_0 == null) || (!v7_0.containsKey("gclid")))) {
                    v16 = v6_2;
                } else {
                    String v10_1 = v7_0.getString("gclid");
                    v16 = v6_2;
                    StringBuilder v6_4 = new StringBuilder("gclid=");
                    v6_4.append(v10_1);
                    v5_4.putString("_cer", v6_4.toString());
                }
                v3.zzF(v8_4, "_cmp", v5_4);
                v3.zzb.zzb(v8_4, v5_4);
            }
        }
        if (!android.text.TextUtils.isEmpty(v4)) {
            v16.zzaV().zzj().zzb("Activity created with referrer", v4);
            if (!v16.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaG)) {
                if ((!v4.contains("gclid")) || ((!v4.contains("utm_campaign")) && ((!v4.contains("utm_source")) && ((!v4.contains("utm_medium")) && ((!v4.contains("utm_term")) && (!v4.contains("utm_content"))))))) {
                    v16.zzaV().zzj().zza("Activity created with data \'referrer\' without required params");
                    return;
                } else {
                    if (!android.text.TextUtils.isEmpty(v4)) {
                        v3.zzK("auto", "_ldl", v4, 1);
                    }
                }
            } else {
                if (v7_0 == null) {
                    v16.zzaV().zzj().zzb("Referrer does not contain valid parameters", v4);
                } else {
                    v3.zzF(v8_4, "_cmp", v7_0);
                    v3.zzb.zzb(v8_4, v7_0);
                }
                v3.zzK("auto", "_ldl", 0, 1);
                return;
            }
        } else {
        }
        return;
    }
}
