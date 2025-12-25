package com.google.android.gms.internal.measurement;
public final class zzc {
    final com.google.android.gms.internal.measurement.zzf zza;
    com.google.android.gms.internal.measurement.zzg zzb;
    final com.google.android.gms.internal.measurement.zzab zzc;
    private final com.google.android.gms.internal.measurement.zzz zzd;

    public zzc()
    {
        com.google.android.gms.internal.measurement.zzj v0_1 = new com.google.android.gms.internal.measurement.zzf();
        this.zza = v0_1;
        this.zzb = v0_1.zzb.zzc();
        this.zzc = new com.google.android.gms.internal.measurement.zzab();
        this.zzd = new com.google.android.gms.internal.measurement.zzz();
        v0_1.zzd.zza("internal.registerCallback", new com.google.android.gms.internal.measurement.zzb(this));
        v0_1.zzd.zza("internal.eventLogger", new com.google.android.gms.internal.measurement.zza(this));
        return;
    }

    public final void zza(String p2, java.util.concurrent.Callable p3)
    {
        this.zza.zzd.zza(p2, p3);
        return;
    }

    public final boolean zzb(com.google.android.gms.internal.measurement.zzaa p6)
    {
        try {
            com.google.android.gms.internal.measurement.zzd v0_0 = this.zzc;
            v0_0.zzb(p6);
            this.zza.zzc.zze("runtime.counter", new com.google.android.gms.internal.measurement.zzah(Double.valueOf(0)));
            this.zzd.zzb(this.zzb.zzc(), v0_0);
        } catch (int v6_3) {
            throw new com.google.android.gms.internal.measurement.zzd(v6_3);
        }
        if ((!this.zzc()) && (!this.zzd())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzc()
    {
        int v0_0 = this.zzc;
        if (v0_0.zzc().equals(v0_0.zza())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzd()
    {
        if (this.zzc.zzf().isEmpty()) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.measurement.zzab zze()
    {
        return this.zzc;
    }

    public final void zzf(com.google.android.gms.internal.measurement.zzja p9)
    {
        String v0_0 = this.zza;
        this.zzb = v0_0.zzb.zzc();
        java.util.List v3_7 = new com.google.android.gms.internal.measurement.zzje[0];
        if ((v0_0.zza(this.zzb, ((com.google.android.gms.internal.measurement.zzje[]) p9.zza().toArray(v3_7))) instanceof com.google.android.gms.internal.measurement.zzag)) {
            throw new IllegalStateException("Program loading failed");
        } else {
            IllegalStateException v9_5 = p9.zzb().zza().iterator();
            while (v9_5.hasNext()) {
                String v1_8 = ((com.google.android.gms.internal.measurement.zziy) v9_5.next());
                java.util.Iterator v2_0 = v1_8.zzb();
                String v1_9 = v1_8.zza();
                java.util.Iterator v2_1 = v2_0.iterator();
                while (v2_1.hasNext()) {
                    java.util.List v3_4 = v0_0.zza(this.zzb, new com.google.android.gms.internal.measurement.zzje[] {((com.google.android.gms.internal.measurement.zzje) v2_1.next())}));
                    if (!(v3_4 instanceof com.google.android.gms.internal.measurement.zzal)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    } else {
                        com.google.android.gms.internal.measurement.zzai v5_2;
                        com.google.android.gms.internal.measurement.zzai v5_0 = this.zzb;
                        if (v5_0.zzd(v1_9)) {
                            com.google.android.gms.internal.measurement.zzai v5_1 = v5_0.zzh(v1_9);
                            if (!(v5_1 instanceof com.google.android.gms.internal.measurement.zzai)) {
                                throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(v1_9)));
                            } else {
                                v5_2 = ((com.google.android.gms.internal.measurement.zzai) v5_1);
                            }
                        } else {
                            v5_2 = 0;
                        }
                        if (v5_2 == null) {
                            throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(v1_9)));
                        } else {
                            v5_2.zza(this.zzb, java.util.Collections.singletonList(v3_4));
                        }
                    }
                }
            }
            return;
        }
    }

    public final synthetic com.google.android.gms.internal.measurement.zzai zzg()
    {
        return new com.google.android.gms.internal.measurement.zzv(this.zzd);
    }
}
