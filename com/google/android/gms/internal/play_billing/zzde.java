package com.google.android.gms.internal.play_billing;
final class zzde extends com.google.android.gms.internal.play_billing.zzcq {
    private com.google.android.gms.internal.play_billing.zzcz zzd;
    private java.util.concurrent.ScheduledFuture zze;

    private zzde(com.google.android.gms.internal.play_billing.zzcz p1)
    {
        this.zzd = p1;
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzcz zzr(com.google.android.gms.internal.play_billing.zzde p0)
    {
        return p0.zzd;
    }

    public static com.google.android.gms.internal.play_billing.zzcz zzs(com.google.android.gms.internal.play_billing.zzcz p2, long p3, java.util.concurrent.TimeUnit p5, java.util.concurrent.ScheduledExecutorService p6)
    {
        com.google.android.gms.internal.play_billing.zzde v3_1 = new com.google.android.gms.internal.play_billing.zzde(p2);
        com.google.android.gms.internal.play_billing.zzdb v4_1 = new com.google.android.gms.internal.play_billing.zzdb(v3_1);
        v3_1.zze = p6.schedule(v4_1, 28500, p5);
        p2.zzb(v4_1, com.google.android.gms.internal.play_billing.zzcp.zza);
        return v3_1;
    }

    public static bridge synthetic java.util.concurrent.ScheduledFuture zzt(com.google.android.gms.internal.play_billing.zzde p0)
    {
        return p0.zze;
    }

    public static bridge synthetic void zzu(com.google.android.gms.internal.play_billing.zzde p0, java.util.concurrent.ScheduledFuture p1)
    {
        p0.zze = 0;
        return;
    }

    public final String zzd()
    {
        String v0_0 = this.zzd;
        long v1_0 = this.zze;
        if (v0_0 == null) {
            return 0;
        } else {
            String v0_1 = v1.a.l("inputFuture=[", v0_0.toString(), "]");
            if (v1_0 != 0) {
                long v1_1 = v1_0.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
                if (v1_1 > 0) {
                    StringBuilder v3_3 = new StringBuilder();
                    v3_3.append(v0_1);
                    v3_3.append(", remaining delay=[");
                    v3_3.append(v1_1);
                    v3_3.append(" ms]");
                    v0_1 = v3_3.toString();
                }
            }
            return v0_1;
        }
    }

    public final void zzg()
    {
        boolean v4_1;
        int v0_0 = this.zzd;
        int v2 = 1;
        if (v0_0 == 0) {
            v4_1 = 0;
        } else {
            v4_1 = 1;
        }
        if (((this.valueField instanceof com.google.android.gms.internal.play_billing.zzcj$zza) & v4_1) != 0) {
            boolean v1_1 = this.valueField;
            if ((!(v1_1 instanceof com.google.android.gms.internal.play_billing.zzcj$zza)) || (!((com.google.android.gms.internal.play_billing.zzcj$zza) v1_1).zzc)) {
                v2 = 0;
            }
            v0_0.cancel(v2);
        }
        int v0_1 = this.zze;
        if (v0_1 != 0) {
            v0_1.cancel(0);
        }
        this.zzd = 0;
        this.zze = 0;
        return;
    }
}
