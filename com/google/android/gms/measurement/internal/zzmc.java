package com.google.android.gms.measurement.internal;
final class zzmc implements java.lang.Runnable {
    final synthetic String zza;
    final synthetic String zzb;
    final synthetic com.google.android.gms.measurement.internal.zzr zzc;
    final synthetic boolean zzd;
    final synthetic com.google.android.gms.internal.measurement.zzcu zze;
    final synthetic com.google.android.gms.measurement.internal.zznl zzf;

    public zzmc(com.google.android.gms.measurement.internal.zznl p1, String p2, String p3, com.google.android.gms.measurement.internal.zzr p4, boolean p5, com.google.android.gms.internal.measurement.zzcu p6)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p6;
        java.util.Objects.requireNonNull(p1);
        this.zzf = p1;
        return;
    }

    public final void run()
    {
        android.os.RemoteException v0_1 = new android.os.Bundle();
        try {
            Throwable v1_0 = this.zzf;
            String v2_2 = v1_0.zzZ();
        } catch (Throwable v1_2) {
            com.google.android.gms.internal.measurement.zzcu v3_1 = v0_1;
            android.os.RemoteException v0_2 = v1_2;
            this.zzf.zzu.zzaV().zzb().zzc("Failed to get user properties; remote exception", this.zza, v0_2);
            this.zzf.zzu.zzk().zzaq(this.zze, v3_1);
            return;
        } catch (Throwable v1_1) {
            this.zzf.zzu.zzk().zzaq(this.zze, v0_1);
            throw v1_1;
        } catch (android.os.RemoteException v0_8) {
            v1_1 = v0_8;
            v0_1 = v3_1;
        }
        if (v2_2 != null) {
            com.google.android.gms.internal.measurement.zzcu v3_2 = this.zzc;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_2);
            String v2_0 = v2_2.zzp(this.zza, this.zzb, this.zzd, v3_2);
            v3_1 = new android.os.Bundle();
            if (v2_0 != null) {
                String v2_1 = v2_0.iterator();
                while (v2_1.hasNext()) {
                    String v4_2 = ((com.google.android.gms.measurement.internal.zzpl) v2_1.next());
                    double v5_0 = v4_2.zze;
                    if (v5_0 == 0) {
                        double v5_1 = v4_2.zzd;
                        if (v5_1 == 0) {
                            double v5_2 = v4_2.zzg;
                            if (v5_2 != 0) {
                                v3_1.putDouble(v4_2.zzb, v5_2.doubleValue());
                            }
                        } else {
                            v3_1.putLong(v4_2.zzb, v5_1.longValue());
                        }
                    } else {
                        v3_1.putString(v4_2.zzb, v5_0);
                    }
                }
            } else {
            }
            try {
                v1_0.zzV();
                v1_0.zzu.zzk().zzaq(this.zze, v3_1);
                return;
            } catch (android.os.RemoteException v0_2) {
                this.zzf.zzu.zzaV().zzb().zzc("Failed to get user properties; remote exception", this.zza, v0_2);
                this.zzf.zzu.zzk().zzaq(this.zze, v3_1);
                return;
            }
        } else {
            Throwable v1_9 = v1_0.zzu;
            v1_9.zzaV().zzb().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
            v1_9.zzk().zzaq(this.zze, v0_1);
            return;
        }
    }
}
