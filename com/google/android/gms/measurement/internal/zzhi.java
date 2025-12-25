package com.google.android.gms.measurement.internal;
final class zzhi implements java.lang.Runnable {
    final synthetic com.google.android.gms.internal.measurement.zzbq zza;
    final synthetic android.content.ServiceConnection zzb;
    final synthetic com.google.android.gms.measurement.internal.zzhj zzc;

    public zzhi(com.google.android.gms.measurement.internal.zzhj p1, com.google.android.gms.internal.measurement.zzbq p2, android.content.ServiceConnection p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void run()
    {
        String v0_0 = this.zzc;
        android.content.Context v1_0 = v0_0.zza;
        android.os.Bundle v2_2 = v1_0.zza;
        v2_2.zzaW().zzg();
        com.google.android.gms.measurement.internal.zzlj v3_20 = new android.os.Bundle();
        String v0_5 = v0_0.zza();
        v3_20.putString("package_name", v0_5);
        try {
            com.google.android.gms.measurement.internal.zzlj v3_13 = this.zza.zze(v3_20);
        } catch (android.os.Bundle v2_4) {
            v1_0.zza.zzaV().zzb().zzb("Exception occurred while retrieving the Install Referrer", v2_4.getMessage());
            v3_13 = 0;
            android.content.Context v1_2 = v1_0.zza;
            v1_2.zzaW().zzg();
            com.google.android.gms.measurement.internal.zzic.zzL();
            if (v3_13 != null) {
                long v8_1 = (v3_13.getLong("install_begin_timestamp_seconds", 0) * 1000);
                if (v8_1 != 0) {
                    android.os.Bundle v2_10 = v3_13.getString("install_referrer");
                    if ((v2_10 != null) && (!v2_10.isEmpty())) {
                        v1_2.zzaV().zzk().zzb("InstallReferrer API result", v2_10);
                        android.os.Bundle v2_13 = v1_2.zzk().zzi(android.net.Uri.parse("?".concat(v2_10)));
                        if (v2_13 != null) {
                            String v4_14 = java.util.Arrays.asList(((String) com.google.android.gms.measurement.internal.zzfy.zzbg.zzb(0)).split(","));
                            String v5_5 = v2_13.keySet().iterator();
                            while (v5_5.hasNext()) {
                                if (v4_14.contains(((String) v5_5.next()))) {
                                    com.google.android.gms.measurement.internal.zzlj v3_22 = (v3_13.getLong("referrer_click_timestamp_server_seconds", 0) * 1000);
                                    if (v3_22 <= 0) {
                                        break;
                                    }
                                    v2_13.putLong("click_timestamp", v3_22);
                                    break;
                                }
                            }
                            if (v8_1 == v1_2.zzd().zzd.zza()) {
                                v1_2.zzaV().zzk().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                            }
                            if (v1_2.zzB()) {
                                v1_2.zzd().zzd.zzb(v8_1);
                                v1_2.zzaV().zzk().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                v2_13.putString("_cis", "referrer API v2");
                                v1_2.zzj().zzI("auto", "_cmp", v2_13, v0_5);
                            }
                        } else {
                            v1.a.s(v1_2, "No campaign params defined in Install Referrer result");
                        }
                    } else {
                        v1.a.s(v1_2, "No referrer defined in Install Referrer response");
                    }
                } else {
                    v1.a.v(v1_2, "Service response is missing Install Referrer install timestamp");
                }
            }
            com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(v1_2.zzaY(), this.zzb);
            return;
        }
        if (v3_13 != null) {
        } else {
            v2_2.zzaV().zzb().zza("Install Referrer Service returned a null response");
        }
    }
}
