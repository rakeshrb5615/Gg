package com.google.android.gms.measurement.internal;
final class zzky implements android.app.Application$ActivityLifecycleCallbacks, com.google.android.gms.measurement.internal.zzkw {
    final synthetic com.google.android.gms.measurement.internal.zzlj zza;

    public zzky(com.google.android.gms.measurement.internal.zzlj p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final void onActivityCreated(android.app.Activity p1, android.os.Bundle p2)
    {
        this.zza(com.google.android.gms.internal.measurement.zzdf.zza(p1), p2);
        return;
    }

    public final void onActivityDestroyed(android.app.Activity p1)
    {
        this.zzb(com.google.android.gms.internal.measurement.zzdf.zza(p1));
        return;
    }

    public final void onActivityPaused(android.app.Activity p1)
    {
        this.zzc(com.google.android.gms.internal.measurement.zzdf.zza(p1));
        return;
    }

    public final void onActivityResumed(android.app.Activity p1)
    {
        this.zzd(com.google.android.gms.internal.measurement.zzdf.zza(p1));
        return;
    }

    public final void onActivitySaveInstanceState(android.app.Activity p1, android.os.Bundle p2)
    {
        this.zze(com.google.android.gms.internal.measurement.zzdf.zza(p1), p2);
        return;
    }

    public final void onActivityStarted(android.app.Activity p1)
    {
        return;
    }

    public final void onActivityStopped(android.app.Activity p1)
    {
        return;
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdf p8, android.os.Bundle p9)
    {
        try {
            RuntimeException v0_11;
            RuntimeException v0_0 = this.zza;
            com.google.android.gms.measurement.internal.zzkx v1_0 = v0_0.zzu;
            v1_0.zzaV().zzk().zza("onActivityCreated");
            com.google.android.gms.measurement.internal.zzky v2_8 = p8.zzc;
        } catch (RuntimeException v0_9) {
            com.google.android.gms.measurement.internal.zzky v2_7.zza.zzu.zzs().zzm(p8, p9);
            throw v0_9;
        }
        if (v2_8 != null) {
            android.os.Bundle v4_1;
            int v3_0 = v2_8.getData();
            if (v3_0 == 0) {
                int v3_1 = v2_8.getExtras();
                v4_1 = 0;
                if (v3_1 != 0) {
                    int v3_2 = v3_1.getString("com.android.vending.referral_url");
                    if (!android.text.TextUtils.isEmpty(v3_2)) {
                        v3_0 = android.net.Uri.parse(v3_2);
                        v4_1 = v3_0;
                    }
                }
            } else {
                if (v3_0.isHierarchical()) {
                } else {
                }
            }
            if ((v4_1 != null) && (v4_1.isHierarchical())) {
                RuntimeException v0_4;
                v1_0.zzk();
                RuntimeException v0_2 = v2_8.getStringExtra("android.intent.extra.REFERRER_NAME");
                if (("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(v0_2)) || ("https://www.google.com".equals(v0_2))) {
                    v0_4 = "gs";
                } else {
                    if (!"android-app://com.google.appcrawler".equals(v0_2)) {
                        v0_4 = "auto";
                    } else {
                    }
                }
                boolean v5_2 = v0_4;
                RuntimeException v0_6;
                String v6 = v4_1.getQueryParameter("referrer");
                if (p9 != null) {
                    v0_6 = 0;
                } else {
                    v0_6 = 1;
                }
                v2_7 = this;
                try {
                    v1_0.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkx(this, v0_6, v4_1, v5_2, v6));
                } catch (RuntimeException v0_8) {
                    v2_7.zza.zzu.zzaV().zzb().zzb("Throwable caught in onActivityCreated", v0_8);
                }
                v0_11 = v2_7.zza.zzu;
                v0_11.zzs().zzm(p8, p9);
                return;
            }
        }
        v0_11 = v0_0.zzu;
        v0_11.zzs().zzm(p8, p9);
        return;
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzdf p2)
    {
        this.zza.zzu.zzs().zzs(p2);
        return;
    }

    public final void zzc(com.google.android.gms.internal.measurement.zzdf p5)
    {
        com.google.android.gms.measurement.internal.zzhz v0_1 = this.zza.zzu;
        v0_1.zzs().zzp(p5);
        com.google.android.gms.measurement.internal.zzoc v5_1 = v0_1.zzh();
        com.google.android.gms.measurement.internal.zzhz v0_3 = v5_1.zzu;
        v0_3.zzaW().zzj(new com.google.android.gms.measurement.internal.zznv(v5_1, v0_3.zzaZ().elapsedRealtime()));
        return;
    }

    public final void zzd(com.google.android.gms.internal.measurement.zzdf p7)
    {
        com.google.android.gms.measurement.internal.zzmb v0_1 = this.zza.zzu;
        com.google.android.gms.measurement.internal.zzoc v1 = v0_1.zzh();
        com.google.android.gms.measurement.internal.zzhz v2_1 = v1.zzu;
        v2_1.zzaW().zzj(new com.google.android.gms.measurement.internal.zznu(v1, v2_1.zzaZ().elapsedRealtime()));
        v0_1.zzs().zzn(p7);
        return;
    }

    public final void zze(com.google.android.gms.internal.measurement.zzdf p2, android.os.Bundle p3)
    {
        this.zza.zzu.zzs().zzq(p2, p3);
        return;
    }
}
