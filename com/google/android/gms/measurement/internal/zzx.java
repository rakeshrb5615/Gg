package com.google.android.gms.measurement.internal;
public final class zzx {
    private final com.google.android.gms.measurement.internal.zzic zza;

    public zzx(com.google.android.gms.measurement.internal.zzic p1)
    {
        this.zza = p1;
        return;
    }

    public final void zza()
    {
        com.google.android.gms.measurement.internal.zzhe v0_0 = this.zza;
        v0_0.zzaW().zzg();
        if (this.zze()) {
            if (!this.zzd()) {
                String v1_2 = v0_0.zzd().zzr.zza();
                if (!android.text.TextUtils.isEmpty(v1_2)) {
                    android.os.Bundle v4_4 = (v0_0.zzd().zzs.zza() / 3600000);
                    String v1_4 = android.net.Uri.parse(v1_2);
                    android.os.Bundle v8_1 = new android.os.Bundle();
                    android.util.Pair v9_1 = new android.util.Pair(v1_4.getPath(), v8_1);
                    long v10_2 = v1_4.getQueryParameterNames().iterator();
                    while (v10_2.hasNext()) {
                        String v11_2 = ((String) v10_2.next());
                        v8_1.putString(v11_2, v1_4.getQueryParameter(v11_2));
                    }
                    String v1_9;
                    ((android.os.Bundle) v9_1.second).putLong("_cc", ((v4_4 + -1) * 3600000));
                    String v1_7 = v9_1.first;
                    if (v1_7 != null) {
                        v1_9 = ((String) v1_7);
                    } else {
                        v1_9 = "app";
                    }
                    v0_0.zzj().zzF(v1_9, "_cmp", ((android.os.Bundle) v9_1.second));
                } else {
                    v0_0.zzaV().zzc().zza("Cache still valid but referrer not found");
                }
                v0_0.zzd().zzr.zzb(0);
            } else {
                v0_0.zzd().zzr.zzb(0);
                String v1_17 = new android.os.Bundle();
                v1_17.putString("source", "(not set)");
                v1_17.putString("medium", "(not set)");
                v1_17.putString("_cis", "intent");
                v1_17.putLong("_cc", 1);
                v0_0.zzj().zzF("auto", "_cmpx", v1_17);
            }
            v0_0.zzd().zzs.zzb(0);
            return;
        } else {
            return;
        }
    }

    public final void zzb(String p5, android.os.Bundle p6)
    {
        long v0_0 = this.zza;
        v0_0.zzaW().zzg();
        if (!v0_0.zzB()) {
            String v5_4;
            if (!p6.isEmpty()) {
                if (1 == p5.isEmpty()) {
                    p5 = "auto";
                }
                android.net.Uri$Builder v1_2 = new android.net.Uri$Builder();
                v1_2.path(p5);
                String v5_2 = p6.keySet().iterator();
                while (v5_2.hasNext()) {
                    String v2_3 = ((String) v5_2.next());
                    v1_2.appendQueryParameter(v2_3, p6.getString(v2_3));
                }
                v5_4 = v1_2.build().toString();
            } else {
                v5_4 = 0;
            }
            if (!android.text.TextUtils.isEmpty(v5_4)) {
                v0_0.zzd().zzr.zzb(v5_4);
                v0_0.zzd().zzs.zzb(v0_0.zzaZ().currentTimeMillis());
            }
        }
        return;
    }

    public final void zzc()
    {
        if ((this.zze()) && (this.zzd())) {
            this.zza.zzd().zzr.zzb(0);
        }
        return;
    }

    public final boolean zzd()
    {
        if (this.zze()) {
            int v0_4 = this.zza;
            if ((v0_4.zzaZ().currentTimeMillis() - v0_4.zzd().zzs.zza()) <= v0_4.zzc().zzl(0, com.google.android.gms.measurement.internal.zzfy.zzaj)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final boolean zze()
    {
        if (this.zza.zzd().zzs.zza() <= 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
