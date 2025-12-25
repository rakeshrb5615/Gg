package com.google.android.gms.internal.play_billing;
final class zzdb implements java.lang.Runnable {
    com.google.android.gms.internal.play_billing.zzde zza;

    public zzdb(com.google.android.gms.internal.play_billing.zzde p1)
    {
        this.zza = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.internal.play_billing.zzde v1 = this.zza;
        if (v1 != null) {
            com.google.android.gms.internal.play_billing.zzcz v2 = com.google.android.gms.internal.play_billing.zzde.zzr(v1);
            if (v2 != null) {
                this.zza = 0;
                if (!v2.isDone()) {
                    try {
                        com.google.android.gms.internal.play_billing.zzdc v5_0 = com.google.android.gms.internal.play_billing.zzde.zzt(v1);
                        com.google.android.gms.internal.play_billing.zzde.zzu(v1, 0);
                        String v6 = "Timed out";
                    } catch (String v0_5) {
                        v2.cancel(1);
                        throw v0_5;
                    }
                    if (v5_0 != null) {
                        String v7_2 = Math.abs(v5_0.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
                        if (v7_2 > 10) {
                            com.google.android.gms.internal.play_billing.zzdc v5_3 = new StringBuilder("Timed out (timeout delayed by ");
                            v5_3.append(v7_2);
                            v5_3.append(" ms after scheduled time)");
                            v6 = v5_3.toString();
                        }
                    }
                    String v0_2 = v2.toString();
                    com.google.android.gms.internal.play_billing.zzdc v5_5 = new StringBuilder();
                    v5_5.append(v6);
                    v5_5.append(": ");
                    v5_5.append(v0_2);
                    v1.zzi(new com.google.android.gms.internal.play_billing.zzdc(v5_5.toString(), 0));
                    v2.cancel(1);
                    return;
                } else {
                    v1.zzj(v2);
                    return;
                }
            }
        }
        return;
    }
}
