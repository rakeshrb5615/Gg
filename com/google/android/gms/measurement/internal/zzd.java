package com.google.android.gms.measurement.internal;
public final class zzd extends com.google.android.gms.measurement.internal.zzf {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private long zzc;

    public zzd(com.google.android.gms.measurement.internal.zzic p2)
    {
        super(p2);
        super.zzb = new r.e(0);
        super.zza = new r.e(0);
        return;
    }

    private final void zzh(long p3, com.google.android.gms.measurement.internal.zzlu p5)
    {
        if (p5 != null) {
            if (p3 >= 1000) {
                android.os.Bundle v0_4 = new android.os.Bundle();
                v0_4.putLong("_xt", p3);
                com.google.android.gms.measurement.internal.zzpp.zzav(p5, v0_4, 1);
                this.zzu.zzj().zzF("am", "_xa", v0_4);
                return;
            } else {
                this.zzu.zzaV().zzk().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(p3));
                return;
            }
        } else {
            this.zzu.zzaV().zzk().zza("Not logging ad exposure. No active activity");
            return;
        }
    }

    private final void zzi(String p3, long p4, com.google.android.gms.measurement.internal.zzlu p6)
    {
        if (p6 != null) {
            if (p4 >= 1000) {
                android.os.Bundle v0_3 = new android.os.Bundle();
                v0_3.putString("_ai", p3);
                v0_3.putLong("_xt", p4);
                com.google.android.gms.measurement.internal.zzpp.zzav(p6, v0_3, 1);
                this.zzu.zzj().zzF("am", "_xu", v0_3);
                return;
            } else {
                this.zzu.zzaV().zzk().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(p4));
                return;
            }
        } else {
            this.zzu.zzaV().zzk().zza("Not logging ad unit exposure. No active activity");
            return;
        }
    }

    private final void zzj(long p5)
    {
        boolean v0_0 = this.zza;
        java.util.Iterator v1_1 = v0_0.keySet().iterator();
        while (v1_1.hasNext()) {
            v0_0.put(((String) v1_1.next()), Long.valueOf(p5));
        }
        if (!v0_0.isEmpty()) {
            this.zzc = p5;
        }
        return;
    }

    public final void zza(String p3, long p4)
    {
        if ((p3 != null) && (p3.length() != 0)) {
            this.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zza(this, p3, p4));
            return;
        } else {
            v1.a.s(this.zzu, "Ad unit id must be a non-empty string");
            return;
        }
    }

    public final void zzb(String p3, long p4)
    {
        if ((p3 != null) && (p3.length() != 0)) {
            this.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzb(this, p3, p4));
            return;
        } else {
            v1.a.s(this.zzu, "Ad unit id must be a non-empty string");
            return;
        }
    }

    public final void zzc(long p7)
    {
        com.google.android.gms.measurement.internal.zzlu v0_2 = this.zzu.zzs().zzh(0);
        long v1_4 = this.zza;
        java.util.Iterator v2_0 = v1_4.keySet().iterator();
        while (v2_0.hasNext()) {
            String v3_2 = ((String) v2_0.next());
            this.zzi(v3_2, (p7 - ((Long) v1_4.get(v3_2)).longValue()), v0_2);
        }
        if (!v1_4.isEmpty()) {
            this.zzh((p7 - this.zzc), v0_2);
        }
        this.zzj(p7);
        return;
    }

    public final synthetic void zzd(String p5, long p6)
    {
        this.zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5);
        java.util.Map v0_1 = this.zzb;
        if (v0_1.isEmpty()) {
            this.zzc = p6;
        }
        Integer v1_4 = ((Integer) v0_1.get(p5));
        if (v1_4 == null) {
            if (v0_1.size() < 100) {
                v0_1.put(p5, Integer.valueOf(1));
                this.zza.put(p5, Long.valueOf(p6));
                return;
            } else {
                v1.a.v(this.zzu, "Too many ads visible");
                return;
            }
        } else {
            v0_1.put(p5, Integer.valueOf((v1_4.intValue() + 1)));
            return;
        }
    }

    public final synthetic void zze(String p6, long p7)
    {
        this.zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p6);
        long v0_0 = this.zzb;
        String v1_5 = ((Integer) v0_0.get(p6));
        if (v1_5 == null) {
            this.zzu.zzaV().zzb().zzb("Call to endAdUnitExposure for unknown ad unit id", p6);
            return;
        } else {
            com.google.android.gms.measurement.internal.zzlu v2_2 = this.zzu.zzs().zzh(0);
            String v1_1 = (v1_5.intValue() - 1);
            if (v1_1 != null) {
                v0_0.put(p6, Integer.valueOf(v1_1));
                return;
            } else {
                v0_0.remove(p6);
                String v1_2 = this.zza;
                long v3_2 = ((Long) v1_2.get(p6));
                if (v3_2 != 0) {
                    long v3_4 = (p7 - v3_2.longValue());
                    v1_2.remove(p6);
                    this.zzi(p6, v3_4, v2_2);
                } else {
                    v1.a.s(this.zzu, "First ad unit exposure time was never set");
                }
                if (v0_0.isEmpty()) {
                    long v0_1 = this.zzc;
                    if (v0_1 != 0) {
                        this.zzh((p7 - v0_1), v2_2);
                        this.zzc = 0;
                    } else {
                        v1.a.s(this.zzu, "First ad exposure time was never set");
                        return;
                    }
                }
                return;
            }
        }
    }

    public final synthetic void zzf(long p1)
    {
        this.zzj(p1);
        return;
    }
}
