package com.google.android.gms.internal.firebase-auth-api;
final class zzakp implements com.google.android.gms.internal.firebase-auth-api.zzaol {
    private final com.google.android.gms.internal.firebase-auth-api.zzakn zza;

    private zzakp(com.google.android.gms.internal.firebase-auth-api.zzakn p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzakn v2_2 = ((com.google.android.gms.internal.firebase-auth-api.zzakn) com.google.android.gms.internal.firebase-auth-api.zzalh.zza(p2, "output"));
        this.zza = v2_2;
        v2_2.zza = this;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzakp zza(com.google.android.gms.internal.firebase-auth-api.zzakn p1)
    {
        com.google.android.gms.internal.firebase-auth-api.zzakp v0_0 = p1.zza;
        if (v0_0 == null) {
            return new com.google.android.gms.internal.firebase-auth-api.zzakp(p1);
        } else {
            return v0_0;
        }
    }

    public final int zza()
    {
        return 1;
    }

    public final void zza(int p3)
    {
        this.zza.zzj(p3, 4);
        return;
    }

    public final void zza(int p2, double p3)
    {
        this.zza.zzb(p2, p3);
        return;
    }

    public final void zza(int p2, float p3)
    {
        this.zza.zzb(p2, p3);
        return;
    }

    public final void zza(int p2, int p3)
    {
        this.zza.zzh(p2, p3);
        return;
    }

    public final void zza(int p2, long p3)
    {
        this.zza.zzf(p2, p3);
        return;
    }

    public final void zza(int p2, com.google.android.gms.internal.firebase-auth-api.zzajv p3)
    {
        this.zza.zzc(p2, p3);
        return;
    }

    public final void zza(int p5, com.google.android.gms.internal.firebase-auth-api.zzamd p6, java.util.Map p7)
    {
        java.util.Iterator v7_2 = p7.entrySet().iterator();
        while (v7_2.hasNext()) {
            Object v0_0 = ((java.util.Map$Entry) v7_2.next());
            this.zza.zzj(p5, 2);
            this.zza.zzm(com.google.android.gms.internal.firebase-auth-api.zzame.zza(p6, v0_0.getKey(), v0_0.getValue()));
            com.google.android.gms.internal.firebase-auth-api.zzame.zza(this.zza, p6, v0_0.getKey(), v0_0.getValue());
        }
        return;
    }

    public final void zza(int p2, Object p3)
    {
        if (!(p3 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) {
            this.zza.zzb(p2, ((com.google.android.gms.internal.firebase-auth-api.zzamm) p3));
            return;
        } else {
            this.zza.zzd(p2, ((com.google.android.gms.internal.firebase-auth-api.zzajv) p3));
            return;
        }
    }

    public final void zza(int p3, Object p4, com.google.android.gms.internal.firebase-auth-api.zzanb p5)
    {
        this.zza.zzj(p3, 3);
        p5.zza(((com.google.android.gms.internal.firebase-auth-api.zzajm) p4), this);
        this.zza.zzj(p3, 4);
        return;
    }

    public final void zza(int p2, String p3)
    {
        this.zza.zzb(p2, p3);
        return;
    }

    public final void zza(int p4, java.util.List p5)
    {
        int v0 = 0;
        while (v0 < p5.size()) {
            this.zza.zzc(p4, ((com.google.android.gms.internal.firebase-auth-api.zzajv) p5.get(v0)));
            v0++;
        }
        return;
    }

    public final void zza(int p3, java.util.List p4, com.google.android.gms.internal.firebase-auth-api.zzanb p5)
    {
        int v0 = 0;
        while (v0 < p4.size()) {
            this.zza(p3, p4.get(v0), p5);
            v0++;
        }
        return;
    }

    public final void zza(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzajt)) {
            if (p6) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                boolean v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((Boolean) p5.get(v4_1)).booleanValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzb(((Boolean) p5.get(v2)).booleanValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzb(p4, ((Boolean) p5.get(v2)).booleanValue());
                v2++;
            }
        } else {
            if (p6) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                boolean v6_9 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzajt) p5).size()) {
                    v6_9 += com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzajt) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_9);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzajt) p5).size()) {
                    this.zza.zzb(((com.google.android.gms.internal.firebase-auth-api.zzajt) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzajt) p5).size()) {
                this.zza.zzb(p4, ((com.google.android.gms.internal.firebase-auth-api.zzajt) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }

    public final void zza(int p2, boolean p3)
    {
        this.zza.zzb(p2, p3);
        return;
    }

    public final void zzb(int p3)
    {
        this.zza.zzj(p3, 3);
        return;
    }

    public final void zzb(int p2, int p3)
    {
        this.zza.zzg(p2, p3);
        return;
    }

    public final void zzb(int p2, long p3)
    {
        this.zza.zzh(p2, p3);
        return;
    }

    public final void zzb(int p3, Object p4, com.google.android.gms.internal.firebase-auth-api.zzanb p5)
    {
        this.zza.zzj(p3, 2);
        this.zza.zzm(((com.google.android.gms.internal.firebase-auth-api.zzajm) p4).zza(p5));
        p5.zza(((com.google.android.gms.internal.firebase-auth-api.zzajm) p4), this);
        return;
    }

    public final void zzb(int p5, java.util.List p6)
    {
        int v1 = 0;
        if (!(p6 instanceof com.google.android.gms.internal.firebase-auth-api.zzalt)) {
            while (v1 < p6.size()) {
                this.zza.zzb(p5, ((String) p6.get(v1)));
                v1++;
            }
        } else {
            while (v1 < p6.size()) {
                com.google.android.gms.internal.firebase-auth-api.zzajv v2_1 = ((com.google.android.gms.internal.firebase-auth-api.zzalt) p6).zza(v1);
                if (!(v2_1 instanceof String)) {
                    this.zza.zzc(p5, ((com.google.android.gms.internal.firebase-auth-api.zzajv) v2_1));
                } else {
                    this.zza.zzb(p5, ((String) v2_1));
                }
                v1++;
            }
        }
        return;
    }

    public final void zzb(int p3, java.util.List p4, com.google.android.gms.internal.firebase-auth-api.zzanb p5)
    {
        int v0 = 0;
        while (v0 < p4.size()) {
            this.zzb(p3, p4.get(v0), p5);
            v0++;
        }
        return;
    }

    public final void zzb(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzaks)) {
            if (p6 != null) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                Double v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((Double) p5.get(v4_1)).doubleValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzb(((Double) p5.get(v2)).doubleValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzb(p4, ((Double) p5.get(v2)).doubleValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                Double v6_8 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzaks) p5).size()) {
                    v6_8 += com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzaks) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_8);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzaks) p5).size()) {
                    this.zza.zzb(((com.google.android.gms.internal.firebase-auth-api.zzaks) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzaks) p5).size()) {
                this.zza.zzb(p4, ((com.google.android.gms.internal.firebase-auth-api.zzaks) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzc(int p2, int p3)
    {
        this.zza.zzh(p2, p3);
        return;
    }

    public final void zzc(int p2, long p3)
    {
        this.zza.zzf(p2, p3);
        return;
    }

    public final void zzc(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                int v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((Integer) p5.get(v4_1)).intValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzk(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzh(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                int v6_9 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                    v6_9 += com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_9);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                    this.zza.zzk(((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                this.zza.zzh(p4, ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzd(int p2, int p3)
    {
        this.zza.zzg(p2, p3);
        return;
    }

    public final void zzd(int p2, long p3)
    {
        this.zza.zzg(p2, p3);
        return;
    }

    public final void zzd(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                int v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(((Integer) p5.get(v4_1)).intValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzj(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzg(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                int v6_9 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                    v6_9 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_9);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                    this.zza.zzj(((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                this.zza.zzg(p4, ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }

    public final void zze(int p2, int p3)
    {
        this.zza.zzi(p2, p3);
        return;
    }

    public final void zze(int p2, long p3)
    {
        this.zza.zzh(p2, p3);
        return;
    }

    public final void zze(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalx)) {
            if (p6 != null) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                Long v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((Long) p5.get(v4_1)).longValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzf(((Long) p5.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzf(p4, ((Long) p5.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                Long v6_8 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                    v6_8 += com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_8);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                    this.zza.zzf(((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                this.zza.zzf(p4, ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzf(int p2, int p3)
    {
        this.zza.zzk(p2, p3);
        return;
    }

    public final void zzf(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzald)) {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                float v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((Float) p5.get(v4_1)).floatValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzb(((Float) p5.get(v2)).floatValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzb(p4, ((Float) p5.get(v2)).floatValue());
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                float v6_9 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzald) p5).size()) {
                    v6_9 += com.google.android.gms.internal.firebase-auth-api.zzakn.zza(((com.google.android.gms.internal.firebase-auth-api.zzald) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_9);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzald) p5).size()) {
                    this.zza.zzb(((com.google.android.gms.internal.firebase-auth-api.zzald) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzald) p5).size()) {
                this.zza.zzb(p4, ((com.google.android.gms.internal.firebase-auth-api.zzald) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzg(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                int v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzc(((Integer) p5.get(v4_1)).intValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzk(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzh(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                int v6_9 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                    v6_9 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzc(((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_9);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                    this.zza.zzk(((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                this.zza.zzh(p4, ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzh(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalx)) {
            if (p6 != null) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                Long v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(((Long) p5.get(v4_1)).longValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzh(((Long) p5.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzh(p4, ((Long) p5.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                Long v6_8 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                    v6_8 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_8);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                    this.zza.zzh(((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                this.zza.zzh(p4, ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzi(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                int v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzf(((Integer) p5.get(v4_1)).intValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzj(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzg(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                int v6_9 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                    v6_9 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzf(((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_9);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                    this.zza.zzj(((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                this.zza.zzg(p4, ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzj(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalx)) {
            if (p6 != null) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                Long v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzc(((Long) p5.get(v4_1)).longValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzf(((Long) p5.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzf(p4, ((Long) p5.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                Long v6_8 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                    v6_8 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzc(((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_8);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                    this.zza.zzf(((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                this.zza.zzf(p4, ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzk(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                int v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzg(((Integer) p5.get(v4_1)).intValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzl(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzi(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                int v6_9 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                    v6_9 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzg(((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_9);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                    this.zza.zzl(((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                this.zza.zzi(p4, ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzl(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalx)) {
            if (p6 != null) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                Long v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzd(((Long) p5.get(v4_1)).longValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzg(((Long) p5.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzg(p4, ((Long) p5.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                Long v6_8 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                    v6_8 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzd(((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_8);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                    this.zza.zzg(((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                this.zza.zzg(p4, ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzm(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzali)) {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                int v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(((Integer) p5.get(v4_1)).intValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzm(((Integer) p5.get(v2)).intValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzk(p4, ((Integer) p5.get(v2)).intValue());
                v2++;
            }
        } else {
            if (p6 != 0) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                int v6_9 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                    v6_9 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_9);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                    this.zza.zzm(((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).size()) {
                this.zza.zzk(p4, ((com.google.android.gms.internal.firebase-auth-api.zzali) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }

    public final void zzn(int p4, java.util.List p5, boolean p6)
    {
        int v2 = 0;
        if (!(p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalx)) {
            if (p6 != null) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_1 = 0;
                Long v6_2 = 0;
                while (v4_1 < p5.size()) {
                    v6_2 += com.google.android.gms.internal.firebase-auth-api.zzakn.zze(((Long) p5.get(v4_1)).longValue());
                    v4_1++;
                }
                this.zza.zzm(v6_2);
                while (v2 < p5.size()) {
                    this.zza.zzh(((Long) p5.get(v2)).longValue());
                    v2++;
                }
                return;
            }
            while (v2 < p5.size()) {
                this.zza.zzh(p4, ((Long) p5.get(v2)).longValue());
                v2++;
            }
        } else {
            if (p6 != null) {
                this.zza.zzj(p4, 2);
                com.google.android.gms.internal.firebase-auth-api.zzakn v4_5 = 0;
                Long v6_8 = 0;
                while (v4_5 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                    v6_8 += com.google.android.gms.internal.firebase-auth-api.zzakn.zze(((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v4_5));
                    v4_5++;
                }
                this.zza.zzm(v6_8);
                while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                    this.zza.zzh(((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v2));
                    v2++;
                }
                return;
            }
            while (v2 < ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).size()) {
                this.zza.zzh(p4, ((com.google.android.gms.internal.firebase-auth-api.zzalx) p5).zzb(v2));
                v2++;
            }
        }
        return;
    }
}
